package com.vikingbrain.nmt.controller.impl;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vikingbrain.nmt.controller.RemoteHttpService;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.util.Constants;
import com.vikingbrain.nmt.util.exceptions.TheDavidBoxClientException;

/**
 * 
 * @author vikingBrain
 */
public class RemoteHttpServiceImpl implements RemoteHttpService {

	/** Logger. */
	private static Logger logger = LoggerFactory.getLogger(RemoteHttpServiceImpl.class);

	/** The http client. */
	private HttpClient client;

	/**
	 * Constructor.
	 */
	public RemoteHttpServiceImpl() {
		client = new DefaultHttpClient();
	}

	/**
	 * It encodes special symbols in their valid representations
	 * for http requests.
	 * @param str the text to encode
	 * @return the text encoded for http
	 */
	private String encodeHttpParameter(String str){
		
		//It translates the empty space
		String encoded = str.replaceAll(" ", "%20");
		//It translates the & symbol				
		encoded = encoded.replaceAll("&", "%26");
		
//		encoded = encoded.replaceAll("$", "%24");
//		encoded = encoded.replaceAll("`", "%60");
//		encoded = encoded.replaceAll(":", "%3A");
//		encoded = encoded.replaceAll("<", "%3C");
//		encoded = encoded.replaceAll(">", "%3E");
//		encoded = encoded.replaceAll("[", "%5B");
//		encoded = encoded.replaceAll("]", "%5D");
//		encoded = encoded.replaceAll("{", "%7B");
//		encoded = encoded.replaceAll("}", "%7D");
		
		return encoded;
	}

	/**
	 * It uses the parameters to build the http arguments with name and value.
	 * @param params all the parameters with name and value
	 * @return the stringbuffer with the http arguments ready to be added to a http request
	 */
	private StringBuffer buildEncodedParameters(LinkedHashMap<String, String> params) {
		StringBuffer parametersUrlGet = new StringBuffer("");

		if (null != params) {
			for (String key : params.keySet()) {

				String value = params.get(key);
				String encodedParameter = encodeHttpParameter(value);

				// It builds something like
				// "&param1=file%20name%26blues for entry "param1","file name&blues"
				parametersUrlGet.append("&").append(key).append("=").append(encodedParameter);
			}
		}
		return parametersUrlGet;
	}

	/** {@inheritDoc} */
	public String buildGetRequest(String remoteHost, OperationType operationType, LinkedHashMap<String, String> arguments) {
		String moduleName = operationType.getModuleName();
		String operationName = operationType.getOperationName();
		
		String urlGet = new StringBuffer("http://").append(remoteHost)
				.append(":").append(Constants.DAVIDBOX_PORT).append("/")
				.append(moduleName).append("?arg0=")
				.append(operationName).append(buildEncodedParameters(arguments))
				.toString();
		return urlGet;
	}	
	
	/** {@inheritDoc} */
	public String sendGetRequest(String url) throws TheDavidBoxClientException {
		// throws ClientProtocolException, IOException{

		String response = "";

		HttpGet get = new HttpGet(url);

		logger.debug("GET Request: " + url);

		HttpResponse responseGet = null;
		try {
			responseGet = client.execute(get);
		} catch (ClientProtocolException e) {
			throw new TheDavidBoxClientException(e);
		} catch (IOException e) {
			throw new TheDavidBoxClientException(e);
		}
		HttpEntity resEntityGet = responseGet.getEntity();
		if (resEntityGet != null) {
			try {
				response = EntityUtils.toString(resEntityGet);
			} catch (ParseException e) {
				throw new TheDavidBoxClientException(e);
			} catch (IOException e) {
				throw new TheDavidBoxClientException(e);
			}
			logger.debug("Get Response: " + response);
		}
		return response;
	}

	/** {@inheritDoc} */
	public void setHttpClient(HttpClient client) {
		this.client = client;
	}

}
