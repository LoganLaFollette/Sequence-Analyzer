package engine.command.predefinedfunctioncommand;

import engine.command.Command;
import engine.command.ExpressionCmd;

/**
 * 
 * @author Logan LaFollette
 *
 */
@SuppressWarnings("rawtypes")
public abstract class PredefinedFunctionCmd<T> extends Command<PredefinedFunctionCmd>  {
	
	protected ExpressionCmd _exp;

	public PredefinedFunctionCmd() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract void execute(ExpressionCmd exp);
	
	
}
