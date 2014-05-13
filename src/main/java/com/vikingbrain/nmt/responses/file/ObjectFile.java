package com.vikingbrain.nmt.responses.file;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.util.UnitConverter;

/**
 * 
 * @author vikingBrain
 */

@Root(name="file", strict=false)
public class ObjectFile {

	@Element(name="isFolder")
	private boolean isFolder; 
	
	@Element(name="name")
	private String name;
	
	@Element(name="path")
	private String path;

	@Element(name="modifyDate", required=false)
	private String modifyDate;	

	@Element(name="size", required=false)
	private long size;	

	
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getPath() {
		return path;
	}

	public final void setPath(String path) {
		this.path = path;
	}
	
	public final boolean isFolder() {
		return isFolder;
	}

	public final void setFolder(boolean isFolder) {
		this.isFolder = isFolder;
	}

	public final String getModifyDate() {
		return modifyDate;
	}

	public final void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public final long getSize() {
		return size;
	}

	public final void setSize(long size) {
		this.size = size;
	}

	public String getSizeHuman(){
		return UnitConverter.bytesToHuman(size);
	}
	
	@Override
	public String toString() {
		return "ObjectFile [isFolder=" + isFolder + ", name=" + name
				+ ", path=" + path + ", modifyDate=" + modifyDate + ", size="
				+ size + ", getSizeHuman()=" + getSizeHuman() + "]";
	}

}
