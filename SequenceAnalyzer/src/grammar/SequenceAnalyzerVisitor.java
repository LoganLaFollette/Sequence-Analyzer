// Generated from SequenceAnalyzer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SequenceAnalyzerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SequenceAnalyzerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SequenceAnalyzerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(SequenceAnalyzerParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(SequenceAnalyzerParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(SequenceAnalyzerParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#strcmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrcmd(SequenceAnalyzerParser.StrcmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#predef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredef(SequenceAnalyzerParser.PredefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubstitutionOfFiles}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutionOfFiles(SequenceAnalyzerParser.SubstitutionOfFilesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubstitutionOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonOfFiles}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOfFiles(SequenceAnalyzerParser.ComparisonOfFilesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CuttingTimesOfFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuttingTimesOfFile(SequenceAnalyzerParser.CuttingTimesOfFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CuttingTimesOfFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuttingTimesOfFileInParens(SequenceAnalyzerParser.CuttingTimesOfFileInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CuttingTimesOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuttingTimesOfExpression(SequenceAnalyzerParser.CuttingTimesOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CuttingTimesOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuttingTimesOfExpressionInParens(SequenceAnalyzerParser.CuttingTimesOfExpressionInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarProductOfFiles}
	 * labeled alternative in {@link SequenceAnalyzerParser#sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarProductOfFiles(SequenceAnalyzerParser.StarProductOfFilesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarProductOfExpressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarProductOfExpressions(SequenceAnalyzerParser.StarProductOfExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuildFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildFile(SequenceAnalyzerParser.BuildFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuildFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildFileInParens(SequenceAnalyzerParser.BuildFileInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuildExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildExpression(SequenceAnalyzerParser.BuildExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuildExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildExpressionInParens(SequenceAnalyzerParser.BuildExpressionInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftMaximalityOfFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftMaximalityOfFile(SequenceAnalyzerParser.ShiftMaximalityOfFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftMaximalityOfFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftMaximalityOfFileInParens(SequenceAnalyzerParser.ShiftMaximalityOfFileInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftMaximalityOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftMaximalityOfExpression(SequenceAnalyzerParser.ShiftMaximalityOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftMaximalityOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftMaximalityOfExpressionInParens(SequenceAnalyzerParser.ShiftMaximalityOfExpressionInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WordCountOfFile}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordCountOfFile(SequenceAnalyzerParser.WordCountOfFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WordCountOfFileInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordCountOfFileInParens(SequenceAnalyzerParser.WordCountOfFileInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WordCountOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WordCountOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordCountOfExpressionInParens(SequenceAnalyzerParser.WordCountOfExpressionInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOn2files}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOn2files(SequenceAnalyzerParser.ConcatOn2filesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOn2FilesAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOn2FilesAtIndex(SequenceAnalyzerParser.ConcatOn2FilesAtIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOn2Expressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOn2Expressions(SequenceAnalyzerParser.ConcatOn2ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOn2ExpressionsAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOn2ExpressionsAtIndex(SequenceAnalyzerParser.ConcatOn2ExpressionsAtIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SequenceAnalyzerParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(SequenceAnalyzerParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SequenceAnalyzerParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(SequenceAnalyzerParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(SequenceAnalyzerParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(SequenceAnalyzerParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SequenceAnalyzerParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(SequenceAnalyzerParser.IntContext ctx);
}