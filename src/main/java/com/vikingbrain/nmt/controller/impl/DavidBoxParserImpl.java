/*
 * Copyright 2011-2014 Rafael Iñigo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

	/** Charset encoding. */
	private static final String CHARSET_ENCODING = "UTF-8";
	
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
			xmlReady = new String(xml.getBytes(), CHARSET_ENCODING);
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
