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
public class ResponseGetMacAddress extends ResponseSimple {

	@Path("response")
	@Element(name="macAddress")
	private String macAddress;

	/**
	 * Getter of property.
	 * @return the macAddress
	 */
	public final String getMacAddress() {
		return macAddress;
	}

	/**
	 * Setter of property.
	 * @param macAddress the macAddress to set
	 */
	public final void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	@Override
	public String toString() {
		return "ResponseGetMacAddress [macAddress=" + macAddress + "]";
	}

}
