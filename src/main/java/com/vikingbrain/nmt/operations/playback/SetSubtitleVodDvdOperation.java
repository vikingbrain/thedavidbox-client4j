package com.vikingbrain.nmt.operations.playback;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.ModuleType;
import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.responses.ResponseSimple;

/**
 * Operation that sets subtitle for current VOD DVD playback ONLY for DVD media format.
 * Execution example: http://popcorn:8008//playback?arg0=set_subtitle_vod&arg1=english
 * 
 * @author vikingBrain
 */
public class SetSubtitleVodDvdOperation extends AbstractPlayblackOperation<ResponseSimple> {

	/** Operation type. */
	private static final OperationType operationType = ModuleType.PLAYBACK.set_subtitle_vod;

	/** Response target class. */
	private static final Class<ResponseSimple> responseTargetClass = ResponseSimple.class;
	
	/** Required operation attributes. */
	//Subtitle (value depends on track as being returned from list_subtitle_vod)
	private String track;
	
	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param track Subtitle (value depends on track as being returned from list_subtitle_vod)
	 */
	public SetSubtitleVodDvdOperation(TheDavidboxOperationFactory operationFactory, String track) {
		super(operationFactory, operationType, responseTargetClass);
		
		this.track = track;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
				
		httpArguments.put("arg1", track);	
		
		return httpArguments;
	}	

	

}
