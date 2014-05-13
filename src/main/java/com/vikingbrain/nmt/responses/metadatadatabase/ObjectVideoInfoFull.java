package com.vikingbrain.nmt.responses.metadatadatabase;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="video_info", strict=false)
public class ObjectVideoInfoFull extends AbstractObjectVideoInfo {
	
	//Fields with differences between original documentation and real responses:
	//directors (director, director_item)
	//genres (genre)
	//hash
	//subtitles
	//ttid
	//video_list (item)

	@Element(name="ext", required=false)
	private String ext;	
	
	@Element(name="format", required=false)
	private String format;
	
	@Element(name="frame_rate", required=false)
	private String frame_rate;
	
	@Element(name="lastwatchscene", required=false)
	private String lastwatchscene;
	
	@Element(name="resolution")
	private String resolution;
		
	@Element(name="synopsis")
	private String synopsis;
	
	@Element(name="video_codec")
	private String video_codec;
	
	public final String getExt() {
		return ext;
	}

	public final void setExt(String ext) {
		this.ext = ext;
	}

	public final String getFormat() {
		return format;
	}

	public final void setFormat(String format) {
		this.format = format;
	}

	public final String getFrame_rate() {
		return frame_rate;
	}

	public final void setFrame_rate(String frame_rate) {
		this.frame_rate = frame_rate;
	}

	public final String getLastwatchscene() {
		return lastwatchscene;
	}

	public final void setLastwatchscene(String lastwatchscene) {
		this.lastwatchscene = lastwatchscene;
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

	public final String getVideo_codec() {
		return video_codec;
	}

	public final void setVideo_codec(String video_codec) {
		this.video_codec = video_codec;
	}	

	@Override
	public String toString() {
		return "ObjectVideoInfoFull [ext=" + ext + ", format=" + format
				+ ", frame_rate=" + frame_rate + ", lastwatchscene="
				+ lastwatchscene + ", resolution=" + resolution + ", synopsis="
				+ synopsis + ", video_codec=" + video_codec + ", getId()="
				+ getId() + ", getPath()=" + getPath() + ", getCasts()="
				+ getCasts() + ", getDate()=" + getDate()
				+ ", getOriginal_path()=" + getOriginal_path()
				+ ", getParental_rating()=" + getParental_rating()
				+ ", getPlay_count()=" + getPlay_count() + ", getPoster()="
				+ getPoster() + ", getRating()=" + getRating()
				+ ", getRuntime()=" + getRuntime() + ", getThumbnail()="
				+ getThumbnail() + ", getTitle()=" + getTitle()
				+ ", getTotal_item()=" + getTotal_item() + ", getVideo_type()="
				+ getVideo_type() + ", getWallpaper()=" + getWallpaper()
				+ ", getWatch_status()=" + getWatch_status() + "]";
	}

}
