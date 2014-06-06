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
public class ResponseGetLanguage extends ResponseSimple {

	@Path("response")
	@Element(name="language")
	private String language;	

	/**
	 * Getter of property.
	 * @return the language
	 */
	public final String getLanguage() {
		return language;
	}

	/**
	 * Setter of property.
	 * @param language the language to set
	 */
	public final void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "ResponseGetLanguage [language=" + language + "]";
	}
	
}
