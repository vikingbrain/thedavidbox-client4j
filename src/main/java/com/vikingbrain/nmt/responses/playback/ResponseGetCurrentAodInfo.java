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
package com.vikingbrain.nmt.responses.playback;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetCurrentAodInfo extends ResponseSimple {

//	String title; //Not used because is empty for video, using fullPath instead

	@Path("response")
	@Element(name="fullPath", required=false)
	private String fullPath;

	@Path("response")
	@Element(name="title", required=false)	
	private String title;

	@Path("response")
	@Element(name="currentTime", required=false)	
	private String currentTime;
	
	@Path("response")
	@Element(name="totalTime", required=false)		
	private String totalTime;

	public final String getFullPath() {
		return fullPath;
	}

	public final void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public final String getTitle() {
		return title;
	}

	public final void setTitle(String title) {
		this.title = title;
	}

	public final String getCurrentTime() {
		return currentTime;
	}

	public final void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public final String getTotalTime() {
		return totalTime;
	}

	public final void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}
}
