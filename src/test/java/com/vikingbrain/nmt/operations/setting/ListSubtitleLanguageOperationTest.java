package com.vikingbrain.nmt.operations.setting;

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

import com.vikingbrain.nmt.responses.setting.ResponseListLanguage;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;
import com.vikingbrain.nmt.util.TypeReturnValue;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListSubtitleLanguageOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListSubtitleLanguageOperationTest.class);

	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_SUBTITLE_LANGUAGE_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.LIST_SUBTITLE_LANGUAGE_A200 }
				};
	    return Arrays.asList(data);
	}

	public ListSubtitleLanguageOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void checkNmtExistTest() throws Exception {
		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);		
				
		ListSubtitleLanguageOperation operation = theDavidBoxClient.getModuleSetting().
				buildListSubtitleLanguageOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseListLanguage response = operation.execute();
		
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
        Assert.assertEquals(response.getTypeReturnValue(), TypeReturnValue.SUCCESS);
        
        //Response information
        logger.info(response.toString());
        
        Assert.assertNotNull(response.getLanguages());        
        Assert.assertFalse(response.getLanguages().isEmpty());

        for (String language : response.getLanguages()){
        	//Requires fields
            Assert.assertFalse("".equals(language));
            logger.debug("Language: " + language);            
        }
        
	}

}
