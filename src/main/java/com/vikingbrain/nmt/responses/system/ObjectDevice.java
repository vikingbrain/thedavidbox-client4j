package com.vikingbrain.nmt.responses.system;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="device", strict=false)
public class ObjectDevice {

	@Element(name="name")
	private String name;
	
	@Element(name="type", required=false)
	private String type;	

	@Element(name="url")
	private String url;

	/**
	 * Getter of property.
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * Setter of property.
	 * @param name the name
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter of property.
	 * @return the type
	 */
	public final String getType() {
		return type;
	}
	
	/**
	 * Setter of property.
	 * @param type the type
	 */
	public final void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter of property.
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Setter of property.
	 * @param url the url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ObjectDevice [name=" + name + ", type=" + type + ", url=" + url
				+ "]";
	}
	
}
