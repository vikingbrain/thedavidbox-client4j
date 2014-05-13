package com.vikingbrain.nmt.responses.system;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseListNmtServices extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "services")
	List<String> services = new ArrayList<String>();	

	public final List<String> getServices() {
		return services;
	}
	
	public final void setServices(List<String> services) {
		this.services = services;
	}

}
