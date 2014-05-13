package com.vikingbrain.nmt.operations.system;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.system.ResponseGetNmtServiceStatus;

/**
 * Retrieve current NMT service's status.
 * Execution example: Example: http://popcorn:8008/system?arg0=get_nmt_service_status&arg1=ftp
 * @author vikingBrain
 */
public class GetNmtServiceStatusOperation extends AbstractSystemOperation<ResponseGetNmtServiceStatus> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.get_nmt_service_status;
	
	/** Response target class. */
	private static final Class<ResponseGetNmtServiceStatus> responseTargetClass = ResponseGetNmtServiceStatus.class;

	/** Required attributes. */
	private String serviceName;

	/**
	 * Constructor. 
	 * @param operationFactory the operation factory
	 * @param serviceName the service name
	 */
	public GetNmtServiceStatusOperation(TheDavidboxOperationFactory operationFactory, String serviceName) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.serviceName = serviceName;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", serviceName);
		
		return httpArguments;
	}

	public String getServiceName() {
		return serviceName;
	}

	public final void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	@Override
	public String toString() {
		return "GetNmtServiceStatusOperation [serviceName=" + serviceName
				+ ", getOperationType()=" + getOperationType() + "]";
	}		
	
}
