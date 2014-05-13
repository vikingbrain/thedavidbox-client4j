package com.vikingbrain.nmt.responses.upnp;

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
public class ResponseListUpnpServer extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "server")
	private List<ObjectUpnpServer> upnpServers = new ArrayList<ObjectUpnpServer>();	

	public final List<ObjectUpnpServer> getUpnpServers() {
		return upnpServers;
	}

	public final void setUpnpServers(List<ObjectUpnpServer> upnpServers) {
		this.upnpServers = upnpServers;
	}
	
}
