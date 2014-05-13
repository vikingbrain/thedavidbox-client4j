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

