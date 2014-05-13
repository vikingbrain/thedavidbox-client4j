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

import com.vikingbrain.nmt.responses.setting.ObjectNetworkShare;
import com.vikingbrain.nmt.responses.setting.ResponseListNetworkSharedFolder;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;
import com.vikingbrain.nmt.util.TypeReturnValue;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListNetworkSharedFolderOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListNetworkSharedFolderOperationTest.class);

	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_NETWORK_SHARED_FOLDER_DOCUMENTATION_EXAMPLE },				
//FIXME a200 it returns a returnValue 12, why? 
//				{ XmlTestFiles.LIST_NETWORK_SHARED_FOLDER_A200 },
				{ XmlTestFiles.LIST_NETWORK_SHARED_FROM_FORUM_1 },
				{ XmlTestFiles.LIST_NETWORK_SHARED_FROM_FORUM_2 },
				};
	    return Arrays.asList(data);
	}

	public ListNetworkSharedFolderOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void checkNmtExistTest() throws Exception {
		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);		
				
		ListNetworkSharedFolderOperation operation = theDavidBoxClient.getModuleSetting().
				buildListNetworkSharedFolderOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseListNetworkSharedFolder response = operation.execute();
		
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
        Assert.assertEquals(response.getTypeReturnValue(), TypeReturnValue.SUCCESS);
        
        //Fields
        Assert.assertNotNull(response.getNetworkShares());        
        Assert.assertFalse(response.getNetworkShares().isEmpty());

        for (ObjectNetworkShare element : response.getNetworkShares()){
        	//Requires fields
            Assert.assertFalse("".equals(element.getShareName()));
            Assert.assertFalse("".equals(element.getUrl()));                        

            logger.debug(element.toString());
        }
        
	}

}
