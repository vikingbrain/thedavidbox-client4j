package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseGetCurrentPodInfo;

/**
 * Operation that gets the photo that is currently playing on NMT.
 * Execution example: http://popcorn:8008/playback?arg0=get_current_pod_info
 * 
 * @author vikingBrain
 */
public class GetCurrentPodInfoOperation extends AbstractPlayblackOperation<ResponseGetCurrentPodInfo> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.get_current_pod_info;
	
	/** Response target class. */
	private static final Class<ResponseGetCurrentPodInfo> responseTargetClass = ResponseGetCurrentPodInfo.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 */
	public GetCurrentPodInfoOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "GetCurrentPodInfoOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
