package com.vikingbrain.nmt.operations.playback;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseInsertAodQueue;

/**
 * Operation that inserts audio file into the NMT audio queue.
 * Execution example http://popcorn:8008/playback?arg0=insert_aod_queue&arg1=sample&arg2=file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/music/sample.mp3&arg3=show
 * 
 * @author vikingBrain
 */
public class InsertAodQueueOperation extends AbstractStartInsertOperation<ResponseInsertAodQueue> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.insert_aod_queue;

	/** Response target class. */
	private static final Class<ResponseInsertAodQueue> responseTargetClass = ResponseInsertAodQueue.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param filePath the file path
	 */
	public InsertAodQueueOperation(TheDavidboxOperationFactory operationFactory, String filePath) {
		super(operationFactory, operationType, responseTargetClass, filePath);
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
				
		//Display mode (show: show audio playback, marquee: will only show window marquee, 
		//hide: will not show anything)
		httpArguments.put("arg3", getDisplayMode().getParamValue());	

		return httpArguments;
	}	

	@Override
	public String toString() {
		return "InsertAodQueueOperation [getFilePath()=" + getFilePath()
				+ ", getDisplayMode()=" + getDisplayMode()
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
