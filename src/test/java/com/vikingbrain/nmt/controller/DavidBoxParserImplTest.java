package com.vikingbrain.nmt.controller;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.vikingbrain.nmt.controller.impl.DavidBoxParserImpl;
import com.vikingbrain.nmt.responses.ResponseSimple;
import com.vikingbrain.nmt.responses.playback.ResponseGetCurrentAodInfo;
import com.vikingbrain.nmt.responses.system.ResponseCheckNmtExist;
import com.vikingbrain.nmt.test.util.MockUtils;
import com.vikingbrain.nmt.test.util.XmlTestFiles;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * Tests for the DavidBoxParserImpl class.
 * @author vikingBrain
 */
public class DavidBoxParserImplTest {

	/** The Davidbox response parser. */
	private DavidBoxParser davidBoxParser;
	
	/**
	 * Set up the test.
	 * @throws Exception exception
	 */
	@Before
	public void setUp() throws Exception {
		//Create a new davidbox parser
		davidBoxParser = new DavidBoxParserImpl();
	}

	/**
	 * Parse a null xml string will throw a DavidBoxClientException.
	 * @throws TheDavidBoxClientException exception in the client
	 */
	@Test(expected = TheDavidBoxClientException.class)
	public void parsingNullXmlResponseTest() throws TheDavidBoxClientException {	
		//Parse a null xml string will throw a DavidBoxClientException
		davidBoxParser.parse(ResponseCheckNmtExist.class, null);
	}

	/**
	 * Parse an empty xml will throw a DavidBoxClientException.
	 * @throws TheDavidBoxClientException exception in the client
	 */
	@Test(expected = TheDavidBoxClientException.class)
	public void parsingEmptyXmlResponseTest() throws TheDavidBoxClientException {
		//Parse an empty xml will throw a DavidBoxClientException
		davidBoxParser.parse(ResponseCheckNmtExist.class, "");
	}

	/**
	 * Parse an malformed xml will throw a DavidBoxClientException.
	 * @throws TheDavidBoxClientException exception in the client
	 */
	@Test(expected = TheDavidBoxClientException.class)
	public void parsingMalformedXmlResponseTest() throws TheDavidBoxClientException {
		//Malformed xml
		String xmlTest = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" +
				"<theDavidBox>" +
				"		<request>" +
				"			<arg0>start_vod</arg0>" +
				"			<arg1>sample</arg1> " +
				"			<arg2>file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/video/sample.avi</arg2> " +
				"			<arg3>show</arg3> " +
				"			<arg4></arg4> " +
				"			<module>playback</module> " +
				"		</request> " +
				"<VERY BAD   response></response> " +
				"		<returnValue>0</returnValue> " +
				"</theDavidBox>";
		davidBoxParser.parse(ResponseSimple.class, xmlTest);
	}

	/**
	 * Parse a checkNmtExist xml response in other response object with other attributes
	 * expected will throw a DavidBoxClientException.
	 * @throws TheDavidBoxClientException exception in the client
	 * @throws IOException exception reading the xml response test file
	 */
	@Test(expected = TheDavidBoxClientException.class)
	public void parsingResponseInWrongObjectTest() throws TheDavidBoxClientException, IOException {		
		//Read a check nmt exist xml response
		//Read the string from the xml file with the test response
		String xmlResponseFileName = XmlTestFiles.CHECK_NMT_EXIST_DOCUMENTATION_EXAMPLE;
		
		String xmlTestResponse = MockUtils.getContentFromResponseTestFile(xmlResponseFileName);

		//Parse it into a ResponseGetCurrentAodInfo object 
		davidBoxParser.parse(ResponseGetCurrentAodInfo.class, xmlTestResponse);
	}
}
