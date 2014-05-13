package com.vikingbrain.nmt.client;

import com.vikingbrain.nmt.client.impl.TheDavidBoxClientImpl;
import com.vikingbrain.nmt.client.modules.ModulePlayback;
import com.vikingbrain.nmt.operations.TheDavidboxOperationListener;
import com.vikingbrain.nmt.operations.downloadmanager.CreateDownloadTaskOperation;
import com.vikingbrain.nmt.operations.networkbrowse.ListNetworkResourceOperation;
import com.vikingbrain.nmt.operations.parameters.DisplayMode;
import com.vikingbrain.nmt.operations.parameters.RotationDegree;
import com.vikingbrain.nmt.operations.playback.StartAodOperation;
import com.vikingbrain.nmt.responses.playback.ResponseGetPlaybackSpeedVod;
import com.vikingbrain.nmt.util.ClientOptions;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

public class ExampleUsage {

	public static class OperationListener implements TheDavidboxOperationListener{

		@Override
		public void onSendHttpRequest(String request) {
			System.out.println(request);			
		}

		@Override
		public void onReceiveXmlResponse(String xmlResponse) {
			System.out.println(xmlResponse);			
		}
		
	}
	
	@SuppressWarnings("all")
	public static void main(String[] args) throws TheDavidBoxClientException {
	

		/** Create a client with default client options */
		TheDavidBoxClient theDavidBoxClient = new TheDavidBoxClientImpl("IPorHostName");

		/** Create a client with your custom default client options */
		ClientOptions clientOptions = new ClientOptions.Builder()
			.defaultRotationDegree(RotationDegree.ROTATION_270)  //override default
			.defaultSlideInterval(23)							 //override default
			.defaultDisplayMode(DisplayMode.SHOW)				 //override default
//			...
			.build();

		TheDavidBoxClient theDavidBoxClient2 = new TheDavidBoxClientImpl("IPorHostName", clientOptions);


		
		/** Create and execute an operation: */		
		//Get the module for the operation
		ModulePlayback modulePlayback = theDavidBoxClient.getModulePlayback();
				
		String audioPath = "file:///opt/sybhttpd/localhost.drives/SATA_DISK/music/mock.mp3";

		/** Operation start audio on NMT. It is built using the DisplayMode specified in your default client options
		 * so you don't need to specify it every time. */
		modulePlayback.buildStartAodOperation(audioPath).execute();

		/** Or redefine the attributes for the operation at any time */
		StartAodOperation startAodOperation = modulePlayback.buildStartAodOperation(audioPath);
		startAodOperation.setDisplayMode(DisplayMode.HIDE); //background mode
		startAodOperation.execute();
				
		//Other operation examples
		CreateDownloadTaskOperation operation1 = theDavidBoxClient.getModuleDownloadManager().
				buildCreateDownloadTaskOperation("http://movie.torrent", "MovieName");		

		ListNetworkResourceOperation operation2 = theDavidBoxClient.getModuleNetworkBrowse().
				buildListNetworkResourceOperation();

		
		/** About the responses: */		
		try {
			ResponseGetPlaybackSpeedVod response = theDavidBoxClient.getModulePlayback().
					buildGetPlaybackSpeedVodOperation().execute();

			//Check first that response is valid
			if (response.isValid()){
//				logger.info("Speed: " + response.getSpeed());
			} else {
				//if it is not valid you can see a description for the problem
//				logger.info("Problem description: " + response.getTypeReturnValue().getDescription());
			}
		} catch (TheDavidBoxClientException e) {
			//NMT device is switched off, problem parsing xml response, unreachable IP address, etc...	
			e.printStackTrace();
		}


		TheDavidBoxClient client = new TheDavidBoxClientImpl("IPorHostName", clientOptions, new OperationListener());	
	
	}
	
}
