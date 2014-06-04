package com.vikingbrain.nmt.responses.playback;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="subtitleList", strict=false)
public class ObjectSubtitleList {

	@Element(name="currentTrack")
	private int currentTrack;
	
	@ElementList(inline = true, entry = "subtitle")
	private List<ObjectSubtitle> subtitles = new ArrayList<ObjectSubtitle>();	
		
	/** Optional attributes that only appear on response for non-DVD media format */
	@Path("colors")
	@ElementList(inline = true, entry = "colorOption", required=false)
	private List<String> nonDvdColors = new ArrayList<String>();		
	
	@Element(name="currentColor", required=false)
	private String nonDvdCurrentColor;

	@Element(name="currentEncoding", required=false)
	private String nonDvdCurrentEncoding;

	@Element(name="currentOffset", required=false)
	private String nonDvdCurrentOffset;
	
	@Element(name="currentPosition", required=false)
	private int nonDvdCurrentPosition;
	
	@Element(name="currentSize", required=false)
	private int nonDvdCurrentSize;
		
	@Path("encodings")
	@ElementList(inline = true, entry = "encodingOption", required=false)
	private List<String> nonDvdEncodings = new ArrayList<String>();	
	
	@Element(name="offsets", required=false)
	private ObjectNonDvdOffsets nonDvdOffsets;

	@Element(name="positions", required=false)
	private ObjectNonDvdPositions nonDvdPositions;

	@Element(name="sizes", required=false)
	private ObjectNonDvdSizes nonDvdSizes;

	/**
	 * Getter of property.
	 * @return the currentTrack
	 */
	public final int getCurrentTrack() {
		return currentTrack;
	}

	/**
	 * Setter of property.
	 * @param currentTrack the currentTrack to set
	 */
	public final void setCurrentTrack(int currentTrack) {
		this.currentTrack = currentTrack;
	}

	/**
	 * Getter of property.
	 * @return the subtitles
	 */
	public final List<ObjectSubtitle> getSubtitles() {
		return subtitles;
	}

	/**
	 * Setter of property.
	 * @param subtitles the subtitles to set
	 */
	public final void setSubtitles(List<ObjectSubtitle> subtitles) {
		this.subtitles = subtitles;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdColors
	 */
	public final List<String> getNonDvdColors() {
		return nonDvdColors;
	}

	/**
	 * Setter of property.
	 * @param nonDvdColors the nonDvdColors to set
	 */
	public final void setNonDvdColors(List<String> nonDvdColors) {
		this.nonDvdColors = nonDvdColors;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdCurrentColor
	 */
	public final String getNonDvdCurrentColor() {
		return nonDvdCurrentColor;
	}

	/**
	 * Setter of property.
	 * @param nonDvdCurrentColor the nonDvdCurrentColor to set
	 */
	public final void setNonDvdCurrentColor(String nonDvdCurrentColor) {
		this.nonDvdCurrentColor = nonDvdCurrentColor;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdCurrentEncoding
	 */
	public final String getNonDvdCurrentEncoding() {
		return nonDvdCurrentEncoding;
	}

	/**
	 * Setter of property.
	 * @param nonDvdCurrentEncoding the nonDvdCurrentEncoding to set
	 */
	public final void setNonDvdCurrentEncoding(String nonDvdCurrentEncoding) {
		this.nonDvdCurrentEncoding = nonDvdCurrentEncoding;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdCurrentOffset
	 */
	public final String getNonDvdCurrentOffset() {
		return nonDvdCurrentOffset;
	}

	/**
	 * Setter of property.
	 * @param nonDvdCurrentOffset the nonDvdCurrentOffset to set
	 */
	public final void setNonDvdCurrentOffset(String nonDvdCurrentOffset) {
		this.nonDvdCurrentOffset = nonDvdCurrentOffset;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdCurrentPosition
	 */
	public final int getNonDvdCurrentPosition() {
		return nonDvdCurrentPosition;
	}

	/**
	 * Setter of property.
	 * @param nonDvdCurrentPosition the nonDvdCurrentPosition to set
	 */
	public final void setNonDvdCurrentPosition(int nonDvdCurrentPosition) {
		this.nonDvdCurrentPosition = nonDvdCurrentPosition;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdCurrentSize
	 */
	public final int getNonDvdCurrentSize() {
		return nonDvdCurrentSize;
	}

	/**
	 * Setter of property.
	 * @param nonDvdCurrentSize the nonDvdCurrentSize to set
	 */
	public final void setNonDvdCurrentSize(int nonDvdCurrentSize) {
		this.nonDvdCurrentSize = nonDvdCurrentSize;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdEncodings
	 */
	public final List<String> getNonDvdEncodings() {
		return nonDvdEncodings;
	}

	/**
	 * Setter of property.
	 * @param nonDvdEncodings the nonDvdEncodings to set
	 */
	public final void setNonDvdEncodings(List<String> nonDvdEncodings) {
		this.nonDvdEncodings = nonDvdEncodings;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdOffsets
	 */
	public final ObjectNonDvdOffsets getNonDvdOffsets() {
		return nonDvdOffsets;
	}

	/**
	 * Setter of property.
	 * @param nonDvdOffsets the nonDvdOffsets to set
	 */
	public final void setNonDvdOffsets(ObjectNonDvdOffsets nonDvdOffsets) {
		this.nonDvdOffsets = nonDvdOffsets;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdPositions
	 */
	public final ObjectNonDvdPositions getNonDvdPositions() {
		return nonDvdPositions;
	}

	/**
	 * Setter of property.
	 * @param nonDvdPositions the nonDvdPositions to set
	 */
	public final void setNonDvdPositions(ObjectNonDvdPositions nonDvdPositions) {
		this.nonDvdPositions = nonDvdPositions;
	}

	/**
	 * Getter of property.
	 * @return the nonDvdSizes
	 */
	public final ObjectNonDvdSizes getNonDvdSizes() {
		return nonDvdSizes;
	}

	/**
	 * Setter of property.
	 * @param nonDvdSizes the nonDvdSizes to set
	 */
	public final void setNonDvdSizes(ObjectNonDvdSizes nonDvdSizes) {
		this.nonDvdSizes = nonDvdSizes;
	}
	
	@Override
	public String toString() {
		return "ObjectSubtitleList [currentTrack=" + currentTrack
				+ ", subtitles=" + subtitles + ", nonDvdColors=" + nonDvdColors
				+ ", nonDvdCurrentColor=" + nonDvdCurrentColor
				+ ", nonDvdCurrentEncoding=" + nonDvdCurrentEncoding
				+ ", nonDvdCurrentOffset=" + nonDvdCurrentOffset
				+ ", nonDvdCurrentPosition=" + nonDvdCurrentPosition
				+ ", nonDvdCurrentSize=" + nonDvdCurrentSize
				+ ", nonDvdEncodings=" + nonDvdEncodings + ", nonDvdOffsets="
				+ nonDvdOffsets + ", nonDvdPositions=" + nonDvdPositions
				+ ", nonDvdSizes=" + nonDvdSizes + "]";
	}

}
