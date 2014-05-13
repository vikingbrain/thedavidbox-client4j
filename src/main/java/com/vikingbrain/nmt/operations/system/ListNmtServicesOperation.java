package com.vikingbrain.nmt.operations.system;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.system.ResponseListNmtServices;

/**
 *  List all available NMT services.
 *  Execution example: http://popcorn:8008/system?arg0=list_nmt_services
 * @author vikingBrain
 */
public class ListNmtServicesOperation extends AbstractSystemOperation<ResponseListNmtServices> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.list_nmt_services;

	/** Response target class. */
	private static final Class<ResponseListNmtServices> responseTargetClass = ResponseListNmtServices.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListNmtServicesOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListNmtServicesOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
