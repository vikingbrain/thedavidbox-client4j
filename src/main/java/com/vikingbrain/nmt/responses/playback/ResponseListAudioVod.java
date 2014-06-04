package com.vikingbrain.nmt.responses.playback;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseListAudioVod extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "audio", required=false)
	private List<String> audioList = new ArrayList<String>();		

	@Path("response")
	@Element(name="currentAudio", required=false)	
	private String currentAudio;

	/**
	 * Getter of property.
	 * @return the audioList
	 */
	public final List<String> getAudioList() {
		return audioList;
	}

	/**
	 * Setter of property.
	 * @param audioList the audioList to set
	 */
	public final void setAudioList(List<String> audioList) {
		this.audioList = audioList;
	}

	/**
	 * Getter of property.
	 * @return the currentAudio
	 */
	public final String getCurrentAudio() {
		return currentAudio;
	}

	/**
	 * Setter of property.
	 * @param currentAudio the currentAudio to set
	 */
	public final void setCurrentAudio(String currentAudio) {
		this.currentAudio = currentAudio;
	}

	@Override
	public String toString() {
		return "ResponseListAudioVod [audioList=" + audioList
				+ ", currentAudio=" + currentAudio + "]";
	}

}
