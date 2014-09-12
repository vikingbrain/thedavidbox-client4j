package com.vikingbrain.nmt.responses.setting;

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
public class ResponseListTimes extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "time")
	List<String> times = new ArrayList<String>();	

	/**
	 * Getter of property.
	 * @return the times
	 */
	public final List<String> getTimes() {
		return times;
	}

	/**
	 * Setter of property.
	 * @param times the times to set
	 */
	public final void setTimes(List<String> times) {
		this.times = times;
	}
	
	@Override
	public String toString() {
		return "ResponseListPhotoInterval [times=" + times + "]";
	}
	
}
