package com.vikingbrain.nmt.operations.deployment;

import java.io.FileNotFoundException;
import java.io.IOException;
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
import com.vikingbrain.nmt.test.util.MockConstants;
import com.vikingbrain.nmt.test.util.XmlTestFiles;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class SetDatabaseOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(SetDatabaseOperationTest.class);

	private static final String KEY_MOCK = "1";
	private static final String NAME_MOCK = "name";
	private static final String VALUE_MOCK = "12";
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.SET_DATABASE_DOCUMENTATION_EXAMPLE }				
				};
	    return Arrays.asList(data);
	}
		
	public SetDatabaseOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws TheDavidBoxClientException, IOException { 

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);
		
		SetDatabaseOperation operation = theDavidBoxClient.getModuleDeployment().
				buildSetDatabaseOperation(MockConstants.DATABASE_PATH, KEY_MOCK, NAME_MOCK, VALUE_MOCK);
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseSimple response = operation.execute();
		
		Assert.assertNotNull(response);
		Assert.assertTrue(response.isValid());

	}

}
