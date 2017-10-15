package grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Stack;
import CommandObject.java;

public class AntlrBridge{ 
	public AntlrBridge(String input){
		String inputFile = null;
		if ( args.length>0 ) inputFile = args[0];
		InputStream is = input;
		if ( inputFile!=null ) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		SequenceAnalyzerLexer lexer = new SequenceAnalyzerLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SequenceAnalyzerParser parser = new SequenceAnalyzerParser(tokens);
		ParseTree tree = parser.prog(); // parse

		CommandObjectVisitor coVisitor = new CommandObjectVisitor();
		coVisitor.visit(tree);
		
		Stack<CommandObject> commandObjectStack = coVisitor.commandObjectStack;
	}
}