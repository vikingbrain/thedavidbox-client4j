/*
 * Copyright 2011-2014 Rafael Iñigo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
