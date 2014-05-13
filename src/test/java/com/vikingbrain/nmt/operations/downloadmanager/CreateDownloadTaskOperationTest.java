package com.vikingbrain.nmt.operations.downloadmanager;

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

import com.vikingbrain.nmt.responses.ResponseSimple;
import com.vikingbrain.nmt.test.util.AbstractClientMock;
import com.vikingbrain.nmt.test.util.XmlTestFiles;

/**
 * 
 * @author vikingBrain
 */
@RunWith(value = Parameterized.class)
public class CreateDownloadTaskOperationTest extends AbstractClientMock {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(CreateDownloadTaskOperationTest.class);

	private static final String SOURCE_MOCK = "http://movie.torrent";
	private static final String FILENAME_MOCK = "MovieName";

	private String xmlFileName;
	
	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {		
		Object[][] data = new Object[][] { 
				{ XmlTestFiles.CREATE_DOWNLOAD_TASK_DOCUMENTATION_EXAMPLE }
				};
	    return Arrays.asList(data);
	}
		
	public CreateDownloadTaskOperationTest(String _xmlFileName) throws FileNotFoundException {
		xmlFileName = _xmlFileName;
	}

	@Test
	public void executeTest() throws Exception {

		//Put the expected response in the mock of the http client
		setXmlFileResponseInHttpMockClient(xmlFileName);

		CreateDownloadTaskOperation operation = theDavidBoxClient.getModuleDownloadManager().
				buildCreateDownloadTaskOperation(SOURCE_MOCK, FILENAME_MOCK);		
		
		//All the info for the operation
		logger.info(operation.toString());
		
		ResponseSimple response =  operation.execute();
        
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isValid());
	}

}
