package com.vikingbrain.nmt.client.modules.impl;

import java.util.ArrayList;
import java.util.List;

import com.vikingbrain.nmt.client.modules.ModuleMetadataDatabase;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.metadatadatabase.CheckDatabaseOperation;
import com.vikingbrain.nmt.operations.metadatadatabase.GetVideoInfoEpisodeOperation;
import com.vikingbrain.nmt.operations.metadatadatabase.GetVideoInfoFullOperation;
import com.vikingbrain.nmt.operations.metadatadatabase.GetVideoInfoSummaryOperation;
import com.vikingbrain.nmt.operations.metadatadatabase.ListCompatVideoWallOperation;
import com.vikingbrain.nmt.operations.metadatadatabase.ListTotalCategoryVideoOperation;
import com.vikingbrain.nmt.operations.parameters.VideoFilter;
import com.vikingbrain.nmt.responses.metadatadatabase.ResponseCheckDatabase;
import com.vikingbrain.nmt.responses.setting.ObjectNetworkShare;
import com.vikingbrain.nmt.responses.setting.ResponseListNetworkSharedFolder;
import com.vikingbrain.nmt.responses.system.ObjectDevice;
import com.vikingbrain.nmt.responses.system.ResponseListDevices;
import com.vikingbrain.nmt.util.MetadataDatabase;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * It allows to create the operations related to the metadata database module.
 * 
 * @author vikingBrain
 */
public class ModuleMetadataDatabaseImpl extends AbstractModule implements ModuleMetadataDatabase {

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ModuleMetadataDatabaseImpl(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory);
	}

	/** {@inheritDoc} */
	public List<MetadataDatabase> getMetadadaDatabasesPhysicalDrives(ResponseListDevices responseDevices) {
		List<MetadataDatabase> databases = new ArrayList<MetadataDatabase>();
		
		if (null != responseDevices){
			for(ObjectDevice device : responseDevices.getDevices()){			
				//we are not using when type is "cd rom"
				if ("harddisk".equals(device.getType())
						|| "usb".equals(device.getType())){
					
					try {						
						MetadataDatabase database = getDatabase(device.getUrl());
						databases.add(database);
					} catch (TheDavidBoxClientException e) {
						logger.warn("Not found metadata database for device url: " + device.getUrl());
					} 
				}
			}
		}	
		return databases;
	}

	/** {@inheritDoc} */
	public List<MetadataDatabase> getMetadadaDatabasesSharedFolders(ResponseListNetworkSharedFolder responseNetworkSharedFolders){
		//Init the list
		List<MetadataDatabase> databases = new ArrayList<MetadataDatabase>();

		if (null != responseNetworkSharedFolders){
			for(ObjectNetworkShare networkShare : responseNetworkSharedFolders.getNetworkShares()){								
				try {						
					MetadataDatabase database = getDatabase(networkShare.getUrl());
					databases.add(database);
					logger.debug(database.toString());
				} catch (TheDavidBoxClientException e) {
					logger.warn("Not found metadata database for network share url: " + networkShare.getUrl());
				} 
			}
		}	
		return databases;	
	}

	/**
	 * Get a possible database from a device url.
	 * @param deviceUrl the device url
	 * @return the metadata database
	 * @throws TheDavidBoxClientException exception in the client
	 */
	private MetadataDatabase getDatabase(String deviceUrl) throws TheDavidBoxClientException{
		ResponseCheckDatabase responseCheckDatabase = buildCheckDatabaseOperation(deviceUrl).execute();
			
		String databasePath = responseCheckDatabase.getDatabasePath();
		MetadataDatabase database = new MetadataDatabase(deviceUrl, databasePath);
		return database;
	}
		
	//TODO list_total_album_photo
	
	//TODO list_compact_photo_wall
	
	//TODO list_total_photo_item
	
	//TODO list_photo_item
	
	//TODO get_photo_info
	
	//TODO jump_photo_index
	
	//TODO delete_photo	
	
	
	/** {@inheritDoc} */
	public ListTotalCategoryVideoOperation buildListTotalCategoryVideoOperation(String databasePath, VideoFilter videoFilter){		
		return new ListTotalCategoryVideoOperation(getOperationFactory(), databasePath, videoFilter);
	}

	/** {@inheritDoc} */
	public ListCompatVideoWallOperation buildListCompatVideoWallOperation(String databasePath, int startIndex, int endIndex, int maxThumbnailsReturned, VideoFilter videoFilter) {
		return new ListCompatVideoWallOperation(getOperationFactory(), databasePath, startIndex, endIndex, maxThumbnailsReturned, videoFilter);
	}
		
	//TODO list_total_video_item
	
	//TODO list_video_item
	
	
	/** {@inheritDoc} */	
	public GetVideoInfoFullOperation buildGetVideoInfoFullOperation(String databasePath, String videoId){
		return new GetVideoInfoFullOperation(getOperationFactory(), databasePath, videoId);
	}
	
	/** {@inheritDoc} */	
	public GetVideoInfoSummaryOperation buildGetVideoInfoSummaryOperation(String databasePath, String videoId){
		return new GetVideoInfoSummaryOperation(getOperationFactory(), databasePath, videoId);
	}

	/** {@inheritDoc} */	
	public GetVideoInfoEpisodeOperation buildGetVideoInfoEpisodeOperation(String databasePath, String videoId){
		return new GetVideoInfoEpisodeOperation(getOperationFactory(), databasePath, videoId);
	}	
		
	//TODO jump_video_index
	
	//TODO delete_video
	
	//TODO update_video_rating
	
	//TODO search_video
	
	//TODO replace_video_info
	
	//TODO set_video_watched

	//TODO search_person
	
	//TODO replace_video_image
	
	//TODO download_video_image
	
	//TODO list_total_category_music
	
	//TODO list_compact_music_wall
	
	//TODO list_total_music_item
	
	//TODO list_music_item
	
	//TODO list_all_music_playlist
	
	//TODO get_particular_music_album_info
	
	//TODO get_particular_music_song_info
	
	//TODO get_particular_music_playlist_info
	
	//TODO edit_music_playlist
	
	//TODO create_music_playlist
	
	//TODO add_item_to_music_playlist
	
	//TODO delete_music
	
	//TODO jump_music_index
	
	//TODO update_music_rating
	
	//TODO search_music
	
	//TODO search_artist
	
	//TODO list_all_total_item
	
	//TODO list_all_item
	
	//TODO get_all_index
	
	//TODO get_recent_activities
	
	//TODO scanner_start
	
	//TODO scanner_pause
	
	//TODO scanner_stop
	
	//TODO add_scandir
	
	//TODO list_scandir
	
	//TODO remove_scandir
	
	//TODO update_scandir	
	
	/** {@inheritDoc} */
	public CheckDatabaseOperation buildCheckDatabaseOperation(String deviceUrl){
		return new CheckDatabaseOperation(getOperationFactory(), deviceUrl);
	}

	//TODO update_database
	
	//TODO check_scanner_status
	
	//TODO check_download_target_status
	
	//TODO download_subtitle
	
	//TODO rename_subtitle
	
}
