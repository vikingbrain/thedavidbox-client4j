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
public class ResponseGetSlideShowEffect extends ResponseSimple {

	@Path("response")
	@Element(name="style")
	private String style;	

	/**
	 * Getter of property.
	 * @return the style
	 */
	public final String getStyle() {
		return style;
	}

	/**
	 * Setter of property.
	 * @param style the style to set
	 */
	public final void setStyle(String style) {
		this.style = style;
	}
	
	@Override
	public String toString() {
		return "ResponseGetSlideShowEffect [style=" + style + "]";
	}
	
}
