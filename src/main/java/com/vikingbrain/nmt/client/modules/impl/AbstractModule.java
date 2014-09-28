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
package com.vikingbrain.nmt.client.modules.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;

/**
 * Abstract class for a Module.
 * 
 * @author vikingBrain
 */
public abstract class AbstractModule {

	/** Logger. */
	static Logger logger = LoggerFactory.getLogger(AbstractModule.class);
	
	/** The operation factory. */
	private final TheDavidboxOperationFactory operationFactory;
	
	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public AbstractModule(TheDavidboxOperationFactory operationFactory) {
		super();
		this.operationFactory = operationFactory;
	}

	/**
	 * Getter of property.
	 * @return the operation factory
	 */
	public final TheDavidboxOperationFactory getOperationFactory() {
		return operationFactory;
	}
	
}
