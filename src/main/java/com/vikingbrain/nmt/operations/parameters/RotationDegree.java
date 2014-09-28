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
 * Degree of rotation. rot0(or pass empty parameter), rot90, rot180, rot270
 * @author vikingBrain
 *
 */
public enum RotationDegree {

	ROTATION_0 {
		public String getParamValue() {
			return "rot0"; //Or pass empty parameter also accepted
		}
	},

	ROTATION_90 {
		public String getParamValue() {
			return "rot90";
		}
	},

	ROTATION_180 {
		public String getParamValue() {
			return "rot180";
		}
	},

	ROTATION_270 {
		public String getParamValue() {
			return "rot270";
		}
	};

//	/**
//	 * Abstract method get the id.
//	 * @return id the id
//	 */
//	public abstract String getId();
	
	/**
	 * Abstract method get the description.
	 * @return description of the error
	 */
	public abstract String getParamValue();


}
