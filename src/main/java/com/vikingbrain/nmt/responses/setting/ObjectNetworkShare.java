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
