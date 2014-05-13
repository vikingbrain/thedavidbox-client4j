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
