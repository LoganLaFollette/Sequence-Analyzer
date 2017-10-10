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
  
  abstract public T execute();

  abstract public T execute(ExpressionCmd exp);
}
