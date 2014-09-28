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
package com.vikingbrain.nmt.client.modules.impl;

import com.vikingbrain.nmt.client.modules.ModuleSetting;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.setting.GetLanguageOperation;
import com.vikingbrain.nmt.operations.setting.GetPhotoIntervalOperation;
import com.vikingbrain.nmt.operations.setting.GetRepeatModeOperation;
import com.vikingbrain.nmt.operations.setting.GetScreenSaverTimeOperation;
import com.vikingbrain.nmt.operations.setting.GetSlideShowEffectOperation;
import com.vikingbrain.nmt.operations.setting.GetSubtitleLanguageOperation;
import com.vikingbrain.nmt.operations.setting.ListLanguageOperation;
import com.vikingbrain.nmt.operations.setting.ListNetworkSharedFolderOperation;
import com.vikingbrain.nmt.operations.setting.ListPhotoIntervalOperation;
import com.vikingbrain.nmt.operations.setting.ListRepeatModeOperation;
import com.vikingbrain.nmt.operations.setting.ListScreenSaverTimeOperation;
import com.vikingbrain.nmt.operations.setting.ListSlideShowEffectOperation;
import com.vikingbrain.nmt.operations.setting.ListSubtitleLanguageOperation;
import com.vikingbrain.nmt.operations.setting.SetLanguageOperation;
import com.vikingbrain.nmt.operations.setting.SetPhotoIntervalOperation;
import com.vikingbrain.nmt.operations.setting.SetRepeatModeOperation;
import com.vikingbrain.nmt.operations.setting.SetScreenSaverTimeOperation;
import com.vikingbrain.nmt.operations.setting.SetSlideShowEffectOperation;
import com.vikingbrain.nmt.operations.setting.SetSubtitleLanguageOperation;

/**
 * It allows to create the operations related to the setting module.
 * 
 * @author vikingBrain
 */
public class ModuleSettingImpl extends AbstractModule implements ModuleSetting { 

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ModuleSettingImpl(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory);
	}
	
	/** {@inheritDoc} */
	public ListLanguageOperation buildListLanguageOperation(){
		return new ListLanguageOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public SetLanguageOperation buildSetLanguageOperation(String language){
		return new SetLanguageOperation(getOperationFactory(), language);
	}
	
	/** {@inheritDoc} */
	public GetLanguageOperation buildGetLanguageOperation(){
		return new GetLanguageOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public ListSubtitleLanguageOperation buildListSubtitleLanguageOperation(){
		return new ListSubtitleLanguageOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public SetSubtitleLanguageOperation buildSetSubtitleLanguageOperation(String language){
		return new SetSubtitleLanguageOperation(getOperationFactory(), language);
	}
		
	/** {@inheritDoc} */
	public GetSubtitleLanguageOperation buildGetSubtitleLanguageOperation(){
		return new GetSubtitleLanguageOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public ListRepeatModeOperation buildListRepeatModeOperation(){
		return new ListRepeatModeOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public SetRepeatModeOperation buildSetRepeatModeOperation(String repeatMode){
		return new SetRepeatModeOperation(getOperationFactory(), repeatMode);
	}
	
	/** {@inheritDoc} */
	public GetRepeatModeOperation buildGetRepeatModeOperation(){
		return new GetRepeatModeOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public ListSlideShowEffectOperation buildListSlideShowEffectOperation(){
		return new ListSlideShowEffectOperation(getOperationFactory());
	}	
	
	/** {@inheritDoc} */
	public SetSlideShowEffectOperation buildSetSlideShowEffectOperation(String slideShowEffect){
		return new SetSlideShowEffectOperation(getOperationFactory(), slideShowEffect);
	}	
	
	/** {@inheritDoc} */
	public GetSlideShowEffectOperation buildGetSlideShowEffectOperation(){
		return new GetSlideShowEffectOperation(getOperationFactory());
	}	
	
	/** {@inheritDoc} */
	public ListPhotoIntervalOperation buildListPhotoIntervalOperation(){
		return new ListPhotoIntervalOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public SetPhotoIntervalOperation buildSetPhotoIntervalOperation(String time){
		return new SetPhotoIntervalOperation(getOperationFactory(), time);
	}
	
	/** {@inheritDoc} */
	public GetPhotoIntervalOperation buildGetPhotoIntervalOperation(){
		return new GetPhotoIntervalOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public ListScreenSaverTimeOperation buildListScreenSaverTimeOperation(){
		return new ListScreenSaverTimeOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public SetScreenSaverTimeOperation buildSetScreenSaverTimeOperation(String time){
		return new SetScreenSaverTimeOperation(getOperationFactory(), time);
	}
	
	/** {@inheritDoc} */
	public GetScreenSaverTimeOperation buildGetScreenSaverTimeOperation(){
		return new GetScreenSaverTimeOperation(getOperationFactory());
	}

	//TODO list_screen_saver_time
	
	//TODO set_screen_saver_time
	
	//TODO get_screen_saver_time
	
	
	
	
	//TODO set_setup_page_lock
	
	//TODO get_setup_page_lock
	
	//TODO list_video_output
	
	//TODO set_video_output
	
	//TODO get_video_output
	
	//TODO list_framerate_sync
	
	//TODO set_framerate_sync
	
	//TODO get_framerate_sync
	
	//TODO list_video_zoom
	
	//TODO set_video_zoom
	
	//TODO get_video_zoom
	
	//TODO list_tv_type
	
	//TODO set_tv_type
	
	//TODO get_tv_type
	
	//TODO list_color_space
	
	//TODO set_color_space
	
	//TODO get_color_space
	
	//TODO set_hdmi_audio
	
	//TODO get_hdmi_audio
	
	//TODO list_dts_audio_mode
	
	//TODO set_dts_audio_mode
	
	//TODO get_dts_audio_mode
	
	//TODO list_ac3_audio_mode
	
	//TODO set_ac3_audio_mode
	
	//TODO get_ac3_audio_mode
	
	//TODO list_aac_audio_mode
	
	//TODO set_aac_audio_mode
	
	//TODO get_aac_audio_mode
	
	//TODO list_wma_pro_audio_mode
	
	//TODO set_wma_pro_audio_mode
	
	//TODO get_wma_pro_audio_mode
	
	//TODO list_pcm_audio_mode
	
	//TODO set_pcm_audio_mode
	
	//TODO get_pcm_audio_mode
	
	//TODO list_network_mode
	
	//TODO set_network_mode
	
	//TODO get_network_mode
	
	//TODO list_time_zone
	
	//TODO set_time_zone
	
	//TODO get_time_zone
	
	//TODO set_time_server
	
	//TODO get_time_server
	
	//TODO set_daylight_saving
	
	//TODO get_daylight_saving
	
	//TODO set_ip_setting
	
	//TODO get_ip_setting
	
	/** {@inheritDoc} */
	public ListNetworkSharedFolderOperation buildListNetworkSharedFolderOperation(){
		return new ListNetworkSharedFolderOperation(getOperationFactory());
	}
		
	//TODO add_network_shared_folder
	
	//TODO delete_network_shared_folder
	
	//TODO list_dvd_parental_control_level
	
	//TODO set_dvd_parental_control_level
	
	//TODO get_dvd_parental_control_level
	
	//TODO set_dvd_cdda_autoplay
	
	//TODO get_dvd_cdda_autoplay
	
	//TODO list_dvd_audio_language
	
	//TODO set_dvd_audio_language
	
	//TODO get_dvd_audio_language
	
	//TODO list_dvd_subtitle_language
	
	//TODO set_dvd_subtitle_language
	
	//TODO get_dvd_subtitle_language
	
	//TODO set_dvd_parental_control_password
	
	//TODO set_proxy_setting
	
	//TODO get_proxy_setting
	
	//TODO list_wireless_ssid
	
	//TODO list_wireless_connection
	
	//TODO list_wireless_security
	
	//TODO get_wireless_ssid
	
	//TODO get_wireless_connection
	
	//TODO get_wireless_security
	
	//TODO set_wireless_ssid
	
	//TODO set_wireless_connection
	
	//TODO set_wireless_security
	
	//TODO set_wireless_setting
	
	//TODO list_file_lock
	
	//TODO set_file_lock
	
	//TODO get_file_lock
	
	//TODO list_setup_option
	
	//TODO list_bd_navigation_option
	
	//TODO set_bd_navigation
	
	//TODO get_bd_navigation
	
	//TODO list_drc_option
	
	//TODO set_drc
	
	//TODO get_drc
	
	//TODO list_connection_speed_option
	
	//TODO set_connection_speed
	
	//TODO get_connection_speed
	
	//TODO list_dns_address_setup
	
	//TODO set_dns_address_setup
	
	//TODO get_dns_address_setup
	
	//TODO set_dns_address
	
	//TODO get_dns_address
	
	//TODO get_preferences
	
	//TODO get_audio
	
	//TODO get_video
	
	//TODO get_dvd
	
	//TODO get_security
	
	//TODO get_maintenance
	
	//TODO get_nmt_application
	
	//TODO get_configure_ip
	
	//TODO get_wireless_config
	
	//TODO get_advanced_network
	
	//TODO set_scanner_language
	
	//TODO get_scanner_language
	
	//TODO set_menu_mode
	
	//TODO get_menu_mode
	
	//TODO set_recent_activity
	
	//TODO get_recent_activity
	
	//TODO set_browse_mode
	
	//TODO get_browse_mode
	
	//TODO set_wallpaper_download_option
	
	//TODO get_wallpaper_download_option

}
