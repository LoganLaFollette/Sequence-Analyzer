package engine.command.predefinedfunctioncommand;

import java.util.Map;

import engine.PredefinedFunctions.WordCount;
import engine.command.ExpressionCmd;

/**
 * 
 * @author Logan LaFollette
 * @param <T>
 * @param <T>
 *
 */
public class WordCountCmd<T> extends PredefinedFunctionCmd {

	public WordCountCmd() {
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public Map<String, Integer> execute(ExpressionCmd exp) {
		
		WordCount wc = new WordCount();
		
		//second parameter is subword length, not sure how this will be extracted from the expression command
		return wc.wordCount(exp.getExpression(), );
		
		
		
	}

}
