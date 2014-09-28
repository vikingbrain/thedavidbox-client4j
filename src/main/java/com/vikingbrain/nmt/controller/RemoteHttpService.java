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
