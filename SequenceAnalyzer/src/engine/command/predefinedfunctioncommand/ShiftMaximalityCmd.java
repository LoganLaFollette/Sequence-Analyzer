package engine.command.predefinedfunctioncommand;

import engine.PredefinedFunctions.ShiftMaximality;
import engine.command.ExpressionCmd;

/**
 * 
 * @author Logan LaFollette
 * @param <T>
 *
 */
@SuppressWarnings("rawtypes")
public class ShiftMaximalityCmd extends PredefinedFunctionCmd {

	public ShiftMaximalityCmd() {
		
	}
	
	@Override
	public Object execute(ExpressionCmd exp) {
		
		ShiftMaximality sm = new ShiftMaximality();
		return sm.shiftMaximal(exp.getExpression());	
	}

}
