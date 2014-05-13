package com.vikingbrain.nmt.operations;

import java.util.LinkedHashMap;


/**
 * 
 * @author vikingBrain
 */
public interface DavidBoxOperation {

	/**
	 * Getter of property.
	 * @return the operation type.
	 */
	OperationType getOperationType();

	/**
	 * It build the http arguments for the operation
	 * @return the http arguments built
	 */
	LinkedHashMap<String, String> buildHttpArguments();

}
