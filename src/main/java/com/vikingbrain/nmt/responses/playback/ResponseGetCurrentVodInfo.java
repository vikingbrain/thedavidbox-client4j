package com.vikingbrain.nmt.responses.playback;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetCurrentVodInfo extends ResponseSimple {

//	@Path("response")
//	@Element(name="title", required=false)
//	private String title; //Not used because is empty for video, using fullPath instead

	@Path("response")
	@Element(name="fullPath")
	private String fullPath;
	
	@Path("response")
	@Element(name="currentTime")
	private String currentTime;

	@Path("response")
	@Element(name="totalTime")
	private String totalTime;
		
	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}	

	public String getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}		

	@Override
	public String toString() {
		return "ResponseGetCurrentVodInfo [fullPath=" + fullPath
				+ ", currentTime=" + currentTime + ", totalTime=" + totalTime
				+ "]";
	}
	
}
