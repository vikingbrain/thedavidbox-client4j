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

import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="video_info", strict=false)
public class ObjectVideoInfoSummary extends AbstractObjectVideoInfo {

	@Override
	public String toString() {
		return "ObjectVideoInfoSummary [getId()=" + getId() + ", getPath()="
				+ getPath() + ", getCasts()=" + getCasts() + ", getDate()="
				+ getDate() + ", getOriginal_path()=" + getOriginal_path()
				+ ", getParental_rating()=" + getParental_rating()
				+ ", getPlay_count()=" + getPlay_count() + ", getPoster()="
				+ getPoster() + ", getRating()=" + getRating()
				+ ", getRuntime()=" + getRuntime() + ", getThumbnail()="
				+ getThumbnail() + ", getTitle()=" + getTitle()
				+ ", getTotal_item()=" + getTotal_item() + ", getVideo_type()="
				+ getVideo_type() + ", getWallpaper()=" + getWallpaper()
				+ ", getWatch_status()=" + getWatch_status() + "]";
	}
	
	//Fields with differences between original documentation and real responses:
	//genres (genre, genre_item)
		

	
}
