package com.vikingbrain.nmt.operations;

/**
 * 
 * @author vikingBrain
 */
public interface TheDavidboxOperationListener {

	/**
	 * Method to execute when an http request has been made.
	 * @param request the http request
	 */
	void onSendHttpRequest(String request);
	
	/**
	 * Method to execute when a xml response has been received.
	 * @param xmlResponse the xml response
	 */
	void onReceiveXmlResponse(String xmlResponse);
	
}
