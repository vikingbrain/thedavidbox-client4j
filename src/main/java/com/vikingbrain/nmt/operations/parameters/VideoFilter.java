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
