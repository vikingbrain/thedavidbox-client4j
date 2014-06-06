package com.vikingbrain.nmt.client.modules.impl;

import com.vikingbrain.nmt.client.modules.ModuleSystem;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
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
public class ModuleSystemImpl extends AbstractModule implements ModuleSystem {
	
	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ModuleSystemImpl(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory);
	}

	/** {@inheritDoc} */
	public GetMacAddressOperation buildGetMacAddressOperation(){
		return new GetMacAddressOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public GetFirmwareVersionOperation buildGetFirmwareVersionOperation(){
		return new GetFirmwareVersionOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public GetNmtVersionOperation buildGetNmtVersionOperation(){
		return new GetNmtVersionOperation(getOperationFactory());
	}
		
	/** {@inheritDoc} */
	public CheckNmtExistOperation buildCheckNmtExistOperation(){
		return new CheckNmtExistOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public ListNmtServicesOperation buildListNmtServicesOperation(){
		return new ListNmtServicesOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public SetNmtServiceStatusOperation buildSetNmtServiceStatusOperation(String serviceName, boolean status){
		return new SetNmtServiceStatusOperation(getOperationFactory(), serviceName, status);
	}

	/** {@inheritDoc} */
	public GetNmtServiceStatusOperation buildGetNmtServiceStatusOperation(String serviceName){
		return new GetNmtServiceStatusOperation(getOperationFactory(), serviceName);
	}

	//TODO set_nmt_device_name
	
	//TODO get_nmt_device_name
	
	//TODO set_nmt_samba_workgroup
	
	//TODO get_nmt_samba_workgroup
	
	//TODO set_nmt_ftp_password
	
	//TODO set_nmt_media_destination
	
	//TODO install_nmt
	
	/** {@inheritDoc} */
	public ListDevicesOperation buildListDevicesOperation(){
		return new ListDevicesOperation(getOperationFactory());
	}

	//TODO list_drives
	
	/** {@inheritDoc} */
	public GetDeviceInfoOperation buildGetDeviceInfoOperation(String deviceName){
		return new GetDeviceInfoOperation(getOperationFactory(), deviceName);
	}	

	//TODO list_all_active_apps
	
	//TODO get_current_app
	
	//TODO get_mute_status
	
	//TODO set_mute_status
	
	//TODO get_system_volume
	
	//TODO set_system_volume
	
	//TODO list_key
	
	/** {@inheritDoc} */
	public SendKeyOperation buildSendKeyOperation(String keyName){
		return new SendKeyOperation(getOperationFactory(), keyName);
	}

	//TODO load_page
	
	//TODO get_connection_status
	
	//TODO get_linkup_status
	
	//TODO suspend_screensaver
	
	//TODO get_board_id
	
	//TODO get_time
	
	//TODO load_appcenter
	
	//TODO load_launcher
	
	//TODO load_phf
	
	//TODO load_widget
	
	//TODO list_webservices_option
	
	//TODO update_firmware
	
	//TODO set_system_led
	
	//TODO capture_screen

}
