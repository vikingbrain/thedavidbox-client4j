package com.vikingbrain.nmt.operations.playback;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that sets time for current VOD playback to seek.
 * Execution example http://popcorn:8008/playback?arg0=set_time_seek_vod&arg1=00:01:16
 * 
 * @author vikingBrain
 */
public class SetTimeSeekVodOperation extends AbstractPlayblackOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.set_time_seek_vod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required operation attributes. */
	private int hours;
	private int minutes;
	private int seconds;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param hours number of hours
	 * @param minutes number of minutes 
	 * @param seconds number of seconds
	 */
	public SetTimeSeekVodOperation(TheDavidboxOperationFactory operationFactory, int hours, int minutes, int seconds) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		String stringHours = String.format("%02d", hours);
		String stringMinutes = String.format("%02d", minutes);
		String stringSeconds = String.format("%02d", seconds);
		
		String stringTime = stringHours.concat(":").concat(stringMinutes).concat(":").concat(stringSeconds);
		
		httpArguments.put("arg1", stringTime);

		return httpArguments;
	}	

	/**
	 * Getter of property.
	 * @return the hours
	 */
	public final int getHours() {
		return hours;
	}

	/**
	 * Setter of property.
	 * @param hours the hours to set
	 */
	public final void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * Getter of property.
	 * @return the minutes
	 */
	public final int getMinutes() {
		return minutes;
	}

	/**
	 * Setter of property.
	 * @param minutes the minutes to set
	 */
	public final void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	/**
	 * Getter of property.
	 * @return the seconds
	 */
	public final int getSeconds() {
		return seconds;
	}

	/**
	 * Setter of property.
	 * @param seconds the seconds to set
	 */
	public final void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	@Override
	public String toString() {
		return "SetTimeSeekVodOperation [hours=" + hours + ", minutes="
				+ minutes + ", seconds=" + seconds + ", getOperationType()="
				+ getOperationType() + "]";
	}

}
