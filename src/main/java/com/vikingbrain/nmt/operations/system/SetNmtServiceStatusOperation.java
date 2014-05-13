package com.vikingbrain.nmt.operations.system;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Start/stop a NMT service.
 * Execution example: http://popcorn:8008/system?arg0=set_nmt_service_status&arg1=ftp&arg2=true
 * @author vikingBrain
 */
public class SetNmtServiceStatusOperation extends AbstractSystemOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.set_nmt_service_status;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required attributes. */
	private String serviceName;
	private boolean status;

	/**
	 * Constructor.
	 * @param operationFactory operationFactory the operation factory
	 * @param serviceName the service name
	 * @param status the status to set
	 */
	public SetNmtServiceStatusOperation(TheDavidboxOperationFactory operationFactory, String serviceName, boolean status) {
		super(operationFactory, operationType, responseTargetClass);
		this.serviceName = serviceName;
		this.status = status;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", serviceName);
		httpArguments.put("arg2", String.valueOf(status));
		
		return httpArguments;		
	}

	public final String getServiceName() {
		return serviceName;
	}

	public final void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public final boolean isStatus() {
		return status;
	}

	public final void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "SetNmtServiceStatusOperation [serviceName=" + serviceName
				+ ", status=" + status + ", getOperationType()="
				+ getOperationType() + "]";
	}	
	
}
