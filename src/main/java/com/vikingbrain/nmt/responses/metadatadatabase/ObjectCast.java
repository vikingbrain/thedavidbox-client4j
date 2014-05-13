package com.vikingbrain.nmt.responses.metadatadatabase;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="cast", strict=false)
public class ObjectCast {

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
		return "ObjectCast [id=" + id + ", name=" + name + "]";
	}
	
}
