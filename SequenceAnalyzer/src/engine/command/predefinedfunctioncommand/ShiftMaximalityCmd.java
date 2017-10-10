package engine.command.predefinedfunctioncommand;

import engine.PredefinedFunctions.ShiftMaximality;
import engine.command.ExpressionCmd;

/**
 * 
 * @author Logan LaFollette
 * @param <T>
 *
 */
public class ShiftMaximalityCmd<T> extends PredefinedFunctionCmd<T> {

	public ShiftMaximalityCmd() {
		
	}
	

	@Override
	public void execute(ExpressionCmd exp) {
		 ShiftMaximality.shiftMaximal(exp);
		
	}


	@Override
	public T execute() {
		// TODO Auto-generated method stub
		return null;
	}


}
