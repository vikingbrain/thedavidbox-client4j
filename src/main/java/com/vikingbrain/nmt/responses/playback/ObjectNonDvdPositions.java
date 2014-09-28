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
