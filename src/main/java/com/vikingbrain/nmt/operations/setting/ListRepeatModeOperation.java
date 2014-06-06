package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseListRepeatMode;

/**
 * Operation that lists all the supported play modes.
 * Execution example: http://popcorn:8008/setting?arg0=list_repeat_mode
 * 
 * @author vikingBrain
 */
public class ListRepeatModeOperation extends AbstractSettingOperation<ResponseListRepeatMode> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.list_repeat_mode;

	/** Response target class. */
	private static final Class<ResponseListRepeatMode> responseTargetClass = ResponseListRepeatMode.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListRepeatModeOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListRepeatModeOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
