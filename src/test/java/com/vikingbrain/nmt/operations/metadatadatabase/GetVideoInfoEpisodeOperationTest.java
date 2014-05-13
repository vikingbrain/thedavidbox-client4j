package com.vikingbrain.nmt.operations.metadatadatabase;

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

import com.vikingbrain.nmt.responses.metadatadatabase.ObjectVideoEpisodeInfo;
import com.vikingbrain.nmt.responses.metadatadatabase.ResponseGetVideoInfoEpisode;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.MockConstants;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class GetVideoInfoEpisodeOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(GetVideoInfoEpisodeOperationTest.class);

	private static final String VIDEO_ID_MOCK = "s91";
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.GET_VIDEO_INFO_EPISODE_A200 }		
				};
	    return Arrays.asList(data);
	}
		
	public GetVideoInfoEpisodeOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		GetVideoInfoEpisodeOperation operation = theDavidBoxClient.getModuleMetadataDatabase().
				buildGetVideoInfoEpisodeOperation(MockConstants.DATABASE_PATH, VIDEO_ID_MOCK);		
		
		//All the info for the operation
		logger.info(operation.toString());
		
		ResponseGetVideoInfoEpisode response =  operation.execute();        

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());                
        
        
        
        
        //Fields
        ObjectVideoEpisodeInfo videoInfo = response.getVideoEpisodeInfo();                
        Assert.assertNotNull(videoInfo);
        
        Assert.assertFalse("".equals(videoInfo.getId()));
        Assert.assertFalse("".equals(videoInfo.getPath()));
        
        logger.info(videoInfo.toString());
        
	}
	
}