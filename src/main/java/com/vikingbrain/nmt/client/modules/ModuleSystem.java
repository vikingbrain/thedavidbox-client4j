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
package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.system.CheckNmtExistOperation;
import com.vikingbrain.nmt.operations.system.GetDeviceInfoOperation;
import com.vikingbrain.nmt.operations.system.GetFirmwareVersionOperation;
import com.vikingbrain.nmt.operations.system.GetMacAddressOperation;
import com.vikingbrain.nmt.operations.system.GetNmtServiceStatusOperation;
import com.vikingbrain.nmt.operations.system.GetNmtVersionOperation;
import com.vikingbrain.nmt.operations.system.ListDevicesOperation;
import com.vikingbrain.nmt.operations.system.ListNmtServicesOperation;
import com.vikingbrain.nmt.operations.system.SendKeyOperation;
import com.vikingbrain.nmt.operations.system.SetNmtServiceStatusOperation;

/**
 * It allows to create the operations related to the system module.
 * 
 * @author vikingBrain
 */
public interface ModuleSystem extends BaseModule {
	
	/**
	 * It creates a retrieve current MAC Address operation.
	 * @return the operation created
	 */
	GetMacAddressOperation buildGetMacAddressOperation();

	/**
	 * It creates a retrieve current firmware version operation.
	 * @return the operation created
	 */
	GetFirmwareVersionOperation buildGetFirmwareVersionOperation();
	
	/**
	 * It creates a retrieve current NMT Apps version operation.
	 * @return the operation created
	 */
	GetNmtVersionOperation buildGetNmtVersionOperation();
	
	/**
	 * It creates a check nmt exist operation.
	 * @return the operation created
	 */
	CheckNmtExistOperation buildCheckNmtExistOperation();
	
	/**
	 * It create a send key operation.
	 * @param keyName the keyName to send
	 * @return the operation created
	 */
	SendKeyOperation buildSendKeyOperation(String keyName);
		
	/**
	 * It creates a list devices operation.
	 * @return the operation created
	 */
	ListDevicesOperation buildListDevicesOperation();
	
	/**
	 * It creates a get device info operation.
	 * @param deviceName the device name
	 * @return the operation created
	 */
	GetDeviceInfoOperation buildGetDeviceInfoOperation(String deviceName);
	
	/**
	 * It creates a list all available NMT services.
	 * @return the operation created
	 */
	ListNmtServicesOperation buildListNmtServicesOperation();

	/**
	 * It creates a get nmt service status.
	 * @param serviceName the service name
	 * @return the operation created
	 */
	GetNmtServiceStatusOperation buildGetNmtServiceStatusOperation(String serviceName);

	/**
	 * It creates a set nmt service status to start/stop a NMT service.
	 * @param serviceName the service name
	 * @param status new status to set
	 * @return the operation created
	 */
	SetNmtServiceStatusOperation buildSetNmtServiceStatusOperation(String serviceName, boolean status);
	
}
