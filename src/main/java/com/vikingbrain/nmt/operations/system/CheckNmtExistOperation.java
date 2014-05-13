package com.vikingbrain.nmt.operations.system;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.system.ResponseCheckNmtExist;

/**
 * Operation that checks if there is a NMT at the IP specified.
 * Execution example: http://popcorn:8008/system?arg0=check_nmt_exist
 * 
 * @author vikingBrain
 */
public class CheckNmtExistOperation extends AbstractSystemOperation<ResponseCheckNmtExist> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.check_nmt_exist;

	/** Response target class. */
	private static final Class<ResponseCheckNmtExist> responseTargetClass = ResponseCheckNmtExist.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public CheckNmtExistOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "CheckNmtExistOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
