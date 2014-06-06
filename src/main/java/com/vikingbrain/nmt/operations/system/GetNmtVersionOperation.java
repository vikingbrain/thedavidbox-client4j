package com.vikingbrain.nmt.operations.system;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.system.ResponseGetNmtVersion;

/**
 * Retrieve current NMT Apps version.
 * Execution example: Example: http://http://popcorn:8008/system?arg0=get_nmt_version
 * @author vikingBrain
 */
public class GetNmtVersionOperation extends AbstractSystemOperation<ResponseGetNmtVersion> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.get_nmt_version;
	
	/** Response target class. */
	private static final Class<ResponseGetNmtVersion> responseTargetClass = ResponseGetNmtVersion.class;

	/**
	 * Constructor. 
	 * @param operationFactory the operation factory
	 */
	public GetNmtVersionOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);		
	}
	
	@Override
	public String toString() {
		return "GetNmtVersionOperation [getOperationType()="
				+ getOperationType() + "]";
	}	

}
