package com.vikingbrain.nmt.responses.networkbrowse;

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
public class ResponseListNetworkResource extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "networkResource")
	private List<ObjectNetworkResource> networkResources = new ArrayList<ObjectNetworkResource>();

	/**
	 * Getter of property.
	 * @return the networkResources
	 */
	public List<ObjectNetworkResource> getNetworkResources() {
		return networkResources;
	}

	/**
	 * Setter of property.
	 * @param networkResources the networkResources to set
	 */
	public void setNetworkResources(List<ObjectNetworkResource> networkResources) {
		this.networkResources = networkResources;
	}	
	
}
