package com.vikingbrain.nmt.operations.downloadmanager;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.downloadmanager.ResponseGetDownloadAgentStatus;

/**
 * Operation that retrieve current download agent's status.
 * Execution example: http://popcorn:8008/download_manager?arg0=get_download_agent_status
 * 
 * @author vikingBrain
 */
public class GetDownloadAgentStatusOperation extends AbstractDownloadManagerOperation<ResponseGetDownloadAgentStatus> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.DOWNLOAD_MANAGER.get_download_agent_status;
	
	/** Response target class. */
	private static final Class<ResponseGetDownloadAgentStatus> responseTargetClass = ResponseGetDownloadAgentStatus.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public GetDownloadAgentStatusOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "GetDownloadAgentStatusOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
