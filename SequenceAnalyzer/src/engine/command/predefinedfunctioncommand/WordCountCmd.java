package engine.command.predefinedfunctioncommand;

import java.util.Map;

import engine.PredefinedFunctions.WordCount;
import engine.command.CommandExpression;
import engine.command.CommandResponse;


/**
 * 
 * @author Logan LaFollette
 * @param <T>
 * @param <T>
 *
 */
public class WordCountCmd extends PredefinedFunctionCmd {

	public WordCountCmd() {
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public CommandResponse execute(CommandExpression exp) {
		
		String s = "";
		int i = 0;
		
		WordCount wc = new WordCount();
		
		//second parameter is subword length, not sure how this will be extracted from the expression command
		CommandResponse resp = new CommandResponse(wc.wordCount(s, i));
		
		return resp;
		
		
		
	}

}
