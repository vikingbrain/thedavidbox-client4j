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
