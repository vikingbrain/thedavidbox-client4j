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
public class ResponseGetRepeatMode extends ResponseSimple {

	@Path("response")
	@Element(name="playMode")
	private String playMode;	

	/**
	 * Getter of property.
	 * @return the playMode
	 */
	public final String getPlayMode() {
		return playMode;
	}

	/**
	 * Setter of property.
	 * @param playMode the playMode to set
	 */
	public final void setPlayMode(String playMode) {
		this.playMode = playMode;
	}
	
	@Override
	public String toString() {
		return "ResponseGetRepeatMode [playMode=" + playMode + "]";
	}
	
}
