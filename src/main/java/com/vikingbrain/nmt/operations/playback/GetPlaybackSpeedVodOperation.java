package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseGetPlaybackSpeedVod;

/**
 * Operation that retrieves current playback speed.
 * Execution example: http://popcorn:8008/playback?arg0=get_playback_speed_vod
 * 
 * @author vikingBrain
 */
public class GetPlaybackSpeedVodOperation extends AbstractPlayblackOperation<ResponseGetPlaybackSpeedVod> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.get_playback_speed_vod;
	
	/** Response target class. */
	private static final Class<ResponseGetPlaybackSpeedVod> responseTargetClass = ResponseGetPlaybackSpeedVod.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public GetPlaybackSpeedVodOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "GetPlaybackSpeedVodOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
