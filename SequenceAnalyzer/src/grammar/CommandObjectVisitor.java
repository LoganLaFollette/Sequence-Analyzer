import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import CommandObject.java;

public class CommandObjectVisitor extends SequenceAnalyzerBaseVisitor {
	List<CommandObject> commandObjectList = new List<CommandObject>;
	public bool debugFlag = true;
	
	@Override
    public void visitSubstitutionOfFiles(SequenceAnalyzerParser.SubstitutionOfFilesContext ctx){

	}

	@Override
    public void visitSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx){
		String target = visit(ctx.expr(1));
		String replacement = visit(ctx.expr(2));
		
		if(debugFlag == true){
			System.out.println("target = " + target);
			System.out.println("replacement = " + replacement);
		}
		
		SubstitutionCommand subCommand = new SubstitutionCommand(target, replacement);
		commandObjectList.add(subCommand);
	}

	@Override
    public void visitComparisonOfFiles(SequenceAnalyzerParser.ComparisonOfFilesContext ctx){
		
	}

	@Override
    public void visitComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx){
		String str1 = visit(ctx.expr(1));
		String str2 = visit(ctx.expr(2)); 
		
		if(debugFlag == true){
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
		}
		
		CompareCommand cmpCommand = new CompareCommand(str1, str2);
		commandObjectList.add(cmpCommand);
	}

	@Override
    public void  visitCuttingTimesOfFile(SequenceAnalyzerParser.CuttingTimesOfFileContext ctx){
		
	}

	@Override
    public void  visitCuttingTimesOfFileInParens(SequenceAnalyzerParser.CuttingTimesOfFileInParensContext ctx){
		
	}

	@Override
    public void visitCuttingTimesOfExpression(SequenceAnalyzerParser.CuttingTimesOfExpressionContext ctx){
		String expr = visit(ctx.expr());
		
		if(debugFlag == true){
			System.out.println("expr = " + expr);
		}
		
		CuttingTimesCommand ctCommand = new CuttingTimesCommand(expr);
		commandObjectList.add(ctCommand);
	}

	@Override
    public void  visitCuttingTimesOfExpressionInParens(SequenceAnalyzerParser.CuttingTimesOfExpressionInParensContext ctx){
		String expr = visit(ctx.expr());
		
		if(debugFlag == true){
			System.out.println("expr = " + expr);
		}
		
		CuttingTimesCommand ctCommand = new CuttingTimesCommand(expr);
		commandObjectList.add(ctCommand);
	}

	@Override
    public void  visitStarProductOfFiles(SequenceAnalyzerParser.StarProductOfFilesContext ctx){
		
	}

	@Override
    public void  visitStarProductOfExpressions(SequenceAnalyzerParser.StarProductOfExpressionsContext ctx){
		String str1 = visit(ctx.expr(1));
		String str2 = visit(ctx.expr(2)); 
		
		if(debugFlag == true){
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
		}
		
		StarProductCommand spCommand = new StarProductCommand(str1, str2); 
		commandObjectList.add(spCommand);
	}

	@Override
    public void  visitBuildFile(SequenceAnalyzerParser.BuildFileContext ctx){
		
	}

	@Override
    public void  visitBuildFileInParens(SequenceAnalyzerParser.BuildFileInParensContext ctx){
		
	}

	@Override
    public void  visitBuildExpression(SequenceAnalyzerParser.BuildExpressionContext ctx){
		String str = visit(ctx.expr());
		
		if(debugFlag == true){
			System.out.println("expr = " + expr);
		}
		
		BuildCommand buildCommand = new BuildCommand(str);
		commandObjectList.add(buildCommand);
	}

	@Override
    public void  visitBuildExpressionInParens(SequenceAnalyzerParser.BuildExpressionInParensContext ctx){
		String str = visit(ctx.expr());
		
		if(debugFlag == true){
			System.out.println("expr = " + expr);
		}
		
		BuildCommand buildCommand = new BuildCommand(str);
		commandObjectList.add(buildCommand);
	}

	@Override
    public void  visitShiftMaximalityOfFile(SequenceAnalyzerParser.ShiftMaximalityOfFileContext ctx){
		
	}

	@Override
    public void  visitShiftMaximalityOfFileInParens(SequenceAnalyzerParser.ShiftMaximalityOfFileInParensContext ctx){
		
	}

	@Override
    public void  visitShiftMaximalityOfExpression(SequenceAnalyzerParser.ShiftMaximalityOfExpressionContext ctx){
		String operand = visit(ctx.expr());
		
		if(debugFlag == true){
			System.out.println("operand = " + operand);
		}
		
		ShiftMaximalityCommand smCommand = new ShiftMaximalityCommand(operand);
		commandObjectList.add(smCommand);
	}

	@Override
    public void  visitShiftMaximalityOfExpressionInParens(SequenceAnalyzerParser.ShiftMaximalityOfExpressionInParensContext ctx){
		String operand = visit(ctx.expr());
		
		if(debugFlag == true){
			System.out.println("operand = " + operand);
		}
		
		ShiftMaximalityCommand smCommand = new ShiftMaximalityCommand(operand);
		commandObjectList.add(smCommand);
	}

	@Override
    public void  visitWordCountOfFile(SequenceAnalyzerParser.WordCountOfFileContext ctx){
		
	}

	@Override
    public void  visitWordCountOfFileInParens(SequenceAnalyzerParser.WordCountOfFileInParensContext ctx){
		
	}

	@Override
    public void  visitWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx){
		String str = visit(ctx.expr());
		
		if(debugFlag == true){
			System.out.println("str = " + str);
		}
		
		WordCountCommand wordcountCommand = new WordCountCommand(str);
		commandObjectList.add(wordcountCommand);
	}

	@Override
    public void  visitWordCountOfExpressionInParens(SequenceAnalyzerParser.WordCountOfExpressionInParensContext ctx){
		String str = visit(ctx.expr());
		
		if(debugFlag == true){
			System.out.println("str = " + str);
		}
		
		WordCountCommand wordcountCommand = new WordCountCommand(str);
		commandObjectList.add(wordcountCommand);
	}

	@Override
    public void  visitConcatOn2files(SequenceAnalyzerParser.ConcatOn2filesContext ctx){
		
	}

	@Override
    public void  visitConcatOn2FilesAtIndex(SequenceAnalyzerParser.ConcatOn2FilesAtIndexContext ctx){
		
	}
	
	@Override
    public void visitConcatOn2Expressions(SequenceAnalyzerParser.ConcatOn2ExpressionsContext ctx){
		String baseStr = visit(ctx.expr(1));
		String concatStr = visit(ctx.expr(2));
		
		if(debugFlag == true){
			System.out.println("baseStr = " + baseStr);
			System.out.println("concatStr = " + concatStr);
		}
		
		ConcatenationCommand concatCommand = new ConcatenationCommand(baseStr, concatStr);
		commandObjectList.add(concatCommand);
	}
	
	@Override
    public void visitConcatOn2ExpressionsAtIndex(SequenceAnalyzerParser.ConcatOn2ExpressionsAtIndexContext ctx){
		String baseStr = visit(ctx.expr(1));
		String concatStr = visit(ctx.expr(2));
		int index = ctx.INT().getText();
		
		if(debugFlag == true){
			System.out.println("baseStr = " + baseStr);
			System.out.println("concatStr = " + concatStr);
			System.out.println("index = " + index);
		}
		
		ConcatenationCommand concatCommand = new ConcatenationCommand(baseStr, concatStr, index);
		commandObjectList.add(concatCommand);
	}


}