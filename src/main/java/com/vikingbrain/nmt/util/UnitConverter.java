/**
 * 
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
	 * Converts size in bytes to human representation with Byte(s),
	 * KB, MB, GB o TB.
	 * @param sizeInBytes the size in bytes
	 * @return text with Byte(s), KB, MB, GB o TB.
	 */
	public static String bytesToHuman(long sizeInBytes) {

		NumberFormat nf = new DecimalFormat();
		nf.setMaximumFractionDigits(2);

		try {
			if (sizeInBytes < SPACE_KB) {
				return nf.format(sizeInBytes) + " Byte(s)";
			} else if (sizeInBytes < SPACE_MB) {
				return nf.format(sizeInBytes / SPACE_KB) + " KB";
			} else if (sizeInBytes < SPACE_GB) {
				return nf.format(sizeInBytes / SPACE_MB) + " MB";
			} else if (sizeInBytes < SPACE_TB) {
				return nf.format(sizeInBytes / SPACE_GB) + " GB";
			} else {
				return nf.format(sizeInBytes / SPACE_TB) + " TB";
			}
		} catch (Exception e) {
			return sizeInBytes + " Byte(s)";
		}

	}
}
