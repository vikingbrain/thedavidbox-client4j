package com.vikingbrain.nmt.controller;

import java.util.LinkedHashMap;

import org.apache.http.client.HttpClient;

import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * 
 * @author vikingBrain
 */
public interface RemoteHttpService {
	
	/**
	 * It builds a get for the specified data.
	 * @param remoteHost the IP or remote host
	 * @param operationType the operation type
	 * @param arguments the operation arguments
	 * @return the get request in a string object 
	 */
	String buildGetRequest(String remoteHost, OperationType operationType, LinkedHashMap<String, String> arguments);	
	
	/**
	 * Sends the get request and get the response as string
	 * @param url the url get
	 * @return the response as a string
	 * @throws TheDavidBoxClientException exception in the client
	 */
	String sendGetRequest(String url) throws TheDavidBoxClientException;

	/**
	 * Setter of property.
	 * @param client the http client
	 */
	void setHttpClient(HttpClient client);
}
