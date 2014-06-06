package com.vikingbrain.nmt.operations.system;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.system.ResponseGetFirmwareVersion;

/**
 * Retrieve current firmware version.
 * Execution example: Example: http://popcorn:8008/system?arg0=get_firmware_version
 * @author vikingBrain
 */
public class GetFirmwareVersionOperation extends AbstractSystemOperation<ResponseGetFirmwareVersion> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.get_firmware_version;
	
	/** Response target class. */
	private static final Class<ResponseGetFirmwareVersion> responseTargetClass = ResponseGetFirmwareVersion.class;

	/**
	 * Constructor. 
	 * @param operationFactory the operation factory
	 */
	public GetFirmwareVersionOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);		
	}
	
	@Override
	public String toString() {
		return "GetFirmwareVersionOperation [getOperationType()="
				+ getOperationType() + "]";
	}	

}
