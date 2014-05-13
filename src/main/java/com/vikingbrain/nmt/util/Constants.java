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
	
	
//	public static final String FTP_NMT_DRIVE_NAME_DEFAULT = "/opt/sybhttpd/localhost.drives";
	
//	public static final String NMT_BASE_PATH_DEFAULT = "/opt/sybhttpd/localhost.drives";
	
//	public static final String MYIHOME_PORT_AND_STREAM = ":8088/stream/file=";
	
//	public static final String LLINK_PORT_DEFAULT = "8001";

//	public static enum SERVICE_STATUS { RUNNING, STOPPED, LOADING, UNKNOWN, SENDING_COMMAND };

	public static final int WAITING_TIME_SAME_KEY_IR_REMOTE = 2 * 1000; //2 seconds		

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
