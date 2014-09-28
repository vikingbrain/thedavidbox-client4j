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
package com.vikingbrain.nmt.responses.upnp;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="file", strict=false)
public class ObjectUpnpServerFile {

	@Element(name="directoryId", required=false)
	private String directoryId;
	
	@Element(name="isFolder")
	private boolean isFolder; 
	
	@Element(name="name", required=false)
	private String name;
	
	@Element(name="filePath", required=false)
	private String filePath;

	public final String getDirectoryId() {
		return directoryId;
	}

	public final void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
	}

	public final boolean isFolder() {
		return isFolder;
	}

	public final void setFolder(boolean isFolder) {
		this.isFolder = isFolder;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getFilePath() {
		return filePath;
	}

	public final void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String toString() {
		return "ObjectFile [directoryId=" + directoryId + ", isFolder="
				+ isFolder + ", name=" + name + ", filePath=" + filePath + "]";
	}

}