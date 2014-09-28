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

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseListPlaybackSpeedVod;

/**
 * List all the supported VOD playback speed.
 * Execution example: http://popcorn:8008/playback?arg0=list_playback_speed_vod
 * @author vikingBrain
 */
public class ListPlaybackSpeedVodOperation extends AbstractPlayblackOperation<ResponseListPlaybackSpeedVod> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.list_playback_speed_vod;

	/** Response target class. */
	private static final Class<ResponseListPlaybackSpeedVod> responseTargetClass = ResponseListPlaybackSpeedVod.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListPlaybackSpeedVodOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListPlaybackSpeedVodOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
