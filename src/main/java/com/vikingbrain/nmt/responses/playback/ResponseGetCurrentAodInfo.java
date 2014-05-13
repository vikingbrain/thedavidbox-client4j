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
	@Element(name="fullPath")
	private String fullPath;

	@Path("response")
	@Element(name="title")	
	private String title;

	@Path("response")
	@Element(name="currentTime")	
	private String currentTime;
	
	@Path("response")
	@Element(name="totalTime")		
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
