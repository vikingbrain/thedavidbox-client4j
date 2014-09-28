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
@Root(name="video", strict=false)
public class ObjectVideo {

	@Element(name="id")
	private String id;
	
	@Element(name="three_d")
	private String threeD;	

	@Element(name="thumbnail", required=false)
	private String thumbnail;
	
	/**
	 * Getter of property.
	 * @return the name
	 */
	public final String getId() {
		return id;
	}
	
	/**
	 * Setter of property.
	 * @param id the id
	 */
	public final void setId(String id) {
		this.id = id;
	}

	public final String getThreeD() {
		return threeD;
	}

	public final void setThreeD(String threeD) {
		this.threeD = threeD;
	}

	public final String getThumbnail() {
		return thumbnail;
	}

	public final void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}
