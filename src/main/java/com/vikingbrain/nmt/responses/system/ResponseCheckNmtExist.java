package com.vikingbrain.nmt.responses.system;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseCheckNmtExist extends ResponseSimple {

	@Path("response")
	@Element(name="exist")
	private String exist;
	
	public final String getExist() {
		return exist;
	}
	
	public final void setExist(String exist) {
		this.exist = exist;
	}
	
	public boolean isExist() {
		boolean check = false;
		if ("true".equalsIgnoreCase(exist)){
			check = true;
		}
		return check;
	}

}
