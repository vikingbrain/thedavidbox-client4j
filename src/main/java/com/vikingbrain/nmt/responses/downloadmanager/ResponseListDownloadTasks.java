package com.vikingbrain.nmt.responses.downloadmanager;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseListDownloadTasks extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "taskId", required=false)
	List<String> taskIds = new ArrayList<String>();	

	/**
	 * Getter of property.
	 * @return the taskIds
	 */
	public final List<String> getTaskIds() {
		return taskIds;
	}

	/**
	 * Setter of property.
	 * @param taskIds the taskIds to set
	 */
	public final void setTaskIds(List<String> taskIds) {
		this.taskIds = taskIds;
	}
	
	@Override
	public String toString() {
		return "ResponseListDownloadTasks [taskIds=" + taskIds + "]";
	}

}
