package engine.command.predefinedfunctioncommand;

import engine.command.Command;
import engine.command.ExpressionCmd;

/**
 * 
 * @author Logan LaFollette
 *
 */
public abstract class PredefinedFunctionCmd<T> extends Command<T>  {
	
	protected ExpressionCmd _exp;

	public PredefinedFunctionCmd() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract T execute(ExpressionCmd exp);

	@Override
	public abstract T execute();
	
	
}
