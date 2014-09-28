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

import com.vikingbrain.nmt.operations.file.GetUserStorageFileInfoOperation;
import com.vikingbrain.nmt.operations.file.ListUserStorageFileOperation;
import com.vikingbrain.nmt.operations.file.ListUserStorageFileRootOperation;

/**
 * It allows to create the operations related to the file module.
 * 
 * @author vikingBrain
 */
public interface ModuleFile extends BaseModule {

	/**
	 * It creates an operation that lists all the files on the root folder.
	 * @return the operation created
	 */	
	ListUserStorageFileRootOperation buildListUserStorageFileRootOperation(int offset, int numberElements);

	/**
	 * It creates an operation that lists all the files or folder in user storage.
	 * @return the operation created
	 */	
	ListUserStorageFileOperation buildListUserStorageFileOperation(String fullPath, int offset, int numberElements);
			
	/**
	 * It creates an operation that retrieves user storage file info.
	 * @return the operation created
	 */		
	GetUserStorageFileInfoOperation buildGetUserStorageFileInfoOperation(String fullPath);
	
}
