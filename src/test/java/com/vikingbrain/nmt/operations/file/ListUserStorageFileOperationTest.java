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

import com.vikingbrain.nmt.responses.file.ObjectFile;
import com.vikingbrain.nmt.responses.file.ResponseListUserStorageFile;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.MockConstants;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListUserStorageFileOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListUserStorageFileOperationTest.class);

	private static final int OFFSET_MOCK = 0;
	private static final int NUMBER_ELEMENTS_MOCK = 100;
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_USER_STORAGE_FILE_A200 },				
				{ XmlTestFiles.LIST_USER_STORAGE_FILE_DOCUMENTATION_EXAMPLE },
				{ XmlTestFiles.LIST_USER_STORAGE_FROM_FORUM_1 },
				};
	    return Arrays.asList(data);
	}
	
	public ListUserStorageFileOperationTest(String _xmlFileName) throws FileNotFoundException {	
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ListUserStorageFileOperation operation = theDavidBoxClient.getModuleFile().
				buildListUserStorageFileOperation(MockConstants.FULL_PATH, OFFSET_MOCK, NUMBER_ELEMENTS_MOCK);
		
		//All the info for the operation
		logger.info(operation.toString());
		
		ResponseListUserStorageFile response =  operation.execute();        

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());                
                      
        //Fields
        logger.debug(response.toString());
        
        Assert.assertNotNull(response.getFileList());        
        Assert.assertFalse(response.getFileList().isEmpty());
        
        for (ObjectFile element : response.getFileList()){
        	
        	Assert.assertFalse("".equals(element.getName()));
        	Assert.assertFalse("".equals(element.getPath()));
        	Assert.assertFalse("".equals(element.getModifyDate()));
        	Assert.assertFalse("".equals(element.getSize()));
                            
            logger.info(element.toString());
        }
	}
	
}