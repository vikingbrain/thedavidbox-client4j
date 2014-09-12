package com.vikingbrain.nmt.operations.playback;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Delete an entry in the video queue.
 * Execution example Example: http://popcorn:8008/playback?arg0=delete_vod_entry_queue&arg1=5
 *
 * @author vikingBrain
  */
public class DeleteVodEntryQueueOperation extends AbstractDeleteEntryQueueOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.delete_vod_entry_queue;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param index Any index returned from the ListVodQueueInfo operation
	 */
	public DeleteVodEntryQueueOperation(TheDavidboxOperationFactory operationFactory, String index) {
		super(operationFactory, operationType, responseTargetClass, index);		
	}

	@Override
	public String toString() {
		return "DeleteVodEntryQueueOperation [getIndex()=" + getIndex()
				+ ", getOperationType()=" + getOperationType() + "]";
	}
	
}
