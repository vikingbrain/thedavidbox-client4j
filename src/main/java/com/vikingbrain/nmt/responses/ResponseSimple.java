package com.vikingbrain.nmt.responses;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.vikingbrain.nmt.util.Constants;
import com.vikingbrain.nmt.util.TypeReturnValue;

/**
 * 
 * @author vikingBrain
 */
@Root(name="theDavidBox", strict=false)
public class ResponseSimple extends AbstractTheDavidBoxResponse {

	@Element(name="returnValue")
	private String returnValue;

	protected final String getReturnValue() {
		return returnValue;
	}

	protected final void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}

	public final boolean isValid(){
		return Constants.STRING_ZERO.equals(returnValue) ? true : false;
	}

	public final TypeReturnValue getTypeReturnValue() {
		//Initialization with default error code unknown
		TypeReturnValue typeReturnCode = TypeReturnValue.UNKNOWN;
		//Find the type by the error id
		TypeReturnValue errorFoundByCode = TypeReturnValue.findById(returnValue);
		if (null != errorFoundByCode){
			typeReturnCode = errorFoundByCode;
		}		
		return typeReturnCode;
	}

}
