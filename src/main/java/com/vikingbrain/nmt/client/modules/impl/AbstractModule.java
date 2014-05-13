package com.vikingbrain.nmt.client.modules.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;

/**
 * Abstract class for a Module.
 * 
 * @author vikingBrain
 */
public abstract class AbstractModule {

	/** Logger. */
	static Logger logger = LoggerFactory.getLogger(AbstractModule.class);
	
	/** The operation factory. */
	private final TheDavidboxOperationFactory operationFactory;
	
	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public AbstractModule(TheDavidboxOperationFactory operationFactory) {
		super();
		this.operationFactory = operationFactory;
	}

	/**
	 * Getter of property.
	 * @return the operation factory
	 */
	public final TheDavidboxOperationFactory getOperationFactory() {
		return operationFactory;
	}
	
}
