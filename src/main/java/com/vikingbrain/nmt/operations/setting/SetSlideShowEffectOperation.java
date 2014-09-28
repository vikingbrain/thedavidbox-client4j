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

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that enable/disable or set current slide show transition effect.
 * Execution example: http://popcorn:8008/setting?arg0=set_slide_show_effect&arg1=fade
 * 
 * @author vikingBrain
 */
public class SetSlideShowEffectOperation extends AbstractSettingOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.set_slide_show_effect;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required attributes. */
	//Any options returns from ListSlideShowEffect operation
	private String slideShowEffect;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param slideShowEffect Any options returns from ListSlideShowEffect operation
	 */
	public SetSlideShowEffectOperation(TheDavidboxOperationFactory operationFactory, String slideShowEffect) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.slideShowEffect = slideShowEffect;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", slideShowEffect);

		return httpArguments;
	}	

	/**
	 * Getter of property.
	 * @return the slideShowEffect
	 */
	public final String getSlideShowEffect() {
		return slideShowEffect;
	}

	/**
	 * Setter of property.
	 * @param slideShowEffect the slideShowEffect to set
	 */
	public final void setSlideShowEffect(String slideShowEffect) {
		this.slideShowEffect = slideShowEffect;
	}
	
	@Override
	public String toString() {
		return "SetSlideShowEffectOperation [slideShowEffect=" + slideShowEffect
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
