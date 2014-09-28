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
@Root(name="offsets", strict=false)
public class ObjectNonDvdOffsets {

	@Element(name="maxOffset", required=false)
	private String maxOffset;
	
	@Element(name="minOffset", required=false)
	private String minOffset;
	
	@Element(name="stepOffset", required=false)
	private String stepOffset;
	
	/**
	 * Getter of property.
	 * @return the maxOffset
	 */
	public final String getMaxOffset() {
		return maxOffset;
	}

	/**
	 * Setter of property.
	 * @param maxOffset the maxOffset to set
	 */
	public final void setMaxOffset(String maxOffset) {
		this.maxOffset = maxOffset;
	}

	/**
	 * Getter of property.
	 * @return the minOffset
	 */
	public final String getMinOffset() {
		return minOffset;
	}

	/**
	 * Setter of property.
	 * @param minOffset the minOffset to set
	 */
	public final void setMinOffset(String minOffset) {
		this.minOffset = minOffset;
	}

	/**
	 * Getter of property.
	 * @return the stepOffset
	 */
	public final String getStepOffset() {
		return stepOffset;
	}

	/**
	 * Setter of property.
	 * @param stepOffset the stepOffset to set
	 */
	public final void setStepOffset(String stepOffset) {
		this.stepOffset = stepOffset;
	}
	
	@Override
	public String toString() {
		return "ObjectOffsets [maxOffset=" + maxOffset + ", minOffset="
				+ minOffset + ", stepOffset=" + stepOffset + "]";
	}
	
}
