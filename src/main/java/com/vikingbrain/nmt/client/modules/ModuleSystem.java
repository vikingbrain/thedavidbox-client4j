package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.system.CheckNmtExistOperation;
import com.vikingbrain.nmt.operations.system.GetDeviceInfoOperation;
import com.vikingbrain.nmt.operations.system.GetNmtServiceStatusOperation;
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
