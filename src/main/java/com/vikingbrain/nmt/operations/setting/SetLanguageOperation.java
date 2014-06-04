package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;

/**
 * Operation that sets the system language.
 * Execution example: http://popcorn:8008/setting?arg0=set_language&arg1=english
 * 
 * @author vikingBrain
 */
public class SetLanguageOperation extends AbstractSetLanguageOperation {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.set_language;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param language Any options returns from ListLanguage operation
	 */
	public SetLanguageOperation(TheDavidboxOperationFactory operationFactory, String language) {
		super(operationFactory, operationType, language);				
	}

	@Override
	public String toString() {
		return "SetLanguageOperation [getLanguage()=" + getLanguage()
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
