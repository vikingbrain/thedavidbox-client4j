package com.vikingbrain.nmt.responses.system;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;
import com.vikingbrain.nmt.util.UnitConverter;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetDeviceInfo extends ResponseSimple {	
	
	@Path("response")
	@Element(name="accessPath")
	private String accessPath;

	@Path("response")
	@Element(name="freeDiskSpace")
	private long freeDiskSpace;

	@Path("response")
	@Element(name="size")
	private long size;	

	@Path("response")
	@Element(name="type")
	private String type;

	public final String getAccessPath() {
		return accessPath;
	}

	public final void setAccessPath(String accessPath) {
		this.accessPath = accessPath;
	}

	public final long getFreeDiskSpace() {
		return freeDiskSpace;
	}

	public final void setFreeDiskSpace(long freeDiskSpace) {
		this.freeDiskSpace = freeDiskSpace;
	}

	public final long getSize() {
		return size;
	}

	public final void setSize(long size) {
		this.size = size;
	}

	public final String getType() {
		return type;
	}

	public final void setType(String type) {
		this.type = type;
	}

	public String getSizeHuman(){
		return UnitConverter.bytesToHuman(size);
	}

	public String getFreeDiskSpaceHuman(){
		return UnitConverter.bytesToHuman(freeDiskSpace);
	}

	public String getUsedDiskSpaceHuman(){
		long bytesUsed = size - freeDiskSpace;
		return  UnitConverter.bytesToHuman(bytesUsed);
	}

	@Override
	public String toString() {
		return "ResponseGetDeviceInfo [accessPath=" + accessPath
				+ ", freeDiskSpace=" + freeDiskSpace + ", size=" + size
				+ ", type=" + type + ", getSizeHuman()=" + getSizeHuman()
				+ ", getFreeDiskSpaceHuman()=" + getFreeDiskSpaceHuman()
				+ ", getDiskSpaceUsedHuman()=" + getUsedDiskSpaceHuman() + "]";
	}

}
