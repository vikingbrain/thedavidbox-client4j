package com.vikingbrain.nmt.client.modules.impl;

import com.vikingbrain.nmt.client.modules.ModuleDownloadManager;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.downloadmanager.CreateDownloadTaskOperation;
import com.vikingbrain.nmt.operations.downloadmanager.GetDownloadAgentStatusOperation;
import com.vikingbrain.nmt.operations.downloadmanager.StartDownloadAgentOperation;
import com.vikingbrain.nmt.operations.downloadmanager.StopDownloadAgentOperation;

/**
 * It allows to create the operations related to the Download Manager module.
 * This module use to download any available media file by passing URL, BT(torrent) or CID(gougou) file.
 * 
 * @author vikingBrain
 */
public class ModuleDownloadManagerImpl extends AbstractModule implements ModuleDownloadManager {

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 */
	public ModuleDownloadManagerImpl(TheDavidboxOperationFactory operationFactory) {
		super(operationFactory);
	}
	
	/** {@inheritDoc} */		
	public GetDownloadAgentStatusOperation buildGetDownloadAgentStatusOperation() {
		return new GetDownloadAgentStatusOperation(getOperationFactory());
	}

	/** {@inheritDoc} */		
	public StartDownloadAgentOperation buildStartDownloadAgentOperation() {
		return new StartDownloadAgentOperation(getOperationFactory());
	}

	/** {@inheritDoc} */		
	public StopDownloadAgentOperation buildStopDownloadAgentOperation() {
		return new StopDownloadAgentOperation(getOperationFactory());
	}

	//TODO set_download_agent_settings
	
	//TODO get_download_agent_settings
	
	/** {@inheritDoc} */
	public CreateDownloadTaskOperation buildCreateDownloadTaskOperation(String source, String fileName) {
		return new CreateDownloadTaskOperation(getOperationFactory(), source, fileName);
	}
	
	//TODO list_download_tasks
	
	//TODO get_download_task_info
	
	//TODO list_download_task_info
	
	//TODO start_download_task
	
	//TODO stop_download_task
	
	//TODO stop_all_download_task
	
	//TODO delete_download_task
	
	//TODO delete_all_download_task
	
	//TODO start_all_download_task
	
	//TODO delete_download_task_and_data
	
	//TODO delete_all_download_task_and_data
	
	//TODO list_setting_torrent_schedule
	
	//TODO list_setting_downloaded_schedule
	
	//TODO list_bandwidth_schedule
	
	//TODO list_torrent_schedule
	
	//TODO list_downloaded_schedule
	
	//TODO add_bandwidth_schedule
	
	//TODO add_torrent_schedule
	
	//TODO add_downloaded_schedule
	
	//TODO delete_schedule
	
	//TODO reset_bandwidth_schedule
	
	//TODO reset_torrent_schedule
	
	//TODO reset_downloaded_schedule
	
}
