/**
 * 
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
