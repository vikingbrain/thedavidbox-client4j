package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseListSubtitleVod;

/**
 * List all the supported subtitle(s) for current VOD playback. (DVD media format and non-DVD media format)
 * Execution example: http://popcorn:8008/playback?arg0=list_subtitle_vod
 * 
 * @author vikingBrain
 */
public class ListSubtitleVodOperation extends AbstractPlayblackOperation<ResponseListSubtitleVod> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.list_subtitle_vod;

	/** Response target class. */
	private static final Class<ResponseListSubtitleVod> responseTargetClass = ResponseListSubtitleVod.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListSubtitleVodOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListSubtitleVodOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
