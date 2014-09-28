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


public class UtilFile {

//	private static Logger logger = LoggerFactory.getLogger(UtilFile.class);

    /**
     * The system dependent file separator character.
     */
    public static final char separatorChar;

    /**
     * The system dependent file separator string. The initial value of this
     * field is the system property "file.separator".
     */
    public static final String separator;

    static {
    	separatorChar = "/".charAt(0); //$NON-NLS-1$ //$NON-NLS-2$        
    	separator = new String(new char[] { separatorChar }, 0, 1);
    }

	/**
	 * Calculate the file absolute URI. Something like for example file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3
	 * Appends file:// if it's not included in the file path
	 */	
	public static String getFileAbsoluteUri(String filePath){
		String fileAbsoluteUri = filePath;
		if (!filePath.startsWith("file://")){
			fileAbsoluteUri = "file://".concat(filePath);
		}	
		return fileAbsoluteUri;		
	}

   /**
    * Returns the name of the file or directory represented by this file.
    * 
    * @return this file's name or an empty string if there is no name part in
    *         the file's path.
    */
   public static String getFileName(String filePath) {
       int separatorIndex = filePath.lastIndexOf(separator);
       return separatorIndex < 0 ? filePath : filePath.substring(separatorIndex + 1,
    		   filePath.length());
   }

	/**
	 * It solves the problem in xml responses because some fullPaths 
	 * are file:///opt/... and other are like /opt/...
	 * @param fullPath
	 * @return
	 */
	public static String getNmtAbsolutePath(String fullPath){
		String absolutePath = "";
		if (fullPath.startsWith("file://")){
			absolutePath = fullPath.replace("file://", "");
		} else {
			absolutePath = fullPath;
		}
		return absolutePath;
	}
	
	public static boolean isAbsolutePathsEqual(String nmtPath1, String nmtPath2){
		boolean equals = false;
		String absolutePath1 = getNmtAbsolutePath(nmtPath1);
		String absolutePath2 = getNmtAbsolutePath(nmtPath2);
		if (absolutePath1.equals(absolutePath2)){
			equals = true;
		}
		return equals;
	}

	/**
	 * Gets the extension of a file name, like ".png" or ".jpg".
	 * @param uri String with the uri
	 * @return Extension including the dot("."); "" if there is no extension;
	 *         null if uri was null.
	 */
	public static String getExtension(String uri) {
		if (uri == null) {
			return null;
		}

		int dot = uri.lastIndexOf(".");
		if (dot >= 0) {
			return uri.substring(dot);
		} else {
			// No extension.
			return "";
		}
	}
	
}
