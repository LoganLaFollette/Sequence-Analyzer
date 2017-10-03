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
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SequenceAnalyzerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SequenceAnalyzerParser.AssignContext ctx);
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