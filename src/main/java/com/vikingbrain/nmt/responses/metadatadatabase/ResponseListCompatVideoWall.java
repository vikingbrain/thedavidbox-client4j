package com.vikingbrain.nmt.responses.metadatadatabase;

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
public class ResponseListCompatVideoWall extends ResponseSimple {
	
	@Path("response")
	@ElementList(inline = true, entry = "category")
	private List<ObjectCategoryVideoWall> categoriesVideoWall = new ArrayList<ObjectCategoryVideoWall>();	
	
	public final List<ObjectCategoryVideoWall> getCategoriesVideoWall() {
		return categoriesVideoWall;
	}

	public final void setCategoriesVideoWall(List<ObjectCategoryVideoWall> categoriesVideoWall) {
		this.categoriesVideoWall = categoriesVideoWall;
	}
	
}
