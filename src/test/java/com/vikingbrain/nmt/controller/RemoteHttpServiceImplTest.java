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
