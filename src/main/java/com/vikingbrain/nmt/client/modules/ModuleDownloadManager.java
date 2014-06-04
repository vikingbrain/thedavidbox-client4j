package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.downloadmanager.CreateDownloadTaskOperation;
import com.vikingbrain.nmt.operations.downloadmanager.GetDownloadAgentStatusOperation;
import com.vikingbrain.nmt.operations.downloadmanager.ListDownloadTasksOperation;
import com.vikingbrain.nmt.operations.downloadmanager.StartDownloadAgentOperation;
import com.vikingbrain.nmt.operations.downloadmanager.StopDownloadAgentOperation;


/**
 * It allows to create the operations related to the Download Manager module.
 * This module use to download any available media file by passing URL, BT(torrent) or CID(gougou) file.
 * 
 * @author vikingBrain
 */
public interface ModuleDownloadManager extends BaseModule {

	/**
	 * It creates an operation that retrieves current download agent's status.
	 * @return the operation created
	 */		
	GetDownloadAgentStatusOperation buildGetDownloadAgentStatusOperation();

	/**
	 * It creates an operation that starts the download agent.
	 * @return the operation created
	 */
	StartDownloadAgentOperation buildStartDownloadAgentOperation();

	/**
	 * It creates an operation that stops the download agent.
	 * @return the operation created
	 */
	StopDownloadAgentOperation buildStopDownloadAgentOperation();

	/**
	 * It creates an operation that lists all exist download tasks.
	 * @return the operation created
	 */	
	ListDownloadTasksOperation buildListDownloadTasksOperation();
	
	/**
	 * It creates an operation that creates new download task.
	 * @param source the Content ID, Url, BT file path for download file
	 * @param fileName the file name
	 * @return the operation created
	 */
	CreateDownloadTaskOperation buildCreateDownloadTaskOperation(String source, String fileName);
}
