package com.vikingbrain.nmt.client.modules;

import com.vikingbrain.nmt.operations.setting.GetLanguageOperation;
import com.vikingbrain.nmt.operations.setting.GetRepeatModeOperation;
import com.vikingbrain.nmt.operations.setting.GetSubtitleLanguageOperation;
import com.vikingbrain.nmt.operations.setting.ListLanguageOperation;
import com.vikingbrain.nmt.operations.setting.ListNetworkSharedFolderOperation;
import com.vikingbrain.nmt.operations.setting.ListRepeatModeOperation;
import com.vikingbrain.nmt.operations.setting.ListSlideShowEffectOperation;
import com.vikingbrain.nmt.operations.setting.ListSubtitleLanguageOperation;
import com.vikingbrain.nmt.operations.setting.SetLanguageOperation;
import com.vikingbrain.nmt.operations.setting.SetRepeatModeOperation;
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
