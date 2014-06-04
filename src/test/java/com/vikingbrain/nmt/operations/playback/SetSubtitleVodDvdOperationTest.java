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
public class SetSubtitleVodDvdOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(SetSubtitleVodDvdOperationTest.class);
	
	private String xmlFileName;
	
	private static final String TRACK_MOCK = "english";

	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.SET_SUBTITLE_VOD_DVD_DOCUMENTATION_EXAMPLE }				
				};
	    return Arrays.asList(data);
	}

	public SetSubtitleVodDvdOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		SetSubtitleVodDvdOperation operation = theDavidBoxClient.getModulePlayback().
				buildSetSubtitleVodDvdOperation(TRACK_MOCK);
		
		//All the info for the operation
		logger.info(operation.toString());

		ResponseSimple response =  operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
	}

}
