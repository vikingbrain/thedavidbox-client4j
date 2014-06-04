package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;

/**
 * Operation that retrieves current system language.
 * Execution example: http://popcorn:8008/setting?arg0=get_language
 * 
 * @author vikingBrain
 */
public class GetLanguageOperation extends AbstractGetLanguageOperation {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.get_language;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public GetLanguageOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType);
	}

	@Override
	public String toString() {
		return "GetLanguageOperation [getOperationType()=" + getOperationType()
				+ "]";
	}	

}
