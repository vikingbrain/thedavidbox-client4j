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
package com.vikingbrain.nmt.operations.networkbrowse;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.networkbrowse.ResponseListNetworkResource;

/**
 * Operation that lists all the network resource(s).
 * Execution examples: 
 * http://popcorn:8008/network_browse?arg0=list_network_resource&arg1=&arg2=&arg3=
 * http://popcorn:8008/network_browse?arg0=list_network_resource&arg1=WORKGROUP&arg2=&arg3=
 * http://popcorn:8008/network_browse?arg0=list_network_resource&arg1=smb://..&arg2=&arg3=
 * 
 * @author vikingBrain
 */
public class ListNetworkResourceOperation extends AbstractNetworkBrowseOperation<ResponseListNetworkResource> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.NETWORK_BROWSE.list_network_resource;

	/** Response target class. */
	private static final Class<ResponseListNetworkResource> responseTargetClass = ResponseListNetworkResource.class;

	/** Required operation attributes. */
	//Type of resource(server or share). If pass empty parameter, will list all Workgroup.
	private String resourceType = "";
	//Username to access this resource.
	private String username = "";
	//Password to access this resource.
	private String password = "";

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param databasePath the source path
	 * @param key the key
	 * @param name the name
	 */
	public ListNetworkResourceOperation(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory, operationType, responseTargetClass);
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", resourceType);
		httpArguments.put("arg2", username);		
		httpArguments.put("arg3", password);	

		return httpArguments;
	}

	/**
	 * Getter of property.
	 * @return the resourceType
	 */
	public String getResourceType() {
		return resourceType;
	}

	/**
	 * Setter of property.
	 * @param resourceType the resourceType to set
	 */
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	/**
	 * Getter of property.
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Setter of property.
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Getter of property.
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter of property.
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ListNetworkResourceOperation [resourceType=" + resourceType
				+ ", username=" + username + ", password=" + password
				+ ", getOperationType()=" + getOperationType() + "]";
	}	

}
