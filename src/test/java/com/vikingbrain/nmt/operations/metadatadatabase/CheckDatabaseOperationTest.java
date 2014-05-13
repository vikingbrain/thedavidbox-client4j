package com.vikingbrain.nmt.operations.metadatadatabase;

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

import com.vikingbrain.nmt.responses.metadatadatabase.ResponseCheckDatabase;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.MockConstants;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class CheckDatabaseOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(CheckDatabaseOperationTest.class);
		
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.CHECK_DATABASE_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.CHECK_DATABASE_A200 },
				{ XmlTestFiles.CHECK_DATABASE_FROM_FORUM_1 },
				};
	    return Arrays.asList(data);
	}

	public CheckDatabaseOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		CheckDatabaseOperation operation = theDavidBoxClient.getModuleMetadataDatabase().
				buildCheckDatabaseOperation(MockConstants.DEVICE_URL);	
		
		//All the info for the operation
		logger.info(operation.toString());
		
		ResponseCheckDatabase response =  operation.execute();        

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());                
        
        //Fields                
        Assert.assertFalse("".equals(response.getDatabasePath()));	            
        logger.info(response.toString());        
	}
	
}