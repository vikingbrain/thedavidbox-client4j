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
 * Operation that sets subtitle for current VOD DVD playback ONLY for DVD media format.
 * Execution example: http://popcorn:8008//playback?arg0=set_subtitle_vod&arg1=english
 * 
 * @author vikingBrain
 */
public class SetSubtitleVodDvdOperation extends AbstractPlayblackOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.set_subtitle_vod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;
	
	/** Required operation attributes. */
	//Subtitle (value depends on track as being returned from list_subtitle_vod)
	private String track;
	
	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param track Subtitle (value depends on track as being returned from list_subtitle_vod)
	 */
	public SetSubtitleVodDvdOperation(TheDavidboxOperationFactory operationFactory, String track) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.track = track;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
				
		httpArguments.put("arg1", track);	
		
		return httpArguments;
	}	

	

}
