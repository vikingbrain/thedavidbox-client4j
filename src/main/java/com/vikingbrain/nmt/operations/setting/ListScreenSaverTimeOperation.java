package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseListTimes;

/**
 * Operation that lists all the supported screen saver time in second(s).
 * Execution example: http://popcorn:8008/setting?arg0=list_screen_saver_time
 * 
 * @author vikingBrain
 */
public class ListScreenSaverTimeOperation extends AbstractSettingOperation<ResponseListTimes> {
	
	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.list_screen_saver_time;

	/** Response target class. */
	private static final Class<ResponseListTimes> responseTargetClass = ResponseListTimes.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListScreenSaverTimeOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListScreenSaverTimeOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
