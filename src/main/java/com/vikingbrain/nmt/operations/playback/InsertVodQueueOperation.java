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
import com.vikingbrain.nmt.responses.playback.ResponseInsertVodQueue;

/**
 * Operation that inserts video file into the NMT video queue.
 * Execution example http://popcorn:8008/playback?arg0=insert_vod_queue&arg1=sample&arg2=file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/video/sample.avi&arg3=show&arg4=start_zero
 * 
 * @author vikingBrain
 */
public class InsertVodQueueOperation extends AbstractStartInsertOperation<ResponseInsertVodQueue> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.insert_vod_queue;

	/** Response target class. */
	private static final Class<ResponseInsertVodQueue> responseTargetClass = ResponseInsertVodQueue.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param filePath the file path
	 */
	public InsertVodQueueOperation(TheDavidboxOperationFactory operationFactory, String filePath) {
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

		//TODO starting time
		httpArguments.put("arg4", "start_zero");
		
		return httpArguments;
	}

	@Override
	public String toString() {
		return "InsertVodQueueOperation [getFilePath()=" + getFilePath()
				+ ", getDisplayMode()=" + getDisplayMode()
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
