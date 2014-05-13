package com.vikingbrain.nmt.controller;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.controller.impl.RemoteHttpServiceImpl;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * Tests for the RemoteHttpServiceImpl class.
 * @author vikingBrain
 */
public class RemoteHttpServiceImplTest {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(RemoteHttpServiceImplTest.class);

	/** The remote http service. */
	protected RemoteHttpService remoteHttpService;

	@Before
	public void setUp() throws Exception {
		// Create the remoteHttpService
		remoteHttpService = new RemoteHttpServiceImpl();
		
		logger.debug("RemoteHttpService created");
	}
		
	/**
	 * No host name in the request.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void invalidHostTest() throws TheDavidBoxClientException {
		//Call with no host name
		remoteHttpService.sendGetRequest("http://@/stuff");
	}
	
}
