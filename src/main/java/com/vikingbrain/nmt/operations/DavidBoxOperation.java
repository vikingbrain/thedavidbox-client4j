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


/**
 * 
 * @author vikingBrain
 */
public interface DavidBoxOperation {

	/**
	 * Getter of property.
	 * @return the operation type.
	 */
	OperationType getOperationType();

	/**
	 * It build the http arguments for the operation
	 * @return the http arguments built
	 */
	LinkedHashMap<String, String> buildHttpArguments();

}
