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

import com.vikingbrain.nmt.client.modules.ModuleDeployment;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.deployment.GetDatabaseOperation;
import com.vikingbrain.nmt.operations.deployment.SetDatabaseOperation;

/**
 * This module is use to install and uninstall application through App Store.
 * 
 * @author vikingBrain
 */
public class ModuleDeploymentImpl extends AbstractModule implements ModuleDeployment {

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ModuleDeploymentImpl(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory);
	}
	
	/** {@inheritDoc} */		
	public GetDatabaseOperation buildGetDatabaseOperation(String databasePath, String key, String name) {
		return new GetDatabaseOperation(getOperationFactory(), databasePath, key, name);
	}

	/** {@inheritDoc} */		
	public SetDatabaseOperation buildSetDatabaseOperation(String databasePath, String key, String name, String value) {
		return new SetDatabaseOperation(getOperationFactory(), databasePath, key, name, value);
	}
	
}
