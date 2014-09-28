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

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;


/**
 * Operation that sets current repeat mode.
 * Execution example: http://popcorn:8008/setting?arg0=set_repeat_mode&arg1=repeat%20one
 * 
 * @author vikingBrain
 */
public class SetRepeatModeOperation extends AbstractSettingOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.set_repeat_mode;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required attributes. */
	//Any options returns from ListRepeatMode operation
	private String repeatMode;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param repeatMode Any options returns from ListRepeatMode operation
	 */
	public SetRepeatModeOperation(TheDavidboxOperationFactory operationFactory, String repeatMode) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.repeatMode = repeatMode;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", repeatMode);

		return httpArguments;
	}	

	/**
	 * Getter of property.
	 * @return the repeatMode
	 */
	public final String getRepeatMode() {
		return repeatMode;
	}

	/**
	 * Setter of property.
	 * @param repeatMode the repeatMode to set
	 */
	public final void setRepeatMode(String repeatMode) {
		this.repeatMode = repeatMode;
	}
	
	@Override
	public String toString() {
		return "SetRepeatModeOperation [repeatMode=" + repeatMode
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
