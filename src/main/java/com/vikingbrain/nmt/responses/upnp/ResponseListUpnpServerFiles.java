package com.vikingbrain.nmt.responses.upnp;

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
public class ResponseListUpnpServerFiles extends ResponseSimple {

	@Path("response")
	@Element(name="totalFile", required=false)
	private int totalFile;

	@Path("response")
	@ElementList(name = "fileList")
	private List<ObjectUpnpServerFile> fileList = new ArrayList<ObjectUpnpServerFile>();	


	public final int getTotalFile() {
		return totalFile;
	}

	public final void setTotalFile(int totalFile) {
		this.totalFile = totalFile;
	}
	
	public final List<ObjectUpnpServerFile> getFileList() {
		return fileList;
	}

	public final void setFileList(List<ObjectUpnpServerFile> fileList) {
		this.fileList = fileList;
	}
	
	
}
