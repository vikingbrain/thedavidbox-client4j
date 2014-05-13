package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.deployment.GetDatabaseOperation;
import com.vikingbrain.nmt.operations.deployment.SetDatabaseOperation;

/**
 * This module is use to install and uninstall application through App Store.
 * 
 * @author vikingBrain
 */
public interface ModuleDeployment extends BaseModule {

	
	/**
	 * It creates an operation that retrieves data which store in database.
	 * @param databasePath the source path
	 * @param key the key
	 * @param name the name
	 * @return the operation created
	 */
	GetDatabaseOperation buildGetDatabaseOperation(String databasePath, String key, String name);
	
	/**
	 * It creates an operation that store data into database.
	 * @param databasePath the source path
	 * @param key the key
	 * @param name the name
	 * @param value the value
	 * @return the operation created
	 */
	SetDatabaseOperation buildSetDatabaseOperation(String databasePath, String key, String name, String value);
	
}
