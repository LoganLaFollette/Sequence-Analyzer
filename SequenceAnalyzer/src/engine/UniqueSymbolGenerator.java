package engine;

import java.util.*;

/**
 * Creates a unique symbol to be contained in the symbol tree every time
 * the method is called.  
 * 
 * @author 
 *
 */
public class UniqueSymbolGenerator {
	
	protected Map<Integer, String> varNames = new HashMap<>(); //Stores Variables and their values
	
	
	//default constructor
	public UniqueSymbolGenerator() {
		
	}
	
	//basic generate command with no arguments
	public void Generate() {
		Generate("");
	}
	
	//overloaded Generate() with String argument 
	public String Generate(String input)
	{
		varNames.put(varNames.size(), input);
		
		return CONSTS.SYMBOL_PREFIX + varNames.size();
	}	
	
}
