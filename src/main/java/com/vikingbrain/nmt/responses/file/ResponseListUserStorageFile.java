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
package com.vikingbrain.nmt.responses.file;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseListUserStorageFile extends ResponseSimple {

	@Path("response")
	@Element(name="availableFile", required=false)	
	private int availableFile;

	@Path("response")
	@Element(name="availableFolder", required=false)
	private int availableFolder;

	@Path("response")
	@Element(name="totalFile", required=false)
	private int totalFile;

	@Path("response")
	@ElementList(name = "fileList")
	private List<ObjectFile> fileList = new ArrayList<ObjectFile>();	

	public final int getAvailableFile() {
		return availableFile;
	}

	public final void setAvailableFile(int availableFile) {
		this.availableFile = availableFile;
	}

	public final int getAvailableFolder() {
		return availableFolder;
	}

	public final void setAvailableFolder(int availableFolder) {
		this.availableFolder = availableFolder;
	}

	public final int getTotalFile() {
		return totalFile;
	}

	public final void setTotalFile(int totalFile) {
		this.totalFile = totalFile;
	}
	
	public final List<ObjectFile> getFileList() {
		return fileList;
	}

	public final void setFileList(List<ObjectFile> fileList) {
		this.fileList = fileList;
	}
	
	@Override
	public String toString() {
		return "ResponseListUserStorageFile [availableFile=" + availableFile
				+ ", availableFolder=" + availableFolder + ", totalFile="
				+ totalFile + ", fileList=" + fileList + "]";
	}
	
}
