package com.vikingbrain.nmt.operations.metadatadatabase;

import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.parameters.InfoMode;
import com.vikingbrain.nmt.responses.metadatadatabase.ResponseGetVideoInfoSummary;

/**
 * Get particular video info in summary mode.
 * Execution example: http://popcorn:8008/metadata_database?arg0=get_video_info&arg1=/opt/sybhttpd/localhost.drives/SATA_DISK/nmj_database/media.db&arg2=s91&arg3=summary
 * @author vikingBrain
 *
 */
public class GetVideoInfoSummaryOperation extends AbstractGetVideoInfoOperation<ResponseGetVideoInfoSummary> {

	/** Response target class. */
	private static final Class<ResponseGetVideoInfoSummary> responseTargetClass = ResponseGetVideoInfoSummary.class;

	//Type of info requested.
	private static final InfoMode INFO_MODE_FULL = InfoMode.SUMMARY;
	
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param databasePath the database path
	 */
	public GetVideoInfoSummaryOperation(TheDavidboxOperationFactory operationFactory, String databasePath, String videoId) {
		super(operationFactory, responseTargetClass, databasePath, videoId, INFO_MODE_FULL);
	}	
	
}
