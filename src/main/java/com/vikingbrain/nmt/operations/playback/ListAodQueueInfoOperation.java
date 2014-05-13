package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseListAodQueueInfo;

/**
 * List of audio files on NMT queue.
 * Execution example: http://popcorn:8008/playback?arg0=list_aod_queue_info
 * @author vikingBrain
 */
public class ListAodQueueInfoOperation extends AbstractPlayblackOperation<ResponseListAodQueueInfo> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.list_aod_queue_info;

	/** Response target class. */
	private static final Class<ResponseListAodQueueInfo> responseTargetClass = ResponseListAodQueueInfo.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 */
	public ListAodQueueInfoOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListAodQueueInfoOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
