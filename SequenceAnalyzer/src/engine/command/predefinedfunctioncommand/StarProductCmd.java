package engine.command.predefinedfunctioncommand;

import engine.PredefinedFunctions.StarProduct;
import engine.command.CommandExpression;
import engine.command.CommandResponse;

/**
 * 
 * @author Logan LaFollette
 *
 */
public class StarProductCmd extends PredefinedFunctionCmd {

	public StarProductCmd() {
	
	}

	@Override
	public CommandResponse execute(CommandExpression exp1) {
		
		String b = "";
		String c = "";
		
		StarProduct sp = new StarProduct();
		CommandResponse resp = new CommandResponse(sp.starProduct(b,c));
		return resp;
	}

}
