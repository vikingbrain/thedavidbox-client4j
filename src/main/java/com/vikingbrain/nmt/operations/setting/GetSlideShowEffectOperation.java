package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseGetSlideShowEffect;

/**
 * Operation that retrieves current slide show effect.
 * Execution example: http://popcorn:8008/setting?arg0=get_slide_show_effect
 * 
 * @author vikingBrain
 */
public class GetSlideShowEffectOperation extends AbstractSettingOperation<ResponseGetSlideShowEffect> {
	
	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.get_slide_show_effect;

	/** Response target class. */
	private static final Class<ResponseGetSlideShowEffect> responseTargetClass = ResponseGetSlideShowEffect.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public GetSlideShowEffectOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "GetSlideShowEffectOperation [getOperationType()="
				+ getOperationType() + "]";
	}
	
}
