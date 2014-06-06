package com.vikingbrain.nmt.operations.downloadmanager;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.internal.util.collections.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.responses.downloadmanager.ResponseListDownloadTasks;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;
import com.vikingbrain.nmt.util.TypeReturnValue;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListDownloadTasksOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListDownloadTasksOperationTest.class);

	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_DOWNLOAD_TASKS_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.LIST_DOWNLOAD_TASKS_A200 },
				{ XmlTestFiles.LIST_DOWNLOAD_TASKS_A200_ERROR_510 }
				};
	    return Arrays.asList(data);
	}
	
	public ListDownloadTasksOperationTest(String _xmlFileName) throws FileNotFoundException {	
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ListDownloadTasksOperation operation = theDavidBoxClient.getModuleDownloadManager().
				buildListDownloadTasksOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
		
		ResponseListDownloadTasks response =  operation.execute();        

        Assert.assertNotNull(response);
        
        if(XmlTestFiles.LIST_DOWNLOAD_TASKS_A200_ERROR_510.equals(xmlFileName)){
        	//Excepted error code 510 (No torrent tasks existed)
	        Assert.assertFalse(response.isValid());
	        Assert.assertEquals(response.getTypeReturnValue(), TypeReturnValue.ERROR_CODE_510);
	        //The list of task is empty
	        Assert.assertTrue(response.getTaskIds().isEmpty());
	        
        } else {        
        	Assert.assertTrue(response.isValid());                                      
	        //Content in the response
	        Assert.assertNotNull(response.getTaskIds());
        }
        logger.info(response.toString());
	}
	
}