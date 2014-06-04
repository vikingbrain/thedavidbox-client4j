package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;

/**
 * Operation that lists all the supported system languages.
 * Execution example: http://popcorn:8008/setting?arg0=list_language
 * 
 * @author vikingBrain
 */
public class ListLanguageOperation extends AbstractListLanguageOperation {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.list_language;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListLanguageOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType);
	}

	@Override
	public String toString() {
		return "ListLanguageOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
