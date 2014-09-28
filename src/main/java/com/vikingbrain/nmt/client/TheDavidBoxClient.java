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
package com.vikingbrain.nmt.client;

import java.util.List;

import com.vikingbrain.nmt.client.modules.ModuleDeployment;
import com.vikingbrain.nmt.client.modules.ModuleDownloadManager;
import com.vikingbrain.nmt.client.modules.ModuleFile;
import com.vikingbrain.nmt.client.modules.ModuleMetadata;
import com.vikingbrain.nmt.client.modules.ModuleMetadataDatabase;
import com.vikingbrain.nmt.client.modules.ModuleNetworkBrowse;
import com.vikingbrain.nmt.client.modules.ModulePlayback;
import com.vikingbrain.nmt.client.modules.ModuleSetting;
import com.vikingbrain.nmt.client.modules.ModuleSystem;
import com.vikingbrain.nmt.client.modules.ModuleUpnp;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.util.ClientOptions;
import com.vikingbrain.nmt.util.MetadataDatabase;

/**
 * Interface for The Davidbx Client.
 * 
 * @author vikingBrain
 */
public interface TheDavidBoxClient {
	
	/**
	 * Get the operation factory.
	 * @return the operation factory
	 */
	TheDavidboxOperationFactory getOperationFactory();

	/**
	 * Get the IP address or name of the remote host.
	 * @return the IP address or host name
	 */
	String getRemoteHost();
	
	/**
	 * Set the IP address or name of the remote host.
	 * @param remoteHost the IP address or host name
	 */
	void setRemoteHost(String remoteHost);
	
	/**
	 * Get the client options.
	 * @return the client options
	 */
	ClientOptions getClientOptions();

	/**
	 * Module with the deployment operations.
	 * @return the module to create the operations
	 */
	ModuleDeployment getModuleDeployment();
	
	/**
	 * Module with the operations for the download manager. 
	 * @return the module to create the operations
	 */
	ModuleDownloadManager getModuleDownloadManager();
	
	/**
	 * Module with operations for the files.
	 * @return the module to create the operations
	 */
	ModuleFile getModuleFile();
	
	/**
	 * Module with operations for the network browse.
	 * @return the network browse module to create the operations
	 */
	ModuleNetworkBrowse getModuleNetworkBrowse();
	
	/**
	 * Module with operations for the playback.
	 * @return the playback module to create the operations
	 */
	ModulePlayback getModulePlayback();

	/**
	 * Module with operations for the setting.
	 * @return the setting module to create the operations
	 */	
	ModuleSetting getModuleSetting();
	
	/**
	 * Module with operations for the system.
	 * @return the system module to create the operations
	 */	
	ModuleSystem getModuleSystem();
	
	/**
	 * Module with the operations for the metadata.
	 * @return the metadata module to create the operations
	 */	
	ModuleMetadata getModuleMetadata();		
	
	/**
	 * Module with the operations for the metadata database.
	 * @return the metadata database module to create the operations
	 */
	ModuleMetadataDatabase getModuleMetadataDatabase();

	/**
	 * Module with the operations for the upnp av module.
	 * @return the upnp av module to create the operations
	 */
	ModuleUpnp getModuleUpnp();		
	
	/**
	 * Get all metadata databases that may exist for the specified IP or host.
	 * @return all possible metadata dabases that may exist.
	 */
	List<MetadataDatabase> getAllMetadadaDatabases();
}
