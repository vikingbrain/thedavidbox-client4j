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
