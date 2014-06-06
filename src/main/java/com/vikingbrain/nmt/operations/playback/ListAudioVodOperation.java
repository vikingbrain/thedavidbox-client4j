package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseListAudioVod;

/**
 * List all the audio streams in current file.
 * Execution example: http://popcorn:8008/playback?arg0=list_audio_vod
 * 
 * @author vikingBrain
 */
public class ListAudioVodOperation extends AbstractPlayblackOperation<ResponseListAudioVod> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.list_audio_vod;

	/** Response target class. */
	private static final Class<ResponseListAudioVod> responseTargetClass = ResponseListAudioVod.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListAudioVodOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListAudioVodOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
