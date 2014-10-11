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

import com.vikingbrain.nmt.client.modules.ModulePlayback;
import com.vikingbrain.nmt.responses.playback.ResponseGetCurrentVodInfo;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class GetCurrentVodInfoOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(GetCurrentVodInfoOperationTest.class);

	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.GET_CURRENT_VOD_INFO_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.GET_CURRENT_VOD_INFO_A200_TEST1 },
				{ XmlTestFiles.GET_CURRENT_VOD_INFO_A200_TEST2 },
				{ XmlTestFiles.GET_CURRENT_VOD_INFO_A200_RETURN_VALUE_1 }				
				};
	    return Arrays.asList(data);
	}

	public GetCurrentVodInfoOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void getCurrentVodInfotest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ModulePlayback modulePlayback = theDavidBoxClient.getModulePlayback();		
		GetCurrentVodInfoOperation operation = modulePlayback.buildGetCurrentVodInfoOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
		
		ResponseGetCurrentVodInfo response =  operation.execute();
		
        Assert.assertNotNull(response);

        Assert.assertFalse("".equals(response.getFullPath()));
        Assert.assertFalse("".equals(response.getCurrentTime()));
        Assert.assertFalse("".equals(response.getTotalTime()));
        
        logger.debug(response.toString());
	}

}
