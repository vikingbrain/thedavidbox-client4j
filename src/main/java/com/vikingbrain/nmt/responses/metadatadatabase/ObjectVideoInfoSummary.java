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
