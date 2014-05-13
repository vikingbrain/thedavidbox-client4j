package com.vikingbrain.nmt.controller.impl;

import java.io.UnsupportedEncodingException;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.vikingbrain.nmt.controller.DavidBoxParser;
import com.vikingbrain.nmt.responses.DavidBoxResponse;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * Response parser for TheDavidBox xml responses.
 * @author vikingBrain
 *
 */
public class DavidBoxParserImpl implements DavidBoxParser {

	/** The serializer for parsing the response. */
	private Serializer serializer = new Persister();		

	/**
	 * It prepares the xml string for parsing.
	 * @param xml the xml response
	 * @return the xml prepared
	 * @throws TheDavidBoxClientException exception in the client
	 */
	private String prepareXmlForParsing(String xml) throws TheDavidBoxClientException{
		//Escape all & symbols in the response so it can parse it later
		xml = xml.replaceAll("&", "&amp;");
		
		String xmlReady;
		try {
			//It repairs the encoding to allow all utf-8 symbols
			xmlReady = new String(xml.getBytes(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new TheDavidBoxClientException(e);
		}
		return xmlReady;
	}
	
	/** {@inheritDoc} */
	public <T extends DavidBoxResponse> T parse(Class<T> responseTargetClass, String xmlString) throws TheDavidBoxClientException{	
      	T response;
		try {
			String xmlForParsing = prepareXmlForParsing(xmlString);
			response = (T)serializer.read(responseTargetClass, xmlForParsing);
		} catch (Exception e) {
			throw new TheDavidBoxClientException(e);
		}
      	return response;
	}	
		
}
