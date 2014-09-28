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

import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseGetLanguage;

/**
 * Abstract class for operation that are just setting language.
 * 
 * @author vikingBrain
 */
public class AbstractGetLanguageOperation extends AbstractSettingOperation<ResponseGetLanguage> {

	/** Response target class. */
	private static final Class<ResponseGetLanguage> responseTargetClass = ResponseGetLanguage.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param operationType the operation type
	 */
	public AbstractGetLanguageOperation(TheDavidboxOperationFactory operationFactory, OperationType operationType) {
		super(operationFactory, operationType, responseTargetClass);
	}

}
