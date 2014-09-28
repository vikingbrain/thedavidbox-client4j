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
package com.vikingbrain.nmt.operations.parameters;

/**
 * Display mode, show(Or pass empty parameter also accepted) or hide (background mode)
 * @author vikingBrain
 *
 */
public enum DisplayMode {

	/**
	 * It will show the playback UI.
	 */
	SHOW {
		public String getParamValue() {
			return "show"; //Or pass empty parameter also accepted
		}
	},

	/**
	 * It will hide the playback behind current display.
	 */
	HIDE {
		public String getParamValue() {
			return "hide";
		}
	};

//	/**
//	 * It will only show window marquee.
//	 */
//	MARQUEE {
//		public String getParamValue() {
//			return "marquee";
//		}
//	};

		
	/**
	 * Abstract method get the description.
	 * @return description of the error
	 */
	public abstract String getParamValue();


}
