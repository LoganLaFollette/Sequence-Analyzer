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
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(SequenceAnalyzerParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(SequenceAnalyzerParser.PrintExprContext ctx);
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
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterBlank(SequenceAnalyzerParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitBlank(SequenceAnalyzerParser.BlankContext ctx);
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