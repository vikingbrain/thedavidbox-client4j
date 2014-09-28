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
import com.vikingbrain.nmt.operations.parameters.DisplayMode;
import com.vikingbrain.nmt.responses.DavidBoxResponse;
import com.vikingbrain.nmt.util.UtilFile;

/**
 * Abstract class that represent a operation for start or insert operation in the playback module.
 * 
 * @author vikingBrain
 *
 * @param <T> the type of the response object for the operation
 */
public abstract class AbstractStartInsertOperation<T extends DavidBoxResponse> extends AbstractTheDavidboxOperation<T> {

	/** Required operation attributes. */
	private String filePath;
	private DisplayMode displayMode;
	
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param operationType the operation type
	 * @param responseTargetClass the response target class
	 */
	protected AbstractStartInsertOperation(TheDavidboxOperationFactory operationFactory, OperationType operationType, 
			Class<T> responseTargetClass, String filePath) {		
		super(operationFactory, operationType, responseTargetClass);
		
		this.filePath = filePath;
		//Default client attributes
		this.displayMode = operationFactory.getClientOptions().getDefaultDisplayMode();		
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		//file name
		httpArguments.put("arg1", UtilFile.getFileName(filePath));
		//file absolute uri file://opt/...
		httpArguments.put("arg2", UtilFile.getFileAbsoluteUri(filePath));   		

		return httpArguments;
	}	

	public final String getFilePath() {
		return filePath;
	}

	public final void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public final DisplayMode getDisplayMode() {
		return displayMode;
	}
	
	public final void setDisplayMode(DisplayMode displayMode) {
		this.displayMode = displayMode;
	}	

}
