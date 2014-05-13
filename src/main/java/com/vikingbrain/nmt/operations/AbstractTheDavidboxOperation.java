package com.vikingbrain.nmt.operations;

import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.responses.DavidBoxResponse;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * Abstract class for a Davidbox operation.
 * 
 * @author vikingBrain
 *
 * @param <T> the type of the response object for the operation
 */
public abstract class AbstractTheDavidboxOperation<T extends DavidBoxResponse> implements DavidBoxOperation {
	
	/** Logger. */
	static Logger logger = LoggerFactory.getLogger(AbstractTheDavidboxOperation.class);

	/** The operation factory. */
	private final TheDavidboxOperationFactory operationFactory;
	
	/** The operation type. */
	private final OperationType operationType;
	
	/** The response target class. */
	private final Class<T> responseTargetClass;
	
	/**
	 * Constructor.
	 * @param factory the operation factory
	 * @param operationType the operation type
	 * @param responseTargetClass the response target class
	 */
    protected AbstractTheDavidboxOperation(TheDavidboxOperationFactory factory, OperationType operationType, Class<T> responseTargetClass) {    	
        this.operationFactory = factory;
        this.operationType = operationType;
        this.responseTargetClass = responseTargetClass;
    }
        
    /**
     * Getter of property.
     * @return the operation factory.
     */
    public final TheDavidboxOperationFactory getOperationFactory() {
        return operationFactory;
    }

    /** {@inheritDoc} */
	public final OperationType getOperationType() {
		return operationType;
	}

	/**
	 * It executes the operation.
	 * @return the object with the result of the operation
	 * @throws TheDavidBoxClientException exception in the client
	 */
    public T execute() throws TheDavidBoxClientException {    	    	
    	return (T)getOperationFactory().execute(this, responseTargetClass);
    }

    /** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Init http arguments
		LinkedHashMap<String, String> httpArguments = new LinkedHashMap<String,String>();
		return httpArguments;
	}
	
}
