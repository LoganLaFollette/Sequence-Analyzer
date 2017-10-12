package engine.command;

/**
 * 
 * @author Logan LaFollette
 *
 */
public class ExpressionCmd {

	protected String expression;
	
	public ExpressionCmd(String exp) {
		expression = exp;
	}
	
	public String getExpression() {
		return expression;
	}
	
	public String toString(ExpressionCmd exp) {
		return null;
	}

}
