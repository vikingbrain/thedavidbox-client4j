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

import com.vikingbrain.nmt.responses.playback.ObjectQueueElement;
import com.vikingbrain.nmt.responses.playback.ResponseListAodQueueInfo;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListAodQueueInfoOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListAodQueueInfoOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_AOD_QUEUE_INFO_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles. LIST_AOD_QUEUE_INFO_A200 },
				{ XmlTestFiles. LIST_AOD_QUEUE_INFO_A200_TEST2 }
				};
	    return Arrays.asList(data);
	}

	public ListAodQueueInfoOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void listAodQueueInfoTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ListAodQueueInfoOperation operation = theDavidBoxClient.getModulePlayback().
				buildListAodQueueInfoOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseListAodQueueInfo response = operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());

        for (ObjectQueueElement element : response.getQueue()){
            Assert.assertFalse("".equals(element.getFullPath()));
            Assert.assertFalse("".equals(element.getIndex()));
            Assert.assertFalse("".equals(element.getTitle()));
        }
	}

}
