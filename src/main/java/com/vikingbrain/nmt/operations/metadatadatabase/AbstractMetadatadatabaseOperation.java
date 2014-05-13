package com.vikingbrain.nmt.operations.metadatadatabase;

import com.vikingbrain.nmt.operations.AbstractTheDavidboxOperation;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.DavidBoxResponse;

/**
 * Abstract class that represent a operation for the metadata dabase module.
 * 
 * @author vikingBrain
 *
 * @param <T> the type of the response object for the operation
 */
public abstract class AbstractMetadatadatabaseOperation<T extends DavidBoxResponse> extends AbstractTheDavidboxOperation<T> {

	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param factory the operation factory
	 * @param operationType the operation type
	 * @param responseTargetClass the response target class
	 */
	protected AbstractMetadatadatabaseOperation(TheDavidboxOperationFactory factory, OperationType operationType, Class<T> responseTargetClass) {		
		super(factory, operationType, responseTargetClass);
	}
	
}
