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

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="video_info", strict=false)
public class ObjectVideoEpisodeInfo {
	
	//display_path
	//external_subtitles
	//frame_rate
	//original_path
	//release_date
	//subtitles	subtitle

	@Element(name="id")
	private String id;

	@Element(name="path")
	private String path;

	@Element(name="aspect_ratio")
	private String aspectRatio;

	@Element(name="format")
	private String format;

	@Element(name="resolution")
	private String resolution;
	
	@Element(name="synopsis")
	private String synopsis;
	
	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getPath() {
		return path;
	}

	public final void setPath(String path) {
		this.path = path;
	}
	
	public final String getAspectRatio() {
		return aspectRatio;
	}

	public final void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public final String getFormat() {
		return format;
	}

	public final void setFormat(String format) {
		this.format = format;
	}

	public final String getResolution() {
		return resolution;
	}

	public final void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public final String getSynopsis() {
		return synopsis;
	}

	public final void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	@Override
	public String toString() {
		return "ObjectVideoEpisodeInfo [id=" + id + ", path=" + path
				+ ", aspectRatio=" + aspectRatio + ", format=" + format
				+ ", resolution=" + resolution + ", synopsis=" + synopsis + "]";
	}
	
}
