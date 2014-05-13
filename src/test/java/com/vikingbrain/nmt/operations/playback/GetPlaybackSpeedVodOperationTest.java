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

import com.vikingbrain.nmt.responses.playback.ResponseGetPlaybackSpeedVod;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class GetPlaybackSpeedVodOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(GetPlaybackSpeedVodOperationTest.class);

	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.GET_PLAYBACK_SPEED_VOD_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles. GET_PLAYBACK_SPEED_VOD_A200 }
				};
	    return Arrays.asList(data);
	}

	public GetPlaybackSpeedVodOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		//create the operation
		GetPlaybackSpeedVodOperation operation = theDavidBoxClient.getModulePlayback().
				buildGetPlaybackSpeedVodOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
		
		ResponseGetPlaybackSpeedVod response =  operation.execute();
        
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());

        Assert.assertFalse("".equals(response.getSpeed()));
        
        logger.info(response.getSpeed());
	}

}
