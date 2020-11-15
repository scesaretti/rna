// Generated from rna.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link rnaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface rnaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link rnaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(rnaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link rnaParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(rnaParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link rnaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(rnaParser.ExprContext ctx);
}