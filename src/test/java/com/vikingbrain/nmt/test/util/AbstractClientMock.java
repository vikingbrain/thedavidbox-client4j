package com.vikingbrain.nmt.test.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.Before;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.client.TheDavidBoxClient;
import com.vikingbrain.nmt.client.impl.TheDavidBoxClientImpl;
import com.vikingbrain.nmt.operations.TheDavidboxOperationListener;
import com.vikingbrain.nmt.util.ClientOptions;

/**
 * 
 * @author vikingBrain
 */
public class AbstractClientMock implements TheDavidboxOperationListener {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(AbstractClientMock.class);
		
	protected TheDavidBoxClient theDavidBoxClient;
	
	@Before
	public void setUp() throws Exception {
		//Create the default client options
		ClientOptions defaultClientOptions = new ClientOptions.Builder().build();
		logger.debug("Default client options created");	

		//Create the client with the mock IP
		theDavidBoxClient = new TheDavidBoxClientImpl(MockConstants.IP, defaultClientOptions, this);
		logger.debug("TheDavidBox client created");
	}
	
	protected void setXmlFileResponseInHttpMockClient(String xmlFileName) throws IOException {
		logger.info(""); //Separate lines printed in the log
				
		//Get the content form the xml file
		String responseBody = MockUtils.getContentFromResponseTestFile(xmlFileName);
		
		HttpResponse response = MockUtils.prepareHttpResponse(200, responseBody);
		HttpClient mockHttpClient = Mockito.mock(HttpClient.class);
		Mockito.when(mockHttpClient.execute(Mockito.any(HttpUriRequest.class))).thenReturn(response);

		//Put the mock http client in the davidbox client
		theDavidBoxClient.getOperationFactory().getRemoteHttpService().setHttpClient(mockHttpClient);
		logger.debug("Established a custom response in the http client mock");
	}

	@Override
	public void onSendHttpRequest(String request) {
		logger.info("Mock Request: " + request);		
	}

	@Override
	public void onReceiveXmlResponse(String xmlResponse) {
//		logger.info("Mock Response: " + xmlResponse);		
	}

}
