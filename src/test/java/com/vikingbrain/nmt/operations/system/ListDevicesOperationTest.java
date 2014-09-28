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
package com.vikingbrain.nmt.operations.system;

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

import com.vikingbrain.nmt.responses.system.ObjectDevice;
import com.vikingbrain.nmt.responses.system.ResponseListDevices;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListDevicesOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListDevicesOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_DEVICES_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.LIST_DEVICES_A200 },
				{ XmlTestFiles.LIST_DEVICES_C200 }
				};
	    return Arrays.asList(data);
	}

	public ListDevicesOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void listDevicesTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ListDevicesOperation operation = theDavidBoxClient.getModuleSystem().
				buildListDevicesOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseListDevices response = operation.execute();		
        
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());

        Assert.assertNotNull(response.getDevices());        
        Assert.assertFalse(response.getDevices().isEmpty());

        for (ObjectDevice element : response.getDevices()){
            Assert.assertFalse("".equals(element.getName()));
            Assert.assertFalse("".equals(element.getType()));
            Assert.assertFalse("".equals(element.getUrl()));

            logger.debug(element.toString());
        }
	}

}
