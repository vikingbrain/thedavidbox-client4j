package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseListVodQueueInfo;

/**
 * List of video files on NMT queue.
 * Execution example: http://popcorn:8008/playback?arg0=list_vod_queue_info
 * @author vikingBrain
 */
public class ListVodQueueInfoOperation extends AbstractPlayblackOperation<ResponseListVodQueueInfo> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.list_vod_queue_info;

	/** Response target class. */
	private static final Class<ResponseListVodQueueInfo> responseTargetClass = ResponseListVodQueueInfo.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 */
	public ListVodQueueInfoOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListVodQueueInfoOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
