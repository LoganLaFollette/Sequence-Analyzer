package engine.command.predefinedfunctioncommand;

import engine.PredefinedFunctions.ShiftMaximality;
import engine.command.ExpressionCmd;

/**
 * 
 * @author Logan LaFollette
 * @param <T>
 * @param <T>
 *
 */

public class ShiftMaximalityCmd extends PredefinedFunctionCmd<ShiftMaximalityCmd> {

	public ShiftMaximalityCmd() {
		
	}
	
	@Override
	public void execute(ExpressionCmd exp) {
		
		ShiftMaximality sm = new ShiftMaximality();
		//result sm.shiftMaximal(exp.getExpression());	
	}

}
