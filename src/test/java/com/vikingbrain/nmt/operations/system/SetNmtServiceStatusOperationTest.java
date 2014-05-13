package com.vikingbrain.nmt.operations.system;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.vikingbrain.nmt.responses.ResponseSimple;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;
import com.vikingbrain.nmt.util.Constants;
import com.vikingbrain.nmt.util.TypeReturnValue;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class SetNmtServiceStatusOperationTest extends AbstractClientMock {

//	/** Logger. */
//	private static Logger logger = LoggerFactory.getLogger(SetNmtServiceStatusOperationTest.class);

	private static final String SERVICE_NAME_MOCK = "samba";
	private static final boolean STATUS_MOCK = true;
	
	private int testNumber;
	private String xmlFileName;	
	
	@Parameters(name = "{index}: {1}")
	public static Collection<Object[]> data() {				
		Object[][] data = new Object[][] { 
				{ Constants.NUMBER_ZERO, XmlTestFiles.SET_NMT_SERVICE_STATUS_DOCUMENTATION_EXAMPLE },				
				{ Constants.NUMBER_ONE, XmlTestFiles. SET_NMT_SERVICE_STATUS_A200 },
				{ Constants.NUMBER_TWO, XmlTestFiles.SET_NMT_SERVICE_STATUS_A200_TEST2 }
				};
	    return Arrays.asList(data);
	}		

	public SetNmtServiceStatusOperationTest(int _testNumber, String _xmlFileName) throws FileNotFoundException {
		testNumber = _testNumber;
		xmlFileName = _xmlFileName;
	}

	@Test
	public void setNmtServiceStatusTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);
		
		SetNmtServiceStatusOperation operation = theDavidBoxClient.getModuleSystem().
				buildSetNmtServiceStatusOperation(SERVICE_NAME_MOCK, STATUS_MOCK);		
		 
		 ResponseSimple response = operation.execute();

        if(testNumber == 2){
        	//Calling the service for setting a service status true when already es started or
        	//false to turn it off when it's already turned off returns a error type numner 4
	        Assert.assertFalse(response.isValid());
	        Assert.assertEquals(response.getTypeReturnValue(), TypeReturnValue.ERROR_CODE_4);
        } else {
        	//expected test result is OK
	        Assert.assertNotNull(response);
	        Assert.assertTrue(response.isValid());        	
        }
	}

}
