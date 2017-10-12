package engine.command.predefinedfunctioncommand;

import engine.PredefinedFunctions.CuttingTimes;
import engine.PredefinedFunctions.StarProduct;
import engine.command.ExpressionCmd;

/**
 * 
 * @author Logan LaFollette
 *
 */
public class StarProductCmd extends PredefinedFunctionCmd {

	public StarProductCmd() {
	
	}

	@Override
	public Object execute(ExpressionCmd exp1) {
		return exp1;
		
//		StarProduct sp = new StarProduct();
//		return sp.starProduct(exp1.getExpression(), exp2.getExpression());
	}

}
