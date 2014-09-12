package com.vikingbrain.nmt.responses.setting;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetTime extends ResponseSimple {

	@Path("response")
	@Element(name="time")
	private String time;	

	/**
	 * Getter of property.
	 * @return the time
	 */
	public final String getTime() {
		return time;
	}

	/**
	 * Setter of property.
	 * @param time the time to set
	 */
	public final void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "ResponseTime [time=" + time + "]";
	}
	
}
