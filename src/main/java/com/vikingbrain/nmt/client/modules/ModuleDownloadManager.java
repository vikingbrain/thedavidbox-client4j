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
