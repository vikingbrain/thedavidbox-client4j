/**
 * 
 */
package com.vikingbrain.nmt.util;

import org.junit.Assert;
import org.junit.Test;

import com.vikingbrain.nmt.operations.parameters.DisplayMode;
import com.vikingbrain.nmt.operations.parameters.FileSorting;
import com.vikingbrain.nmt.operations.parameters.RotationDegree;

/**
 * @author vikingBrain
 *
 */
public class ClientOptionsTest {

	@Test
	public void defaultBuilderTest(){
		ClientOptions clientOptions = new ClientOptions.Builder().build();
		
		//Default values for properties playback
		Assert.assertEquals(Constants.DEFAULT_PHOTO_SLIDE_INTERVAL, clientOptions.getDefaultSlideInterval());
		Assert.assertEquals(Constants.DEFAULT_ROTATION_DEGREE, clientOptions.getDefaultRotationDegree());
		Assert.assertEquals(Constants.DEFAULT_DISPLAY_MODE, clientOptions.getDefaultDisplayMode());
		
		//Default values for properties file operations
		Assert.assertEquals(Constants.DEFAULT_SHOW_FOLDERS, clientOptions.isDefaultShowFolders());
		Assert.assertEquals(Constants.DEFAULT_SHOW_FILES, clientOptions.isDefaultShowFiles());
		Assert.assertEquals(Constants.DEFAULT_ENABLE_MORE_INFO, clientOptions.isDefaultEnableMoreInfo());
		Assert.assertEquals(Constants.DEFAULT_MIME_TYPE, clientOptions.getDefaultMimeType());
		Assert.assertEquals(Constants.DEFAULT_SORTING, clientOptions.getDefaultFileSorting());
		Assert.assertEquals(Constants.DEFAULT_ENABLE_PERSISTENCE, clientOptions.getDefaultEnablePersistence());
	}
	
	@Test
	public void customBuilderTest(){
		
		int slideInterval = 10;
		RotationDegree rotationDegree= RotationDegree.ROTATION_270;
		DisplayMode displayMode = DisplayMode.HIDE;
		boolean showFolders = false;
		boolean showFiles = false;
		boolean enableMoreInfo = false;
		String mimeType = "mpg";
		FileSorting fileSorting = FileSorting.DATE_ASC;
		boolean enablePersistence = false;		

		//build the clientOptions with the custom options
		ClientOptions clientOptions = new ClientOptions.Builder()
			.defaultSlideInterval(slideInterval)
			.defaultRotationDegree(rotationDegree)
			.defaultDisplayMode(displayMode)
			.defaultShowFolders(showFolders)
			.defaultShowFiles(showFiles)
			.defaultEnableMoreInfo(enableMoreInfo)
			.defaultMimeType(mimeType)
			.defaultFileSorting(fileSorting)
			.defaultEnablePersistence(enablePersistence)
			.build();
			
		//Check that the client options has the established custom values
		Assert.assertEquals(slideInterval, clientOptions.getDefaultSlideInterval());
		Assert.assertEquals(rotationDegree, clientOptions.getDefaultRotationDegree());
		Assert.assertEquals(displayMode, clientOptions.getDefaultDisplayMode());
		Assert.assertEquals(showFolders, clientOptions.isDefaultShowFolders());
		Assert.assertEquals(showFiles, clientOptions.isDefaultShowFiles());
		Assert.assertEquals(enableMoreInfo, clientOptions.isDefaultEnableMoreInfo());
		Assert.assertEquals(mimeType, clientOptions.getDefaultMimeType());
		Assert.assertEquals(fileSorting, clientOptions.getDefaultFileSorting());
		Assert.assertEquals(enablePersistence, clientOptions.getDefaultEnablePersistence());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void invalidSlideIntervalTest(){		
		new ClientOptions.Builder().defaultSlideInterval(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidRotationDegree(){		
		new ClientOptions.Builder().defaultRotationDegree(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidDisplayMode(){		
		new ClientOptions.Builder().defaultDisplayMode(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidFileSorting(){		
		new ClientOptions.Builder().defaultFileSorting(null);
	}

}
