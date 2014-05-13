package com.vikingbrain.nmt.client.modules.impl;

import com.vikingbrain.nmt.client.modules.ModuleMetadata;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;

/**
 * It allows to create the operations related to the metadata module.
 * 
 * @author vikingBrain
 */
public class ModuleMetadataImpl extends AbstractModule implements ModuleMetadata {

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ModuleMetadataImpl(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory);
	}

	//TODO list_all_metadata

	//TODO get_metadata
	
	//TODO set_metadata
	
	//TODO get_reference_file
	
	//TODO delete_metadata
	
	//TODO delete_all_metadata
	
}
