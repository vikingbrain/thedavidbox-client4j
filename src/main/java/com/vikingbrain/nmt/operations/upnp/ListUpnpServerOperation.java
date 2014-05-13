package com.vikingbrain.nmt.operations.upnp;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.upnp.ResponseListUpnpServer;

/**
 * Operation that gets the audio that is currently playing on NMT.
 * Execution example: http://popcorn:8008/upnp?arg0=list_upnp_server
 * 
 * @author vikingBrain
 */
public class ListUpnpServerOperation extends AbstractUpnpOperation<ResponseListUpnpServer> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.UPNP.list_upnp_server;
	
	/** Response target class. */
	private static final Class<ResponseListUpnpServer> responseTargetClass = ResponseListUpnpServer.class;

	/**
	 * Constructor. 
	 * @param operationFactory the operation factory
	 */
	public ListUpnpServerOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}

	@Override
	public String toString() {
		return "ListUpnpServerOperation [getOperationType()="
				+ getOperationType() + "]";
	}

}
