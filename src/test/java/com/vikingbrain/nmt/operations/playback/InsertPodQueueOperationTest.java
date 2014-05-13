package com.vikingbrain.nmt.operations.playback;

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

import com.vikingbrain.nmt.responses.playback.ResponseInsertPodQueue;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.MockConstants;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class InsertPodQueueOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(InsertPodQueueOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.INSERT_POD_QUEUE_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.INSERT_POD_QUEUE_A200 }
				};
	    return Arrays.asList(data);
	}

	public InsertPodQueueOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void insetPodQueueTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		InsertPodQueueOperation operation = theDavidBoxClient.getModulePlayback().
				buildInsertPodQueueOperation(MockConstants.FILE_PATH_PHOTO);
		
		//All the info for the operation
		logger.info(operation.toString());

		ResponseInsertPodQueue response =  operation.execute();			

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
	}

}
