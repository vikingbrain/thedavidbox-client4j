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
public class ResponseListRepeatMode extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "playMode")
	List<String> playModes = new ArrayList<String>();	

	/**
	 * Getter of property.
	 * @return the playModes
	 */
	public final List<String> getPlayModes() {
		return playModes;
	}

	/**
	 * Setter of property.
	 * @param playModes the playModes to set
	 */
	public final void setPlayModes(List<String> playModes) {
		this.playModes = playModes;
	}
	
	@Override
	public String toString() {
		return "ResponseListRepeatMode [playModes=" + playModes + "]";
	}
	
}
