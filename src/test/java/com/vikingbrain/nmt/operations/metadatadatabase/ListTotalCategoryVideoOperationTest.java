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
import com.vikingbrain.nmt.responses.metadatadatabase.ObjectCategory;
import com.vikingbrain.nmt.responses.metadatadatabase.ResponseListTotalCategoryVideo;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.MockConstants;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListTotalCategoryVideoOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListTotalCategoryVideoOperationTest.class);
	
	private static final VideoFilter VIDEO_FILTER_MOCK = VideoFilter.MOVIE;
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_TOTAL_CATEGORY_VIDEO_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.LIST_TOTAL_CATEGORY_VIDEO_A200 }
				};
	    return Arrays.asList(data);
	}

	public ListTotalCategoryVideoOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ListTotalCategoryVideoOperation operation = theDavidBoxClient.getModuleMetadataDatabase().
				buildListTotalCategoryVideoOperation(MockConstants.DATABASE_PATH, VIDEO_FILTER_MOCK);		
		
		//All the info for the operation
		logger.info(operation.toString());
		
		ResponseListTotalCategoryVideo response =  operation.execute();        

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());                
        
        //Fields
        Assert.assertNotNull(response.getTotal());
        
        for (ObjectCategory element : response.getCategories()){
            Assert.assertFalse("".equals(element.getId()));
            Assert.assertFalse("".equals(element.getName()));
            logger.debug(element.getId());
            logger.debug(element.getName());
        }
        
	}
	
}