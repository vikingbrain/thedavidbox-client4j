package com.vikingbrain.nmt.util;

import com.vikingbrain.nmt.operations.parameters.DisplayMode;
import com.vikingbrain.nmt.operations.parameters.FileSorting;
import com.vikingbrain.nmt.operations.parameters.RotationDegree;

public class ClientOptions {

	/** Parameters playback operations default options. */
	private final int defaultSlideInterval;
	private final RotationDegree defaultRotationDegree;
	private final DisplayMode defaultDisplayMode;

	/** Parameters file operations default options. */
	private final boolean defaultShowFolders;
	private final boolean defaultShowFiles;
	private final boolean defaultEnableMoreInfo;
	private final String defaultMimeType;
	private final FileSorting defaultFileSorting;
	private final Boolean defaultEnablePersistence;

	public final int getDefaultSlideInterval() {
		return defaultSlideInterval;
	}

	public final RotationDegree getDefaultRotationDegree() {
		return defaultRotationDegree;
	}
	
	public final DisplayMode getDefaultDisplayMode() {
		return defaultDisplayMode;
	}	
	
	public final boolean isDefaultShowFolders() {
		return defaultShowFolders;
	}

	public final boolean isDefaultShowFiles() {
		return defaultShowFiles;
	}

	public final boolean isDefaultEnableMoreInfo() {
		return defaultEnableMoreInfo;
	}

	public final String getDefaultMimeType() {
		return defaultMimeType;
	}

	public final FileSorting getDefaultFileSorting() {
		return defaultFileSorting;
	}

	public final Boolean getDefaultEnablePersistence() {
		return defaultEnablePersistence;
	}
	
	public ClientOptions(Builder builder) {
		super();
		//playback parameters
		defaultSlideInterval = builder.defaultSlideInterval;
		defaultRotationDegree = builder.defaultRotationDegree;
		defaultDisplayMode = builder.defaultDisplayMode;
		//file parameters
		defaultShowFolders = builder.defaultShowFolders;
		defaultShowFiles = builder.defaultShowFiles;
		defaultEnableMoreInfo = builder.defaultEnableMoreInfo;
		defaultMimeType = builder.defaultMimeType;
		defaultFileSorting = builder.defaultFileSorting;
		defaultEnablePersistence = builder.defaultEnablePersistence;		
	}
	
	/**
	 * Builder for the class.
	 * @author vikingBrain
	 */
	public static class Builder {

		//Default values for properties playback
		private int defaultSlideInterval = Constants.DEFAULT_PHOTO_SLIDE_INTERVAL;
		private RotationDegree defaultRotationDegree = Constants.DEFAULT_ROTATION_DEGREE;
		private DisplayMode defaultDisplayMode = Constants.DEFAULT_DISPLAY_MODE;
		
		//Default values for properties file operations
		private boolean defaultShowFolders = Constants.DEFAULT_SHOW_FOLDERS;
		private boolean defaultShowFiles = Constants.DEFAULT_SHOW_FILES;
		private boolean defaultEnableMoreInfo = Constants.DEFAULT_ENABLE_MORE_INFO;
		private String defaultMimeType = Constants.DEFAULT_MIME_TYPE;
		private FileSorting defaultFileSorting = Constants.DEFAULT_SORTING;
		private Boolean defaultEnablePersistence = Constants.DEFAULT_ENABLE_PERSISTENCE;		
		
		public Builder defaultSlideInterval(int defaultSlideInterval) {
			if (defaultSlideInterval < 0) {
				throw new IllegalArgumentException("Minimum value is 0");
			}
			this.defaultSlideInterval = defaultSlideInterval;
			return this;
		}

		public Builder defaultRotationDegree(RotationDegree defaultRotationDegree) {
			if (null == defaultRotationDegree){
				throw new IllegalArgumentException("null is not a legal value");
			}
			this.defaultRotationDegree = defaultRotationDegree;
			return this;
		}

		public Builder defaultDisplayMode(DisplayMode defaultDisplayMode) {
			if (null == defaultDisplayMode){
				throw new IllegalArgumentException("null is not a legal value");
			}
			this.defaultDisplayMode = defaultDisplayMode;
			return this;
		}

		public Builder defaultShowFolders(boolean defaultShowFolders) {
			this.defaultShowFolders = defaultShowFolders;
			return this;
		}

		public Builder defaultShowFiles(boolean defaultShowFiles) {
			this.defaultShowFiles = defaultShowFiles;
			return this;
		}

		public Builder defaultEnableMoreInfo(boolean defaultEnableMoreInfo) {
			this.defaultEnableMoreInfo = defaultEnableMoreInfo;
			return this;
		}
		
		public Builder defaultMimeType(String defaultMimeType) {
			this.defaultMimeType = defaultMimeType;
			return this;
		}
		
		public Builder defaultFileSorting(FileSorting defaultFileSorting) {
			if (null == defaultFileSorting){
				throw new IllegalArgumentException("null is not a legal value");
			}
			this.defaultFileSorting = defaultFileSorting;
			return this;
		}
		
		public Builder defaultEnablePersistence(boolean defaultEnablePersistence) {
			this.defaultEnablePersistence = defaultEnablePersistence;
			return this;
		}
		
		/**
		 * Build method.
		 * @return the ClientOptions
		 */
		public ClientOptions build() {
			return new ClientOptions(this);
		}

	}
}
