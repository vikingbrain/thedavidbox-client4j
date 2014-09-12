package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that resumes AOD playback.
 * Execution example:
 * http://popcorn:8008/playback?arg0=resume_aod
 * 
 * @author vikingBrain
 */
public class ResumeAodOperation extends AbstractPlayblackOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.resume_aod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ResumeAodOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ResumeAodOperation [getOperationType()=" + getOperationType()
				+ "]";
	}

}
