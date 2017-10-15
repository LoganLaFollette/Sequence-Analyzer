package engine.command;

/**
 * 
 * @author Logan LaFollette
 *
 */
public class CommandExpression {
	
	public String _exec;
	public String _exec2;
	public int _intExec;
	
	
	//shift maximality, cutting times
	public CommandExpression(String input) {
		_exec = input;
	}
	
	//word count
	public CommandExpression(String input1, String input2) {
		_exec = input1;
		_exec2 = input2;
	}

	//star product
	public CommandExpression(String input, int input2) {
		_exec = input;
		_intExec = input2;
	}
	
	public <T> T[] getParams() {
		return null;
		
		
	}
}
