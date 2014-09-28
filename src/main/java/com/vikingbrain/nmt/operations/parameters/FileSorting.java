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
 * Sorting option. (name_asc/dsc, date_asc/dsc, size_asc/dsc).
 * @author vikingBrain
 *
 */
public enum FileSorting {

	NAME_ASC {
		public String getParamValue() {
			return "name_asc";
		}
	},

	NAME_DSC {
		public String getParamValue() {
			return "name_dsc";
		}
	},
	
	DATE_ASC {
		public String getParamValue() {
			return "date_asc";
		}
	},

	DATE_DSC {
		public String getParamValue() {
			return "date_dsc";
		}
	},

	SIZE_ASC {
		public String getParamValue() {
			return "size_asc";
		}
	},
	
	SIZE_DSC {
		public String getParamValue() {
			return "size_dsc";
		}
	};
	

		
	/**
	 * Abstract method get the description.
	 * @return description of the error
	 */
	public abstract String getParamValue();


}
