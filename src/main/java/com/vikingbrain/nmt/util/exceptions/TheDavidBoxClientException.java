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
package com.vikingbrain.nmt.util.exceptions;

/**
 * Exception that represents DOM parser failed Exception.
 * It represents a exception produced by a bad behavior in the client.
 * @author vikingBrain
 * 
 */
public class TheDavidBoxClientException extends java.lang.Exception {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	private String request;
	private String response;
	
	/**
	 * Constructor.
	 * @param message message of exception.
	 * @param t trace of exception.
	 */ 
	public TheDavidBoxClientException(String message, Throwable t) {
		super(message, t);
	}

	/**
	 * Constructor with message.
	 * @param message message of exception.
	 */
	public TheDavidBoxClientException(String message) {
		super(message);
	}

	/**
	 * Constructor with trace.
	 * @param t the trace.
	 */
	public TheDavidBoxClientException(Throwable t) {
		super(t);
	}

	/**
	 * Constructor with trace.
	 * @param t the trace.
	 */
	public TheDavidBoxClientException(Throwable t, String request, String response) {
		super(t);
		this.request = request;
		this.response = response;
	}

	public final String getRequest() {
		return request;
	}

	public final String getResponse() {
		return response;
	}
	
}

