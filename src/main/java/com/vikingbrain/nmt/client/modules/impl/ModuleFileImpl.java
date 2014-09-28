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

import com.vikingbrain.nmt.client.modules.ModuleFile;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.file.GetUserStorageFileInfoOperation;
import com.vikingbrain.nmt.operations.file.ListUserStorageFileOperation;
import com.vikingbrain.nmt.operations.file.ListUserStorageFileRootOperation;

/**
 * It allows to create the operations related to the file module.
 * 
 * @author vikingBrain
 */
public class ModuleFileImpl extends AbstractModule implements ModuleFile {

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ModuleFileImpl(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory);
	}

	/** {@inheritDoc} */
	public ListUserStorageFileRootOperation buildListUserStorageFileRootOperation(int offset, int numberElements) {
		return new ListUserStorageFileRootOperation(getOperationFactory(), offset, numberElements);
	}

	/** {@inheritDoc} */
	public ListUserStorageFileOperation buildListUserStorageFileOperation(String fullPath, int offset, int numberElements) {
		return new ListUserStorageFileOperation(getOperationFactory(), fullPath, offset, numberElements);
	}

	//TODO search_user_storage_file
	//operation not working http://popcorn:8008/file_operation?arg0=search_user_storage_file&arg1=/opt/sybhttpd/localhost.drives/SATA_DISK&arg2=0&arg3=10&arg4=true&arg5=true&arg6=true&arg7=&arg8=p
	//documentation: http://<hostname>:<port>/file_operation?arg0=search_user_storage_file&arg1=user_storage_path&arg2=0&arg3=10&arg4=true&arg5=true&arg6=true&arg7=&arg8=m
			
	//TODO create_user_storage_file
	
	//TODO write_user_storage_file
	
	//TODO read_user_storage_file
	
	
	public GetUserStorageFileInfoOperation buildGetUserStorageFileInfoOperation(String fullPath){
		return new GetUserStorageFileInfoOperation(getOperationFactory(), fullPath);
	}	
	
	//TODO copy_user_storage_file
	
	//TODO move_user_storage_file
	
	//TODO delete_user_storage_file
	
	//TODO create_user_storage_directory
	
	//TODO rename_user_storage_file
	
	//TODO select_user_storage_file_to_list
	
	//TODO delete_user_storage_file_from_list
	
	//TODO copy_user_storage_file_from_list
	
	//TODO move_user_storage_file_from_list
	
	//TODO create_app_storage
	
	//TODO change_app_storage_password
	
	//TODO create_app_storage_file
	
	//TODO write_app_storage_file
	
	//TODO read_app_storage_file
	
	//TODO get_app_storage_file_info
	
	//TODO copy_app_storage_file
	
	//TODO delete_app_storage
	
	//TODO delete_app_storage_file
	
	//TODO ripping
	
}
