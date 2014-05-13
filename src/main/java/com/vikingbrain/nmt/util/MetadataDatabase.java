package com.vikingbrain.nmt.util;

public class MetadataDatabase {

	private final String deviceUrl;
	private final String databasePath;
	
	public MetadataDatabase(String deviceUrl, String databasePath) {
		super();
		this.deviceUrl = deviceUrl;
		this.databasePath = databasePath;
	}
	
	public final String getDeviceUrl() {
		return deviceUrl;
	}

	public final String getDatabasePath() {
		return databasePath;
	}

	@Override
	public String toString() {
		return "MetadataDatabase [deviceUrl=" + deviceUrl + ", databasePath="
				+ databasePath + "]";
	}				

}
