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
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(SequenceAnalyzerParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SequenceAnalyzerParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(SequenceAnalyzerParser.BlankContext ctx);
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