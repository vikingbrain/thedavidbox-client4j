package com.vikingbrain.nmt.responses.playback;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="subtitle", strict=false)
public class ObjectSubtitle {

	@Element(name="track")
	private String track;
		
	/** Optional attributes that only appear on response for non-DVD media format */	
	@Element(name="color", required=false)
	private String nonDvdColor;

	@Element(name="encoding", required=false)
	private String nonDvdEncoding;

	@Element(name="language", required=false)
	private String nonDvdLanguage;

	@Element(name="position", required=false)
	private String nonDvdPosition;

	@Element(name="size", required=false)
	private String nonDvdSize;

	@Element(name="timeOffset", required=false)
	private String nonDvdTimeOffset;

	/**
	 * Getter of property.
	 * @return the track
	 */
	public final String getTrack() {
		return track;
	}

	/**
	 * Setter of property.
	 * @param track the track to set
	 */
	public final void setTrack(String track) {
		this.track = track;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdColor
	 */
	public final String getNonDvdColor() {
		return nonDvdColor;
	}

	/**
	 * Setter of property.
	 * @param nonDvdColor the nonDvdColor to set
	 */
	public final void setNonDvdColor(String nonDvdColor) {
		this.nonDvdColor = nonDvdColor;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdEncoding
	 */
	public final String getNonDvdEncoding() {
		return nonDvdEncoding;
	}

	/**
	 * Setter of property.
	 * @param nonDvdEncoding the nonDvdEncoding to set
	 */
	public final void setNonDvdEncoding(String nonDvdEncoding) {
		this.nonDvdEncoding = nonDvdEncoding;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdLanguage
	 */
	public final String getNonDvdLanguage() {
		return nonDvdLanguage;
	}

	/**
	 * Setter of property.
	 * @param nonDvdLanguage the nonDvdLanguage to set
	 */
	public final void setNonDvdLanguage(String nonDvdLanguage) {
		this.nonDvdLanguage = nonDvdLanguage;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdPosition
	 */
	public final String getNonDvdPosition() {
		return nonDvdPosition;
	}

	/**
	 * Setter of property.
	 * @param nonDvdPosition the nonDvdPosition to set
	 */
	public final void setNonDvdPosition(String nonDvdPosition) {
		this.nonDvdPosition = nonDvdPosition;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdSize
	 */
	public final String getNonDvdSize() {
		return nonDvdSize;
	}

	/**
	 * Setter of property.
	 * @param nonDvdSize the nonDvdSize to set
	 */
	public final void setNonDvdSize(String nonDvdSize) {
		this.nonDvdSize = nonDvdSize;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdTimeOffset
	 */
	public final String getNonDvdTimeOffset() {
		return nonDvdTimeOffset;
	}

	/**
	 * Setter of property.
	 * @param nonDvdTimeOffset the nonDvdTimeOffset to set
	 */
	public final void setNonDvdTimeOffset(String nonDvdTimeOffset) {
		this.nonDvdTimeOffset = nonDvdTimeOffset;
	}
	
	@Override
	public String toString() {
		return "ObjectSubtitle [track=" + track + ", nonDvdColor="
				+ nonDvdColor + ", nonDvdEncoding=" + nonDvdEncoding
				+ ", nonDvdLanguage=" + nonDvdLanguage + ", nonDvdPosition="
				+ nonDvdPosition + ", nonDvdSize=" + nonDvdSize
				+ ", nonDvdTimeOffset=" + nonDvdTimeOffset + "]";
	}

}
