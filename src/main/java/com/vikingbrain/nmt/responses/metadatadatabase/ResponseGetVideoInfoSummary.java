package com.vikingbrain.nmt.responses.metadatadatabase;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetVideoInfoSummary extends ResponseSimple {
	
	@Path("response")
	@Element(name="video_info")
	private ObjectVideoInfoSummary videoInfo;
	
	public final ObjectVideoInfoSummary getVideoInfo() {
		return videoInfo;
	}

	public final void setVideoInfo(ObjectVideoInfoSummary videoInfo) {
		this.videoInfo = videoInfo;
	}
	
}
