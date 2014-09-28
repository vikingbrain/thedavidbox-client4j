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
