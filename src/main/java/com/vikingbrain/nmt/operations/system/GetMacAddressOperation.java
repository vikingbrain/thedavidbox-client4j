package com.vikingbrain.nmt.operations.system;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.system.ResponseGetMacAddress;

/**
 * Retrieve current MAC Address.
 * Execution example: Example: http://http://popcorn:8008/system?arg0=get_mac_address
 * @author vikingBrain
 */
public class GetMacAddressOperation extends AbstractSystemOperation<ResponseGetMacAddress> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.get_mac_address;
	
	/** Response target class. */
	private static final Class<ResponseGetMacAddress> responseTargetClass = ResponseGetMacAddress.class;

	/**
	 * Constructor. 
	 * @param operationFactory the operation factory
	 */
	public GetMacAddressOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);		
	}
	
	@Override
	public String toString() {
		return "GetMacAddressOperation [getOperationType()="
				+ getOperationType() + "]";
	}	

}
