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
public class ResponseListPlaybackSpeedVod extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "speed")
	List<String> speeds = new ArrayList<String>();	

	/**
	 * Getter of property.
	 * @return the speeds
	 */
	public final List<String> getSpeeds() {
		return speeds;
	}

	/**
	 * Setter of property.
	 * @param speeds the speeds to set
	 */
	public final void setSpeeds(List<String> speeds) {
		this.speeds = speeds;
	}

	@Override
	public String toString() {
		return "ResponseListPlaybackSpeedVod [speeds=" + speeds + "]";
	}	
	
}
