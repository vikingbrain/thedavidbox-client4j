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
