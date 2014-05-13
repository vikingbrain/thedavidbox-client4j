package com.vikingbrain.nmt.operations.parameters;

/**
 * Video filter (movie/ tv_show / genre / year / rating).
 * @author vikingBrain
 *
 */
public enum VideoFilter {

	/**
	 * Movie.
	 */
	MOVIE {
		public String getParamValue() {
			return "movie";
		}
	},

	/**
	 * TV show.
	 */
	TV_SHOW {
		public String getParamValue() {
			return "tv_show";
		}
	},
	
	/**
	 * Genre.
	 */
	GENRE {
		public String getParamValue() {
			return "genre";
		}
	},

	/**
	 * YEAR.
	 */
	YEAR {
		public String getParamValue() {
			return "year";
		}
	},

	/**
	 * Rating.
	 */
	RATING {
		public String getParamValue() {
			return "rating";
		}
	};
	

		
	/**
	 * Abstract method get the description.
	 * @return description of the error
	 */
	public abstract String getParamValue();


}
