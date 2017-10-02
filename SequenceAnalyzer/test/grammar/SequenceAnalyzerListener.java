// Generated from SequenceAnalyzer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SequenceAnalyzerParser}.
 */
public interface SequenceAnalyzerListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SequenceAnalyzerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SequenceAnalyzerParser.ExprContext ctx);
}