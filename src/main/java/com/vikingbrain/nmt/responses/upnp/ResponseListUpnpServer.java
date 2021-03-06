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
