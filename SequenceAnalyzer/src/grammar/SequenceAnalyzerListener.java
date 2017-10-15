// Generated from SequenceAnalyzer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SequenceAnalyzerParser}.
 */
public interface SequenceAnalyzerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SequenceAnalyzerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SequenceAnalyzerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(SequenceAnalyzerParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(SequenceAnalyzerParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(SequenceAnalyzerParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(SequenceAnalyzerParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(SequenceAnalyzerParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(SequenceAnalyzerParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#strcmd}.
	 * @param ctx the parse tree
	 */
	void enterStrcmd(SequenceAnalyzerParser.StrcmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#strcmd}.
	 * @param ctx the parse tree
	 */
	void exitStrcmd(SequenceAnalyzerParser.StrcmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#predef}.
	 * @param ctx the parse tree
	 */
	void enterPredef(SequenceAnalyzerParser.PredefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#predef}.
	 * @param ctx the parse tree
	 */
	void exitPredef(SequenceAnalyzerParser.PredefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubstitutionOfFiles}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSubstitutionOfFiles(SequenceAnalyzerParser.SubstitutionOfFilesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubstitutionOfFiles}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSubstitutionOfFiles(SequenceAnalyzerParser.SubstitutionOfFilesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubstitutionOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubstitutionOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonOfFiles}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOfFiles(SequenceAnalyzerParser.ComparisonOfFilesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonOfFiles}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOfFiles(SequenceAnalyzerParser.ComparisonOfFilesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CuttingTimesOfFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void enterCuttingTimesOfFile(SequenceAnalyzerParser.CuttingTimesOfFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CuttingTimesOfFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void exitCuttingTimesOfFile(SequenceAnalyzerParser.CuttingTimesOfFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CuttingTimesOfFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void enterCuttingTimesOfFileInParens(SequenceAnalyzerParser.CuttingTimesOfFileInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CuttingTimesOfFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void exitCuttingTimesOfFileInParens(SequenceAnalyzerParser.CuttingTimesOfFileInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CuttingTimesOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void enterCuttingTimesOfExpression(SequenceAnalyzerParser.CuttingTimesOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CuttingTimesOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void exitCuttingTimesOfExpression(SequenceAnalyzerParser.CuttingTimesOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CuttingTimesOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void enterCuttingTimesOfExpressionInParens(SequenceAnalyzerParser.CuttingTimesOfExpressionInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CuttingTimesOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void exitCuttingTimesOfExpressionInParens(SequenceAnalyzerParser.CuttingTimesOfExpressionInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarProductOfFiles}
	 * labeled alternative in {@link SequenceAnalyzerParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterStarProductOfFiles(SequenceAnalyzerParser.StarProductOfFilesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarProductOfFiles}
	 * labeled alternative in {@link SequenceAnalyzerParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitStarProductOfFiles(SequenceAnalyzerParser.StarProductOfFilesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarProductOfExpressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterStarProductOfExpressions(SequenceAnalyzerParser.StarProductOfExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarProductOfExpressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitStarProductOfExpressions(SequenceAnalyzerParser.StarProductOfExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuildFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuildFile(SequenceAnalyzerParser.BuildFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuildFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuildFile(SequenceAnalyzerParser.BuildFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuildFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuildFileInParens(SequenceAnalyzerParser.BuildFileInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuildFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuildFileInParens(SequenceAnalyzerParser.BuildFileInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuildExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuildExpression(SequenceAnalyzerParser.BuildExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuildExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuildExpression(SequenceAnalyzerParser.BuildExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuildExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuildExpressionInParens(SequenceAnalyzerParser.BuildExpressionInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuildExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuildExpressionInParens(SequenceAnalyzerParser.BuildExpressionInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftMaximalityOfFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void enterShiftMaximalityOfFile(SequenceAnalyzerParser.ShiftMaximalityOfFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftMaximalityOfFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void exitShiftMaximalityOfFile(SequenceAnalyzerParser.ShiftMaximalityOfFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftMaximalityOfFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void enterShiftMaximalityOfFileInParens(SequenceAnalyzerParser.ShiftMaximalityOfFileInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftMaximalityOfFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void exitShiftMaximalityOfFileInParens(SequenceAnalyzerParser.ShiftMaximalityOfFileInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftMaximalityOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void enterShiftMaximalityOfExpression(SequenceAnalyzerParser.ShiftMaximalityOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftMaximalityOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void exitShiftMaximalityOfExpression(SequenceAnalyzerParser.ShiftMaximalityOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftMaximalityOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void enterShiftMaximalityOfExpressionInParens(SequenceAnalyzerParser.ShiftMaximalityOfExpressionInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftMaximalityOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void exitShiftMaximalityOfExpressionInParens(SequenceAnalyzerParser.ShiftMaximalityOfExpressionInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WordCountOfFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 */
	void enterWordCountOfFile(SequenceAnalyzerParser.WordCountOfFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WordCountOfFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 */
	void exitWordCountOfFile(SequenceAnalyzerParser.WordCountOfFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WordCountOfFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 */
	void enterWordCountOfFileInParens(SequenceAnalyzerParser.WordCountOfFileInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WordCountOfFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 */
	void exitWordCountOfFileInParens(SequenceAnalyzerParser.WordCountOfFileInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WordCountOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 */
	void enterWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WordCountOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 */
	void exitWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WordCountOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 */
	void enterWordCountOfExpressionInParens(SequenceAnalyzerParser.WordCountOfExpressionInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WordCountOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 */
	void exitWordCountOfExpressionInParens(SequenceAnalyzerParser.WordCountOfExpressionInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatOn2files}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcatOn2files(SequenceAnalyzerParser.ConcatOn2filesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatOn2files}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcatOn2files(SequenceAnalyzerParser.ConcatOn2filesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatOn2FilesAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcatOn2FilesAtIndex(SequenceAnalyzerParser.ConcatOn2FilesAtIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatOn2FilesAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcatOn2FilesAtIndex(SequenceAnalyzerParser.ConcatOn2FilesAtIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatOn2Expressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcatOn2Expressions(SequenceAnalyzerParser.ConcatOn2ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatOn2Expressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcatOn2Expressions(SequenceAnalyzerParser.ConcatOn2ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatOn2ExpressionsAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcatOn2ExpressionsAtIndex(SequenceAnalyzerParser.ConcatOn2ExpressionsAtIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatOn2ExpressionsAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcatOn2ExpressionsAtIndex(SequenceAnalyzerParser.ConcatOn2ExpressionsAtIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SequenceAnalyzerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SequenceAnalyzerParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(SequenceAnalyzerParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(SequenceAnalyzerParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SequenceAnalyzerParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SequenceAnalyzerParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(SequenceAnalyzerParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(SequenceAnalyzerParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(SequenceAnalyzerParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(SequenceAnalyzerParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(SequenceAnalyzerParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(SequenceAnalyzerParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(SequenceAnalyzerParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(SequenceAnalyzerParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(SequenceAnalyzerParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(SequenceAnalyzerParser.IntContext ctx);
}