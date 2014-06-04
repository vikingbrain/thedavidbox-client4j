/**
 * 
 */
package com.vikingbrain.nmt.responses.playback;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="positions", strict=false)
public class ObjectNonDvdPositions {

	@Element(name="maxPosition", required=false)
	private String maxPosition;
	
	@Element(name="minPosition", required=false)
	private String minPosition;
	
	@Element(name="stepPosition", required=false)
	private String stepPosition;
	
	/**
	 * Getter of property.
	 * @return the maxPosition
	 */
	public final String getMaxPosition() {
		return maxPosition;
	}

	/**
	 * Setter of property.
	 * @param maxPosition the maxPosition to set
	 */
	public final void setMaxPosition(String maxPosition) {
		this.maxPosition = maxPosition;
	}

	/**
	 * Getter of property.
	 * @return the minPosition
	 */
	public final String getMinPosition() {
		return minPosition;
	}

	/**
	 * Setter of property.
	 * @param minPosition the minPosition to set
	 */
	public final void setMinPosition(String minPosition) {
		this.minPosition = minPosition;
	}

	/**
	 * Getter of property.
	 * @return the stepPosition
	 */
	public final String getStepPosition() {
		return stepPosition;
	}

	/**
	 * Setter of property.
	 * @param stepPosition the stepPosition to set
	 */
	public final void setStepPosition(String stepPosition) {
		this.stepPosition = stepPosition;
	}

	@Override
	public String toString() {
		return "ObjectPositions [maxPosition=" + maxPosition + ", minPosition="
				+ minPosition + ", stepPosition=" + stepPosition + "]";
	}

}
