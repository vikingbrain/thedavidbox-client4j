package com.vikingbrain.nmt.operations.file;

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

import com.vikingbrain.nmt.responses.file.ResponseGetUserStorageFileInfo;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.MockConstants;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class GetUserStorageFileInfoOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(GetUserStorageFileInfoOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.GET_USER_STORAGE_FILE_INFO_A200 },				
				{ XmlTestFiles.GET_USER_STORAGE_FILE_INFO_DOCUMENTATION_EXAMPLE },
				};
	    return Arrays.asList(data);
	}
		
	public GetUserStorageFileInfoOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		GetUserStorageFileInfoOperation operation = theDavidBoxClient.getModuleFile().
				buildGetUserStorageFileInfoOperation(MockConstants.FULL_PATH_VIDEO_FILE);				
		
		//All the info for the operation
		logger.info(operation.toString());
		
		ResponseGetUserStorageFileInfo response =  operation.execute();        

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());                
                      
        //Fields
        logger.debug(response.toString());
                     	
    	Assert.assertFalse("".equals(response.getFileSize()));
    	Assert.assertFalse("".equals(response.getName()));
    	Assert.assertFalse("".equals(response.getMimeType()));
    	Assert.assertFalse("".equals(response.getPermission()));
                            
	}
	
}