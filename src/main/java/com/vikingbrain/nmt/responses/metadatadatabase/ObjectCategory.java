package com.vikingbrain.nmt.responses.metadatadatabase;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="category", strict=false)
public class ObjectCategory {

	@Element(name="id")
	private String id;
	
	@Element(name="name")
	private String name;	

	/**
	 * Getter of property.
	 * @return the name
	 */
	public final String getId() {
		return id;
	}
	
	/**
	 * Setter of property.
	 * @param id the id
	 */
	public final void setId(String id) {
		this.id = id;
	}

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
	
}
