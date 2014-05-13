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

import com.vikingbrain.nmt.client.modules.ModuleSystem;
import com.vikingbrain.nmt.responses.ResponseSimple;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class SendKeyOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(SendKeyOperationTest.class);

	private static final String KEY_NAME_MOCK = "play";
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.SEND_KEY_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles. SEND_KEY_A200 }
				};
	    return Arrays.asList(data);
	}

	public SendKeyOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void sendKeyTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		
		ModuleSystem moduleSystem = theDavidBoxClient.getModuleSystem();		
		SendKeyOperation operation = moduleSystem.buildSendKeyOperation(KEY_NAME_MOCK);
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseSimple response = operation.execute();

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
	}

}
