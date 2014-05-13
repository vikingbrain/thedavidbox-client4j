package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseGetCurrentAodInfo;

/**
 * Operation that gets the audio that is currently playing on NMT.
 * Execution example: http://popcorn:8008/playback?arg0=get_current_aod_info
 * 
 * @author vikingBrain
 */
public class GetCurrentAodInfoOperation extends AbstractPlayblackOperation<ResponseGetCurrentAodInfo> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.get_current_aod_info;
	
	/** Response target class. */
	private static final Class<ResponseGetCurrentAodInfo> responseTargetClass = ResponseGetCurrentAodInfo.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 */
	public GetCurrentAodInfoOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "GetCurrentAodInfoOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
