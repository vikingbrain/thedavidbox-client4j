package com.vikingbrain.nmt.operations.metadatadatabase;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.metadatadatabase.ResponseCheckDatabase;

/**
 * Operation that checks metadata database status checking.
 * Execution example: http://popcorn:8008/metadata_database?arg0=check_database&arg1=/opt/sybhttpd/localhost.drives/SATA_DISK
 * 
 * @author vikingBrain
 */
public class CheckDatabaseOperation extends AbstractMetadatadatabaseOperation<ResponseCheckDatabase> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.METADATA_DATABASE.check_database;

	/** Response target class. */
	private static final Class<ResponseCheckDatabase> responseTargetClass = ResponseCheckDatabase.class;

	/** Required operation attributes. */
	/** Devide url. */
	private String deviceUrl;
	
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param deviceUrl the device url
	 */
	public CheckDatabaseOperation(TheDavidboxOperationFactory operationFactory, String deviceUrl) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.deviceUrl = deviceUrl;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", deviceUrl);
		
		return httpArguments;
	}

	public final String getDeviceUrl() {
		return deviceUrl;
	}

	public final void setDeviceUrl(String deviceUrl) {
		this.deviceUrl = deviceUrl;
	}

	@Override
	public String toString() {
		return "CheckDatabaseOperation [deviceUrl=" + deviceUrl
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
