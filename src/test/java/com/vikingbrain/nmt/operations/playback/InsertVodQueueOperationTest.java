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

import com.vikingbrain.nmt.responses.playback.ResponseInsertVodQueue;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.MockConstants;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class InsertVodQueueOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(InsertVodQueueOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.INSERT_VOD_QUEUE_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.INSERT_VOD_QUEUE_A200 }
				};
	    return Arrays.asList(data);
	}

	public InsertVodQueueOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void insetVodQueueTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		InsertVodQueueOperation operation = theDavidBoxClient.getModulePlayback().
				buildInsertVodQueueOperation(MockConstants.FILE_PATH_VIDEO);
		
		//All the info for the operation
		logger.info(operation.toString());

		ResponseInsertVodQueue response =  operation.execute();			

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
	}

}
