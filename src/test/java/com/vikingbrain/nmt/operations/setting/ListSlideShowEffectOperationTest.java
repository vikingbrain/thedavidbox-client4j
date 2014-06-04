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

import com.vikingbrain.nmt.responses.setting.ResponseListSlideShowEffect;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;
import com.vikingbrain.nmt.util.TypeReturnValue;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListSlideShowEffectOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListSlideShowEffectOperationTest.class);

	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_SLIDE_SHOW_EFFECT_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.LIST_SLIDE_SHOW_EFFECT_A200 }
				};
	    return Arrays.asList(data);
	}

	public ListSlideShowEffectOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void checkNmtExistTest() throws Exception {
		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);		
				
		ListSlideShowEffectOperation operation = theDavidBoxClient.getModuleSetting().
				buildListSlideShowEffectOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseListSlideShowEffect response = operation.execute();
		
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
        Assert.assertEquals(response.getTypeReturnValue(), TypeReturnValue.SUCCESS);
        
        //Response information
        logger.info(response.toString());
        
        Assert.assertNotNull(response.getStyles());        
        Assert.assertFalse(response.getStyles().isEmpty());

        for (String language : response.getStyles()){
        	//Requires fields
            Assert.assertFalse("".equals(language));
            logger.info("Style: " + language);            
        }
        
	}

}
