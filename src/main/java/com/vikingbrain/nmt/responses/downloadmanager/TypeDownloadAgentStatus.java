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
package com.vikingbrain.nmt.responses.downloadmanager;

/**
 * This section list down all the possible error code returned by command server.
 * @author vikingBrain
 *
 */
public enum TypeDownloadAgentStatus {

	UNKNOWN {
		public String getId() {
			return "0";
		}
		public String getDescription() {
			return "Unknown status";
		}
	},

	STARTED {
		public String getId() {
			return "1";
		}
		public String getDescription() {
			return "Download agent have been started. Initialize is complete";
		}
	},

	STARTING {
		public String getId() {
			return "2";
		}
		public String getDescription() {
			return "Download agent in startup progress. Initialize is in progress";
		}
	},

	STOPED {
		public String getId() {
			return "3";
		}
		public String getDescription() {
			return "Download agent have been stoped. Uninitialized complete";
		}
	},
	
	STOPING {
		public String getId() {
			return "4";
		}
		public String getDescription() {
			return "Download agent in stop progress. Uninitialized is in progress";
		}
	};

	/**
	 * Abstract method get the id.
	 * @return id the id
	 */
	public abstract String getId();
	
	/**
	 * Abstract method get the description.
	 * @return description of the error
	 */
	public abstract String getDescription();

	/**
	 * Find the type by id.
	 * @param _id id of the status
	 * @return the return status or null if not found
	 */
	public static TypeDownloadAgentStatus findById(String _id) {
		TypeDownloadAgentStatus type = null;
	    for (TypeDownloadAgentStatus actual : TypeDownloadAgentStatus.values()) {
        	if(actual.getId().equals(_id)){
        		type = actual;
        	}
	    }
		return type;
	}	
	
}
