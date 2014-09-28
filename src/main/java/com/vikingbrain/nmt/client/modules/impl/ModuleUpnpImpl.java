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
