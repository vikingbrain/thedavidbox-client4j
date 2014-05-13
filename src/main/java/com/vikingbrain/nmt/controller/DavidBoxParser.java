package com.vikingbrain.nmt.controller;

import com.vikingbrain.nmt.responses.DavidBoxResponse;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * Response parser for TheDavidBox xml responses.
 * @author vikingBrain
 *
 */
public interface DavidBoxParser {

	/**
	 * It parses the xml string into a Davidbox response object desired.
	 * @param responseTargetClass the target object to fit the xml
	 * @param xmlString the xml string to parse
	 * @return the davidbox response object
	 * @throws TheDavidBoxClientException exception in the client
	 */
	<T extends DavidBoxResponse> T parse(Class<T> responseTargetClass, String xmlString) throws TheDavidBoxClientException;
	
}
