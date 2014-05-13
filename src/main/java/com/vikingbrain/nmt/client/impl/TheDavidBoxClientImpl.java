package com.vikingbrain.nmt.client.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.client.TheDavidBoxClient;
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
import com.vikingbrain.nmt.client.modules.impl.ModuleDeploymentImpl;
import com.vikingbrain.nmt.client.modules.impl.ModuleDownloadManagerImpl;
import com.vikingbrain.nmt.client.modules.impl.ModuleFileImpl;
import com.vikingbrain.nmt.client.modules.impl.ModuleMetadataDatabaseImpl;
import com.vikingbrain.nmt.client.modules.impl.ModuleMetadataImpl;
import com.vikingbrain.nmt.client.modules.impl.ModuleNetworkBrowseImpl;
import com.vikingbrain.nmt.client.modules.impl.ModulePlaybackImpl;
import com.vikingbrain.nmt.client.modules.impl.ModuleSettingImpl;
import com.vikingbrain.nmt.client.modules.impl.ModuleSystemImpl;
import com.vikingbrain.nmt.client.modules.impl.ModuleUpnpImpl;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.TheDavidboxOperationListener;
import com.vikingbrain.nmt.responses.setting.ResponseListNetworkSharedFolder;
import com.vikingbrain.nmt.responses.system.ResponseListDevices;
import com.vikingbrain.nmt.util.ClientOptions;
import com.vikingbrain.nmt.util.MetadataDatabase;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * Implementation of The Davidbox client.
 * 
 * @author vikingBrain
 */
public class TheDavidBoxClientImpl implements TheDavidBoxClient {

	/** Logger. */
	static Logger logger = LoggerFactory.getLogger(TheDavidBoxClientImpl.class);

	/** The operation factory. */
	private final TheDavidboxOperationFactory operationFactory;

	/** Module with download manager operations. */
	private final ModuleDownloadManager moduleDownloadManager;	

	/** Module with the deployment operations. */
	private final ModuleDeployment moduleDeployment;	

	/** Module with file operations. */
	private final ModuleFile moduleFile;	

	/** Module with network browse operations. */
	private final ModuleNetworkBrowse moduleNetworkBrowse;

	/** Module with playback operations. */
	private final ModulePlayback modulePlayback;

	/** Module with the setting operations. */
	private final ModuleSetting moduleSetting;

	/** Module with the system operations. */
	private final ModuleSystem moduleSystem;

	/** Module with the metadata operations. */
	private final ModuleMetadata moduleMetadata;

	/** Module with the metadata database operations. */
	private final ModuleMetadataDatabase moduleMetadataDatabase;

	/** Module with the upnp av operations. */
	private final ModuleUpnp moduleUpnp;

	/**
	 * Constructor.
	 * @param remoteHost the IP or remote host
	 */
	public TheDavidBoxClientImpl(String remoteHost) {		
		this(remoteHost, new ClientOptions.Builder().build());
	}

	/**
	 * Constructor.
	 * @param remoteHost the IP or remote host
	 * @param clientOptions the client options
	 */
	public TheDavidBoxClientImpl(String remoteHost, ClientOptions clientOptions) {
		this(remoteHost, clientOptions, null);
	}
	
	/**
	 * Constructor
	 * @param remoteHost the IP or remote host
	 * @param clientOptions the client options
	 */
	public TheDavidBoxClientImpl(String remoteHost, ClientOptions clientOptions, TheDavidboxOperationListener operationListener) {			
		operationFactory = new TheDavidboxOperationFactory(remoteHost, clientOptions, operationListener);
		
		//build the modules
		moduleDeployment = new ModuleDeploymentImpl(operationFactory);
		moduleFile = new ModuleFileImpl(operationFactory);
		
		moduleNetworkBrowse = new ModuleNetworkBrowseImpl(operationFactory);
		modulePlayback = new ModulePlaybackImpl(operationFactory);
		moduleSetting = new ModuleSettingImpl(operationFactory);
		moduleSystem = new ModuleSystemImpl(operationFactory);
		moduleMetadata = new ModuleMetadataImpl(operationFactory);
		moduleMetadataDatabase = new ModuleMetadataDatabaseImpl(operationFactory);
		moduleUpnp = new ModuleUpnpImpl(operationFactory);
		moduleDownloadManager = new ModuleDownloadManagerImpl(operationFactory);
	}	

	/** {@inheritDoc} */
	public final TheDavidboxOperationFactory getOperationFactory() {
		return operationFactory;
	}

	/** {@inheritDoc} */
	public final ModuleDeployment getModuleDeployment() {
		return moduleDeployment;
	}

	/** {@inheritDoc} */
	public final ModuleDownloadManager getModuleDownloadManager() {
		return moduleDownloadManager;
	}

	/** {@inheritDoc} */
	public final ModuleFile getModuleFile() {
		return moduleFile;
	}

	/** {@inheritDoc} */
	public final ModuleNetworkBrowse getModuleNetworkBrowse() {
		return moduleNetworkBrowse;
	}

	/** {@inheritDoc} */
	public final ModulePlayback getModulePlayback() {
		return modulePlayback;
	}

	/** {@inheritDoc} */
	public final ModuleSetting getModuleSetting() {
		return moduleSetting;
	}

	/** {@inheritDoc} */
	public final ModuleSystem getModuleSystem() {
		return moduleSystem;
	}

	/** {@inheritDoc} */
	public final ModuleMetadata getModuleMetadata() {
		return moduleMetadata;
	}

	/** {@inheritDoc} */
	public final ModuleMetadataDatabase getModuleMetadataDatabase() {
		return moduleMetadataDatabase;
	}

	/** {@inheritDoc} */
	public final ModuleUpnp getModuleUpnp() {
		return moduleUpnp;
	}

	/** {@inheritDoc} */
	public final String getRemoteHost() {
		return operationFactory.getRemoteHost();
	}

	/** {@inheritDoc} */
	public final void setRemoteHost(String remoteHost) {
		operationFactory.setRemoteHost(remoteHost);
	}

	/** {@inheritDoc} */
	public final ClientOptions getClientOptions() {
		return operationFactory.getClientOptions();
	}
	
	/** {@inheritDoc} */
	public List<MetadataDatabase> getAllMetadadaDatabases() {
		//Init the list
		List<MetadataDatabase> databases = new ArrayList<MetadataDatabase>();
		
		logger.warn("Finding metadata databases in physical drives and network shares");
		try {
			//Add all databases found in physical disk drives
			ResponseListDevices responseDevices = getModuleSystem().buildListDevicesOperation().execute();			
			List<MetadataDatabase> databasesPhysicalDrives = getModuleMetadataDatabase().getMetadadaDatabasesPhysicalDrives(responseDevices);
			databases.addAll(databasesPhysicalDrives);
		} catch (TheDavidBoxClientException e1) {
			logger.warn("No physical drives found");
		}		
		
		try {
			//Add all databases found from network shared folders
			ResponseListNetworkSharedFolder responseNetworkSharedFolders = getModuleSetting().buildListNetworkSharedFolderOperation().execute();			
			List<MetadataDatabase> databasesNetworkSharedFolders = getModuleMetadataDatabase().getMetadadaDatabasesSharedFolders(responseNetworkSharedFolders);			
			databases.addAll(databasesNetworkSharedFolders);
		} catch (TheDavidBoxClientException e) {
			logger.warn("No network shared folders found");
		}
		
		return databases;
	}	


}
