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
