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
