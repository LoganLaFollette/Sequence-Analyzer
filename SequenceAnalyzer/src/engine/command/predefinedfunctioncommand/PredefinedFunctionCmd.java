package engine.command.predefinedfunctioncommand;

import engine.command.Command;
import engine.command.CommandExpression;
import engine.command.CommandResponse;

/**
 * 
 * @author Logan LaFollette
 *
 */
public abstract class PredefinedFunctionCmd extends Command<PredefinedFunctionCmd>  {
	

	public PredefinedFunctionCmd() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract CommandResponse execute(CommandExpression cmd);
	
	
}
