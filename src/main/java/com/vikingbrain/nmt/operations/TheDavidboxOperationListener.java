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
