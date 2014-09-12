package com.vikingbrain.nmt.responses.playback;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="server", strict=false)
public class ObjectQueueElement {

	@Element(name="fullpath")
	private String fullPath;
	
	@Element(name="index")
	private String index;
	
	@Element(name="title")
	private String title;
	
	/**
	 * Getter of property.
	 * @return the fullPath
	 */
	public final String getFullPath() {
		return fullPath;
	}

	/**
	 * Setter of property.
	 * @param fullPath the fullPath to set
	 */
	public final void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	/**
	 * Getter of property.
	 * @return the index
	 */
	public final String getIndex() {
		return index;
	}
	
	/**
	 * Setter of property.
	 * @param index the index to set
	 */
	public final void setIndex(String index) {
		this.index = index;
	}	

	/**
	 * Getter of property.
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setter of property.
	 * @param title the title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "ObjectQueueElement [fullPath=" + fullPath + ", index=" + index
				+ ", title=" + title + "]";
	}
	
}
