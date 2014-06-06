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
public class ResponseListLanguage extends ResponseSimple {

	@Path("response")
	@ElementList(inline = true, entry = "language")
	List<String> languages = new ArrayList<String>();	

	/**
	 * Getter of property.
	 * @return the languages
	 */
	public final List<String> getLanguages() {
		return languages;
	}

	/**
	 * Setter of property.
	 * @param languages the languages to set
	 */
	public final void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	
	@Override
	public String toString() {
		return "ResponseListLanguage [languages=" + languages + "]";
	}
	
}
