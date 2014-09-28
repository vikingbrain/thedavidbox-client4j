/*
 * Copyright 2011-2014 Rafael Iñigo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
