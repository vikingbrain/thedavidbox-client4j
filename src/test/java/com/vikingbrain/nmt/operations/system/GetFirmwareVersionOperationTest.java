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

import com.vikingbrain.nmt.responses.system.ResponseGetFirmwareVersion;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class GetFirmwareVersionOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(GetFirmwareVersionOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.GET_FIRMWARE_VERSION_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.GET_FIRMWARE_VERSION_A200 }
				};
	    return Arrays.asList(data);
	}

	public GetFirmwareVersionOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void getDeviceInfotest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		GetFirmwareVersionOperation operation = theDavidBoxClient.getModuleSystem().
				buildGetFirmwareVersionOperation();
		
		//All the info for the operation
		logger.info(operation.toString());

		ResponseGetFirmwareVersion response =  operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());

        Assert.assertFalse("".equals(response.getFirmwareVersion()));
        
        logger.debug(response.getFirmwareVersion());
	}

}
