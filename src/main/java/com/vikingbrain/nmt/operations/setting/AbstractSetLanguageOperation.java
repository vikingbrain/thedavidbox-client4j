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

import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Abstract class for operation that are just setting language.
 * 
 * @author vikingBrain
 */
public class AbstractSetLanguageOperation extends AbstractSettingOperation<ResponseSimple> {

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required attributes. */
	//Any options returns from List language operation or list subtitle language
	private String language;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param operationType the operation type
	 * @param language the language to set
	 */
	public AbstractSetLanguageOperation(TheDavidboxOperationFactory operationFactory, OperationType operationType, String language) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.language = language;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", language);

		return httpArguments;
	}	

	/**
	 * Getter of property.
	 * @return the language
	 */
	public final String getLanguage() {
		return language;
	}

	/**
	 * Setter of property.
	 * @param language the language to set
	 */
	public final void setLanguage(String language) {
		this.language = language;
	}
	
}
