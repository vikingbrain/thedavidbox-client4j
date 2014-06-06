package com.vikingbrain.nmt.operations.playback;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.responses.playback.ObjectSubtitle;
import com.vikingbrain.nmt.responses.playback.ObjectSubtitleList;
import com.vikingbrain.nmt.responses.playback.ResponseListSubtitleVod;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListSubtitleVodOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListSubtitleVodOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_SUBTITLE_VOD_DOCUMENTATION_EXAMPLE_DVD_MEDIA_FORMAT },				
				{ XmlTestFiles.LIST_SUBTITLE_VOD_DOCUMENTATION_EXAMPLE_NON_DVD_MEDIA_FORMAT },
				{ XmlTestFiles.LIST_SUBTITLE_VOD_A200 }
				};
	    return Arrays.asList(data);
	}

	public ListSubtitleVodOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ListSubtitleVodOperation operation = theDavidBoxClient.getModulePlayback().
				buildListSubtitleVodOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseListSubtitleVod response = operation.execute();		

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());

        logger.info(response.toString());
        
        //Check data inside response
        Assert.assertTrue(response.getNumberOfTrack() > 0);        
        ObjectSubtitleList subtitleList = response.getSubtitleList();
        List<ObjectSubtitle> subtitles = subtitleList.getSubtitles();
        Assert.assertTrue(subtitles.size() > 0);
        for(ObjectSubtitle subtitle : subtitleList.getSubtitles()){
        	Assert.assertFalse("".equals(subtitle.getTrack()));
        }
        
	}

}