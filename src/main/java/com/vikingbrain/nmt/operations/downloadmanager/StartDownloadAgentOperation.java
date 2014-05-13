package com.vikingbrain.nmt.operations.downloadmanager;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that starts download agent.
 * Execution example: http://popcorn:8008/download_manager?arg0=start_download_agent
 * 
 * @author vikingBrain
 */
public class StartDownloadAgentOperation extends AbstractDownloadManagerOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.DOWNLOAD_MANAGER.start_download_agent;
	
	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public StartDownloadAgentOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "StartDownloadAgentOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
