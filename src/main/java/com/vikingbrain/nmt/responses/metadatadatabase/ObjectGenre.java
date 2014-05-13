package com.vikingbrain.nmt.responses.metadatadatabase;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="genre", strict=false)
public class ObjectGenre {

	@Element(name="id")
	private String id;
	
	@Element(name="name")
	private String name;	

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ObjectGenre [id=" + id + ", name=" + name + "]";
	}
	
}
