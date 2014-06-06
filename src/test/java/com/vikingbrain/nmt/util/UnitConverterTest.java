package com.vikingbrain.nmt.util;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for the class UnitConverter
 * 
 * @author vikingBrain
 */
public class UnitConverterTest {
	
	@Test
	public void bytesToHumanTest(){
		
		//Use locale to en_US to receive the decimals with the . symbol
        Locale locale = new Locale("en", "US");		
        Locale.setDefault(locale);
        
		//786 Bytes = 786 Byte(s)
		long sizeInBytes = 786;
		String expectedHumanText = "786 Byte(s)";
		Assert.assertEquals(expectedHumanText, UnitConverter.bytesToHuman(sizeInBytes));
		
		//456321 Bytes = 445.63 KB
		sizeInBytes = 456321;
		expectedHumanText = "445.63 KB";
		Assert.assertEquals(expectedHumanText, UnitConverter.bytesToHuman(sizeInBytes));

		//896789489 Bytes = 855.25 MB
		sizeInBytes = 896789489;
		expectedHumanText = "855.25 MB";
		Assert.assertEquals(expectedHumanText, UnitConverter.bytesToHuman(sizeInBytes));

		//989678948985 Bytes = 921.71 GB
		sizeInBytes = 989678948985L;
		expectedHumanText = "921.71 GB";
		Assert.assertEquals(expectedHumanText, UnitConverter.bytesToHuman(sizeInBytes));

		//1698296768946289482 Bytes = 1,544,591.91 TB
		sizeInBytes = 1698296768946289482L;
		expectedHumanText = "1,544,591.91 TB";
		Assert.assertEquals(expectedHumanText, UnitConverter.bytesToHuman(sizeInBytes));					
	}

}
