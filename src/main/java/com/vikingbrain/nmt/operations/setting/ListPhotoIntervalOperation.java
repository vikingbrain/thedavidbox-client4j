package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseListTimes;

/**
 * Operation that lists all the supported photo interval time in second(s).
 * Execution example: http://popcorn:8008/setting?arg0=list_photo_interval
 * 
 * @author vikingBrain
 */
public class ListPhotoIntervalOperation extends AbstractSettingOperation<ResponseListTimes> {
	
	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.list_photo_interval;

	/** Response target class. */
	private static final Class<ResponseListTimes> responseTargetClass = ResponseListTimes.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListPhotoIntervalOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListPhotoIntervalOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
