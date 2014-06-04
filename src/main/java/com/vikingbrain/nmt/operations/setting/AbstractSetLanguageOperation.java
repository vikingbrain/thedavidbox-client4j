package com.vikingbrain.nmt.operations.setting;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Abstract class for operation that are just setting language.
 * 
 * @author vikingBrain
 */
public class AbstractSetLanguageOperation extends AbstractSettingOperation<ResponseSimple> {

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required attributes. */
	//Any options returns from List language operation or list subtitle language
	private String language;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param operationType the operation type
	 * @param language the language to set
	 */
	public AbstractSetLanguageOperation(TheDavidboxOperationFactory operationFactory, OperationType operationType, String language) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.language = language;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", language);

		return httpArguments;
	}	

	/**
	 * Getter of property.
	 * @return the language
	 */
	public final String getLanguage() {
		return language;
	}

	/**
	 * Setter of property.
	 * @param language the language to set
	 */
	public final void setLanguage(String language) {
		this.language = language;
	}
	
}
