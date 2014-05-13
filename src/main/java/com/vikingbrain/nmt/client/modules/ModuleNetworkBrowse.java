package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.networkbrowse.ListNetworkResourceOperation;

/**
 * This module is use to browse Samba and NFS shared.
 * 
 * @author vikingBrain
 */
public interface ModuleNetworkBrowse extends BaseModule {

	
	/**
	 * It creates an operation that lists all the network resource(s).
	 * @return the operation created
	 */
	ListNetworkResourceOperation buildListNetworkResourceOperation();
	
}
