package com.vikingbrain.nmt.responses.file;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetUserStorageFileInfo extends ResponseSimple {

	@Path("response")
	@Element(name="fileSize")
	private String fileSize;

	@Path("response")
	@Element(name="mimeType")
	private String mimeType;

	@Path("response")
	@Element(name="name")
	private String name;	

	@Path("response")
	@Element(name="permission")
	private String permission;

	/**
	 * Getter of property.
	 * @return the fileSize
	 */
	public String getFileSize() {
		return fileSize;
	}

	/**
	 * Setter of property.
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * Getter of property.
	 * @return the mimeType
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * Setter of property.
	 * @param mimeType the mimeType to set
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	/**
	 * Getter of property.
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of property.
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter of property.
	 * @return the permission
	 */
	public String getPermission() {
		return permission;
	}

	/**
	 * Setter of property.
	 * @param permission the permission to set
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		return "ResponseGetUserStorageFileInfo [fileSize=" + fileSize
				+ ", mimeType=" + mimeType + ", name=" + name + ", permission="
				+ permission + "]";
	}	
	
}
