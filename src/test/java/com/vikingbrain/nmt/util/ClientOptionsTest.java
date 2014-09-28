/*
 * Copyright 2011-2014 Rafael Iñigo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
