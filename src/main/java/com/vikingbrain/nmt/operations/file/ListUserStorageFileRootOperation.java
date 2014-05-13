package com.vikingbrain.nmt.operations.file;

import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.util.Constants;

/**
 * List all the files or folder in user storage.
 * Execution example: 
 * http://popcorn:8008/file_operation?arg0=list_user_storage_file&arg1=&arg2=0&arg3=10&arg4=true&arg5=true&arg6=true&arg7=
 * 
 * @author vikingBrain
 *
 */
public class ListUserStorageFileRootOperation extends ListUserStorageFileOperation {

	/** Root full path. */
	private static final String ROOT_FULL_PATH = Constants.EMPTY_STRING;	
		
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param offset the offset to start
	 * @param numberElements the number of elements
	 */
	public ListUserStorageFileRootOperation(TheDavidboxOperationFactory operationFactory, int offset, int numberElements) {
		super(operationFactory, ROOT_FULL_PATH, offset, numberElements);		
	}

}
