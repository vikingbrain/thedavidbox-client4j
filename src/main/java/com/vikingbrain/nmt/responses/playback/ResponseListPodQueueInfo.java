package com.vikingbrain.nmt.responses.playback;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 *
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseListPodQueueInfo extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "queue", required = false)
	private List<ObjectQueueElement> queue = new ArrayList<ObjectQueueElement>();	

	public List<ObjectQueueElement> getQueue() {
		return queue;
	}

	public void setQueue(List<ObjectQueueElement> queue) {
		this.queue = queue;
	}

}
