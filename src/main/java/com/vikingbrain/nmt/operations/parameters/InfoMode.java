package com.vikingbrain.nmt.operations.parameters;

/**
 * Display mode, show(Or pass empty parameter also accepted) or hide (background mode)
 * @author vikingBrain
 *
 */
public enum InfoMode {

	/**
	 * Summary info mode.
	 */
	SUMMARY {
		public String getParamValue() {
			return "summary";
		}
	},

	/**
	 * Full info mode.
	 */
	FULL {
		public String getParamValue() {
			return "full";
		}
	},

	/**
	 * Episode to get synopsis only.
	 */
	EPISODE {
		public String getParamValue() {
			return "episode";
		}
	};
		
	/**
	 * Abstract method get the description.
	 * @return description of the error
	 */
	public abstract String getParamValue();


}
