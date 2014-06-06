package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseListSlideShowEffect;

/**
 * List all the supported slide show transition effects.
 * Execution example: http://popcorn:8008/setting?arg0=list_slide_show_effect
 * 
 * @author vikingBrain
 */
public class ListSlideShowEffectOperation extends AbstractSettingOperation<ResponseListSlideShowEffect> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.list_slide_show_effect;

	/** Response target class. */
	private static final Class<ResponseListSlideShowEffect> responseTargetClass = ResponseListSlideShowEffect.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListSlideShowEffectOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListSlideShowEffectOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
