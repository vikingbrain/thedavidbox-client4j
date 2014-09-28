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
package com.vikingbrain.nmt.operations.upnp;

import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.util.Constants;

/**
 * List all the file or folder in the root of an UPNP server.
 * Execution example: 
 * http://popcorn:8008/upnp?arg0=list_upnp_server_files&arg1=http://...&arg2=&arg3=0&arg4=10&arg5=true&arg6=true&arg7=true&arg8=image/png
 *
 * @author vikingBrain
 *
 */
public class ListUpnpServerFilesRootOperation extends ListUpnpServerFilesOperation {

	/** Root full path. */
	private static final String ROOT_FULL_PATH = Constants.EMPTY_STRING;	
		
	/**
	 * Constructor. 
	 * @param operationFactory  the operation factory
	 * @param urlUpnpServer Url get from list_upnp_server function
	 * @param offset start number of the response list
	 * @param numberElements number of response to return
	 */
	public ListUpnpServerFilesRootOperation(TheDavidboxOperationFactory operationFactory, String urlUpnpServer, int offset, int numberElements) {
		super(operationFactory, urlUpnpServer, ROOT_FULL_PATH, offset, numberElements);		
	}

}
