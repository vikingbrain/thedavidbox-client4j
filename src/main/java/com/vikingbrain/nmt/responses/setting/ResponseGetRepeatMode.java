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
package com.vikingbrain.nmt.responses.setting;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetRepeatMode extends ResponseSimple {

	@Path("response")
	@Element(name="playMode")
	private String playMode;	

	/**
	 * Getter of property.
	 * @return the playMode
	 */
	public final String getPlayMode() {
		return playMode;
	}

	/**
	 * Setter of property.
	 * @param playMode the playMode to set
	 */
	public final void setPlayMode(String playMode) {
		this.playMode = playMode;
	}
	
	@Override
	public String toString() {
		return "ResponseGetRepeatMode [playMode=" + playMode + "]";
	}
	
}
