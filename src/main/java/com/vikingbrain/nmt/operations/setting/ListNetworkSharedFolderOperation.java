package com.vikingbrain.nmt.operations.setting;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.setting.ResponseListNetworkSharedFolder;

/**
 * Operation that lists all the shared network folder(s) added for local access.
 * Execution example: http://popcorn:8008/setting?arg0=list_network_shared_folder
 * 
 * @author vikingBrain
 */
public class ListNetworkSharedFolderOperation extends AbstractSettingOperation<ResponseListNetworkSharedFolder> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.list_network_shared_folder;

	/** Response target class. */
	private static final Class<ResponseListNetworkSharedFolder> responseTargetClass = ResponseListNetworkSharedFolder.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListNetworkSharedFolderOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListNetworkSharedFolderOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
