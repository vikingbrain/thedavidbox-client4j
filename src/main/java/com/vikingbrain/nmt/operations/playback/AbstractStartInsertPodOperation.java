package com.vikingbrain.nmt.operations.playback;

import java.util.LinkedHashMap;

import com.vikingbrain.nmt.operations.OperationType;
import com.vikingbrain.nmt.operations.TheDavidboxOperationFactory;
import com.vikingbrain.nmt.operations.parameters.RotationDegree;
import com.vikingbrain.nmt.responses.DavidBoxResponse;

/**
 * Abstract class that represent a operation for start or insert pod operation in the playback module.
 * 
 * @author vikingBrain
 *
 * @param <T> the type of the response object for the operation
 */
public abstract class AbstractStartInsertPodOperation<T extends DavidBoxResponse> extends AbstractStartInsertOperation<T> {

	/** Required operation attributes. */
	private int slideInterval;
	private RotationDegree rotationDegree;
	
	/**
	 * Constructor. Create the operation with the supplied parameters plus the default client parameters.
	 * @param operationFactory the operation factory
	 * @param operationType the operation type
	 * @param responseTargetClass the response target class
	 */
	protected AbstractStartInsertPodOperation(TheDavidboxOperationFactory operationFactory, OperationType operationType, 
			Class<T> responseTargetClass, String filePath) {		
		super(operationFactory, operationType, responseTargetClass, filePath);

		//Default client attributes
		this.slideInterval = operationFactory.getClientOptions().getDefaultSlideInterval();
		this.rotationDegree = operationFactory.getClientOptions().getDefaultRotationDegree();
	}

	@Override
	/** {@inheritDoc} */
	public LinkedHashMap<String, String> buildHttpArguments(){
		//Get http arguments from superclass
		LinkedHashMap<String, String> httpArguments = super.buildHttpArguments();
		
		//Slide interval in second(s) 
		httpArguments.put("arg3", String.valueOf(slideInterval));						
		
		//Degree of rotation. rot0(or pass empty parameter), rot90, rot180, rot270
		httpArguments.put("arg4", rotationDegree.getParamValue()); 
				
		//Display mode
		httpArguments.put("arg5", getDisplayMode().getParamValue()); 

		return httpArguments;
	}	

	public final int getSlideInterval() {
		return slideInterval;
	}

	public final void setSlideInterval(int slideInterval) {
		this.slideInterval = slideInterval;
	}

	public final RotationDegree getRotationDegree() {
		return rotationDegree;
	}

	public final void setRotationDegree(RotationDegree rotationDegree) {
		this.rotationDegree = rotationDegree;
	}


}
