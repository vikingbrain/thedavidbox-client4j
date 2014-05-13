package com.vikingbrain.nmt.responses.system;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseListDevices extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "device")
	List<ObjectDevice> devices = new ArrayList<ObjectDevice>();	

	public final List<ObjectDevice> getDevices() {
		return devices;
	}
	
	public final void setDevices(List<ObjectDevice> devices) {
		this.devices = devices;
	}

}
