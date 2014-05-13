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
public class ResponseGetVideoInfoEpisode extends ResponseSimple {
	
	@Path("response")
	@Element(name="video_episode_info")
	private ObjectVideoEpisodeInfo videoEpisodeInfo;
	
	public final ObjectVideoEpisodeInfo getVideoEpisodeInfo() {
		return videoEpisodeInfo;
	}

	public final void setVideoEpisodeInfo(ObjectVideoEpisodeInfo videoEpisodeInfo) {
		this.videoEpisodeInfo = videoEpisodeInfo;
	}
	
}
