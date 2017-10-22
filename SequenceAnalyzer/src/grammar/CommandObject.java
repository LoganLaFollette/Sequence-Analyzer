package grammar;
//Command Objects to be passed to the Engine

//COMMAND HIERARCHY LEVEL 0
public class CommandObject{										
	public String commandType;
	public List<Command> commandList;
	
	public CommandObject(){//default constructor
		commandType = "";
		commandList = new List<Command>();
	}
	
}

//COMMAND HIERARCHY LEVEL 1

public class VarDefCommand extends CommandObject{					
	public VarDefCommand (){//default constructor
		commandType = "";
	}
}

public class StringCommand extends CommandObject{					
	public StringCommand (){//default constructor
		commandType = "";
	}
	
}

public class PredefinedFunctionCommand extends CommandObject{		
	public PredefinedFunctionCommand (){//default constructor
		commandType = "";
	}
}

//COMMAND HIERARCHY LEVEL 2

public class VariableAssignmentCommand extends VarDefCommand{	
	String value, varName;
	
	public VariableAssignmentCommand (){//default constructor
		commandType = "";
	}
	
	public VariableAssignmentCommand (String varName, String value){
		commandType = "VariableAssignmentCommand";
		this.varName = varName;
		this.value = value;
	}
}

public class AlphabetDefinitionCommand extends VarDefCommand{	
	String alphabetName;
	List<String> charList;
	
	public AlphabetDefinitionCommand (){//default constructor
		commandType = "";
	}
	
	public AlphabetDefinitionCommand (String alphabetName, List<String> charList){
		commandType = "AlphabetDefinitionCommand";
		this.alphabetName = alphabetName;
		this.charList = charList;
	}
	
}

public class SubstitutionCommand extends StringCommand{
	String target, replacement;
	
	public SubstitutionCommand (){//default constructor
		commandType = "";
	}
	
	public SubstitutionCommand (String target, String replacement){//replacing a target string
		commandType = "SubstitutionCommand";
		this.target = target;
		this.replacement = replacement;
	}
}

public class CompareCommand extends StringCommand{	
	String str1, str2;
	
	public CompareCommand (){//default constructor
		commandType = "";
	}
	
	public CompareCommand (String str1, String str2){//comparing 2 strings
		commandType = "CompareCommand";
		this.str1 = str1;
		this.str2 = str2;
	}
}

public class CuttingTimesCommand extends PredefinedFunctionCommand{	
	String expr;
	
	public CuttingTimesCommand (){//default constructor
		commandType = "";
	}
	
	public CuttingTimesCommand (String expr){
		commandType = "CuttingTimesCommand";
		this.expr = expr;
	}
}

public class StarProductCommand extends PredefinedFunctionCommand{	
	String str1, str2;
	
	public StarProductCommand (){//default constructor
		commandType = "";
	}
	
	public StarProductCommand (String str1, String str2){
		commandType = "StarProductCommand";
		this.str1 = str1;
		this.str2 = str2;
	}
}

public class BuildCommand extends PredefinedFunctionCommand{	
	String str;
		
	public BuildCommand (){//default constructor
		commandType = "";
	}
	
	public BuildCommand (String str){
		commandType = "BuildCommand";
		this.str = str;
	}
}

public class ShiftMaximalityCommand extends PredefinedFunctionCommand{	
	String operand;
	
	public ShiftMaximalityCommand (){//default constructor
		commandType = "";
	}
	
	public ShiftMaximalityCommand (String operand){
		commandType = "ShiftMaximalityCommand";
		this.operand = operand;
	}
}

public class WordCountCommand extends PredefinedFunctionCommand{	
	String str;
	
	public WordCountCommand (){//default constructor
		commandType = "";
	}
	
	public WordCountCommand (String str){
		commandType = "WordCountCommand";
		this.str = str;
	}
}

public class ConcatenationCommand extends PredefinedFunctionCommand{	
	String baseStr, concatStr;
	int index;
	
	public ConcatenationCommand (){	//default constructor
		commandType = "";
	}
	
	public ConcatenationCommand (String baseStr, String concatStr){//concatenate concatStr to end baseStr
		commandType = "ConcatenationCommand";
		this.baseStr = baseStr;
		this.concatStr = concatStr;
	}
	
	public ConcatenationCommand (String baseStr, String concatStr, int index){//concatenate concatStr to baseStr at index
		commandType = "ConcatenationCommand";
		this.baseStr = baseStr;
		this.concatStr = concatStr;
		this.index = index;
	}
}

