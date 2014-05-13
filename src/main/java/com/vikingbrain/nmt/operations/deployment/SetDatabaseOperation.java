package com.vikingbrain.nmt.operations.deployment;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that store data into database.
 * Execution example http://popcorn:8008/deployment?arg0=set_database&arg1=path/media.db&arg2=1&arg3=name&arg4=12
 * 
 * @author vikingBrain
 */
public class SetDatabaseOperation extends AbstractDeploymentOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.DEPLOYMENT.set_database;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required operation attributes. */
	private String databasePath;
	private String key;
	private String name;
	private String value;
	
	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param databasePath the source path
	 * @param key the key
	 * @param name the name
	 * @param value the value
	 */
	public SetDatabaseOperation(TheDavidboxOperationFactory operationFactory, String databasePath, String key, String name, String value) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.databasePath = databasePath;
		this.key = key;
		this.name = name;
		this.value = value;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", databasePath);
		httpArguments.put("arg2", key);		
		httpArguments.put("arg3", name);
		httpArguments.put("arg4", value);

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

	/**
	 * Getter of property.
	 * @return the value
	 */
	public final String getValue() {
		return value;
	}

	/**
	 * Setter of property.
	 * @param value the value to set
	 */
	public final void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SetDatabaseOperation [databasePath=" + databasePath + ", key="
				+ key + ", name=" + name + ", value=" + value
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
