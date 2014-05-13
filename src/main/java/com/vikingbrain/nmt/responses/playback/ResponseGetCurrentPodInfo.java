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
public class ResponseGetCurrentPodInfo extends ResponseSimple {

//	@Path("response")
//	@Element(name="fullPath")
//	private String fullPath;

	@Path("response")
	@Element(name="title")	
	private String title;

//
//	public final String getFullPath() {
//		return fullPath;
//	}
//
//	public final void setFullPath(String fullPath) {
//		this.fullPath = fullPath;
//	}

	public final String getTitle() {
		return title;
	}

	public final void setTitle(String title) {
		this.title = title;
	}

}
