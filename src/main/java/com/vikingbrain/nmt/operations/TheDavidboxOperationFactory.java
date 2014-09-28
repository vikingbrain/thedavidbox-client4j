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
package com.vikingbrain.nmt.operations;

import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.controller.DavidBoxParser;
import com.vikingbrain.nmt.controller.RemoteHttpService;
import com.vikingbrain.nmt.controller.impl.DavidBoxParserImpl;
import com.vikingbrain.nmt.controller.impl.RemoteHttpServiceImpl;
import com.vikingbrain.nmt.responses.DavidBoxResponse;
import com.vikingbrain.nmt.util.ClientOptions;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * Factory for DavidBox operations.
 * 
 * @author vikingBrain
 */
public class TheDavidboxOperationFactory {	
	
	/** Logger. */
	static Logger logger = LoggerFactory.getLogger(TheDavidboxOperationFactory.class);
		
	/** IP address or name of the remote host. */
	private String remoteHost;
	
	/** Client options. */
	private final ClientOptions clientOptions;
	
	/** Remote http service. */
	private final RemoteHttpService remoteHttpService = new RemoteHttpServiceImpl();
	
	/** The Davidbox response parser. */
	private final DavidBoxParser davidBoxPaser = new DavidBoxParserImpl();

	/** Operation listener. */
	private TheDavidboxOperationListener operationListener;
	
	/**
	 * Constructor with default client options.
	 * @param remoteHost the IP or remote host
	 */
	public TheDavidboxOperationFactory(String remoteHost) {		
		this(remoteHost, new ClientOptions.Builder().build());
	}

	/**
	 * Constructor.
	 * @param remoteHost the IP or remote host
	 * @param clientOptions the client options
	 */
	public TheDavidboxOperationFactory(String remoteHost, ClientOptions clientOptions) {		
		this(remoteHost, clientOptions, null);
	}	
	
	/**
	 * Constructor.
	 * @param remoteHost the IP or remote host
	 * @param clientOptions the client options
	 * @param operationListener the operation listener
	 */
	public TheDavidboxOperationFactory(String remoteHost, ClientOptions clientOptions, TheDavidboxOperationListener operationListener) {		
		this.remoteHost = remoteHost;
		this.clientOptions = clientOptions;
		this.operationListener = operationListener;
	}		
	
	/**
	 * It executes a davidbox operation. Builds the http get request, sends, receive and fit the response in the response target object
	 * @param operation the davidbox operation
	 * @param responseTargetClass the response target class
	 * @return the response object with the result of the operation
	 * @throws TheDavidBoxClientException exception in the client
	 */
	protected <T extends DavidBoxResponse> T execute(DavidBoxOperation operation, Class<T> responseTargetClass) throws TheDavidBoxClientException{
		//Build the additional http arguments for the operation if there is additioanl http parameters
		LinkedHashMap<String, String> operationArguments = operation.buildHttpArguments();
		
		// Build the get request with the arguments
		String urlGet = remoteHttpService.buildGetRequest(remoteHost, operation.getOperationType(), operationArguments);

		T responseObject = sendAndParse(urlGet, responseTargetClass);
		return responseObject;
	}

	/**
	 * It sends the url get to the service and parse the response in the desired response target class.
	 * @param urlGet the url to send to the service
	 * @param responseTargetClass the response target class
	 * @return the response object filled with the xml result
	 * @throws TheDavidBoxClientException exception in the client
	 */
	private <T extends DavidBoxResponse> T sendAndParse(String urlGet, Class<T> responseTargetClass) throws TheDavidBoxClientException{
	
		logger.debug("urlGet: " + urlGet);
		
		//Notify the listener about the request
		notifyRequest(urlGet);
		
		// Call the davidbox service to get the xml response
		String xmlResponse = "";
		try {
			xmlResponse = getRemoteHttpService().sendGetRequest(urlGet);
		} catch (TheDavidBoxClientException e1) {
			throw new TheDavidBoxClientException(e1, urlGet, xmlResponse);
		}

		//Notify the listener about the response
		notifyResponse(xmlResponse);
		
		// Parse the response into a business object
		T responseObject = null;
		try {
			responseObject = getDavidBoxPaser().parse(responseTargetClass, xmlResponse);
		} catch (TheDavidBoxClientException e2) {
			throw new TheDavidBoxClientException(e2, urlGet, xmlResponse);
		}

		return responseObject;
	}		

	/**
	 * Getter of property.
	 * @return the IP or remote host
	 */
	public final String getRemoteHost() {
		return remoteHost;
	}

	/**
	 * Setter of property.
	 * @param remoteHost the IP or remote host
	 * @return the IP or remote host
	 */
	public final String setRemoteHost(String remoteHost) {
		return this.remoteHost = remoteHost;
	}

	/**
	 * Getter of property.
	 * @return the client options
	 */
	public final ClientOptions getClientOptions() {
		return clientOptions;
	}

	/**
	 * Getter of property.	
	 * @return the remote http service
	 */
	public final RemoteHttpService getRemoteHttpService() {
		return remoteHttpService;
	}

	/**
	 * Getter of property.
	 * @return the davidbox parser
	 */
	public final DavidBoxParser getDavidBoxPaser() {
		return davidBoxPaser;
	}

	/**
	 * Getter of property.
	 * @return the operation listener
	 */
	public final TheDavidboxOperationListener getOperationListener() {
		return operationListener;
	}

	/**
	 * sGetter of property.
	 * @param operationListener the operation listener
	 */
	public final void setOperationListener(TheDavidboxOperationListener operationListener) {
		this.operationListener = operationListener;
	}

	/**
	 * Notify that a http request has been send.
	 * @param urlGet the url
	 */
	private void notifyRequest(String urlGet){
		if (null != operationListener){
			operationListener.onSendHttpRequest(urlGet);
		}		
	}

	/**
	 * Notify that a response has been received.
	 * @param xmlResponse the xml response
	 */
	private void notifyResponse(String xmlResponse){
		if (null != operationListener){
			operationListener.onReceiveXmlResponse(xmlResponse);
		}		
	}

}
