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

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.system.ResponseGetFirmwareVersion;

/**
 * Retrieve current firmware version.
 * Execution example: Example: http://popcorn:8008/system?arg0=get_firmware_version
 * @author vikingBrain
 */
public class GetFirmwareVersionOperation extends AbstractSystemOperation<ResponseGetFirmwareVersion> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.get_firmware_version;
	
	/** Response target class. */
	private static final Class<ResponseGetFirmwareVersion> responseTargetClass = ResponseGetFirmwareVersion.class;

	/**
	 * Constructor. 
	 * @param operationFactory the operation factory
	 */
	public GetFirmwareVersionOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);		
	}
	
	@Override
	public String toString() {
		return "GetFirmwareVersionOperation [getOperationType()="
				+ getOperationType() + "]";
	}	

}
