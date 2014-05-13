package com.vikingbrain.nmt.responses.setting;

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
public class ResponseListNetworkSharedFolder extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "networkShare")
	List<ObjectNetworkShare> networkShares = new ArrayList<ObjectNetworkShare>();	

	public final List<ObjectNetworkShare> getNetworkShares() {
		return networkShares;
	}

	public final void setNetworkShares(List<ObjectNetworkShare> networkShares) {
		this.networkShares = networkShares;
	}

}
