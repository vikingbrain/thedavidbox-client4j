package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that resumes VOD playback.
 * Execution example:
 * http://popcorn:8008/playback?arg0=resume_vod
 * 
 * @author vikingBrain
 */
public class ResumeVodOperation extends AbstractPlayblackOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.resume_vod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ResumeVodOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ResumeVodOperation [getOperationType()=" + getOperationType()
				+ "]";
	}

}
