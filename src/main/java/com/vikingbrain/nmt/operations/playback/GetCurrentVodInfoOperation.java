package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseGetCurrentVodInfo;

/**
 * Operation that gets the video that is currently playing on NMT.
 * Execution example: http://popcorn:8008/playback?arg0=get_current_vod_info
 * 
 * @author vikingBrain
 */
public class GetCurrentVodInfoOperation extends AbstractPlayblackOperation<ResponseGetCurrentVodInfo> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.get_current_vod_info;
	
	/** Response target class. */
	private static final Class<ResponseGetCurrentVodInfo> responseTargetClass = ResponseGetCurrentVodInfo.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 */
	public GetCurrentVodInfoOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "GetCurrentVodInfoOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
