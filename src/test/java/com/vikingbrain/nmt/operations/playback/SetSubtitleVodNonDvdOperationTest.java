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
package com.vikingbrain.nmt.operations.playback;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.responses.ResponseSimple;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class SetSubtitleVodNonDvdOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(SetSubtitleVodNonDvdOperationTest.class);
	
	private String xmlFileName;
	
	private static final String TRACK_MOCK = "1";
	private static final String COLOR_MOCK = "red";
	private static final int FONT_SIZE_MOCK = 40;
	private static final int POSITION_MOCK = 30;
	private static final String ENCODING_MOCK = "english";
	private static final String TIME_OFFSET_MOCK = "20.5";
	

	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.SET_SUBTITLE_VOD_NON_DVD_DOCUMENTATION_EXAMPLE },
				{ XmlTestFiles.SET_SUBTITLE_VOD_NON_DVD_A200 }
				};
	    return Arrays.asList(data);
	}

	public SetSubtitleVodNonDvdOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		SetSubtitleVodNonDvdOperation operation = theDavidBoxClient.getModulePlayback().
				buildSetSubtitleVodNonDvdOperation(TRACK_MOCK, COLOR_MOCK, FONT_SIZE_MOCK, POSITION_MOCK, ENCODING_MOCK, TIME_OFFSET_MOCK);
		
		//All the info for the operation
		logger.info(operation.toString());

		ResponseSimple response =  operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
	}

}
