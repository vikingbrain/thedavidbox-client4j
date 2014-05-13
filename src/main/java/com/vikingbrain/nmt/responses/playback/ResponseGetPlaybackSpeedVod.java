package com.vikingbrain.nmt.responses.playback;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseGetPlaybackSpeedVod extends ResponseSimple {

	@Path("response")
	@Element(name="speed")
	private String speed;

	/**
	 * Getter of property.
	 * @return the speed
	 */
	public final String getSpeed() {
		return speed;
	}

	/**
	 * Setter of property.
	 * @param speed the speed to set
	 */
	public final void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "ResponseGetPlaybackSpeedVod [speed=" + speed + "]";
	}
	
}
