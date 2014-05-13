package com.vikingbrain.nmt.operations.system;

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

import com.vikingbrain.nmt.responses.system.ResponseListNmtServices;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class ListNmtServicesOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(ListNmtServicesOperationTest.class);
	
	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.LIST_NMT_SERVICES_DOCUMENTATION_EXAMPLE },				
				{ XmlTestFiles.LIST_NMT_SERVICES_A200 }
				};
	    return Arrays.asList(data);
	}

	public ListNmtServicesOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void listNmtServicesTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		ListNmtServicesOperation operation =  theDavidBoxClient.getModuleSystem().
				buildListNmtServicesOperation();		       
        
		ResponseListNmtServices response = operation.execute();
		
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());

        for (String element : response.getServices()){
            Assert.assertFalse("".equals(element));
            logger.debug(element.toString());
        }        
        
	}

}
