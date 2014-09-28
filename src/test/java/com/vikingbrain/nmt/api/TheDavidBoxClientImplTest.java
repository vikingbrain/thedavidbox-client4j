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
package com.vikingbrain.nmt.api;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.client.TheDavidBoxClient;
import com.vikingbrain.nmt.client.impl.TheDavidBoxClientImpl;
import com.vikingbrain.nmt.test.util.MockConstants;
import com.vikingbrain.nmt.util.ClientOptions;
import com.vikingbrain.nmt.util.MetadataDatabase;

/**
 * 
 * @author vikingBrain
 */
public class TheDavidBoxClientImplTest {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(TheDavidBoxClientImplTest.class);

	@Test
	public void constructorWithRemoteHostTest(){
		//Client with IP
		TheDavidBoxClient theDavidBoxClient = new TheDavidBoxClientImpl(MockConstants.IP);		
		Assert.assertTrue(MockConstants.IP.equals(theDavidBoxClient.getRemoteHost()));
		
		//Create a client with your custom client options
		ClientOptions clientOptions = new ClientOptions.Builder().build();
		theDavidBoxClient = new TheDavidBoxClientImpl(MockConstants.IP, clientOptions);
		Assert.assertTrue(MockConstants.IP.equals(theDavidBoxClient.getRemoteHost()));		
	}	

	@Test
	public void getAllMetadadaDatabasesTest(){
		TheDavidBoxClient theDavidBoxClient = new TheDavidBoxClientImpl(MockConstants.IP);
		
		List<MetadataDatabase> metadataDatabases = theDavidBoxClient.getAllMetadadaDatabases();
		
		//There should not be any metadata database for the IP_MOCK
		Assert.assertNotNull(metadataDatabases);
//		Assert.assertTrue(metadataDatabases.isEmpty());
		
        for (MetadataDatabase element : metadataDatabases){
        	logger.info(element.toString());
        }
	}	

	@Test
	public void changeRemoteHostTest() {
				
		TheDavidBoxClient theDavidBoxClient = new TheDavidBoxClientImpl(MockConstants.IP);
		Assert.assertTrue(MockConstants.IP.equals(theDavidBoxClient.getRemoteHost()));
		logger.info("IP: " + theDavidBoxClient.getRemoteHost());
		
		//change the remote host
		theDavidBoxClient.setRemoteHost(MockConstants.IP_2);
		Assert.assertTrue(MockConstants.IP_2.equals(theDavidBoxClient.getRemoteHost()));			
		logger.info("IP changed: " + theDavidBoxClient.getRemoteHost());		
	}
		
}
