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
public class ResponseListSlideShowEffect extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "style")
	List<String> styles = new ArrayList<String>();	

	/**
	 * Getter of property.
	 * @return the styles
	 */
	public final List<String> getStyles() {
		return styles;
	}

	/**
	 * Setter of property.
	 * @param styles the styles to set
	 */
	public final void setStyles(List<String> styles) {
		this.styles = styles;
	}

	@Override
	public String toString() {
		return "ResponseListSlideShowEffect [styles=" + styles + "]";
	}

}
