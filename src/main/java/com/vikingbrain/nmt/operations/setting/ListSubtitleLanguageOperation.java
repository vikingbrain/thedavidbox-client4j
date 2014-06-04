package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;

/**
 * Operation that lists all the supported subtitle languages.
 * Execution example: http://popcorn:8008/setting?arg0=list_subtitle_language
 * 
 * @author vikingBrain
 */
public class ListSubtitleLanguageOperation extends AbstractListLanguageOperation {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.list_subtitle_language;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListSubtitleLanguageOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType);
	}

	@Override
	public String toString() {
		return "ListSubtitleLanguageOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
