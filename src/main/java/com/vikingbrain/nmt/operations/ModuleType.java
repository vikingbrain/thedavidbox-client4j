package com.vikingbrain.nmt.operations;



public interface ModuleType {

	public enum DEPLOYMENT implements OperationType {
		// Operations in this module
		get_database, set_database;
		
		public String getModuleName() {
			return "deployment";
		}

		public String getOperationName() {
			return this.toString();
		}

	};

	public enum DOWNLOAD_MANAGER implements OperationType {
		// Operations in this module
		get_download_agent_status, start_download_agent, stop_download_agent,
		set_download_agent_settings, get_download_agent_settings, create_download_task,
		list_download_tasks, get_download_task_info, list_download_task_info, start_download_task,
		stop_download_task, stop_all_download_task, delete_download_task, delete_all_download_task, 
		start_all_download_task, delete_download_task_and_data, delete_all_download_task_and_data, 
		list_setting_torrent_schedule, list_setting_downloaded_schedule, list_bandwidth_schedule,
		list_torrent_schedule, list_downloaded_schedule, add_bandwidth_schedule, add_torrent_schedule,
		add_downloaded_schedule, delete_schedule, reset_bandwidth_schedule, reset_torrent_schedule,
		reset_downloaded_schedule;

		public String getModuleName() {
			return "download_manager";
		}

		public String getOperationName() {
			return this.toString();
		}

	};

	public enum FILE_OPERATION implements OperationType {
		// Operations in this module
		list_user_storage_file, search_user_storage_file, create_user_storage_file, write_user_storage_file,
		read_user_storage_file, get_user_storage_file_info, copy_user_storage_file, move_user_storage_file,
		delete_user_storage_file, create_user_storage_directory, rename_user_storage_file, 
		select_user_storage_file_to_list, delete_user_storage_file_from_list, copy_user_storage_file_from_list, 
		move_user_storage_file_from_list, create_app_storage, change_app_storage_password, 
		create_app_storage_file, write_app_storage_file, read_app_storage_file, get_app_storage_file_info, 
		copy_app_storage_file, delete_app_storage, delete_app_storage_file, ripping;

		public String getModuleName() {
			return "file_operation";
		}

		public String getOperationName() {
			return this.toString();
		}

	};

	public enum METADATA implements OperationType {
		// Operations in this module
		list_all_metadata, get_metadata, set_metadata, get_reference_file, 
		delete_metadata, delete_all_metadata;

		public String getModuleName() {
			return "metadata";
		}

		public String getOperationName() {
			return this.toString();
		}

	};	
	
	public enum METADATA_DATABASE implements OperationType {
		// Operations in this module
		list_total_album_photo, list_compact_photo_wall, list_total_photo_item, list_photo_item, 
		get_photo_info, jump_photo_index, delete_photo, list_total_category_video, 
		list_compact_video_wall, list_total_video_item, list_video_item, get_video_info,
		jump_video_index, delete_video, update_video_rating, search_video, replace_video_info,
		set_video_watched, search_person, replace_video_image, download_video_image, 
		list_total_category_music, list_compact_music_wall, list_total_music_item, list_music_item,
		list_all_music_playlist, get_particular_music_album_info, get_particular_music_song_info,
		get_particular_music_playlist_info, edit_music_playlist, create_music_playlist, 
		add_item_to_music_playlist, delete_music, jump_music_index, update_music_rating, 
		search_music, search_artist, list_all_total_item, list_all_item, get_all_index, 
		get_recent_activities, scanner_start, scanner_pause, scanner_stop, add_scandir,
		list_scandir, remove_scandir, update_scandir, check_database, update_database,
		check_scanner_status, check_download_target_status, download_subtitle, rename_subtitle;

		public String getModuleName() {
			return "metadata_database";
		}

		public String getOperationName() {
			return this.toString();
		}

	};	

	public enum NETWORK_BROWSE implements OperationType {
		// Operations in this module
		list_network_resource, list_network_content;

		public String getModuleName() {
			return "network_browse";
		}

		public String getOperationName() {
			return this.toString();
		}

	};	
	
	public enum PLAYBACK implements OperationType {
		// Operations in this module
		list_vod_supported_format,				
		start_vod, get_current_vod_info, list_playback_speed_vod, get_playback_speed_vod,
		set_playback_speed_vod, step_vod, repeat_vod, list_subtitle_vod, set_subtitle_vod,
		list_audio_vod, set_audio_vod, set_time_seek_vod, set_zoom_vod,pause_vod, resume_vod, 
		stop_vod, insert_vod_queue, next_vod_in_queue, delete_vod_entry_queue, list_vod_queue_info,		
		list_aod_supported_format, start_aod, get_current_aod_info, pause_aod, resume_aod, 
		repeat_aod, stop_aod, insert_aod_queue, next_aod_in_queue, delete_aod_entry_queue, 
		list_aod_queue_info, list_pod_supported_format, marquee_aod, start_pod, get_current_pod_info,
		pause_pod, resume_pod, set_zoom_pod, stop_pod, insert_pod_queue, next_pod_in_queue,
		delete_pod_entry_queue, list_pod_queue_info, start_database_aod, insert_database_aod_queue, 
		delete_playlist_aod_queue, list_playlist_aod_queue_info, get_playlist_current_aod_info, 
		prev_aod_in_queue, start_database_vod, next_database_vod_in_queue, 
		prev_database_vod_in_queue, stop_database_vod, start_database_pod;

		public String getModuleName() {
			return "playback";
		}

		public String getOperationName() {
			return this.toString();
		}
	};

	public enum SETTING implements OperationType {
		// Operations in this module
		list_language, set_language, get_language, list_subtitle_language, set_subtitle_language,
		get_subtitle_language, list_repeat_mode, set_repeat_mode, get_repeat_mode, list_slide_show_effect,
		set_slide_show_effect, get_slide_show_effect, list_photo_interval, set_photo_interval, get_photo_interval,
		list_screen_saver_time, set_screen_saver_time, get_screen_saver_time, set_setup_page_lock, 
		get_setup_page_lock, list_video_output, set_video_output, get_video_output, list_framerate_sync,
		set_framerate_sync, get_framerate_sync, list_video_zoom, set_video_zoom, get_video_zoom,
		list_tv_type, set_tv_type, get_tv_type, list_color_space, set_color_space, get_color_space,
		set_hdmi_audio, get_hdmi_audio, list_dts_audio_mode, set_dts_audio_mode, get_dts_audio_mode, 
		list_ac3_audio_mode, set_ac3_audio_mode, get_ac3_audio_mode, list_aac_audio_mode, set_aac_audio_mode, 
		get_aac_audio_mode, list_wma_pro_audio_mode, set_wma_pro_audio_mode, get_wma_pro_audio_mode,
		list_pcm_audio_mode, set_pcm_audio_mode, get_pcm_audio_mode, list_network_mode, 
		set_network_mode, get_network_mode, list_time_zone, set_time_zone, get_time_zone,
		set_time_server, get_time_server, set_daylight_saving, get_daylight_saving, set_ip_setting,
		get_ip_setting, list_network_shared_folder, add_network_shared_folder, delete_network_shared_folder,
		list_dvd_parental_control_level, set_dvd_parental_control_level, get_dvd_parental_control_level,
		set_dvd_cdda_autoplay, get_dvd_cdda_autoplay, list_dvd_audio_language, set_dvd_audio_language,
		get_dvd_audio_language, list_dvd_subtitle_language, set_dvd_subtitle_language, get_dvd_subtitle_language,
		set_dvd_parental_control_password, set_proxy_setting, get_proxy_setting, list_wireless_ssid, 
		list_wireless_connection, list_wireless_security, get_wireless_ssid, get_wireless_connection,
		get_wireless_security, set_wireless_ssid, set_wireless_connection, set_wireless_security,
		set_wireless_setting, list_file_lock, set_file_lock, get_file_lock, list_setup_option,
		list_bd_navigation_option, set_bd_navigation, get_bd_navigation, list_drc_option, set_drc,
		get_drc, list_connection_speed_option, set_connection_speed, get_connection_speed,
		list_dns_address_setup, set_dns_address_setup, get_dns_address_setup, set_dns_address,
		get_dns_address, get_preferences, get_audio, get_video, get_dvd, get_security, get_maintenance,
		get_nmt_application, get_configure_ip, get_wireless_config, get_advanced_network,
		set_scanner_language, get_scanner_language, set_menu_mode, get_menu_mode, set_recent_activity,
		get_recent_activity, set_browse_mode, get_browse_mode, set_wallpaper_download_option, 
		get_wallpaper_download_option;

		public String getModuleName() {
			return "setting";
		}

		public String getOperationName() {
			return this.toString();
		}

	};

	public enum SYSTEM implements OperationType {
		// Operations in this module
		get_mac_address, get_firmware_version, get_nmt_version, check_nmt_exist, list_nmt_services,
		set_nmt_service_status, get_nmt_service_status, set_nmt_device_name, get_nmt_device_name,
		set_nmt_samba_workgroup, get_nmt_samba_workgroup, set_nmt_ftp_password, set_nmt_media_destination,
		install_nmt, list_devices, list_drives, get_device_info, list_all_active_apps, get_current_app,
		get_mute_status, set_mute_status, get_system_volume, set_system_volume, list_key, send_key,
		load_page, get_connection_status, get_linkup_status, suspend_screensaver, get_board_id,
		get_time, load_appcenter, load_launcher, load_phf, load_widget, list_webservices_option,
		update_firmware, set_system_led, capture_screen;

		public String getModuleName() {
			return "system";
		}

		public String getOperationName() {
			return this.toString();
		}

	};

	public enum UPNP implements OperationType {
		// Operations in this module
		list_upnp_server, list_upnp_server_files;

		public String getModuleName() {
			return "upnp";
		}

		public String getOperationName() {
			return this.toString();
		}

	};

}