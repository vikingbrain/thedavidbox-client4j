package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that starts photo on NMT.
 * Execution example http://popcorn:8008/playback?arg0=start_pod&arg1=127&arg2=file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/photo/127.png&arg3=5&arg4=&arg5=show
 * 
 * @author vikingBrain
 */
public class StartPodOperation extends AbstractStartInsertPodOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.start_pod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param filePath the file path
	 */
	public StartPodOperation(TheDavidboxOperationFactory operationFactory, String filePath) {
		super(operationFactory, operationType, responseTargetClass, filePath);		
	}

	@Override
	public String toString() {
		return "StartPodOperation [getSlideInterval()=" + getSlideInterval()
				+ ", getRotationDegree()=" + getRotationDegree()
				+ ", getFilePath()=" + getFilePath() + ", getDisplayMode()="
				+ getDisplayMode() + ", getOperationType()="
				+ getOperationType() + "]";
	}
	
}
