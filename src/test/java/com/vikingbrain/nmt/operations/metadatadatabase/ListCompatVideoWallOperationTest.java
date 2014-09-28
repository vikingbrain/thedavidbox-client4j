/*
 * Copyright 2011-2014 Rafael Iñigo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

import com.vikingbrain.nmt.operations.parameters.VideoFilter;
import com.vikingbrain.nmt.responses.metadatadatabase.ObjectCategoryVideoWall;
import com.vikingbrain.nmt.responses.metadatadatabase.ObjectVideo;
import com.vikingbrain.nmt.responses.metadatadatabase.ResponseListCompatVideoWall;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.MockConstants;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListCompatVideoWallOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListCompatVideoWallOperationTest.class);
	
	private static final int START_INDEX_MOCK = 0;
	private static final int END_INDEX_MOCK = 4;
	private static final int MAX_THUMBNAILS_RETURNED_MOCK = 8;
	private static final VideoFilter VIDEO_FILTER_MOCK = VideoFilter.MOVIE;
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_COMPAT_VIDEO_WALL_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.LIST_COMPAT_VIDEO_WALL_VIDEO_A200 }
				};
	    return Arrays.asList(data);
	}

	public ListCompatVideoWallOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ListCompatVideoWallOperation operation = theDavidBoxClient.getModuleMetadataDatabase().
				buildListCompatVideoWallOperation(MockConstants.DATABASE_PATH, START_INDEX_MOCK, END_INDEX_MOCK, MAX_THUMBNAILS_RETURNED_MOCK, VIDEO_FILTER_MOCK);	
		
		//All the info for the operation
		logger.info(operation.toString());
		
		ResponseListCompatVideoWall response =  operation.execute();        

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());                
        
        //Fields                
        Assert.assertNotNull(response.getCategoriesVideoWall());        
        Assert.assertFalse(response.getCategoriesVideoWall().isEmpty());
        
        for (ObjectCategoryVideoWall element : response.getCategoriesVideoWall()){
        	
            Assert.assertNotNull(element.getVideos());        
            Assert.assertFalse(element.getVideos().isEmpty());
        	
        	for (ObjectVideo video : element.getVideos()){
        			
	            Assert.assertFalse("".equals(video.getId()));
	            Assert.assertFalse("".equals(video.getThreeD()));
	            Assert.assertFalse("".equals(video.getThumbnail()));
	            
	            logger.debug("Video: ");
	            logger.debug(" Id: " + video.getId());
	            logger.debug(" Three_d: " + video.getThreeD());
	            logger.debug(" Thumbnail: " + video.getThumbnail());
        	}
        }
        
	}
	
}