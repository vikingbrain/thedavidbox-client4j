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
package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;

/**
 * Operation that sets the system language.
 * Execution example: http://popcorn:8008/setting?arg0=set_language&arg1=english
 * 
 * @author vikingBrain
 */
public class SetLanguageOperation extends AbstractSetLanguageOperation {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.set_language;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param language Any options returns from ListLanguage operation
	 */
	public SetLanguageOperation(TheDavidboxOperationFactory operationFactory, String language) {
		super(operationFactory, operationType, language);				
	}

	@Override
	public String toString() {
		return "SetLanguageOperation [getLanguage()=" + getLanguage()
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
