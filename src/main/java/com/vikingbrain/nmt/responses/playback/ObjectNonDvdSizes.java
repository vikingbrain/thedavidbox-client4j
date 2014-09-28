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
@Root(name="sizes", strict=false)
public class ObjectNonDvdSizes {

	@Element(name="maxSize", required=false)
	private String maxSize;
	
	@Element(name="minSize", required=false)
	private String minSize;
	
	@Element(name="stepSize", required=false)
	private String stepSize;
	
	/**
	 * Getter of property.
	 * @return the maxSize
	 */
	public final String getMaxSize() {
		return maxSize;
	}

	/**
	 * Setter of property.
	 * @param maxSize the maxSize to set
	 */
	public final void setMaxSize(String maxSize) {
		this.maxSize = maxSize;
	}

	/**
	 * Getter of property.
	 * @return the minSize
	 */
	public final String getMinSize() {
		return minSize;
	}

	/**
	 * Setter of property.
	 * @param minSize the minSize to set
	 */
	public final void setMinSize(String minSize) {
		this.minSize = minSize;
	}

	/**
	 * Getter of property.
	 * @return the stepSize
	 */
	public final String getStepSize() {
		return stepSize;
	}

	/**
	 * Setter of property.
	 * @param stepSize the stepSize to set
	 */
	public final void setStepSize(String stepSize) {
		this.stepSize = stepSize;
	}

	@Override
	public String toString() {
		return "ObjectSizes [maxSize=" + maxSize + ", minSize=" + minSize
				+ ", stepSize=" + stepSize + "]";
	}

}
