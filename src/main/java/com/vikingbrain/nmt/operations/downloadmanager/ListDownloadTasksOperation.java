package com.vikingbrain.nmt.operations.downloadmanager;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.downloadmanager.ResponseListDownloadTasks;

/**
 * List all exist download tasks.
 * Execution example: http://popcorn:8008/download_manager?arg0=list_download_tasks
 * 
 * @author vikingBrain
 */
public class ListDownloadTasksOperation extends AbstractDownloadManagerOperation<ResponseListDownloadTasks> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.DOWNLOAD_MANAGER.list_download_tasks;
	
	/** Response target class. */
	private static final Class<ResponseListDownloadTasks> responseTargetClass = ResponseListDownloadTasks.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListDownloadTasksOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListDownloadTasksOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
