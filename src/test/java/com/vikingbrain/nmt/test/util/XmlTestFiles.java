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
package com.vikingbrain.nmt.test.util;

/**
 * 
 * @author vikingBrain
 */
public class XmlTestFiles {

	public static final String TEST_RESPONSES_BASE_PATH =  "src/test/resources/responses/";

	/** DEPLOYMENT OPERATIONS. */
	public static final String FOLDER_DEPLOYMENT = "deployment/";
	/** Get database. */
	public static final String GET_DATABASE_DOCUMENTATION_EXAMPLE = FOLDER_DEPLOYMENT + "GetDatabase_documentation_example.xml";
	/** Set database. */
	public static final String SET_DATABASE_DOCUMENTATION_EXAMPLE = FOLDER_DEPLOYMENT + "SetDatabase_documentation_example.xml";
	
	
	/** DOWNLOAD MANAGER OPERATIONS. */
	public static final String FOLDER_DOWNLOAD_MANAGER = "download_manager/";
	/** Get download agent status. */
	public static final String GET_DOWNLOAD_AGENT_STATUS_DOCUMENTATION_EXAMPLE = FOLDER_DOWNLOAD_MANAGER + "GetDownloadAgentStatus_documentation_example.xml";
	/** Start download agent. */
	public static final String START_DOWNLOAD_AGENT_DOCUMENTATION_EXAMPLE = FOLDER_DOWNLOAD_MANAGER + "StartDownloadAgent_documentation_example.xml";
	/** Stop download agent. */
	public static final String STOP_DOWNLOAD_AGENT_DOCUMENTATION_EXAMPLE = FOLDER_DOWNLOAD_MANAGER + "StopDownloadAgent_documentation_example.xml";
	/** Create download task. */
	public static final String CREATE_DOWNLOAD_TASK_DOCUMENTATION_EXAMPLE = FOLDER_DOWNLOAD_MANAGER + "CreateDownloadTask_documentation_example.xml";
	/** List download tasks. */
	public static final String LIST_DOWNLOAD_TASKS_DOCUMENTATION_EXAMPLE = FOLDER_DOWNLOAD_MANAGER + "ListDownloadTasks_documentation_example.xml";
	public static final String LIST_DOWNLOAD_TASKS_A200 = FOLDER_DOWNLOAD_MANAGER + "ListDownloadTasks_a200.xml";
	public static final String LIST_DOWNLOAD_TASKS_A200_ERROR_510 = FOLDER_DOWNLOAD_MANAGER + "ListDownloadTasks_a200_error510.xml";
	
	
	/** FILE OPERTAIONS. */
	public static final String FOLDER_FILE_OPERATION = "file_operation/";
	/** List user storage file response files for root path. */
	public static final String LIST_USER_STORAGE_FILE_ROOT_A200 = FOLDER_FILE_OPERATION + "ListUserStorageFile_root_a200.xml";
	/** List user storage file response files. */
	public static final String LIST_USER_STORAGE_FILE_A200 = FOLDER_FILE_OPERATION + "ListUserStorageFile_a200.xml";
	public static final String LIST_USER_STORAGE_FILE_DOCUMENTATION_EXAMPLE = FOLDER_FILE_OPERATION + "ListUserStorageFile_documentation_example.xml";
	public static final String LIST_USER_STORAGE_FROM_FORUM_1 = FOLDER_FILE_OPERATION + "ListUserStorageFile_from_forum1.xml";
	
	/** Get user storage file info response files. */
	public static final String GET_USER_STORAGE_FILE_INFO_A200 = FOLDER_FILE_OPERATION + "GetUserStorageFileInfo_a200.xml";
	public static final String GET_USER_STORAGE_FILE_INFO_DOCUMENTATION_EXAMPLE = FOLDER_FILE_OPERATION + "GetUserStorageFileInfo_documentation_example.xml";
	
	
	
	/** NETWORK BROWSE. */
	public static final String FOLDER_NETWORK_BROWSE = "network_browse/";
	
	/** Delete audio entry queue response files. */
	public static final String LIST_NETWORK_RESOURCE_DOCUMENTATION_EXAMPLE = FOLDER_NETWORK_BROWSE + "ListNetworkResource_documentation_example.xml";				
	public static final String LIST_NETWORK_RESOURCE_A200 = FOLDER_NETWORK_BROWSE + "ListNetworkResource_a200.xml";
	
	
	/** PLAYBACK. */
	public static final String FOLDER_PLAYBACK = "playback/";
	
	/** List aod supported format response files. */
	public static final String LIST_AOD_SUPPORTED_FORMAT_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ListAodSupportedFormat_documentation_example.xml";				
	public static final String LIST_AOD_SUPPORTED_FORMAT_A200 = FOLDER_PLAYBACK + "ListAodSupportedFormat_a200.xml";

	/** List vod supported format response files. */
	public static final String LIST_VOD_SUPPORTED_FORMAT_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ListVodSupportedFormat_documentation_example.xml";				
	public static final String LIST_VOD_SUPPORTED_FORMAT_A200 = FOLDER_PLAYBACK + "ListVodSupportedFormat_a200.xml";

	/** List pod supported format response files. */
	public static final String LIST_POD_SUPPORTED_FORMAT_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ListPodSupportedFormat_documentation_example.xml";				
	public static final String LIST_POD_SUPPORTED_FORMAT_A200 = FOLDER_PLAYBACK + "ListPodSupportedFormat_a200.xml";
	
	/** Delete audio entry queue response files. */
	public static final String DELETE_AOD_ENTRY_QUEUE_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "DeleteAodEntryQueue_documentation_example.xml";				
	public static final String DELETE_AOD_ENTRY_QUEUE_A200 = FOLDER_PLAYBACK + "DeleteAodEntryQueue_a200.xml";

	/** Delete video entry queue response files. */
	public static final String DELETE_VOD_ENTRY_QUEUE_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "DeleteVodEntryQueue_documentation_example.xml";				
	public static final String DELETE_VOD_ENTRY_QUEUE_A200 = FOLDER_PLAYBACK + "DeleteVodEntryQueue_a200.xml";

	/** Delete photo entry queue response files. */
	public static final String DELETE_POD_ENTRY_QUEUE_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "DeletePodEntryQueue_documentation_example.xml";				
	public static final String DELETE_POD_ENTRY_QUEUE_A200 = FOLDER_PLAYBACK + "DeletePodEntryQueue_a200.xml";
	
	/** Get current aod info response files. */
	public static final String GET_CURRENT_AOD_INFO_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "GetCurrentAodInfo_documentation_example.xml";				
	public static final String GET_CURRENT_AOD_INFO_A200 = FOLDER_PLAYBACK + "GetCurrentAodInfo_a200.xml";

	/** Get current vod info response files. */
	public static final String GET_CURRENT_VOD_INFO_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "GetCurrentVodInfo_documentation_example.xml";	
	public static final String GET_CURRENT_VOD_INFO_A200_TEST1 = FOLDER_PLAYBACK + "GetCurrentVodInfo_a200_test1.xml";	
	public static final String GET_CURRENT_VOD_INFO_A200_TEST2 = FOLDER_PLAYBACK + "GetCurrentVodInfo_a200_test2.xml";
	
	/** Get current pod info response files. */
	public static final String GET_CURRENT_POD_INFO_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "GetCurrentPodInfo_documentation_example.xml";	
	public static final String GET_CURRENT_POD_INFO_A200 = FOLDER_PLAYBACK + "GetCurrentPodInfo_a200.xml";	

	/** List playback speed vod response files. */
	public static final String LIST_PLAYBACK_SPEED_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ListPlaybackSpeedVod_documentation_example.xml";	
	public static final String LIST_PLAYBACK_SPEED_VOD_A200 = FOLDER_PLAYBACK + "ListPlaybackSpeedVod_a200.xml";
	
	/** Get playback speed vod response files. */
	public static final String GET_PLAYBACK_SPEED_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "GetPlaybackSpeedVod_documentation_example.xml";	
	public static final String GET_PLAYBACK_SPEED_VOD_A200 = FOLDER_PLAYBACK + "GetPlaybackSpeedVod_a200.xml";
	
	/** Set playback speed vod response files. */
	public static final String SET_PLAYBACK_SPEED_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "SetPlaybackSpeedVod_documentation_example.xml";	
	public static final String SET_PLAYBACK_SPEED_VOD_A200 = FOLDER_PLAYBACK + "SetPlaybackSpeedVod_a200.xml";
	
	
	/** Insert audio queue response files. */
	public static final String INSERT_AOD_QUEUE_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "InserAodQueue_documentation_example.xml";
	public static final String INSERT_AOD_QUEUE_A200 = FOLDER_PLAYBACK + "InserAodQueue_a200.xml";

	/** Insert photo queue response files. */
	public static final String INSERT_POD_QUEUE_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "InserPodQueue_documentation_example.xml";
	public static final String INSERT_POD_QUEUE_A200 = FOLDER_PLAYBACK + "InserPodQueue_a200.xml";

	/** Insert video queue response files. */
	public static final String INSERT_VOD_QUEUE_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "InserVodQueue_documentation_example.xml";
	public static final String INSERT_VOD_QUEUE_A200 = FOLDER_PLAYBACK + "InserVodQueue_a200.xml";

	/** List audio queue info response files. */
	public static final String LIST_AOD_QUEUE_INFO_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ListAodQueueInfo_documentation_example.xml";
	public static final String LIST_AOD_QUEUE_INFO_A200 = FOLDER_PLAYBACK + "ListAodQueueInfo_a200.xml";
	public static final String LIST_AOD_QUEUE_INFO_A200_TEST2 = FOLDER_PLAYBACK + "ListAodQueueInfo_a200_test2.xml";

	/** List video queue info response files. */
	public static final String LIST_VOD_QUEUE_INFO_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ListVodQueueInfo_documentation_example.xml";
	public static final String LIST_VOD_QUEUE_INFO_A200 = FOLDER_PLAYBACK + "ListVodQueueInfo_a200.xml";
	public static final String LIST_VOD_QUEUE_INFO_A200_TEST2 = FOLDER_PLAYBACK + "ListVodQueueInfo_a200_test2.xml";

	/** List photo queue info response files. */
	public static final String LIST_POD_QUEUE_INFO_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ListPodQueueInfo_documentation_example.xml";
	public static final String LIST_POD_QUEUE_INFO_A200 = FOLDER_PLAYBACK + "ListPodQueueInfo_a200.xml";
	public static final String LIST_POD_QUEUE_INFO_A200_TEST2 = FOLDER_PLAYBACK + "ListPodQueueInfo_a200_test2.xml";

	/** Start audio response files. */
	public static final String START_AOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "StartAod_documentation_example.xml";
	public static final String START_AOD_A200 = FOLDER_PLAYBACK + "StartAod_a200.xml";

	/** Start photo response files. */
	public static final String START_POD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "StartPod_documentation_example.xml";
	public static final String START_POD_A200 = FOLDER_PLAYBACK + "StartPod_a200.xml";

	/** Start video response files. */
	public static final String START_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "StartVod_documentation_example.xml";
	public static final String START_VOD_A200 = FOLDER_PLAYBACK + "StartVod_a200.xml";
	
	/** Stop audio response files. */
	public static final String STOP_AOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "StopAod_documentation_example.xml";
	public static final String STOP_AOD_A200 = FOLDER_PLAYBACK + "StopAod_a200.xml";

	/** Stop photo response files. */
	public static final String STOP_POD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "StopPod_documentation_example.xml";
	public static final String STOP_POD_A200 = FOLDER_PLAYBACK + "StopPod_a200.xml";

	/** Stop video response files. */
	public static final String STOP_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "StopVod_documentation_example.xml";
	public static final String STOP_VOD_A200 = FOLDER_PLAYBACK + "StopVod_a200.xml";

	/** Step video response files. */
	public static final String STEP_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "StepVod_documentation_example.xml";
	public static final String STEP_VOD_A200 = FOLDER_PLAYBACK + "StepVod_a200.xml";

	/** Repeat video playback response files. */
	public static final String REPEAT_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "RepeatVod_documentation_example.xml";
	public static final String REPEAT_VOD_A200 = FOLDER_PLAYBACK + "RepeatVod_a200.xml";

	/** List subtitle vod response files. */
	public static final String LIST_SUBTITLE_VOD_DOCUMENTATION_EXAMPLE_DVD_MEDIA_FORMAT = FOLDER_PLAYBACK + "ListSubtitleVod_documentation_example_dvd_media_format.xml";
	public static final String LIST_SUBTITLE_VOD_DOCUMENTATION_EXAMPLE_NON_DVD_MEDIA_FORMAT = FOLDER_PLAYBACK + "ListSubtitleVod_documentation_example_non_dvd_media_format.xml";
	public static final String LIST_SUBTITLE_VOD_A200 = FOLDER_PLAYBACK + "ListSubtitleVod_a200.xml";

	/** Set subtitle vod response files. */
	public static final String SET_SUBTITLE_VOD_DVD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "SetSubtitleVodDvd_documentation_example.xml";
	public static final String SET_SUBTITLE_VOD_NON_DVD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "SetSubtitleVodNonDvd_documentation_example.xml";
	public static final String SET_SUBTITLE_VOD_NON_DVD_A200 = FOLDER_PLAYBACK + "SetSubtitleVodNonDvd_a200.xml";

	/** List audio vod response files. */
	public static final String LIST_AUDIO_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ListAudioVod_documentation_example.xml";
	public static final String LIST_AUDIO_VOD_A200 = FOLDER_PLAYBACK + "ListAudioVod_a200.xml";
	
	/** Set audio vod response files. */
	public static final String SET_AUDIO_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "SetAudioVod_documentation_example.xml";
	public static final String SET_AUDIO_VOD_A200 = FOLDER_PLAYBACK + "SetAudioVod_a200.xml";
	
	/** Set time seek vod response files. */
	public static final String SET_TIME_SEEK_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "SetTimeSeekVod_documentation_example.xml";
	public static final String SET_TIME_SEEK_VOD_A200 = FOLDER_PLAYBACK + "SetTimeSeekVod_a200.xml";
	
	/** Set zoom vod response files. */
	public static final String SET_ZOOM_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "SetZoomVod_documentation_example.xml";
	public static final String SET_ZOOM_VOD_A200 = FOLDER_PLAYBACK + "SetZoomVod_a200.xml";
	
	/** Pause vod response files. */
	public static final String PAUSE_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "PauseVod_documentation_example.xml";
	public static final String PAUSE_VOD_A200 = FOLDER_PLAYBACK + "PauseVod_a200.xml";

	/** Pause aod response files. */
	public static final String PAUSE_AOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "PauseAod_documentation_example.xml";
	public static final String PAUSE_AOD_A200 = FOLDER_PLAYBACK + "PauseAod_a200.xml";

	/** Pause pod response files. */
	public static final String PAUSE_POD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "PausePod_documentation_example.xml";
	public static final String PAUSE_POD_A200 = FOLDER_PLAYBACK + "PausePod_a200.xml";

	/** Resume vod response files. */
	public static final String RESUME_VOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ResumeVod_documentation_example.xml";
	public static final String RESUME_VOD_A200 = FOLDER_PLAYBACK + "ResumeVod_a200.xml";

	/** Resume aod response files. */
	public static final String RESUME_AOD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ResumeAod_documentation_example.xml";
	public static final String RESUME_AOD_A200 = FOLDER_PLAYBACK + "ResumeAod_a200.xml";

	/** Resume pod response files. */
	public static final String RESUME_POD_DOCUMENTATION_EXAMPLE = FOLDER_PLAYBACK + "ResumePod_documentation_example.xml";
	public static final String RESUME_POD_A200 = FOLDER_PLAYBACK + "ResumePod_a200.xml";

	
	/** SETTING. */
	public static final String FOLDER_SETTING = "setting/";

	/** Check nmt exist response files. */
	public static final String LIST_NETWORK_SHARED_FOLDER_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "ListNetworkSharedFolder_documentation_example.xml";				
	public static final String LIST_NETWORK_SHARED_FOLDER_A200 = FOLDER_SETTING + "ListNetworkSharedFolder_a200.xml";
	public static final String LIST_NETWORK_SHARED_FROM_FORUM_1 = FOLDER_SETTING + "ListNetworkSharedFolder_from_forum_1.xml";
	public static final String LIST_NETWORK_SHARED_FROM_FORUM_2 = FOLDER_SETTING + "ListNetworkSharedFolder_from_forum_2.xml";
	
	/** List language response files. */
	public static final String LIST_LANGUAGE_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "ListLanguage_documentation_example.xml";				
	public static final String LIST_LANGUAGE_A200 = FOLDER_SETTING + "ListLanguage_a200.xml";
	
	/** Set language response files. */
	public static final String SET_LANGUAGE_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "SetLanguage_documentation_example.xml";				
	public static final String SET_LANGUAGE_A200 = FOLDER_SETTING + "SetLanguage_a200.xml";

	/** Get language response files. */
	public static final String GET_LANGUAGE_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "GetLanguage_documentation_example.xml";				
	public static final String GET_LANGUAGE_A200 = FOLDER_SETTING + "GetLanguage_a200.xml";
	
	/** List subtitle language response files. */
	public static final String LIST_SUBTITLE_LANGUAGE_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "ListSubtitleLanguage_documentation_example.xml";				
	public static final String LIST_SUBTITLE_LANGUAGE_A200 = FOLDER_SETTING + "ListSubtitleLanguage_a200.xml";

	/** Set subtitle language response files. */
	public static final String SET_SUBTITLE_LANGUAGE_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "SetSubtitleLanguage_documentation_example.xml";				
	public static final String SET_SUBTITLE_LANGUAGE_A200 = FOLDER_SETTING + "SetSubtitleLanguage_a200.xml";
	
	/** Get subtitle language response files. */
	public static final String GET_SUBTITLE_LANGUAGE_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "GetSubtitleLanguage_documentation_example.xml";				
	public static final String GET_SUBTITLE_LANGUAGE_A200 = FOLDER_SETTING + "GetSubtitleLanguage_a200.xml";
	
	/** List repeat mode response files. */
	public static final String LIST_REPEAT_MODE_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "ListRepeatMode_documentation_example.xml";				
	public static final String LIST_REPEAT_MODE_A200 = FOLDER_SETTING + "ListRepeatMode_a200.xml";
	
	/** Set repeat mode response files. */
	public static final String SET_REPEAT_MODE_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "SetRepeatMode_documentation_example.xml";				
	public static final String SET_REPEAT_MODE_A200 = FOLDER_SETTING + "SetRepeatMode_a200.xml";

	/** Get repeat mode response files. */
	public static final String GET_REPEAT_MODE_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "GetRepeatMode_documentation_example.xml";				
	public static final String GET_REPEAT_MODE_A200 = FOLDER_SETTING + "GetRepeatMode_a200.xml";

	/** List slide show effect response files. */
	public static final String LIST_SLIDE_SHOW_EFFECT_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "ListSlideShowEffect_documentation_example.xml";				
	public static final String LIST_SLIDE_SHOW_EFFECT_A200 = FOLDER_SETTING + "ListSlideShowEffect_a200.xml";

	/** Set slide show effect response files. */
	public static final String SET_SLIDE_SHOW_EFFECT_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "SetSlideShowEffect_documentation_example.xml";				
	public static final String SET_SLIDE_SHOW_EFFECT_A200 = FOLDER_SETTING + "SetSlideShowEffect_a200.xml";

	/** Get slide show effect response files. */
	public static final String GET_SLIDE_SHOW_EFFECT_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "GetSlideShowEffect_documentation_example.xml";				
	public static final String GET_SLIDE_SHOW_EFFECT_A200 = FOLDER_SETTING + "GetSlideShowEffect_a200.xml";

	/** List photo interval response files. */
	public static final String LIST_PHOTO_INTERVAL_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "ListPhotoInterval_documentation_example.xml";				
	public static final String LIST_PHOTO_INTERVAL_A200 = FOLDER_SETTING + "ListPhotoInterval_a200.xml";

	/** Set photo interval response files. */
	public static final String SET_PHOTO_INTERVAL_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "SetPhotoInterval_documentation_example.xml";				
	public static final String SET_PHOTO_INTERVAL_A200 = FOLDER_SETTING + "SetPhotoInterval_a200.xml";

	/** Get photo interval response files. */
	public static final String GET_PHOTO_INTERVAL_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "GetPhotoInterval_documentation_example.xml";				
	public static final String GET_PHOTO_INTERVAL_A200 = FOLDER_SETTING + "GetPhotoInterval_a200.xml";
	

	
	/** List screen saver time response files. */
	public static final String LIST_SCREEN_SAVER_TIME_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "ListScreenSaverTime_documentation_example.xml";				
	public static final String LIST_SCREEN_SAVER_TIME_A200 = FOLDER_SETTING + "ListScreenSaverTime_a200.xml";

	/** Set screen saver time response files. */
	public static final String SET_SCREEN_SAVER_TIME_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "SetScreenSaverTime_documentation_example.xml";				
	public static final String SET_SCREEN_SAVER_TIME_A200 = FOLDER_SETTING + "SetScreenSaverTime_a200.xml";

	/** Get screen saver time response files. */
	public static final String GET_SCREEN_SAVER_TIME_DOCUMENTATION_EXAMPLE = FOLDER_SETTING + "GetScreenSaverTime_documentation_example.xml";				
	public static final String GET_SCREEN_SAVER_TIME_A200 = FOLDER_SETTING + "GetScreenSaverTime_a200.xml";

	
	/** SYSTEM. */
	public static final String FOLDER_SYSTEM = "system/";

	/** Get MAC address response files. */	
	public static final String GET_MAC_ADDRESS_DOCUMENTATION_EXAMPLE = FOLDER_SYSTEM + "GetMacAddress_documentation_example.xml";
	public static final String GET_MAC_ADDRESS_A200 = FOLDER_SYSTEM + "GetMacAddress_a200.xml";

	/** Get firmware version response files. */	
	public static final String GET_FIRMWARE_VERSION_DOCUMENTATION_EXAMPLE = FOLDER_SYSTEM + "GetFirmwareVersion_documentation_example.xml";
	public static final String GET_FIRMWARE_VERSION_A200 = FOLDER_SYSTEM + "GetFirmwareVersion_a200.xml";

	/** Get nmt version response files. */	
	public static final String GET_NMT_VERSION_DOCUMENTATION_EXAMPLE = FOLDER_SYSTEM + "GetNmtVersion_documentation_example.xml";
	public static final String GET_NMT_VERSION_A200 = FOLDER_SYSTEM + "GetNmtVersion_a200.xml";

	/** Check nmt exist response files. */
	public static final String CHECK_NMT_EXIST_DOCUMENTATION_EXAMPLE = FOLDER_SYSTEM + "CheckNmtExist_documentation_example.xml";				
	public static final String CHECK_NMT_EXIST_A200 = FOLDER_SYSTEM + "CheckNmtExist_a200.xml";
		
	/** Get devide info response files. */
	public static final String GET_DEVICE_INFO_DOCUMENTATION_EXAMPLE = FOLDER_SYSTEM + "GetDeviceInfo_documentation_example.xml";				
	public static final String GET_DEVICE_INFO_A200 = FOLDER_SYSTEM + "GetDeviceInfo_a200.xml";
	public static final String GET_DEVICE_INFO_C200 = FOLDER_SYSTEM + "GetDeviceInfo_c200.xml";
	
	
	/** Get nmt service status response files. */
	public static final String GET_NMT_SERVICE_STATUS_DOCUMENTATION_EXAMPLE = FOLDER_SYSTEM + "GetNmtServiceStatus_documentation_example.xml";				
	public static final String GET_NMT_SERVICE_STATUS_A200= FOLDER_SYSTEM + "GetNmtServiceStatus_a200.xml";
		
	/** List devices response files. */
	public static final String LIST_DEVICES_DOCUMENTATION_EXAMPLE = FOLDER_SYSTEM + "ListDevices_documentation_example.xml";
	public static final String LIST_DEVICES_A200 = FOLDER_SYSTEM + "ListDevices_a200.xml";
	public static final String LIST_DEVICES_C200 = FOLDER_SYSTEM + "ListDevices_c200.xml";

	/** List nmt services response files. */
	public static final String LIST_NMT_SERVICES_DOCUMENTATION_EXAMPLE = FOLDER_SYSTEM + "ListNmtServices_documentation_example.xml";
	public static final String LIST_NMT_SERVICES_A200 = FOLDER_SYSTEM + "ListNmtServices_a200.xml";
	
	/** Send key response files. */	
	public static final String SEND_KEY_DOCUMENTATION_EXAMPLE = FOLDER_SYSTEM + "SendKey_documentation_example.xml";
	public static final String SEND_KEY_A200 = FOLDER_SYSTEM + "SendKey_a200.xml";

	/** Set nmt service status response files. */	
	public static final String SET_NMT_SERVICE_STATUS_DOCUMENTATION_EXAMPLE = FOLDER_SYSTEM + "SetNmtServiceStatus_documentation_example.xml";
	public static final String SET_NMT_SERVICE_STATUS_A200 = FOLDER_SYSTEM + "SetNmtServiceStatus_a200.xml";
	public static final String SET_NMT_SERVICE_STATUS_A200_TEST2 = FOLDER_SYSTEM + "SetNmtServiceStatus_a200_test2.xml";
	
	
	
	/** METADATA DATABASE. */
	public static final String FOLDER_METADATA_DATABASE = "metadata_database/";
	
	/** List total category video response files. */
	public static final String LIST_TOTAL_CATEGORY_VIDEO_DOCUMENTATION_EXAMPLE = FOLDER_METADATA_DATABASE + "ListTotalCategoryVideo_documentation_example.xml";
	public static final String LIST_TOTAL_CATEGORY_VIDEO_A200 = FOLDER_METADATA_DATABASE + "ListTotalCategoryVideo_a200.xml";
	
	/** List compat video wall response files. */
	public static final String LIST_COMPAT_VIDEO_WALL_DOCUMENTATION_EXAMPLE = FOLDER_METADATA_DATABASE + "ListCompatVideoWall_documentation_example.xml";
	public static final String LIST_COMPAT_VIDEO_WALL_VIDEO_A200 = FOLDER_METADATA_DATABASE + "ListCompatVideoWall_a200.xml";
		
	/** Get video info response files. */
	public static final String GET_VIDEO_INFO_EPISODE_A200 = FOLDER_METADATA_DATABASE + "GetVideoInfo_episode_a200.xml";
	public static final String GET_VIDEO_INFO_FULL_A200 = FOLDER_METADATA_DATABASE + "GetVideoInfo_full_a200.xml";
	public static final String GET_VIDEO_INFO_FULL_DOCUMENTATION_EXAMPLE = FOLDER_METADATA_DATABASE + "GetVideoInfo_full_documentation_example.xml";	
	public static final String GET_VIDEO_INFO_SUMMARY_A200 = FOLDER_METADATA_DATABASE + "GetVideoInfo_summary_a200.xml";
	public static final String GET_VIDEO_INFO_SUMMARY_DOCUMENTATION_EXAMPLE = FOLDER_METADATA_DATABASE + "GetVideoInfo_summary_documentation_example.xml";

	
	/** Check database response files. */
	public static final String CHECK_DATABASE_DOCUMENTATION_EXAMPLE = FOLDER_METADATA_DATABASE + "CheckDatabase_documentation_example.xml";
	public static final String CHECK_DATABASE_A200 = FOLDER_METADATA_DATABASE + "CheckDatabase_a200.xml";
	public static final String CHECK_DATABASE_FROM_FORUM_1 = FOLDER_METADATA_DATABASE + "CheckDatabase_from_forum1.xml";


	/** UPNP AV MODULE. */
	public static final String FOLDER_UPNP = "upnp/";
	
	/** List upnp servers. */
	public static final String LIST_UPNP_SERVER_DOCUMENTATION_EXAMPLE = FOLDER_UPNP + "ListUpnpServer_documentation_example.xml";
	public static final String LIST_UPNP_SERVER_C200 = FOLDER_UPNP + "ListUpnpServer_c200.xml";

	/** List upnp server files in the root. */
	public static final String LIST_UPNP_SERVER_FILES_ROOT_DOCUMENTATION_EXAMPLE = FOLDER_UPNP + "ListUpnpServerFiles_documentation_example.xml";
	
	/** List upnp server files in a directory id. */
	public static final String LIST_UPNP_SERVER_FILES_DOCUMENTATION_EXAMPLE = FOLDER_UPNP + "ListUpnpServerFiles_documentation_example.xml";
	
}
