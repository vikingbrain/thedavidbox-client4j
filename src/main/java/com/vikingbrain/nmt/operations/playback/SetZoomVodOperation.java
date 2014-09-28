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
 * Operation that sets zoom mode for current VOD playback.
 * Execution example http://popcorn:8008/playback?arg0=set_zoom_vod&arg1=99
 * 
 * @author vikingBrain
 */
public class SetZoomVodOperation extends AbstractPlayblackOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.set_zoom_vod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required operation attributes. */
	private int zoomValue;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param zoomValue Any valid positive number in range 10-400. Note: 100 is normal size.
	 */
	public SetZoomVodOperation(TheDavidboxOperationFactory operationFactory, int zoomValue) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.zoomValue = zoomValue;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", String.valueOf(zoomValue));

		return httpArguments;
	}	

	/**
	 * Getter of property.
	 * @return the zoomValue
	 */
	public final int getZoomValue() {
		return zoomValue;
	}

	/**
	 * Setter of property.
	 * @param zoomValue the zoomValue to set
	 */
	public final void setZoomValue(int zoomValue) {
		this.zoomValue = zoomValue;
	}	

	@Override
	public String toString() {
		return "SetZoomVodOperation [zoomValue=" + zoomValue + "]";
	}

}
