package com.vikingbrain.nmt.client.modules.impl;

import com.vikingbrain.nmt.client.modules.ModuleNetworkBrowse;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.networkbrowse.ListNetworkResourceOperation;

/**
 * This module is use to browse Samba and NFS shared.
 * 
 * @author vikingBrain
 */
public class ModuleNetworkBrowseImpl extends AbstractModule implements ModuleNetworkBrowse {

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ModuleNetworkBrowseImpl(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory);
	}
	
	/** {@inheritDoc} */		
	public ListNetworkResourceOperation buildListNetworkResourceOperation() {
		return new ListNetworkResourceOperation(getOperationFactory());
	}

	//TODO list_network_content
	
}
