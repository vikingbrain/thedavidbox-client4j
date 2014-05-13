package com.vikingbrain.nmt.operations.deployment;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that retrieves data which store in database.
 * Execution example: http://popcorn:8008/deployment?arg0=get_database&arg1=path/media.db&arg2=1&arg3=name
 * 
 * @author vikingBrain
 */
public class GetDatabaseOperation extends AbstractDeploymentOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.DEPLOYMENT.get_database;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required operation attributes. */
	private String databasePath;
	private String key;
	private String name;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param databasePath the source path
	 * @param key the key
	 * @param name the name
	 */
	public GetDatabaseOperation(TheDavidboxOperationFactory operationFactory, String databasePath, String key, String name) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.databasePath = databasePath;
		this.key = key;
		this.name = name;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", databasePath);
		httpArguments.put("arg2", key);		
		httpArguments.put("arg3", name);	

		return httpArguments;
	}	

	/**
	 * Getter of property.
	 * @return the databasePath
	 */
	public final String getDatabasePath() {
		return databasePath;
	}

	/**
	 * Setter of property.
	 * @param databasePath the databasePath to set
	 */
	public final void setDatabasePath(String databasePath) {
		this.databasePath = databasePath;
	}

	/**
	 * Getter of property.
	 * @return the key
	 */
	public final String getKey() {
		return key;
	}

	/**
	 * Setter of property.
	 * @param key the key to set
	 */
	public final void setKey(String key) {
		this.key = key;
	}

	/**
	 * Getter of property.
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Setter of property.
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GetDatabaseOperation [databasePath=" + databasePath + ", key="
				+ key + ", name=" + name + ", getOperationType()="
				+ getOperationType() + "]";
	}

}
