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
package com.vikingbrain.nmt.operations.metadatadatabase;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.parameters.InfoMode;
import com.vikingbrain.nmt.responses.DavidBoxResponse;

/**
 * Get particular video info (summary).
 * Execution example: http://popcorn:8008/metadata_database?arg0=get_video_info&arg1=/opt/sybhttpd/localhost.drives/SATA_DISK/nmj_database/media.db&arg2=s91&arg3=summary
 * @author vikingBrain
 *
 */
public abstract class AbstractGetVideoInfoOperation<T extends DavidBoxResponse> extends AbstractMetadatadatabaseOperation<T> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.METADATA_DATABASE.get_video_info;

	/** Required operation attributes. */
	private String databasePath;
	//Video id.
	private String videoId;
	//Type of info requested.
	private InfoMode infoMode;
	
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param databasePath the database path
	 */
	protected AbstractGetVideoInfoOperation(TheDavidboxOperationFactory operationFactory, Class<T> responseTargetClass, String databasePath, String videoId, InfoMode infoMode) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.databasePath = databasePath;
		this.videoId = videoId;
		this.infoMode = infoMode;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", databasePath);
		httpArguments.put("arg2", videoId);
		httpArguments.put("arg3", infoMode.getParamValue());
		
		return httpArguments;
	}

	public final String getDatabasePath() {
		return databasePath;
	}

	public final void setDatabasePath(String databasePath) {
		this.databasePath = databasePath;
	}

	public final String getVideoId() {
		return videoId;
	}

	public final void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public final InfoMode getInfoMode() {
		return infoMode;
	}

	public final void setInfoMode(InfoMode infoMode) {
		this.infoMode = infoMode;
	}

	@Override
	public String toString() {
		return "AbstractGetVideoInfoOperation [databasePath=" + databasePath
				+ ", videoId=" + videoId + ", infoMode=" + infoMode
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
