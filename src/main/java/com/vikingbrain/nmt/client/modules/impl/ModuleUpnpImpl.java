package com.vikingbrain.nmt.client.modules.impl;

import com.vikingbrain.nmt.client.modules.ModuleUpnp;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.upnp.ListUpnpServerFilesOperation;
import com.vikingbrain.nmt.operations.upnp.ListUpnpServerFilesRootOperation;
import com.vikingbrain.nmt.operations.upnp.ListUpnpServerOperation;

/**
 * It allows to create the operations related to the uPnP AV module.
 * 
 * @author vikingBrain
 */
public class ModuleUpnpImpl extends AbstractModule implements ModuleUpnp {

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ModuleUpnpImpl(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory);
	}

	/** {@inheritDoc} */		
	public ListUpnpServerOperation buildListUpnpServerOperation() {
		return new ListUpnpServerOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public ListUpnpServerFilesRootOperation buildListUpnpServerFilesRootOperation(String urlUpnpServer, int offset, int numberElements) {
		return new ListUpnpServerFilesRootOperation(getOperationFactory(), urlUpnpServer, offset, numberElements);
	}

	/** {@inheritDoc} */
	public ListUpnpServerFilesOperation buildListUpnpServerFilesOperation(String urlUpnpServer, String directoryId, int offset, int numberElements) {
		return new ListUpnpServerFilesOperation(getOperationFactory(), urlUpnpServer, directoryId, offset, numberElements);
	}

}
