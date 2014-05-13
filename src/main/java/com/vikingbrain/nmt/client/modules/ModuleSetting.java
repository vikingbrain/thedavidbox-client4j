package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.setting.ListNetworkSharedFolderOperation;

/**
 * It allows to create the operations related to the setting module.
 * 
 * @author vikingBrain
 */
public interface ModuleSetting extends BaseModule {

	/**
	 * It creates an operation that lists all the shared network folder(s) added for local access.
	 * @return the operation created
	 */	
	ListNetworkSharedFolderOperation buildListNetworkSharedFolderOperation();
}
