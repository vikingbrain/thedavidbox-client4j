package com.vikingbrain.nmt.operations.upnp;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.upnp.ResponseListUpnpServerFiles;

/**
 * List all the file or folder in UPNP server.
 * Execution example: 
 * http://popcorn:8008/upnp?arg0=list_upnp_server_files&arg1=http://...&arg2=21&arg3=0&arg4=10&arg5=true&arg6=true&arg7=true&arg8=image/png
 *
 * @author vikingBrain
 *
 */
public class ListUpnpServerFilesOperation extends AbstractUpnpOperation<ResponseListUpnpServerFiles> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.UPNP.list_upnp_server_files;

	/** Response target class. */
	private static final Class<ResponseListUpnpServerFiles> responseTargetClass = ResponseListUpnpServerFiles.class;

	/** Required operation attributes. */
	//Url get from list_upnp_server function
	private String urlUpnpServer;
	//Directory ID to access specific directory. If not pass this parameter, will return ROOT directory
	private String directoryId;	
	//start number of the response list
	private int offset;
	//number of response to return
	private int numberElements;
	
	private boolean showFolders;
	private boolean showFiles;
	private boolean enableMoreInfo;
	private String mimeType;
		
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory  the operation factory
	 * @param urlUpnpServer Url get from list_upnp_server function
	 * @param directoryId Directory ID to access specific directory. If not pass this parameter, will return ROOT directory
	 * @param offset start number of the response list
	 * @param numberElements number of response to return
	 */
	public ListUpnpServerFilesOperation(TheDavidboxOperationFactory operationFactory, String urlUpnpServer, String directoryId, int offset, int numberElements) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.urlUpnpServer = urlUpnpServer;
		this.directoryId = directoryId;		
		this.offset = offset;
		this.numberElements = numberElements;
		
		//Default client attributes
		this.showFolders =  operationFactory.getClientOptions().isDefaultShowFolders();
		this.showFiles =  operationFactory.getClientOptions().isDefaultShowFiles();		
		this.enableMoreInfo =  operationFactory.getClientOptions().isDefaultEnableMoreInfo();
		this.mimeType = operationFactory.getClientOptions().getDefaultMimeType();
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();

		httpArguments.put("arg1", urlUpnpServer);
		httpArguments.put("arg2", directoryId);		
		httpArguments.put("arg3", String.valueOf(offset));
		httpArguments.put("arg4", String.valueOf(numberElements));		
		httpArguments.put("arg5", String.valueOf(showFolders));
		httpArguments.put("arg6", String.valueOf(showFiles));		
		httpArguments.put("arg7", String.valueOf(enableMoreInfo));
		httpArguments.put("arg8", mimeType);
		
		return httpArguments;
	}

	public final String getUrlUpnpServer() {
		return urlUpnpServer;
	}

	public final void setUrlUpnpServer(String urlUpnpServer) {
		this.urlUpnpServer = urlUpnpServer;
	}

	public final String getDirectoryId() {
		return directoryId;
	}

	public final void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
	}

	public final int getOffset() {
		return offset;
	}

	public final void setOffset(int offset) {
		this.offset = offset;
	}

	public final int getNumberElements() {
		return numberElements;
	}

	public final void setNumberElements(int numberElements) {
		this.numberElements = numberElements;
	}

	public final boolean isShowFolders() {
		return showFolders;
	}

	public final void setShowFolders(boolean showFolders) {
		this.showFolders = showFolders;
	}

	public final boolean isShowFiles() {
		return showFiles;
	}

	public final void setShowFiles(boolean showFiles) {
		this.showFiles = showFiles;
	}

	public final boolean isEnableMoreInfo() {
		return enableMoreInfo;
	}

	public final void setEnableMoreInfo(boolean enableMoreInfo) {
		this.enableMoreInfo = enableMoreInfo;
	}

	public final String getMimeType() {
		return mimeType;
	}

	public final void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	@Override
	public String toString() {
		return "ListUpnpServerFilesOperation [urlUpnpServer=" + urlUpnpServer
				+ ", directoryId=" + directoryId + ", offset=" + offset
				+ ", numberElements=" + numberElements + ", showFolders="
				+ showFolders + ", showFiles=" + showFiles
				+ ", enableMoreInfo=" + enableMoreInfo + ", mimeType="
				+ mimeType + ", getOperationType()=" + getOperationType() + "]";
	}

}
