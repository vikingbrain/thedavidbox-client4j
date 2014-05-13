package com.vikingbrain.nmt.operations.networkbrowse;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.responses.networkbrowse.ObjectNetworkResource;
import com.vikingbrain.nmt.responses.networkbrowse.ResponseListNetworkResource;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListNetworkResourceOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListNetworkResourceOperationTest.class);

	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_NETWORK_RESOURCE_DOCUMENTATION_EXAMPLE },
				{ XmlTestFiles.LIST_NETWORK_RESOURCE_A200 },
				};
	    return Arrays.asList(data);
	}

	public ListNetworkResourceOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws TheDavidBoxClientException, IOException { 

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);
		
		ListNetworkResourceOperation operation = theDavidBoxClient.getModuleNetworkBrowse().
				buildListNetworkResourceOperation();
		
		//All the info for the operation
		logger.info(operation.toString());
				
		ResponseListNetworkResource response = operation.execute();
		
		Assert.assertNotNull(response);
		Assert.assertTrue(response.isValid());
		
        for (ObjectNetworkResource element : response.getNetworkResources()){
        	
        	Assert.assertFalse("".equals(element.getName()));
        	Assert.assertFalse("".equals(element.getUrl()));
        	
            logger.info(element.toString());
        }

	}

}
