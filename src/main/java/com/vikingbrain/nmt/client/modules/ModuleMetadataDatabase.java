package com.vikingbrain.nmt.client.modules;

import java.util.List;

import com.vikingbrain.nmt.operations.metadatadatabase.CheckDatabaseOperation;
import com.vikingbrain.nmt.operations.metadatadatabase.GetVideoInfoEpisodeOperation;
import com.vikingbrain.nmt.operations.metadatadatabase.GetVideoInfoFullOperation;
import com.vikingbrain.nmt.operations.metadatadatabase.GetVideoInfoSummaryOperation;
import com.vikingbrain.nmt.operations.metadatadatabase.ListCompatVideoWallOperation;
import com.vikingbrain.nmt.operations.metadatadatabase.ListTotalCategoryVideoOperation;
import com.vikingbrain.nmt.operations.parameters.VideoFilter;
import com.vikingbrain.nmt.responses.setting.ResponseListNetworkSharedFolder;
import com.vikingbrain.nmt.responses.system.ResponseListDevices;
import com.vikingbrain.nmt.util.MetadataDatabase;

/**
 * It allows to create the operations related to the metadata database module.
 * 
 * @author vikingBrain
 */
public interface ModuleMetadataDatabase extends BaseModule {

	/**
	 * Get all metadata databases from physical drives.
	 * @param responseDevices a response with the devices
	 * @return all the metadata databases
	 */
	List<MetadataDatabase> getMetadadaDatabasesPhysicalDrives(ResponseListDevices responseDevices);

	/**
	 * Get all metadata databases from network shared folders.
	 * @param responseNetworkSharedFolders a response with a list of network shared folders
	 * @return all the metadata databases
	 */
	List<MetadataDatabase> getMetadadaDatabasesSharedFolders(ResponseListNetworkSharedFolder responseNetworkSharedFolders);
		
	/**
	 * Creates operation that lists all video categories.
	 * @param databasePath
	 * @param videoFilter
	 * @return the operation created
	 */
	ListTotalCategoryVideoOperation buildListTotalCategoryVideoOperation(String databasePath, VideoFilter videoFilter);

	/**
	 * Creates operation that retrieves video info from different video category.
	 * @param databasePath  the metadata database path
	 * @param startIndex start index
	 * @param endIndex end index
	 * @param maxThumbnailsReturned max number of thumbnails returned
	 * @param videoFilter the video filter
	 * @return the operation created
	 */
	ListCompatVideoWallOperation buildListCompatVideoWallOperation(String databasePath, int startIndex, int endIndex, int maxThumbnailsReturned, VideoFilter videoFilter);	
	
	/**
	 * Creates operation that gets full info for particular video.
	 * @param databasePath the metadata database path
	 * @param videoId the video id
	 * @return the operation created
	 */
	GetVideoInfoFullOperation buildGetVideoInfoFullOperation(String databasePath, String videoId);
	
	/**
	 * Creates operation that gets info summary for particular video.
	 * @param databasePath the metadata database path
	 * @param videoId the video id
	 * @return the operation created
	 */
	GetVideoInfoSummaryOperation buildGetVideoInfoSummaryOperation(String databasePath, String videoId);
	
	/**
	 * Creates operation that gets info episode for particular video.
	 * @param databasePath the metadata database path
	 * @param videoId the video id
	 * @return the operation created
	 */
	GetVideoInfoEpisodeOperation buildGetVideoInfoEpisodeOperation(String databasePath, String videoId);
	
	/**
	 * Operation that checks metadata database status checking.
	 * @param deviceUrl url from the device or network shared folder
	 * @return the operation created
	 */
	CheckDatabaseOperation buildCheckDatabaseOperation(String deviceUrl);
}
