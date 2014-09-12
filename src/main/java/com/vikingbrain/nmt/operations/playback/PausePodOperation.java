package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that pauses POD playback. 
 * Execution example:
 * http://popcorn:8008/playback?arg0=pause_pod
 * 
 * @author vikingBrain
 */
public class PausePodOperation extends AbstractPlayblackOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.pause_pod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public PausePodOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "PausePodOperation [getOperationType()=" + getOperationType()
				+ "]";
	}

}
