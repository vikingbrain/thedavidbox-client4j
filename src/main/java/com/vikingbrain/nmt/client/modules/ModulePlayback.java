package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.playback.DeleteAodEntryQueueOperation;
import com.vikingbrain.nmt.operations.playback.GetCurrentAodInfoOperation;
import com.vikingbrain.nmt.operations.playback.GetCurrentPodInfoOperation;
import com.vikingbrain.nmt.operations.playback.GetCurrentVodInfoOperation;
import com.vikingbrain.nmt.operations.playback.GetPlaybackSpeedVodOperation;
import com.vikingbrain.nmt.operations.playback.InsertAodQueueOperation;
import com.vikingbrain.nmt.operations.playback.InsertPodQueueOperation;
import com.vikingbrain.nmt.operations.playback.InsertVodQueueOperation;
import com.vikingbrain.nmt.operations.playback.ListAodQueueInfoOperation;
import com.vikingbrain.nmt.operations.playback.ListAodSupportedFormatOperation;
import com.vikingbrain.nmt.operations.playback.ListPlaybackSpeedVodOperation;
import com.vikingbrain.nmt.operations.playback.ListPodSupportedFormatOperation;
import com.vikingbrain.nmt.operations.playback.ListVodSupportedFormatOperation;
import com.vikingbrain.nmt.operations.playback.SetPlaybackSpeedVodOperation;
import com.vikingbrain.nmt.operations.playback.StartAodOperation;
import com.vikingbrain.nmt.operations.playback.StartPodOperation;
import com.vikingbrain.nmt.operations.playback.StartVodOperation;
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
	 * It creates a list audio queue infor operration.
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

}
