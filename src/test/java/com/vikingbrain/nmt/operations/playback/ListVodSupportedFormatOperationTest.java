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

import com.vikingbrain.nmt.responses.playback.ResponseListSupportedFormat;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListVodSupportedFormatOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListVodSupportedFormatOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_VOD_SUPPORTED_FORMAT_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles. LIST_VOD_SUPPORTED_FORMAT_A200 }
				};
	    return Arrays.asList(data);
	}

	public ListVodSupportedFormatOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ListVodSupportedFormatOperation operation = theDavidBoxClient.getModulePlayback().
				buildListVodSupportedFormatOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseListSupportedFormat response = operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());

        logger.info(response.toString());
//        for (ObjectQueueElement element : response.getQueue()){
//            Assert.assertFalse("".equals(element.getFullPath()));
//            Assert.assertFalse("".equals(element.getIndex()));
//        }
	}

}
