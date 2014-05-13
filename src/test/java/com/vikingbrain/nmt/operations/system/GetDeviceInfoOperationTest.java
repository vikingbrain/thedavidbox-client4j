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

import com.vikingbrain.nmt.responses.system.ResponseGetDeviceInfo;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class GetDeviceInfoOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(GetDeviceInfoOperationTest.class);

	private static final String DEVICE_NAME_MOCK = "SATA_DISK_MOCK";
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.GET_DEVICE_INFO_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles. GET_DEVICE_INFO_A200 },
				{ XmlTestFiles. GET_DEVICE_INFO_C200 }
				};
	    return Arrays.asList(data);
	}

	public GetDeviceInfoOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void getDeviceInfotest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		GetDeviceInfoOperation operation = theDavidBoxClient.getModuleSystem().
				buildGetDeviceInfoOperation(DEVICE_NAME_MOCK);
		
		//All the info for the operation
		logger.info(operation.toString());

		ResponseGetDeviceInfo response =  operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());

        Assert.assertFalse("".equals(response.getAccessPath()));
        Assert.assertFalse("".equals(response.getFreeDiskSpace()));
        Assert.assertFalse("".equals(response.getSize()));
        Assert.assertFalse("".equals(response.getType()));
        
        logger.info(response.toString());
	}

}
