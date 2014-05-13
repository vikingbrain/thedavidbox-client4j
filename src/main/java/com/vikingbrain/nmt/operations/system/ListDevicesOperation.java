package com.vikingbrain.nmt.operations.system;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.system.ResponseListDevices;

/**
 * Operation that list all available devices.
 * Execution example: http://popcorn:8008/system?arg0=list_devices
 * 
 * @author vikingBrain
 */
public class ListDevicesOperation extends AbstractSystemOperation<ResponseListDevices> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.list_devices;

	/** Response target class. */
	private static final Class<ResponseListDevices> responseTargetClass = ResponseListDevices.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListDevicesOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListDevicesOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
