package com.vikingbrain.nmt.operations.downloadmanager;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that creates new download task.
 * Execution examples: 
 * http://popcorn:8008/download_manager?arg0=create_download_task&arg1=http://movie.avi&arg2=MovieName
 * http://popcorn:8008/download_manager?arg0=create_download_task&arg1=http://movie.torrent&arg2=MovieName
 * http://popcorn:8008/download_manager?arg0=create_download_task&arg1=cid://11BJAJKDAF12324&arg2=MovieName
 * http://popcorn:8008/download_manager?arg0=create_download_task&arg1=http://ca.isohunt.com/download/293451849/15c5c28663bc9396239024e7d4787eeb3dbd3196.torrent&arg2=FileName
 * @author vikingBrain
 */
public class CreateDownloadTaskOperation extends AbstractDownloadManagerOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.DOWNLOAD_MANAGER.create_download_task;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required attributes. */
	//Content ID, Url, BT file path for download file.
	private String source;
	//The file name
	private String fileName;

	/**
	 * Constructor.
	 * @param operationFactory operationFactory the operation factory
	 * @param source the Content ID, Url, BT file path for download file
	 * @param fileName the file name
	 */
	public CreateDownloadTaskOperation(TheDavidboxOperationFactory operationFactory, String source, String fileName) {
		super(operationFactory, operationType, responseTargetClass);
		this.source = source;
		this.fileName = fileName;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", source);
		httpArguments.put("arg2", fileName);
		
		return httpArguments;		
	}

	/**
	 * Getter of property.
	 * @return the source
	 */
	public final String getSource() {
		return source;
	}

	/**
	 * Setter of property.
	 * @param source the source to set
	 */
	public final void setSource(String source) {
		this.source = source;
	}

	/**
	 * Getter of property.
	 * @return the fileName
	 */
	public final String getFileName() {
		return fileName;
	}

	/**
	 * Setter of property.
	 * @param fileName the fileName to set
	 */
	public final void setFileName(String fileName) {
		this.fileName = fileName;
	}	
	
	@Override
	public String toString() {
		return "CreateDownloadTaskOperation [source=" + source + ", fileName="
				+ fileName + ", getOperationType()=" + getOperationType() + "]";
	}
	
}
