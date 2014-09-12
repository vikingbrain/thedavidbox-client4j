package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseListPodQueueInfo;

/**
 * List of photo files on NMT queue.
 * Execution example: http://popcorn:8008/playback?arg0=list_pod_queue_info
 * @author vikingBrain
 */
public class ListPodQueueInfoOperation extends AbstractPlayblackOperation<ResponseListPodQueueInfo> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.list_pod_queue_info;

	/** Response target class. */
	private static final Class<ResponseListPodQueueInfo> responseTargetClass = ResponseListPodQueueInfo.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 */
	public ListPodQueueInfoOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListpodQueueInfoOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
