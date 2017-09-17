package engine;

import java.util.*;

public class UniqueSymbolGenerator {
	private Map<String, String> varNames = new HashMap<>(); //Stores Variables and their values
//	int symbolNum = 0;
	
	//Generates a blank variable
	public void Generate()
	{
		Generate("");
	}
	//Generates a variable with the given value
	public void Generate(String input)
	{
		varNames.put(SymbolGen(), input);
	}	
	
//	public String SymbolGenerator() {
//		String symbol = "_" + symbolNum;
//		symbolNum++;
//		return symbol;
//	}	
	
	//Creates next unique variable name
	public String SymbolGen()
	{
		return "_Var" + varNames.size();
	}	
}
