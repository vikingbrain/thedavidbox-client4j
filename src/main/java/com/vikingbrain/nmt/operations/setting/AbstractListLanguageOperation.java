package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseListLanguage;

/**
 * Abstract class for operation that are just listing languages.
 * 
 * @author vikingBrain
 */
public class AbstractListLanguageOperation extends AbstractSettingOperation<ResponseListLanguage> {

	/** Response target class. */
	private static final Class<ResponseListLanguage> responseTargetClass = ResponseListLanguage.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param operationType the operation type
	 */
	public AbstractListLanguageOperation(TheDavidboxOperationFactory operationFactory, OperationType operationType) {
		super(operationFactory, operationType, responseTargetClass);
	}

}
