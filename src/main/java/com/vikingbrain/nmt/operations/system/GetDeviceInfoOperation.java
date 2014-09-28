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
import com.vikingbrain.nmt.responses.system.ResponseGetDeviceInfo;

/**
 * Retrieve selected device info.
 * Execution example: Example: http://http://popcorn:8008/system?arg0=get_device_info&arg1=SATA_DISK_1
 * @author vikingBrain
 */
public class GetDeviceInfoOperation extends AbstractSystemOperation<ResponseGetDeviceInfo> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.get_device_info;
	
	/** Response target class. */
	private static final Class<ResponseGetDeviceInfo> responseTargetClass = ResponseGetDeviceInfo.class;

	/** Required attributes. */
	private String deviceName;

	/**
	 * Constructor. 
	 * @param operationFactory the operation factory
	 * @param deviceName the device name
	 */
	public GetDeviceInfoOperation(TheDavidboxOperationFactory operationFactory, String deviceName) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.deviceName = deviceName;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", deviceName);
		
		return httpArguments;
	}

	public final String getDeviceName() {
		return deviceName;
	}

	public final void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	@Override
	public String toString() {
		return "GetDeviceInfoOperation [deviceName=" + deviceName
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
