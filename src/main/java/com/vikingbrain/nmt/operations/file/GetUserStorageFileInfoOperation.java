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
package com.vikingbrain.nmt.operations.file;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.file.ResponseGetUserStorageFileInfo;

/**
 * Retrieve user storage file info.
 * Execution example: 
 * http://popcorn:8008/file_operation?arg0=get_user_storage_file_info&arg1=/opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/video/sample.avi
 * 
 * @author vikingBrain
 *
 */
public class GetUserStorageFileInfoOperation extends AbstractFileOperation<ResponseGetUserStorageFileInfo> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.FILE_OPERATION.get_user_storage_file_info;

	/** Response target class. */
	private static final Class<ResponseGetUserStorageFileInfo> responseTargetClass = ResponseGetUserStorageFileInfo.class;

	/** Required operation attributes. */
	private String fullPath;	
		
	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param fullPath the full path 
	 */
	public GetUserStorageFileInfoOperation(TheDavidboxOperationFactory operationFactory, String fullPath) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.fullPath = fullPath;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", fullPath);
		
		return httpArguments;
	}

	public final String getFullPath() {
		return fullPath;
	}

	public final void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	@Override
	public String toString() {
		return "GetUserStorageFileInfoOperation [fullPath=" + fullPath
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
