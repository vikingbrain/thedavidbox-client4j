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
package com.vikingbrain.nmt.operations.file;

import com.vikingbrain.nmt.operations.AbstractTheDavidboxOperation;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.DavidBoxResponse;

/**
 * Abstract class that represent a operation for the file module.
 * 
 * @author vikingBrain
 *
 * @param <T> the type of the response object for the operation
 */
public abstract class AbstractFileOperation<T extends DavidBoxResponse> extends AbstractTheDavidboxOperation<T> {

	/**
	 * Constructor.
	 * @param factory the operation factory
	 * @param operationType the operation type
	 * @param responseTargetClass the response target class
	 */
	protected AbstractFileOperation(TheDavidboxOperationFactory factory, OperationType operationType, Class<T> responseTargetClass) {		
		super(factory, operationType, responseTargetClass);
	}
	
}
