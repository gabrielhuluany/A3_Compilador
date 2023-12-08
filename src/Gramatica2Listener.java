// Generated from Gramatica2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Gramatica2Parser}.
 */
public interface Gramatica2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Gramatica2Parser#raiz_programa}.
	 * @param ctx the parse tree
	 */
	void enterRaiz_programa(Gramatica2Parser.Raiz_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica2Parser#raiz_programa}.
	 * @param ctx the parse tree
	 */
	void exitRaiz_programa(Gramatica2Parser.Raiz_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gramatica2Parser#jogo}.
	 * @param ctx the parse tree
	 */
	void enterJogo(Gramatica2Parser.JogoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica2Parser#jogo}.
	 * @param ctx the parse tree
	 */
	void exitJogo(Gramatica2Parser.JogoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gramatica2Parser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(Gramatica2Parser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica2Parser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(Gramatica2Parser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Gramatica2Parser#declaracao2}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao2(Gramatica2Parser.Declaracao2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica2Parser#declaracao2}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao2(Gramatica2Parser.Declaracao2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Gramatica2Parser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(Gramatica2Parser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Gramatica2Parser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(Gramatica2Parser.TimeContext ctx);
}