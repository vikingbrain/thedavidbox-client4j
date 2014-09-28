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
package com.vikingbrain.nmt.operations.playback;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.AbstractTheDavidboxOperation;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.DavidBoxResponse;

public abstract class AbstractDeleteEntryQueueOperation<T extends DavidBoxResponse> extends AbstractTheDavidboxOperation<T> {

	/** Required operation attributes. */
	private String index;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param operationType the operation type
	 * @param responseTargetClass the response target class
	 * @param index Any index returned from the List Queue Info operation of audio, video or photo
	 */
	protected AbstractDeleteEntryQueueOperation(TheDavidboxOperationFactory operationFactory, OperationType operationType, 
			Class<T> responseTargetClass, String index) {	
		super(operationFactory, operationType, responseTargetClass);
		
		this.index = index;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", index);
		
		return httpArguments;
	}

	public final String getIndex() {
		return index;
	}

	public final void setIndex(String index) {
		this.index = index;
	}

}
