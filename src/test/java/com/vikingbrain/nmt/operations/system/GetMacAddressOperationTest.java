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

import com.vikingbrain.nmt.responses.system.ResponseGetMacAddress;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class GetMacAddressOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(GetMacAddressOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.GET_MAC_ADDRESS_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.GET_MAC_ADDRESS_A200 }
				};
	    return Arrays.asList(data);
	}

	public GetMacAddressOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void getDeviceInfotest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		GetMacAddressOperation operation = theDavidBoxClient.getModuleSystem().
				buildGetMacAddressOperation();
		
		//All the info for the operation
		logger.info(operation.toString());

		ResponseGetMacAddress response =  operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());

        Assert.assertFalse("".equals(response.getMacAddress()));
        
        logger.debug(response.getMacAddress());
	}

}
