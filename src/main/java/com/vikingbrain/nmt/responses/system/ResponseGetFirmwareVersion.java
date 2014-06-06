package com.vikingbrain.nmt.responses.system;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetFirmwareVersion extends ResponseSimple {

	@Path("response")
	@Element(name="firmwareVersion")
	private String firmwareVersion;

	/**
	 * Getter of property.
	 * @return the firmwareVersion
	 */
	public final String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * Setter of property.
	 * @param firmwareVersion the firmwareVersion to set
	 */
	public final void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	@Override
	public String toString() {
		return "ResponseGetFirmwareVersion [firmwareVersion=" + firmwareVersion
				+ "]";
	}
	
}
