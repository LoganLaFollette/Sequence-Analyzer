package engine.command.predefinedfunctioncommand;

import engine.PredefinedFunctions.ShiftMaximality;
import engine.command.CommandExpression;
import engine.command.CommandResponse;

/**
 * 
 * @author Logan LaFollette
 * @param <T>
 * @param <T>
 *
 */
public class ShiftMaximalityCmd extends PredefinedFunctionCmd {

	public ShiftMaximalityCmd() {
		
	}
	
	@Override
	public CommandResponse execute(CommandExpression exp) {
		
		ShiftMaximality sm = new ShiftMaximality();
		
		String a = "";
		
		CommandResponse resp = new CommandResponse(sm.shiftMaximal(a));
		
		return resp;
		
	}

}
