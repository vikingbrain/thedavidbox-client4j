package com.vikingbrain.nmt.responses.metadatadatabase;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * 
 * @author vikingBrain
 */
@Root(name="response", strict=false)
public class ResponseCheckDatabase extends ResponseSimple {

	@Path("response")
	@Element(name="database_path")
	private String databasePath;

	public final String getDatabasePath() {
		return databasePath;
	}

	public final void setDatabasePath(String databasePath) {
		this.databasePath = databasePath;
	}
	
	@Override
	public String toString() {
		return "ResponseCheckDatabase [databasePath=" + databasePath + "]";
	}
	
}
