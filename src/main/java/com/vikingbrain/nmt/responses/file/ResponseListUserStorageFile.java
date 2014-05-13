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
