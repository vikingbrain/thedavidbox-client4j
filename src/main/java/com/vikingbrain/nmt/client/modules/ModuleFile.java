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
