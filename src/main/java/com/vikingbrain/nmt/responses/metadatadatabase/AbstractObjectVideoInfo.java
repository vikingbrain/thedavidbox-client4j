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

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

public abstract class AbstractObjectVideoInfo {
	
	//three_d		

	@Element(name="id")
	private String id;

	@Element(name="path")
	private String path;

	@Path("casts")
	@ElementList(inline = true, entry = "cast")
	private List<ObjectCast> casts = new ArrayList<ObjectCast>();	

	@Element(name="date")
	private String date;

	@Element(name="original_path", required=false)
	private String original_path;

	@Element(name="parental_rating", required=false)
	private String parental_rating;

	@Element(name="play_count", required=false)
	private String play_count;
	
	@Element(name="poster")
	private String poster;
	
	@Element(name="rating")
	private String rating;
	
	@Element(name="runtime", required=false)
	private String runtime;
	
	@Element(name="thumbnail")
	private String thumbnail;
	
	@Element(name="title")
	private String title;

	@Element(name="total_item")
	private String total_item;
	
	@Element(name="video_type", required=false)
	private String video_type;
	
	@Element(name="wallpaper", required=false)
	private String wallpaper;
	
	@Element(name="watch_status")
	private String watch_status;

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

	public final List<ObjectCast> getCasts() {
		return casts;
	}

	public final void setCasts(List<ObjectCast> casts) {
		this.casts = casts;
	}

	public final String getDate() {
		return date;
	}

	public final void setDate(String date) {
		this.date = date;
	}

	public final String getOriginal_path() {
		return original_path;
	}

	public final void setOriginal_path(String original_path) {
		this.original_path = original_path;
	}

	public final String getParental_rating() {
		return parental_rating;
	}

	public final void setParental_rating(String parental_rating) {
		this.parental_rating = parental_rating;
	}

	public final String getPlay_count() {
		return play_count;
	}

	public final void setPlay_count(String play_count) {
		this.play_count = play_count;
	}

	public final String getPoster() {
		return poster;
	}

	public final void setPoster(String poster) {
		this.poster = poster;
	}

	public final String getRating() {
		return rating;
	}

	public final void setRating(String rating) {
		this.rating = rating;
	}

	public final String getRuntime() {
		return runtime;
	}

	public final void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public final String getThumbnail() {
		return thumbnail;
	}

	public final void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public final String getTitle() {
		return title;
	}

	public final void setTitle(String title) {
		this.title = title;
	}

	public final String getTotal_item() {
		return total_item;
	}

	public final void setTotal_item(String total_item) {
		this.total_item = total_item;
	}

	public final String getVideo_type() {
		return video_type;
	}

	public final void setVideo_type(String video_type) {
		this.video_type = video_type;
	}

	public final String getWallpaper() {
		return wallpaper;
	}

	public final void setWallpaper(String wallpaper) {
		this.wallpaper = wallpaper;
	}

	public final String getWatch_status() {
		return watch_status;
	}

	public final void setWatch_status(String watch_status) {
		this.watch_status = watch_status;
	}

	@Override
	public String toString() {
		return "AbstractObjectVideoInfo [id=" + id + ", path=" + path
				+ ", casts=" + casts + ", date=" + date + ", original_path="
				+ original_path + ", parental_rating=" + parental_rating
				+ ", play_count=" + play_count + ", poster=" + poster
				+ ", rating=" + rating + ", runtime=" + runtime
				+ ", thumbnail=" + thumbnail + ", title=" + title
				+ ", total_item=" + total_item + ", video_type=" + video_type
				+ ", wallpaper=" + wallpaper + ", watch_status=" + watch_status
				+ "]";
	}

}
