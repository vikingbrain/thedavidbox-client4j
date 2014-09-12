package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseGetTime;

/**
 * Operation that retrieves current photo interval time in second(s).
 * Execution example: http://popcorn:8008/setting?arg0=get_photo_interval
 * 
 * @author vikingBrain
 */
public class GetPhotoIntervalOperation extends AbstractSettingOperation<ResponseGetTime> {
	
	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.get_photo_interval;

	/** Response target class. */
	private static final Class<ResponseGetTime> responseTargetClass = ResponseGetTime.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public GetPhotoIntervalOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ResponseGetPhotoInterval [getOperationType()="
				+ getOperationType() + "]";
	}
	
}
