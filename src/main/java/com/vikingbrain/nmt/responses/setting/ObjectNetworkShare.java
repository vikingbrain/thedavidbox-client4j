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
package com.vikingbrain.nmt.responses.setting;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 
 * @author vikingBrain
 */
@Root(name="networkShare", strict=false)
public class ObjectNetworkShare {

	@Element(name="gotPassword", required=false)
	private String gotPassword;
	
	@Element(name="shareName")
	private String shareName;
	
	@Element(name="url")
	private String url;

	@Element(name="userName", required=false)
	private String userName;	

	public final String getGotPassword() {
		return gotPassword;
	}

	public final void setGotPassword(String gotPassword) {
		this.gotPassword = gotPassword;
	}

	public final String getShareName() {
		return shareName;
	}

	public final void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public final String getUrl() {
		return url;
	}

	public final void setUrl(String url) {
		this.url = url;
	}

	public final String getUserName() {
		return userName;
	}

	public final void setUserName(String userName) {
		this.userName = userName;
	}	

	@Override
	public String toString() {
		return "ObjectNetworkShare [gotPassword=" + gotPassword
				+ ", shareName=" + shareName + ", url=" + url + ", userName="
				+ userName + "]";
	}

}
