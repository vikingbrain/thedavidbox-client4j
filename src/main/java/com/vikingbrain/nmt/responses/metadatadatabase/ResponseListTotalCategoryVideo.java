package com.vikingbrain.nmt.responses.metadatadatabase;

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
public class ResponseListTotalCategoryVideo extends ResponseSimple {
	
	@Path("response")
	@Element(name="total")
	private String total;
	
	@Path("response")
	@ElementList(name = "all_categories")
	private List<ObjectCategory> categories = new ArrayList<ObjectCategory>();	
	
	public final String getTotal() {
		return total;
	}

	public final void setTotal(String total) {
		this.total = total;
	}

	public final List<ObjectCategory> getCategories() {
		return categories;
	}

	public final void setCategories(List<ObjectCategory> categories) {
		this.categories = categories;
	}
	
}
