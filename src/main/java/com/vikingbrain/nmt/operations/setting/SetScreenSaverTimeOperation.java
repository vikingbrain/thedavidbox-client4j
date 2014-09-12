package com.vikingbrain.nmt.operations.setting;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that enable/disable or set current screen saver time in second(s).
 * Execution example: http://popcorn:8008/setting?arg0=set_screen_saver_time&arg1=1
 * 
 * @author vikingBrain
 */
public class SetScreenSaverTimeOperation extends AbstractSettingOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.SETTING.set_photo_interval;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required attributes. */
	//Any options returns from ListScreenSaverTime operation
	private String time;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param time Any options returns from ListScreenSaverTime operation
	 */
	public SetScreenSaverTimeOperation(TheDavidboxOperationFactory operationFactory, String time) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.time = time;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", time);

		return httpArguments;
	}	

	/**
	 * Getter of property.
	 * @return the time
	 */
	public final String getTime() {
		return time;
	}

	/**
	 * Setter of property.
	 * @param time the time to set
	 */
	public final void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "SetScreenSaverTimeOperation [time=" + time
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
