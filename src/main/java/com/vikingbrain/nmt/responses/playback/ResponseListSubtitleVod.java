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
package com.vikingbrain.nmt.responses.playback;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseListSubtitleVod extends ResponseSimple {
		
	@Path("response")
	@Element(name="NumberOfTrack")
	private int numberOfTrack;

	@Path("response")
	@Element(name = "subtitleList")
	private ObjectSubtitleList subtitleList;	

	/**
	 * Getter of property.
	 * @return the numberOfTrack
	 */
	public final int getNumberOfTrack() {
		return numberOfTrack;
	}

	/**
	 * Setter of property.
	 * @param numberOfTrack the numberOfTrack to set
	 */
	public final void setNumberOfTrack(int numberOfTrack) {
		this.numberOfTrack = numberOfTrack;
	}

	/**
	 * Getter of property.
	 * @return the subtitleList
	 */
	public final ObjectSubtitleList getSubtitleList() {
		return subtitleList;
	}

	/**
	 * Setter of property.
	 * @param subtitleList the subtitleList to set
	 */
	public final void setSubtitleList(ObjectSubtitleList subtitleList) {
		this.subtitleList = subtitleList;
	}

	@Override
	public String toString() {
		return "ResponseListSubtitleVod [numberOfTrack=" + numberOfTrack
				+ ", subtitleList=" + subtitleList + "]";
	}

}
