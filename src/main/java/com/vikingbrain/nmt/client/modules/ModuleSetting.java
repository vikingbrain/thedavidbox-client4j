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
package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.setting.GetLanguageOperation;
import com.vikingbrain.nmt.operations.setting.GetPhotoIntervalOperation;
import com.vikingbrain.nmt.operations.setting.GetRepeatModeOperation;
import com.vikingbrain.nmt.operations.setting.GetScreenSaverTimeOperation;
import com.vikingbrain.nmt.operations.setting.GetSlideShowEffectOperation;
import com.vikingbrain.nmt.operations.setting.GetSubtitleLanguageOperation;
import com.vikingbrain.nmt.operations.setting.ListLanguageOperation;
import com.vikingbrain.nmt.operations.setting.ListNetworkSharedFolderOperation;
import com.vikingbrain.nmt.operations.setting.ListPhotoIntervalOperation;
import com.vikingbrain.nmt.operations.setting.ListRepeatModeOperation;
import com.vikingbrain.nmt.operations.setting.ListScreenSaverTimeOperation;
import com.vikingbrain.nmt.operations.setting.ListSlideShowEffectOperation;
import com.vikingbrain.nmt.operations.setting.ListSubtitleLanguageOperation;
import com.vikingbrain.nmt.operations.setting.SetLanguageOperation;
import com.vikingbrain.nmt.operations.setting.SetPhotoIntervalOperation;
import com.vikingbrain.nmt.operations.setting.SetRepeatModeOperation;
import com.vikingbrain.nmt.operations.setting.SetScreenSaverTimeOperation;
import com.vikingbrain.nmt.operations.setting.SetSlideShowEffectOperation;
import com.vikingbrain.nmt.operations.setting.SetSubtitleLanguageOperation;

/**
 * It allows to create the operations related to the setting module.
 * 
 * @author vikingBrain
 */
public interface ModuleSetting extends BaseModule {

	/**
	 * It creates an operation that lists all the supported system languages.
	 * @return the operation created
	 */		
	ListLanguageOperation buildListLanguageOperation();
	
	/**
	 * It creates an operation that sets the system language.
	 * @param language Any options returns from ListLanguage operation
	 * @return the operation created
	 */			
	SetLanguageOperation buildSetLanguageOperation(String language);
	
	/**
	 * It creates an operation that retrieves current system language.
	 * @return the operation created
	 */			
	GetLanguageOperation buildGetLanguageOperation();
	
	/**
	 * It creates an operation that lists all the supported subtitle languages.
	 * @return the operation created
	 */		
	ListSubtitleLanguageOperation buildListSubtitleLanguageOperation();
	
	/**
	 * It creates an operation that Enable/disable or set current subtitle language.
	 * @param language Any options returns from ListSubtitleLanguage operation
	 * @return the operation created
	 */			
	SetSubtitleLanguageOperation buildSetSubtitleLanguageOperation(String language);
	
	/**
	 * It creates an operation that retrieves current subtitle language.
	 * @return the operation created
	 */			
	GetSubtitleLanguageOperation buildGetSubtitleLanguageOperation();

	/**
	 * It creates an operation that lists all the supported play modes.
	 * @return the operation created
	 */			
	ListRepeatModeOperation buildListRepeatModeOperation();
	
	/**
	 * It creates a list all the supported slide show transition effects.
	 * @return the operation created
	 */			
	ListSlideShowEffectOperation buildListSlideShowEffectOperation();
	
	/**
	 * It creates a enable/disable or set current slide show transition effect.
	 * @param slideShowEffect Any options returns from ListSlideShowEffect operation
	 * @return the operation created
	 */
	SetSlideShowEffectOperation buildSetSlideShowEffectOperation(String slideShowEffect);
	
	/**
	 * It creates a Operation that retrieves current slide show effect.
	 * @return the operation created
	 */
	GetSlideShowEffectOperation buildGetSlideShowEffectOperation();
	
	/**
	 * It creates a Operation that lists all the supported photo interval time in second(s).
	 * @return the operation created
	 */
	ListPhotoIntervalOperation buildListPhotoIntervalOperation();
	
	/**
	 * It creates a Operation that sets current photo interval time.
	 * @param time Any options returns from ListPhotoInterval operation
	 * @return the operation created
	 */
	SetPhotoIntervalOperation buildSetPhotoIntervalOperation(String time);
		
	/**
	 * It creates a Operation that retrieves current photo interval time in second(s).
	 * @return the operation created
	 */
	GetPhotoIntervalOperation buildGetPhotoIntervalOperation();			
	
	/**
	 * It creates a Operation that lists all the supported screen saver time in second(s).
	 * @return the operation created
	 */
	ListScreenSaverTimeOperation buildListScreenSaverTimeOperation();
	
	/**
	 * It creates a Operation that sets current screen saver time in second(s).
	 * @param time Any options returns from ListPhotoInterval operation
	 * @return the operation created
	 */
	SetScreenSaverTimeOperation buildSetScreenSaverTimeOperation(String time);
		
	/**
	 * It creates a Operation that retrieves current screen saver time in second(s).
	 * @return the operation created
	 */
	GetScreenSaverTimeOperation buildGetScreenSaverTimeOperation();			
	
	/**
	 * It creates an operation that sets current repeat mode.
	 * @param repeatMode Any options returns from ListRepeatMode operation
	 * @return the operation created
	 */			
	SetRepeatModeOperation buildSetRepeatModeOperation(String repeatMode);
	
	/**
	 * It creates an operation that retrieves current repeat mode.
	 * @return the operation created
	 */			
	GetRepeatModeOperation buildGetRepeatModeOperation();
	
	
	/**
	 * It creates an operation that lists all the shared network folder(s) added for local access.
	 * @return the operation created
	 */	
	ListNetworkSharedFolderOperation buildListNetworkSharedFolderOperation();
}
