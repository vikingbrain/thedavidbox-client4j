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