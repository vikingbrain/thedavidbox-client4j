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

import com.vikingbrain.nmt.operations.parameters.DisplayMode;
import com.vikingbrain.nmt.operations.parameters.FileSorting;
import com.vikingbrain.nmt.operations.parameters.RotationDegree;

/**
 * Class with constants.
 * 
 * @author VikingBrain
 */
public class Constants {

	public static final int DAVIDBOX_PORT = 8008;

	public static final String EMPTY_STRING = "";		

	public static final String STRING_ZERO = "0";

	public static final int NUMBER_ZERO = 0;
	
	public static final int NUMBER_ONE = 1;
	
	public static final int NUMBER_TWO = 2;

	public static final int NUMBER_THREE = 3;

	public static final int NUMBER_FOUR = 4;

	public static final int NUMBER_FIVE = 5;
	
	public static final int NUMBER_SIX = 6;
	
	public static final int NUMBER_SEVEN = 7;
	
	public static final int NUMBER_EIGHT = 8;
	
	public static final int NUMBER_NINE = 9;
	
	public static final int NUMBER_TEN = 10;
	
	public static final int NUMBER_ELEVEN = 11;
	
	
	/** Default values for properties playback. */
	public static final int DEFAULT_PHOTO_SLIDE_INTERVAL = 5;  //seconds
	public static final RotationDegree DEFAULT_ROTATION_DEGREE = RotationDegree.ROTATION_0;
	public static final DisplayMode DEFAULT_DISPLAY_MODE = DisplayMode.SHOW;
	/** Default values for properties file operations. */
	public static final boolean DEFAULT_SHOW_FOLDERS = true;
	public static final boolean DEFAULT_SHOW_FILES = true;
	public static final boolean DEFAULT_ENABLE_MORE_INFO = true;
	public static final String DEFAULT_MIME_TYPE = "";
	public static final FileSorting DEFAULT_SORTING = FileSorting.NAME_ASC;
	public static final Boolean DEFAULT_ENABLE_PERSISTENCE = null;


}
