package com.vikingbrain.nmt.responses.downloadmanager;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetDownloadAgentStatus extends ResponseSimple {

	@Path("response")
	@Element(name="status")
	private String status;

	protected final String getStatus() {
		return status;
	}
	
	protected final void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Get the status for the download agent.
	 * @return type for the download agent status
	 */
	public final TypeDownloadAgentStatus getDownloadAgentStatus(){
		//Initialization with default status to unknown
		TypeDownloadAgentStatus typeStatus = TypeDownloadAgentStatus.UNKNOWN;
		//Find the type by the error id
		TypeDownloadAgentStatus typeStatusFoundByCode = TypeDownloadAgentStatus.findById(status);
		if (null != typeStatusFoundByCode){
			typeStatus = typeStatusFoundByCode;
		}		
		return typeStatus;
	}
	
}
