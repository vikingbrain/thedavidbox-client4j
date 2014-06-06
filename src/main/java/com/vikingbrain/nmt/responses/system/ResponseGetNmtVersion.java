package com.vikingbrain.nmt.responses.system;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Current NMT Apps version.
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetNmtVersion extends ResponseSimple {
	
	@Path("response")
	@Element(name="nmtVersion")
	private String nmtVersion;

	/**
	 * Getter of property.
	 * @return the nmtVersion
	 */
	public final String getNmtVersion() {
		return nmtVersion;
	}

	/**
	 * Setter of property.
	 * @param nmtVersion the nmtVersion to set
	 */
	public final void setNmtVersion(String nmtVersion) {
		this.nmtVersion = nmtVersion;
	}
	
	@Override
	public String toString() {
		return "ResponseGetNmtVersion [nmtVersion=" + nmtVersion + "]";
	}
	
}
