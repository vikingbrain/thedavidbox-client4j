package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.AbstractTheDavidboxOperation;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.DavidBoxResponse;

/**
 * Abstract class that represent a operation for the setting module.
 * 
 * @author vikingBrain
 *
 * @param <T> the type of the response object for the operation
 */
public abstract class AbstractSettingOperation<T extends DavidBoxResponse> extends AbstractTheDavidboxOperation<T> {

	/**
	 * Constructor.
	 * @param factory the operation factory
	 * @param operationType the operation type
	 * @param responseTargetClass the response target class
	 */
	protected AbstractSettingOperation(TheDavidboxOperationFactory factory, OperationType operationType, Class<T> responseTargetClass) {
		super(factory, operationType, responseTargetClass);
	}
	
}
