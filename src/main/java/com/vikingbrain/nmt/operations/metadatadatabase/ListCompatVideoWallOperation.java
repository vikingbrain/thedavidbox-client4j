package com.vikingbrain.nmt.operations.metadatadatabase;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.parameters.VideoFilter;
import com.vikingbrain.nmt.responses.metadatadatabase.ResponseListCompatVideoWall;

/**
 * Retrieve video info from different video category.
 * Execution example: http://popcorn:8008/metadata_database?arg0=list_compact_video_wall&arg1=/opt/sybhttpd/localhost.drives/SATA_DISK/nmj_database/media.db&arg2=0&arg3=4&arg4=8&arg5=movie
 * @author vikingBrain
 *
 */
public class ListCompatVideoWallOperation extends AbstractMetadatadatabaseOperation<ResponseListCompatVideoWall> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.METADATA_DATABASE.list_compact_video_wall;

	/** Response target class. */
	private static final Class<ResponseListCompatVideoWall> responseTargetClass = ResponseListCompatVideoWall.class;

	/** Required operation attributes. */
	private String databasePath;
	//Category start index.
	private int startIndex;
	//Category end index.
	private int endIndex;
	//Maximum numbers of thumbnail returned.
	private int maxThumbnailsReturned;
	private VideoFilter videoFilter;
	
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param databasePath the database path
	 * @param videoFilter the video filter
	 */
	public ListCompatVideoWallOperation(TheDavidboxOperationFactory operationFactory, String databasePath, int startIndex, int endIndex, int maxThumbnailsReturned, VideoFilter videoFilter) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.databasePath = databasePath;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.maxThumbnailsReturned = maxThumbnailsReturned;
		this.videoFilter = videoFilter;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", databasePath);
		httpArguments.put("arg2", String.valueOf(startIndex));
		httpArguments.put("arg3", String.valueOf(endIndex));
		httpArguments.put("arg4", String.valueOf(maxThumbnailsReturned));
		httpArguments.put("arg5", videoFilter.getParamValue());
		
		return httpArguments;
	}

	public final String getDatabasePath() {
		return databasePath;
	}

	public final void setDatabasePath(String databasePath) {
		this.databasePath = databasePath;
	}

	public final int getStartIndex() {
		return startIndex;
	}

	public final void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public final int getEndIndex() {
		return endIndex;
	}

	public final void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public final int getMaxThumbnailsReturned() {
		return maxThumbnailsReturned;
	}

	public final void setMaxThumbnailsReturned(int maxThumbnailsReturned) {
		this.maxThumbnailsReturned = maxThumbnailsReturned;
	}

	public final VideoFilter getVideoFilter() {
		return videoFilter;
	}

	public final void setVideoFilter(VideoFilter videoFilter) {
		this.videoFilter = videoFilter;
	}

	@Override
	public String toString() {
		return "ListCompatVideoWallOperation [databasePath=" + databasePath
				+ ", startIndex=" + startIndex + ", endIndex=" + endIndex
				+ ", maxThumbnailsReturned=" + maxThumbnailsReturned
				+ ", videoFilter=" + videoFilter + ", getOperationType()="
				+ getOperationType() + "]";
	}
	
}
