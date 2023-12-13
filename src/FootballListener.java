// Generated from Football.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FootballParser}.
 */
public interface FootballListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FootballParser#raiz_programa}.
	 * @param ctx the parse tree
	 */
	void enterRaiz_programa(FootballParser.Raiz_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FootballParser#raiz_programa}.
	 * @param ctx the parse tree
	 */
	void exitRaiz_programa(FootballParser.Raiz_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FootballParser#jogo}.
	 * @param ctx the parse tree
	 */
	void enterJogo(FootballParser.JogoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FootballParser#jogo}.
	 * @param ctx the parse tree
	 */
	void exitJogo(FootballParser.JogoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FootballParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(FootballParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link FootballParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(FootballParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link FootballParser#jogada}.
	 * @param ctx the parse tree
	 */
	void enterJogada(FootballParser.JogadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FootballParser#jogada}.
	 * @param ctx the parse tree
	 */
	void exitJogada(FootballParser.JogadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FootballParser#fim}.
	 * @param ctx the parse tree
	 */
	void enterFim(FootballParser.FimContext ctx);
	/**
	 * Exit a parse tree produced by {@link FootballParser#fim}.
	 * @param ctx the parse tree
	 */
	void exitFim(FootballParser.FimContext ctx);
	/**
	 * Enter a parse tree produced by {@link FootballParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(FootballParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FootballParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(FootballParser.TimeContext ctx);
}