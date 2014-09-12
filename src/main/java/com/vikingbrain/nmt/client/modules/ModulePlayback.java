package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.playback.DeleteAodEntryQueueOperation;
import com.vikingbrain.nmt.operations.playback.DeletePodEntryQueueOperation;
import com.vikingbrain.nmt.operations.playback.DeleteVodEntryQueueOperation;
import com.vikingbrain.nmt.operations.playback.GetCurrentAodInfoOperation;
import com.vikingbrain.nmt.operations.playback.GetCurrentPodInfoOperation;
import com.vikingbrain.nmt.operations.playback.GetCurrentVodInfoOperation;
import com.vikingbrain.nmt.operations.playback.GetPlaybackSpeedVodOperation;
import com.vikingbrain.nmt.operations.playback.InsertAodQueueOperation;
import com.vikingbrain.nmt.operations.playback.InsertPodQueueOperation;
import com.vikingbrain.nmt.operations.playback.InsertVodQueueOperation;
import com.vikingbrain.nmt.operations.playback.ListAodQueueInfoOperation;
import com.vikingbrain.nmt.operations.playback.ListAodSupportedFormatOperation;
import com.vikingbrain.nmt.operations.playback.ListAudioVodOperation;
import com.vikingbrain.nmt.operations.playback.ListPlaybackSpeedVodOperation;
import com.vikingbrain.nmt.operations.playback.ListPodQueueInfoOperation;
import com.vikingbrain.nmt.operations.playback.ListPodSupportedFormatOperation;
import com.vikingbrain.nmt.operations.playback.ListSubtitleVodOperation;
import com.vikingbrain.nmt.operations.playback.ListVodQueueInfoOperation;
import com.vikingbrain.nmt.operations.playback.ListVodSupportedFormatOperation;
import com.vikingbrain.nmt.operations.playback.PauseAodOperation;
import com.vikingbrain.nmt.operations.playback.PausePodOperation;
import com.vikingbrain.nmt.operations.playback.PauseVodOperation;
import com.vikingbrain.nmt.operations.playback.RepeatVodOperation;
import com.vikingbrain.nmt.operations.playback.ResumeAodOperation;
import com.vikingbrain.nmt.operations.playback.ResumePodOperation;
import com.vikingbrain.nmt.operations.playback.ResumeVodOperation;
import com.vikingbrain.nmt.operations.playback.SetAudioVodOperation;
import com.vikingbrain.nmt.operations.playback.SetPlaybackSpeedVodOperation;
import com.vikingbrain.nmt.operations.playback.SetSubtitleVodDvdOperation;
import com.vikingbrain.nmt.operations.playback.SetSubtitleVodNonDvdOperation;
import com.vikingbrain.nmt.operations.playback.SetTimeSeekVodOperation;
import com.vikingbrain.nmt.operations.playback.SetZoomVodOperation;
import com.vikingbrain.nmt.operations.playback.StartAodOperation;
import com.vikingbrain.nmt.operations.playback.StartPodOperation;
import com.vikingbrain.nmt.operations.playback.StartVodOperation;
import com.vikingbrain.nmt.operations.playback.StepVodOperation;
import com.vikingbrain.nmt.operations.playback.StopAodOperation;
import com.vikingbrain.nmt.operations.playback.StopPodOperation;
import com.vikingbrain.nmt.operations.playback.StopVodOperation;

/**
 * It allows to create the operations related to the playback module.
 * 
 * @author vikingBrain
 */
public interface ModulePlayback extends BaseModule {
	
	/**
	 * It creates a list all the supported VOD format operation.
	 * @return the operation created
	 */
	ListVodSupportedFormatOperation buildListVodSupportedFormatOperation();
	
	/**
	 * It creates a start video operation.
	 * @param filePath the file path
	 * @return the operation created
	 */
	StartVodOperation buildStartVodOperation(String filePath);
	
	/**
	 * It creates a get current video info operation.
	 * @return the operation created
	 */
	GetCurrentVodInfoOperation buildGetCurrentVodInfoOperation();

	/**
	 * It creates a list playback speed vod operation.
	 * @return the operation created
	 */
	ListPlaybackSpeedVodOperation buildListPlaybackSpeedVodOperation();

	/**
	 * It creates a get playback speed vod operation.
	 * @return the operation created
	 */
	GetPlaybackSpeedVodOperation buildGetPlaybackSpeedVodOperation();
	
	/**
	 * It creates a set playback speed vod operation.
	 * @return the operation created
	 */
	SetPlaybackSpeedVodOperation buildSetPlaybackSpeedVodOperation(String speed);

	/**
	 * It creates a step to next video frame operation.
	 * @return the operation created
	 */
	StepVodOperation buildStepVodOperation();
	
	/**
	 * It creates a toggle the repeat mode operation to repeat VOD playback.
	 * @return the operation created
	 */
	RepeatVodOperation buildRepeatVodOperation();

	/**
	 * It creates a list all the supported subtitle(s) for current VOD playback operation.
	 * @return the operation created
	 */
	ListSubtitleVodOperation buildListSubtitleVodOperation();
	
	/**
	 * It creates a sets subtitle for current VOD DVD playback ONLY for DVD media format.
	 * @param track Subtitle (value depends on track as being returned from list_subtitle_vod) 
	 * @return the operation created
	 */
	SetSubtitleVodDvdOperation buildSetSubtitleVodDvdOperation(String track);

	/**
	 * It creates sets subtitle for current VOD playback ONLY for non-DVD media format.
	 * @param track Subtitle (value depends on track as being returned from list_subtitle_vod)
	 * @param color Subtitle Color. Eg: "white/black" (value depends on colorOption as being returned from list_subtitle_vod)
	 * @param fontSize Subtitle FontSize. Eg:"30" (value must be within maxSize and minSize and must be divisible by stepSize as being returned from list_subtitle_vod)
	 * @param position Subtitle Position. Eg: "20" (value must be within maxPosition and minPosition and must be divisible by stepPosition as being returned from list_subtitle_vod)
	 * @param encoding Subtitle Encoding. Eg: "English" (value depends on encodingOption as being returned from list_subtitle_vod)
	 * @param timeOffset Subtitle TimeOffset. Eg: "300.5" (value must be within maxOffset and minOffset and must be divisible by stepOffset as being returned from list_subtitle_vod)
	 * @return the operation created
	 */
	SetSubtitleVodNonDvdOperation buildSetSubtitleVodNonDvdOperation(String track, String color, int fontSize, 
			int position, String encoding, String timeOffset);
		
	/**
	 * It creates a list all the audio streams in current file operation.
	 * @return the operation created
	 */	
	ListAudioVodOperation buildListAudioVodOperation();
	
	/**
	 * It creates a set the audio stream in current file.
	 * @param audioValue (value depends on audio as being returned from ListAudioVodOperation)
	 * @return the operation created
	 */	
	SetAudioVodOperation buildSetAudioVodOperation(String audioValue);
	
	/**
	 * It creates a set time for current VOD playback to seek operation.
	 * @param hours number of hours
	 * @param minutes number of minutes 
	 * @param seconds number of seconds
	 * @return the operation created
	 */
	SetTimeSeekVodOperation buildSetTimeSeekVodOperation(int hours, int minutes, int seconds);
		
	/**
	 * It creates a sets zoom mode for current VOD playback operation
	 * @param zoomValue Any valid positive number in range 10-400. Note: 100 is normal size.
	 * @return the operation created
	 */
	SetZoomVodOperation buildSetZoomVodOperation(int zoomValue);
	
	/**
	 * It creates a pause VOD operation.
	 * @return the operation created
	 */
	PauseVodOperation buildPauseVodOperation();		

	/**
	 * It creates a resume VOD operation.
	 * @return the operation created
	 */
	ResumeVodOperation buildResumeVodOperation();		

	/**
	 * It creates a stop VOD operation.
	 * @return the operation created
	 */
	StopVodOperation buildStopVodOperation();		

	/**
	 * It creates a insert video into NMT queue operation.
	 * @param filePath the file path
	 * @return the operation created
	 */
	InsertVodQueueOperation buildInsertVodQueueOperation(String filePath);

	/**
	 * It creates a delete video entry queue operation.
	 * @param index Any index returned from the ListVodQueueInfo operation
	 * @return the operation created
	 */
	DeleteVodEntryQueueOperation buildDeleteVodEntryQueueOperation(String index);
	
	/**
	 * It creates a list video queue info operation.
	 * @return the operation created
	 */
	ListVodQueueInfoOperation buildListVodQueueInfoOperation();
	
	/**
	 * It creates a list all the supported AOD format operation.
	 * @return the operation created
	 */
	ListAodSupportedFormatOperation buildListAodSupportedFormatOperation();

	/**
	 * It creates a start audio operation.
	 * @param filePath the file path
	 * @return the operation created
	 */
	StartAodOperation buildStartAodOperation(String filePath);

	/**
	 * It creates a get current audio info operation.
	 * @return the operation created
	 */
	GetCurrentAodInfoOperation buildGetCurrentAodInfoOperation();

	/**
	 * It creates a pause AOD operation.
	 * @return the operation created
	 */
	PauseAodOperation buildPauseAodOperation();		

	/**
	 * It creates a resume AOD operation.
	 * @return the operation created
	 */
	ResumeAodOperation buildResumeAodOperation();

	/**
	 * It creates a stop AOD operation.
	 * @return the operation created
	 */
	StopAodOperation buildStopAodOperation();		

	/**
	 * It creates a insert audio into NMT queue operation.
	 * @param filePath the file path
	 * @return the operation created
	 */
	InsertAodQueueOperation buildInsertAodQueueOperation(String filePath);

	/**
	 * It creates a delete audio entry queue operation.
	 * @param index Any index returned from the ListAodQueueInfo operation
	 * @return the operation created
	 */
	DeleteAodEntryQueueOperation buildDeleteAodEntryQueueOperation(String index);

	/**
	 * It creates a list audio queue info operation.
	 * @return the operation created
	 */
	ListAodQueueInfoOperation buildListAodQueueInfoOperation();
	
	/**
	 * It creates a list all the supported POD format operation.
	 * @return the operation created
	 */
	ListPodSupportedFormatOperation buildListPodSupportedFormatOperation();

	/**
	 * It creates a start photo operation.
	 * @param filePath the file path
	 * @return the operation created
	 */
	StartPodOperation buildStartPodOperation(String filePath);
	
	/**
	 * It creates a get current photo info operation.
	 * @return the operation created
	 */
	GetCurrentPodInfoOperation buildGetCurrentPodInfoOperation();
	
	/**
	 * It creates a pause POD operation.
	 * @return the operation created
	 */
	PausePodOperation buildPausePodOperation();
	
	/**
	 * It creates a resume POD operation.
	 * @return the operation created
	 */
	ResumePodOperation buildResumePodOperation();
	
	/**
	 * It creates a stop POD operation.
	 * @return the operation created
	 */
	StopPodOperation buildStopPodOperation();		
	
	/**
	 * It creates a insert photo into NMT queue operation.
	 * @param filePath the file path
	 * @return the operation created
	 */
	InsertPodQueueOperation buildInsertPodQueueOperation(String filePath);	

	/**
	 * It creates a delete photo entry queue operation.
	 * @param index Any index returned from the ListPodQueueInfo operation
	 * @return the operation created
	 */
	DeletePodEntryQueueOperation buildDeletePodEntryQueueOperation(String index);
	
	/**
	 * It creates a list photo queue info operation.
	 * @return the operation created
	 */
	ListPodQueueInfoOperation buildListPodQueueInfoOperation();

}
