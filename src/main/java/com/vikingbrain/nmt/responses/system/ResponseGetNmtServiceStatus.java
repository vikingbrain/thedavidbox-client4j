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
package com.vikingbrain.nmt.responses.system;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetNmtServiceStatus extends ResponseSimple {

	public static enum ServiceStatusType { RUNNING, STOPPED, UNKNOWN };
	
	@Path("response")
	@Element(name="status")
	private String status;

	protected final String getStatus() {
		return status;
	}
	
	protected final void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Get the service status.
	 * @return serviceStatusType RUNNING, STOPPED or UNKNOWN
	 */
	public final ServiceStatusType getServiceStatus(){
    	//Initial value for status just in case "true" of "false" is not found
		ServiceStatusType serviceStatus = ServiceStatusType.UNKNOWN;
    	if ("true".equals(status)){
    		serviceStatus = ServiceStatusType.RUNNING;
    	} else if ("false".equals(status)){
    		serviceStatus = ServiceStatusType.STOPPED;
    	}		    	
    	return serviceStatus;
	}

}
