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
public class ResponseGetVideoInfoFull extends ResponseSimple {
	
	@Path("response")
	@Element(name="video_info")
	private ObjectVideoInfoFull videoInfo;
	
	public final ObjectVideoInfoFull getVideoInfo() {
		return videoInfo;
	}

	public final void setVideoInfo(ObjectVideoInfoFull videoInfo) {
		this.videoInfo = videoInfo;
	}
	
}
