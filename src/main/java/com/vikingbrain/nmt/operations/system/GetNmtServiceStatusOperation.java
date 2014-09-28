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
package com.vikingbrain.nmt.operations.system;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.system.ResponseGetNmtServiceStatus;

/**
 * Retrieve current NMT service's status.
 * Execution example: Example: http://popcorn:8008/system?arg0=get_nmt_service_status&arg1=ftp
 * @author vikingBrain
 */
public class GetNmtServiceStatusOperation extends AbstractSystemOperation<ResponseGetNmtServiceStatus> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.get_nmt_service_status;
	
	/** Response target class. */
	private static final Class<ResponseGetNmtServiceStatus> responseTargetClass = ResponseGetNmtServiceStatus.class;

	/** Required attributes. */
	private String serviceName;

	/**
	 * Constructor. 
	 * @param operationFactory the operation factory
	 * @param serviceName the service name
	 */
	public GetNmtServiceStatusOperation(TheDavidboxOperationFactory operationFactory, String serviceName) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.serviceName = serviceName;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", serviceName);
		
		return httpArguments;
	}

	public String getServiceName() {
		return serviceName;
	}

	public final void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	@Override
	public String toString() {
		return "GetNmtServiceStatusOperation [serviceName=" + serviceName
				+ ", getOperationType()=" + getOperationType() + "]";
	}		
	
}
