package com.vikingbrain.nmt.responses.metadatadatabase;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="all_videos", strict=false)
public class ObjectCategoryVideoWall {
	
	@Path("all_videos")
	@ElementList(inline = true, entry = "video")
	private List<ObjectVideo> videos = new ArrayList<ObjectVideo>();	
	
	public final List<ObjectVideo> getVideos() {
		return videos;
	}

	public final void setVideos(List<ObjectVideo> videos) {
		this.videos = videos;
	}
	
}
