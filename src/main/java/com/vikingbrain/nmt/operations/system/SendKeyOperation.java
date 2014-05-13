package com.vikingbrain.nmt.operations.system;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation send remote control key to command server.
 * It execute the keys remote infrared command on NMT.
 * Execution example: http://popcorn:8008/system?arg0=send_key&arg1=play
 * 
 * @author vikingBrain
 *
 */
public class SendKeyOperation extends AbstractSystemOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SYSTEM.send_key;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required attributes. */
	private String keyName;
	
	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param keyName the key name
	 */
	public SendKeyOperation(TheDavidboxOperationFactory operationFactory, String keyName) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.keyName = keyName;		
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", keyName);
		
		return httpArguments;		
	}

	public final String getKeyName() {
		return keyName;
	}

	public final void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	@Override
	public String toString() {
		return "SendKeyOperation [keyName=" + keyName + ", getOperationType()="
				+ getOperationType() + "]";
	}
	
}
