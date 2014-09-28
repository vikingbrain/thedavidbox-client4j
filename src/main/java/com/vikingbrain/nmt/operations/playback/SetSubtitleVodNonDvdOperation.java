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
package com.vikingbrain.nmt.operations.playback;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;

/**
 * Operation that sets subtitle for current VOD playback ONLY for non-DVD media format.
 * Execution example: http://popcorn:8008/playback?arg0=set_subtitle_vod&arg1=1&arg2=red&arg3=40&arg4=30&arg5=English&arg6=20.5
 * 
 * @author vikingBrain
 */
public class SetSubtitleVodNonDvdOperation extends SetSubtitleVodDvdOperation {

	/** Required operation attributes. */
	//Subtitle Color. Eg: "white/black" (value depends on colorOption as being returned from list_subtitle_vod)
	private String color;

	//Subtitle FontSize. Eg:"30" (value must be within maxSize and minSize and must be divisible by stepSize as being returned from list_subtitle_vod)
	private int fontSize;		

	//Subtitle Position. Eg: "20" (value must be within maxPosition and minPosition and must be divisible by stepPosition as being returned from list_subtitle_vod)
	private int position;
	
	//Subtitle Encoding. Eg: "English" (value depends on encodingOption as being returned from list_subtitle_vod) 
	private String encoding;
	
	//Subtitle TimeOffset. Eg: "300.5" (value must be within maxOffset and minOffset and must be divisible by stepOffset as being returned from list_subtitle_vod)
	private String timeOffset;
	
	/**
	 * Constructor.
	 * @param operationFactory the operation factory
	 * @param track Subtitle (value depends on track as being returned from list_subtitle_vod)
	 * @param color Subtitle Color. Eg: "white/black" (value depends on colorOption as being returned from list_subtitle_vod)
	 * @param fontSize Subtitle FontSize. Eg:"30" (value must be within maxSize and minSize and must be divisible by stepSize as being returned from list_subtitle_vod)
	 * @param position Subtitle Position. Eg: "20" (value must be within maxPosition and minPosition and must be divisible by stepPosition as being returned from list_subtitle_vod)
	 * @param encoding Subtitle Encoding. Eg: "English" (value depends on encodingOption as being returned from list_subtitle_vod)
	 * @param timeOffset Subtitle TimeOffset. Eg: "300.5" (value must be within maxOffset and minOffset and must be divisible by stepOffset as being returned from list_subtitle_vod)
	 */
	public SetSubtitleVodNonDvdOperation(TheDavidboxOperationFactory operationFactory, String track, String color, int fontSize, int position, String encoding, String timeOffset) {
		super(operationFactory, track);
		
		this.color = color;
		this.fontSize = fontSize;
		this.position = position;
		this.encoding = encoding;
		this.timeOffset = timeOffset;
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();				

		httpArguments.put("arg2", color);
		httpArguments.put("arg3", String.valueOf(fontSize));
		httpArguments.put("arg4", String.valueOf(position));
		httpArguments.put("arg5", encoding);
		httpArguments.put("arg6", timeOffset);
		
		return httpArguments;
	}	



}
