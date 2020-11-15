// Generated from rna.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rnaParser}.
 */
public interface rnaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rnaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(rnaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link rnaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(rnaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link rnaParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(rnaParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link rnaParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(rnaParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link rnaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(rnaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link rnaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(rnaParser.ExprContext ctx);
}