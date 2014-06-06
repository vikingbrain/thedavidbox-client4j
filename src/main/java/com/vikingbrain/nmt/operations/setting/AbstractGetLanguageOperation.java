package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseGetLanguage;

/**
 * Abstract class for operation that are just setting language.
 * 
 * @author vikingBrain
 */
public class AbstractGetLanguageOperation extends AbstractSettingOperation<ResponseGetLanguage> {

	/** Response target class. */
	private static final Class<ResponseGetLanguage> responseTargetClass = ResponseGetLanguage.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param operationType the operation type
	 */
	public AbstractGetLanguageOperation(TheDavidboxOperationFactory operationFactory, OperationType operationType) {
		super(operationFactory, operationType, responseTargetClass);
	}

}
