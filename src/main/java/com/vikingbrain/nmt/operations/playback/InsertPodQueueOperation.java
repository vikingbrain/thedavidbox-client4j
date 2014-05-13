package com.vikingbrain.nmt.operations.playback;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.playback.ResponseInsertPodQueue;

/**
 * Operation that inserts photo file into the NMT photo queue.
 * Execution example http://popcorn:8008/playback?arg0=insert_pod_queue&arg1=samplee&arg2=file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/photo/sample.png&arg3=5&arg4=rot90&arg5=bgrun
 * 
 * @author vikingBrain
 */
public class InsertPodQueueOperation extends AbstractStartInsertPodOperation<ResponseInsertPodQueue> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.insert_pod_queue;

	/** Response target class. */
	private static final Class<ResponseInsertPodQueue> responseTargetClass = ResponseInsertPodQueue.class;

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param filePath the file path
	 */
	public InsertPodQueueOperation(TheDavidboxOperationFactory operationFactory, String filePath) {
		super(operationFactory, operationType, responseTargetClass, filePath);
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		//arg6 Optional. Specify transition effect. Possible value are 
		//"off", "zoom", "slide", "fade", "spiral", "random" 
		
		return httpArguments;
	}

	@Override
	public String toString() {
		return "InsertPodQueueOperation [getSlideInterval()="
				+ getSlideInterval() + ", getRotationDegree()="
				+ getRotationDegree() + ", getFilePath()=" + getFilePath()
				+ ", getDisplayMode()=" + getDisplayMode()
				+ ", getOperationType()=" + getOperationType() + "]";
	}
	
}
