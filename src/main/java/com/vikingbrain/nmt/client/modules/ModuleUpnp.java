/*
 * Copyright 2011-2014 Rafael Iñigo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
