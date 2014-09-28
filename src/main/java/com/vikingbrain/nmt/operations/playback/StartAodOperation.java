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

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that starts audio on NMT.
 * Execution example http://popcorn:8008/playback?arg0=start_aod&arg1=nombre&arg2=file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/music/mp3.mp3&arg3=show
 * 
 * @author vikingBrain
 */
public class StartAodOperation extends AbstractStartInsertOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.start_aod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;
	
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param filePath the file path
	 */
	public StartAodOperation(TheDavidboxOperationFactory operationFactory, String filePath) {
		super(operationFactory, operationType, responseTargetClass, filePath);
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
				
		//Display mode (show: show audio playback, marquee: will only show window marquee, 
		//hide: will not show anything)
		httpArguments.put("arg3", getDisplayMode().getParamValue());	
		
		//New in DavidBox SDK 3.4.4
		//arg4 http cache (disable/enable)


		return httpArguments;
	}	

	@Override
	public String toString() {
		return "StartAodOperation [getFilePath()=" + getFilePath()
				+ ", getDisplayMode()=" + getDisplayMode()
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
