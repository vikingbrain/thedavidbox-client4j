package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseListSupportedFormat;

/**
 * List all the supported VOD format.
 * Execution example: http://popcorn:8008/playback?arg0=list_vod_supported_format
 * @author vikingBrain
 */
public class ListPodSupportedFormatOperation extends AbstractPlayblackOperation<ResponseListSupportedFormat> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.list_pod_supported_format;

	/** Response target class. */
	private static final Class<ResponseListSupportedFormat> responseTargetClass = ResponseListSupportedFormat.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ListPodSupportedFormatOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListPodSupportedFormatOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
