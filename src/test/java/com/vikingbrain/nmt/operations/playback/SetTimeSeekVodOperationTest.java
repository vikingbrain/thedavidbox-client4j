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
public class SetTimeSeekVodOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(SetTimeSeekVodOperationTest.class);
	
	private String xmlFileName;
	
	private static final int HOURS_MOCK = 0;
	private static final int MINUTES_MOCK = 1;
	private static final int SECONDS_MOCK = 16;

	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.SET_TIME_SEEK_VOD_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.SET_TIME_SEEK_VOD_A200 }
				};
	    return Arrays.asList(data);
	}

	public SetTimeSeekVodOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		SetTimeSeekVodOperation operation = theDavidBoxClient.getModulePlayback().
				buildSetTimeSeekVodOperation(HOURS_MOCK, MINUTES_MOCK, SECONDS_MOCK);
		
		//All the info for the operation
		logger.info(operation.toString());

		ResponseSimple response =  operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
	}

}
