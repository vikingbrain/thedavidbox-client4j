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
import com.vikingbrain.nmt.operations.parameters.FileSorting;
import com.vikingbrain.nmt.responses.file.ResponseListUserStorageFile;

/**
 * List all the files or folder in user storage.
 * Execution example: 
 * http://popcorn:8008/file_operation?arg0=list_user_storage_file&arg1=/opt/sybhttpd/localhost.drives/SATA_DISK/Apps&arg2=0&arg3=10&arg4=true&arg5=true&arg6=true&arg7=
 * http://popcorn:8008/file_operation?arg0=list_user_storage_file&arg1=&arg2=0&arg3=100&arg4=true&arg5=false&arg6=false&arg7=&arg8=&arg9=false
 * 
 * @author vikingBrain
 *
 */
public class ListUserStorageFileOperation extends AbstractFileOperation<ResponseListUserStorageFile> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.FILE_OPERATION.list_user_storage_file;

	/** Response target class. */
	private static final Class<ResponseListUserStorageFile> responseTargetClass = ResponseListUserStorageFile.class;

	/** Required operation attributes. */
	private String fullPath;	
	private int offset;
	private int numberElements;	
	private boolean showFolders;
	private boolean showFiles;
	private boolean enableMoreInfo;
	private String mimeType;
	private FileSorting sorting;
	private Boolean enablePersistence;
		
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param fullPath the full path 
	 * @param offset the offset to start
	 * @param numberElements the number of elements
	 */
	public ListUserStorageFileOperation(TheDavidboxOperationFactory operationFactory, String fullPath, int offset, int numberElements) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.fullPath = fullPath;
		this.offset = offset;
		this.numberElements = numberElements;
		
		//Default client attributes
		this.showFolders =  operationFactory.getClientOptions().isDefaultShowFolders();
		this.showFiles =  operationFactory.getClientOptions().isDefaultShowFiles();		
		this.enableMoreInfo =  operationFactory.getClientOptions().isDefaultEnableMoreInfo();
		this.mimeType = operationFactory.getClientOptions().getDefaultMimeType();
		this.sorting = operationFactory.getClientOptions().getDefaultFileSorting();
		this.enablePersistence = operationFactory.getClientOptions().getDefaultEnablePersistence();
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", fullPath);
		httpArguments.put("arg2", String.valueOf(offset));
		httpArguments.put("arg3", String.valueOf(numberElements));		
		httpArguments.put("arg4", String.valueOf(showFolders));
		httpArguments.put("arg5", String.valueOf(showFiles));
		httpArguments.put("arg6", String.valueOf(enableMoreInfo));
		httpArguments.put("arg7", mimeType);
		//sorting
		httpArguments.put("arg8", sorting.getParamValue());
		//enable persistence
		if (null == enablePersistence){
			httpArguments.put("arg9", "");
		} else {
			httpArguments.put("arg9", enablePersistence.toString());	
		}		
		
		return httpArguments;
	}

	public final String getFullPath() {
		return fullPath;
	}

	public final void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public final int getOffset() {
		return offset;
	}

	public final void setNumberElements(int numberElements) {
		this.numberElements = numberElements;
	}

	public final boolean isShowFolders() {
		return showFolders;
	}

	public final void setShowFolders(boolean showFolders) {
		this.showFolders = showFolders;
	}

	public final void setOffset(int offset) {
		this.offset = offset;
	}

	public final int getNumberElements() {
		return numberElements;
	}

	public final boolean isEnableMoreInfo() {
		return enableMoreInfo;
	}

	public final void setEnableMoreInfo(boolean enableMoreInfo) {
		this.enableMoreInfo = enableMoreInfo;
	}

	public final boolean isShowFiles() {
		return showFiles;
	}

	public final void setShowFiles(boolean showFiles) {
		this.showFiles = showFiles;
	}

	public final FileSorting getSorting() {
		return sorting;
	}

	public final void setSorting(FileSorting sorting) {
		this.sorting = sorting;
	}

	public final String getMimeType() {
		return mimeType;
	}

	public final void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public final Boolean getEnablePersistence() {
		return enablePersistence;
	}

	public final void setEnablePersistence(Boolean enablePersistence) {
		this.enablePersistence = enablePersistence;
	}

	@Override
	public String toString() {
		return "ListUserStorageFileOperation [fullPath=" + fullPath
				+ ", offset=" + offset + ", numberElements=" + numberElements
				+ ", showFolders=" + showFolders + ", showFiles=" + showFiles
				+ ", enableMoreInfo=" + enableMoreInfo + ", mimeType="
				+ mimeType + ", sorting=" + sorting + ", enablePersistence="
				+ enablePersistence + ", getOperationType()="
				+ getOperationType() + "]";
	}

}
