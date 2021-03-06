/*
 * Copyright 2011-2014 Rafael Iñigo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
