package com.vikingbrain.nmt.responses.upnp;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="queue", strict=false)
public class ObjectUpnpServer {

	@Element(name="name")
	private String name;
	
	@Element(name="url")
	private String url;

	@Element(name="authorization")
	private boolean authorization; 

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

	public final boolean isAuthorization() {
		return authorization;
	}

	public final void setAuthorization(boolean authorization) {
		this.authorization = authorization;
	}

	@Override
	public String toString() {
		return "ObjectUpnpServer [name=" + name + ", url=" + url
				+ ", authorization=" + authorization + "]";
	}
	
}
