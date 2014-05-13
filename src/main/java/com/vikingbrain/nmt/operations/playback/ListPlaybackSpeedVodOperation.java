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
