package engine.command;

/**
 * 
 * @author 
 *
 */
public abstract class Command<T>
{
	/**
	 * Individually defined by all subclasses of Command
	 */
	abstract public void execute(ExpressionCmd exp);
}
