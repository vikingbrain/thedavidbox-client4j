package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;

/**
 * Operation that enable/disable or set current subtitle language.
 * Execution example: http://popcorn:8008/setting?arg0=set_subtitle_language&arg1=english
 * 
 * @author vikingBrain
 */
public class SetSubtitleLanguageOperation extends AbstractSetLanguageOperation {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.set_subtitle_language;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param language Any options returns from ListSubtitleLanguage operation
	 */
	public SetSubtitleLanguageOperation(TheDavidboxOperationFactory operationFactory, String language) {
		super(operationFactory, operationType, language);				
	}

	@Override
	public String toString() {
		return "SetSubtitleLanguageOperation [getLanguage()=" + getLanguage()
				+ ", getOperationType()=" + getOperationType() + "]";
	}
	
}
