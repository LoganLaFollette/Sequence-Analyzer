package engine.command.predefinedfunctioncommand;

import engine.PredefinedFunctions.CuttingTimes;
import engine.command.CommandExpression;
import engine.command.CommandResponse;

/**
 * 
 * @author Logan LaFollette
 *
 */
public class CuttingTimesCmd extends PredefinedFunctionCmd {

	public CuttingTimesCmd() {
		
	}

	@Override
	public CommandResponse execute(CommandExpression cmd) {
		
		CuttingTimes ct = new CuttingTimes();
		String a = "";
		
		CommandResponse resp = new CommandResponse(ct.cuttingTimes(a));
		
		return resp;
	}

}
