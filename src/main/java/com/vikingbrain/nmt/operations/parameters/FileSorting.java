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
