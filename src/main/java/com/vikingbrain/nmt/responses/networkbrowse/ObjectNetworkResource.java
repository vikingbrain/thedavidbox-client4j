package com.vikingbrain.nmt.responses.networkbrowse;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="networkResource", strict=false)
public class ObjectNetworkResource {

	@Element(name="name")
	private String name;
	
	@Element(name="url")
	private String url;

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getUrl() {
		return url;
	}

	public final void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ObjectNetworkResource [name=" + name + ", url=" + url + "]";
	}
	
}
