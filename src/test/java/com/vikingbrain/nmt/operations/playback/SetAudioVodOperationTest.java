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

import com.vikingbrain.nmt.responses.ResponseSimple;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class SetAudioVodOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(SetAudioVodOperationTest.class);
	
	private String xmlFileName;
	
	private static final String AUDIO_VALUE_MOCK = "1";

	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.SET_AUDIO_VOD_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.SET_AUDIO_VOD_A200 }
				};
	    return Arrays.asList(data);
	}

	public SetAudioVodOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		SetAudioVodOperation operation = theDavidBoxClient.getModulePlayback().
				buildSetAudioVodOperation(AUDIO_VALUE_MOCK);
		
		//All the info for the operation
		logger.info(operation.toString());

		ResponseSimple response =  operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
	}

}
