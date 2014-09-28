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

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Utility class to convert units.
 * 
 * @author vikingBrain
 */
public class UnitConverter {

	public static final double SPACE_KB = 1024;
	public static final double SPACE_MB = 1024 * SPACE_KB;
	public static final double SPACE_GB = 1024 * SPACE_MB;
	public static final double SPACE_TB = 1024 * SPACE_GB;

	/**
	 * Converts size in bytes to human representation with Byte(s), KB, MB, GB o
	 * TB.
	 * 
	 * @param sizeInBytes
	 *            the size in bytes
	 * @return text with Byte(s), KB, MB, GB o TB.
	 */
	public static String bytesToHuman(long sizeInBytes) {

		NumberFormat nf = new DecimalFormat();
		nf.setMaximumFractionDigits(2);

		//init the human text
		String humanText = sizeInBytes + " Byte(s)";

		if (sizeInBytes < SPACE_KB) {
			humanText = nf.format(sizeInBytes) + " Byte(s)";
		} else if (sizeInBytes < SPACE_MB) {
			humanText = nf.format(sizeInBytes / SPACE_KB) + " KB";
		} else if (sizeInBytes < SPACE_GB) {
			humanText = nf.format(sizeInBytes / SPACE_MB) + " MB";
		} else if (sizeInBytes < SPACE_TB) {
			humanText = nf.format(sizeInBytes / SPACE_GB) + " GB";
		} else {
			humanText = nf.format(sizeInBytes / SPACE_TB) + " TB";
		}
		
		return humanText;
	}
}
