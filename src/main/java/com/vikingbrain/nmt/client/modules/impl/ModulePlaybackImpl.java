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

import com.vikingbrain.nmt.client.modules.ModulePlayback;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
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
public class ModulePlaybackImpl extends AbstractModule implements ModulePlayback { 

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ModulePlaybackImpl(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory);
	}

	/** {@inheritDoc} */
	public ListVodSupportedFormatOperation buildListVodSupportedFormatOperation(){
		return new ListVodSupportedFormatOperation(getOperationFactory());
	}	
		
	/** {@inheritDoc} */
	public StartVodOperation buildStartVodOperation(String filePath){
		return new StartVodOperation(getOperationFactory(), filePath);
	}

	/** {@inheritDoc} */
	public GetCurrentVodInfoOperation buildGetCurrentVodInfoOperation(){
		return new GetCurrentVodInfoOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public ListPlaybackSpeedVodOperation buildListPlaybackSpeedVodOperation(){
		return new ListPlaybackSpeedVodOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public GetPlaybackSpeedVodOperation buildGetPlaybackSpeedVodOperation(){
		return new GetPlaybackSpeedVodOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public SetPlaybackSpeedVodOperation buildSetPlaybackSpeedVodOperation(String speed){
		return new SetPlaybackSpeedVodOperation(getOperationFactory(), speed);
	}
	
	/** {@inheritDoc} */
	public StepVodOperation buildStepVodOperation(){
		return new StepVodOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public RepeatVodOperation buildRepeatVodOperation(){
		return new RepeatVodOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public ListSubtitleVodOperation buildListSubtitleVodDvdOperation(){
		return new ListSubtitleVodOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public ListSubtitleVodOperation buildListSubtitleVodOperation(){
		return new ListSubtitleVodOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public SetSubtitleVodDvdOperation buildSetSubtitleVodDvdOperation(String track){
		return new SetSubtitleVodDvdOperation(getOperationFactory(), track);
	}

	/** {@inheritDoc} */
	public SetSubtitleVodNonDvdOperation buildSetSubtitleVodNonDvdOperation(String track, String color, int fontSize, int position, String encoding, String timeOffset){
		return new SetSubtitleVodNonDvdOperation(getOperationFactory(), track, color, fontSize, position, encoding, timeOffset);
	}	
	
	/** {@inheritDoc} */
	public ListAudioVodOperation buildListAudioVodOperation(){
		return new ListAudioVodOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public SetAudioVodOperation buildSetAudioVodOperation(String audioValue){
		return new SetAudioVodOperation(getOperationFactory(), audioValue);
	}

	/** {@inheritDoc} */
	public SetTimeSeekVodOperation buildSetTimeSeekVodOperation(int hours, int minutes, int seconds){
		return new SetTimeSeekVodOperation(getOperationFactory(), hours, minutes, seconds);
	}
	
	/** {@inheritDoc} */
	public SetZoomVodOperation buildSetZoomVodOperation(int zoomValue){
		return new SetZoomVodOperation(getOperationFactory(), zoomValue);
	}
	
	/** {@inheritDoc} */
	public PauseVodOperation buildPauseVodOperation(){
		return new PauseVodOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public ResumeVodOperation buildResumeVodOperation(){
		return new ResumeVodOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public StopVodOperation buildStopVodOperation(){
		return new StopVodOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public InsertVodQueueOperation buildInsertVodQueueOperation(String filePath){
		return new InsertVodQueueOperation(getOperationFactory(), filePath);
	}

	//TODO next_vod_in_queue
	
    /** {@inheritDoc} */
	public DeleteVodEntryQueueOperation buildDeleteVodEntryQueueOperation(String index){
		return new DeleteVodEntryQueueOperation(getOperationFactory(), index);
	}
	
    /** {@inheritDoc} */
	public ListVodQueueInfoOperation buildListVodQueueInfoOperation(){
		return new ListVodQueueInfoOperation(getOperationFactory());
	}	
	
	/** {@inheritDoc} */
	public ListAodSupportedFormatOperation buildListAodSupportedFormatOperation(){
		return new ListAodSupportedFormatOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public StartAodOperation buildStartAodOperation(String filePath){
		return new StartAodOperation(getOperationFactory(), filePath);
	}

	/** {@inheritDoc} */
	public GetCurrentAodInfoOperation buildGetCurrentAodInfoOperation(){
		return new GetCurrentAodInfoOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public PauseAodOperation buildPauseAodOperation(){
		return new PauseAodOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public ResumeAodOperation buildResumeAodOperation(){
		return new ResumeAodOperation(getOperationFactory());
	}
	
	//TODO repeat_aod
	
	/** {@inheritDoc} */
	public StopAodOperation buildStopAodOperation(){
		return new StopAodOperation(getOperationFactory());
	}	
	
	/** {@inheritDoc} */
	public InsertAodQueueOperation buildInsertAodQueueOperation(String filePath){
		return new InsertAodQueueOperation(getOperationFactory(), filePath);
	}

	//TODO next_aod_in_queue		
	
    /** {@inheritDoc} */
	public DeleteAodEntryQueueOperation buildDeleteAodEntryQueueOperation(String index){
		return new DeleteAodEntryQueueOperation(getOperationFactory(), index);
	}

    /** {@inheritDoc} */
	public ListAodQueueInfoOperation buildListAodQueueInfoOperation(){
		return new ListAodQueueInfoOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public ListPodSupportedFormatOperation buildListPodSupportedFormatOperation(){
		return new ListPodSupportedFormatOperation(getOperationFactory());
	}
	
	//TODO marquee_aod
	
	/** {@inheritDoc} */
	public StartPodOperation buildStartPodOperation(String filePath){
		return new StartPodOperation(getOperationFactory(), filePath);
	}

	/** {@inheritDoc} */
	public GetCurrentPodInfoOperation buildGetCurrentPodInfoOperation(){
		return new GetCurrentPodInfoOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public PausePodOperation buildPausePodOperation(){
		return new PausePodOperation(getOperationFactory());
	}

	/** {@inheritDoc} */
	public ResumePodOperation buildResumePodOperation(){
		return new ResumePodOperation(getOperationFactory());
	}	
	
	//TODO set_zoom_pod
	
	/** {@inheritDoc} */
	public StopPodOperation buildStopPodOperation(){
		return new StopPodOperation(getOperationFactory());
	}
	
	/** {@inheritDoc} */
	public InsertPodQueueOperation buildInsertPodQueueOperation(String filePath){
		return new InsertPodQueueOperation(getOperationFactory(), filePath);
	}

	//TODO next_pod_in_queue
	
    /** {@inheritDoc} */
	public DeletePodEntryQueueOperation buildDeletePodEntryQueueOperation(String index){
		return new DeletePodEntryQueueOperation(getOperationFactory(), index);
	}
	
    /** {@inheritDoc} */
	public ListPodQueueInfoOperation buildListPodQueueInfoOperation(){
		return new ListPodQueueInfoOperation(getOperationFactory());
	}	
	
	//TODO start_database_aod
	
	//TODO insert_database_aod_queue
	
	//TODO delete_playlist_aod_queue
	
	//TODO list_playlist_aod_queue_info
	
	//TODO get_playlist_current_aod_info
	
	//TODO prev_aod_in_queue
	
	//TODO start_database_vod
	
	//TODO next_database_vod_in_queue
	
	//TODO prev_database_vod_in_queue
	
	//TODO stop_database_vod
	
	//TODO start_database_pod	
	
}
