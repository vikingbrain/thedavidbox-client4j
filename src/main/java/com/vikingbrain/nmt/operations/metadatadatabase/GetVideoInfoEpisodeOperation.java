package com.vikingbrain.nmt.operations.metadatadatabase;

import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.parameters.InfoMode;
import com.vikingbrain.nmt.responses.metadatadatabase.ResponseGetVideoInfoEpisode;

/**
 * Get particular video info in episode mode (Episode to get synopsis only).
 * Execution example: http://popcorn:8008/metadata_database?arg0=get_video_info&arg1=/opt/sybhttpd/localhost.drives/SATA_DISK/nmj_database/media.db&arg2=s91&arg3=episode
 * @author vikingBrain
 *
 */
public class GetVideoInfoEpisodeOperation extends AbstractGetVideoInfoOperation<ResponseGetVideoInfoEpisode> {

	/** Response target class. */
	private static final Class<ResponseGetVideoInfoEpisode> responseTargetClass = ResponseGetVideoInfoEpisode.class;

	//Type of info requested.
	private static final InfoMode INFO_MODE_FULL = InfoMode.EPISODE;
	
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param databasePath the database path
	 */
	public GetVideoInfoEpisodeOperation(TheDavidboxOperationFactory operationFactory, String databasePath, String videoId) {
		super(operationFactory, responseTargetClass, databasePath, videoId, INFO_MODE_FULL);
	}	
	
}
