package com.vikingbrain.nmt.operations.playback;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that sets VOD playback speed.
 * Execution example http://popcorn:8008/playback?arg0=set_playback_speed_vod&arg1=2x
 * 
 * @author vikingBrain
 */
public class SetPlaybackSpeedVodOperation extends AbstractPlayblackOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.set_playback_speed_vod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;

	/** Required operation attributes. */
	private String speed;

	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param speed Any speed returned from list_playback_speed_vod function.
	 * < 0: Rewind ( -1x, -2x )
	 * 0: Pause will only work when current speed is 1x ( 0 )
	 * 0 < x < 1: Slow ( 1/2x, 1/4x )
	 * 1: Normal Play ( 1x )
	 * > 1: Fast forward ( 2x, 4x )
	 */
	public SetPlaybackSpeedVodOperation(TheDavidboxOperationFactory operationFactory, String speed) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.speed = speed;
	}
	
	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		httpArguments.put("arg1", speed);

		return httpArguments;
	}	

	/**
	 * Getter of property.
	 * @return the speed
	 */
	public final String getSpeed() {
		return speed;
	}

	/**
	 * Setter of property.
	 * @param speed the speed to set
	 */
	public final void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "SetPlaybackSpeedVodOperation [speed=" + speed
				+ ", getOperationType()=" + getOperationType() + "]";
	}

}
