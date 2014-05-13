package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.upnp.ListUpnpServerFilesOperation;
import com.vikingbrain.nmt.operations.upnp.ListUpnpServerFilesRootOperation;
import com.vikingbrain.nmt.operations.upnp.ListUpnpServerOperation;

/**
 * It allows to create the operations related to the uPnP AV module.
 * 
 * @author vikingBrain
 */
public interface ModuleUpnp extends BaseModule {

	/**
	 * It creates an operation that lists all List all the UPNP server(s).
	 * @return the operation created
	 */		
	ListUpnpServerOperation buildListUpnpServerOperation();

	/**
	 * It creates an operation that lists all the file or folder in the root of an UPNP server.
	 * @param urlUpnpServer
	 * @param offset
	 * @param numberElements
	 * @return
	 */
	ListUpnpServerFilesRootOperation buildListUpnpServerFilesRootOperation(String urlUpnpServer, int offset, int numberElements);
	
	/**
	 * It creates an operation that lists all the file or folder in UPNP server.
	 * @param urlUpnpServer
	 * @param directoryId
	 * @param offset
	 * @param numberElements
	 * @return
	 */
	ListUpnpServerFilesOperation buildListUpnpServerFilesOperation(String urlUpnpServer, String directoryId, int offset, int numberElements);
	
}
