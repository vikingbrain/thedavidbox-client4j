package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseGetRepeatMode;

/**
 * Operation that retrieves current repeat mode.
 * Execution example: http://popcorn:8008/setting?arg0=get_repeat_mode
 * 
 * @author vikingBrain
 */
public class GetRepeatModeOperation extends AbstractSettingOperation<ResponseGetRepeatMode> {
	
	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.get_repeat_mode;

	/** Response target class. */
	private static final Class<ResponseGetRepeatMode> responseTargetClass = ResponseGetRepeatMode.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public GetRepeatModeOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "GetRepeatModeOperation [getOperationType()="
				+ getOperationType() + "]";
	}
	
}
