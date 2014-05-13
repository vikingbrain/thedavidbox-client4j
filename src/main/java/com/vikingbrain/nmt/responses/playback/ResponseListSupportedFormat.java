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
public class ResponseListSupportedFormat extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "format")
	List<String> formats = new ArrayList<String>();	

	/**
	 * Getter of property.
	 * @return the formats
	 */
	public final List<String> getFormats() {
		return formats;
	}

	/**
	 * Setter of property.
	 * @param formats the formats to set
	 */
	public final void setFormats(List<String> formats) {
		this.formats = formats;
	}

	@Override
	public String toString() {
		return "ResponseListVodSupportedFormat [formats=" + formats + "]";
	}
	
}
