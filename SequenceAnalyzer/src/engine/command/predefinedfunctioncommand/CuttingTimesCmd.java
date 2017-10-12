package engine.command.predefinedfunctioncommand;

import engine.PredefinedFunctions.CuttingTimes;
import engine.command.ExpressionCmd;

/**
 * 
 * @author Logan LaFollette
 *
 */
@SuppressWarnings("rawtypes")
public class CuttingTimesCmd extends PredefinedFunctionCmd {

	public CuttingTimesCmd() {
		
	}

	@Override
	public void execute(ExpressionCmd exp) {
		
		CuttingTimes ct = new CuttingTimes();
		//result ct.cuttingTimes(exp.getExpression());
	}

}
