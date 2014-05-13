package com.vikingbrain.nmt.operations.playback;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Delete an entry in the audio queue.
 * Execution example Example: http://popcorn:8008/playback?arg0=delete_aod_entry_queue&arg1=5
 *
 * @author vikingBrain
  */
public class DeleteAodEntryQueueOperation extends AbstractPlayblackOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.delete_aod_entry_queue;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required operation attributes. */
	private String index;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param index Any index returned from the ListAodQueueInfo operation
	 */
	public DeleteAodEntryQueueOperation(TheDavidboxOperationFactory operationFactory, String index) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.index = index;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", index);
		
		return httpArguments;
	}

	public final String getIndex() {
		return index;
	}

	public final void setIndex(String index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "DeleteAodEntryQueueOperation [index=" + index
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
