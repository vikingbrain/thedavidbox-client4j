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
 * Operation that sets the audio stream in current file.
 * Execution example http://popcorn:8008/playback?arg0=set_audio_vod&arg1=1
 * 
 * @author vikingBrain
 */
public class SetAudioVodOperation extends AbstractPlayblackOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.set_audio_vod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required operation attributes. */
	private String audioValue;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param audioValue Eg: "1" (value depends on audio as being returned from list_audio_vod)
	 */
	public SetAudioVodOperation(TheDavidboxOperationFactory operationFactory, String audioValue) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.audioValue = audioValue;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", audioValue);

		return httpArguments;
	}	

	/**
	 * Getter of property.
	 * @return the audioValue
	 */
	public final String getAudioValue() {
		return audioValue;
	}

	/**
	 * Setter of property.
	 * @param audioValue the audioValue to set
	 */
	public final void setAudioValue(String audioValue) {
		this.audioValue = audioValue;
	}

	@Override
	public String toString() {
		return "SetAudioVodOperation [audioValue=" + audioValue + "]";
	}

}
