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
import com.vikingbrain.nmt.operations.parameters.VideoFilter;
import com.vikingbrain.nmt.responses.metadatadatabase.ResponseListTotalCategoryVideo;

/**
 * List all video categories.
 * Execution example: http://popcorn:8008/metadata_database?arg0=list_total_category_video&arg1=/opt/sybhttpd/localhost.drives/SATA_DISK/nmj_database/media.db&arg2=movie
 * @author vikingBrain
 *
 */
public class ListTotalCategoryVideoOperation extends AbstractMetadatadatabaseOperation<ResponseListTotalCategoryVideo> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.METADATA_DATABASE.list_total_category_video;

	/** Response target class. */
	private static final Class<ResponseListTotalCategoryVideo> responseTargetClass = ResponseListTotalCategoryVideo.class;

	/** Required operation attributes. */
	private String databasePath;
	private VideoFilter videoFilter;
	
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param databasePath the database path
	 * @param videoFilter the video filter
	 */
	public ListTotalCategoryVideoOperation(TheDavidboxOperationFactory operationFactory, String databasePath, VideoFilter videoFilter) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.databasePath = databasePath;
		this.videoFilter = videoFilter;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", databasePath);
		httpArguments.put("arg2", videoFilter.getParamValue());
		
		return httpArguments;
	}

	public final String getDatabasePath() {
		return databasePath;
	}

	public final void setDatabasePath(String databasePath) {
		this.databasePath = databasePath;
	}

	public final VideoFilter getVideoFilter() {
		return videoFilter;
	}

	public final void setVideoFilter(VideoFilter videoFilter) {
		this.videoFilter = videoFilter;
	}
	
	@Override
	public String toString() {
		return "ListTotalCategoryVideoOperation [databasePath=" + databasePath
				+ ", videoFilter=" + videoFilter + ", getOperationType()="
				+ getOperationType() + "]";
	}
	
}
