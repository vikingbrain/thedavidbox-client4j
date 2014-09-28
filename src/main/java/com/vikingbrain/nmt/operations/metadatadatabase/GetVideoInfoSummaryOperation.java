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

import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.parameters.InfoMode;
import com.vikingbrain.nmt.responses.metadatadatabase.ResponseGetVideoInfoSummary;

/**
 * Get particular video info in summary mode.
 * Execution example: http://popcorn:8008/metadata_database?arg0=get_video_info&arg1=/opt/sybhttpd/localhost.drives/SATA_DISK/nmj_database/media.db&arg2=s91&arg3=summary
 * @author vikingBrain
 *
 */
public class GetVideoInfoSummaryOperation extends AbstractGetVideoInfoOperation<ResponseGetVideoInfoSummary> {

	/** Response target class. */
	private static final Class<ResponseGetVideoInfoSummary> responseTargetClass = ResponseGetVideoInfoSummary.class;

	//Type of info requested.
	private static final InfoMode INFO_MODE_FULL = InfoMode.SUMMARY;
	
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param databasePath the database path
	 */
	public GetVideoInfoSummaryOperation(TheDavidboxOperationFactory operationFactory, String databasePath, String videoId) {
		super(operationFactory, responseTargetClass, databasePath, videoId, INFO_MODE_FULL);
	}	
	
}
