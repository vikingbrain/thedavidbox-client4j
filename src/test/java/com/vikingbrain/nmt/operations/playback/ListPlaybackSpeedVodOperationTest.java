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

import com.vikingbrain.nmt.responses.playback.ResponseListPlaybackSpeedVod;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListPlaybackSpeedVodOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListPlaybackSpeedVodOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_PLAYBACK_SPEED_VOD_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.LIST_PLAYBACK_SPEED_VOD_A200 }
				};
	    return Arrays.asList(data);
	}

	public ListPlaybackSpeedVodOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ListPlaybackSpeedVodOperation operation = theDavidBoxClient.getModulePlayback().
				buildListPlaybackSpeedVodOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseListPlaybackSpeedVod response = operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());

        logger.info(response.toString());
	}

}
