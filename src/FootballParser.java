// Generated from Football.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FootballParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NFL=1, CONTRA=2, NOVA_LINHA=3, ESPACO=4, ACAO=5, QUANTIDADE=6, JARDAS=7, 
		FIM=8;
	public static final int
		RULE_raiz_programa = 0, RULE_jogo = 1, RULE_inicio = 2, RULE_jogada = 3, 
		RULE_fim = 4, RULE_time = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz_programa", "jogo", "inicio", "jogada", "fim", "time"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'@'", "'\\n'", "' '", null, null, "'jardas'", "'Fim de jogo'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NFL", "CONTRA", "NOVA_LINHA", "ESPACO", "ACAO", "QUANTIDADE", 
			"JARDAS", "FIM"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Football.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FootballParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raiz_programaContext extends ParserRuleContext {
		public JogoContext jogo() {
			return getRuleContext(JogoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FootballParser.EOF, 0); }
		public Raiz_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).enterRaiz_programa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).exitRaiz_programa(this);
		}
	}

	public final Raiz_programaContext raiz_programa() throws RecognitionException {
		Raiz_programaContext _localctx = new Raiz_programaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_raiz_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			jogo();
			setState(13);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JogoContext extends ParserRuleContext {
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public List<JogadaContext> jogada() {
			return getRuleContexts(JogadaContext.class);
		}
		public JogadaContext jogada(int i) {
			return getRuleContext(JogadaContext.class,i);
		}
		public JogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).enterJogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).exitJogo(this);
		}
	}

	public final JogoContext jogo() throws RecognitionException {
		JogoContext _localctx = new JogoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jogo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			inicio();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NFL) {
				{
				{
				setState(16);
				jogada();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			fim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public List<TerminalNode> ESPACO() { return getTokens(FootballParser.ESPACO); }
		public TerminalNode ESPACO(int i) {
			return getToken(FootballParser.ESPACO, i);
		}
		public TerminalNode CONTRA() { return getToken(FootballParser.CONTRA, 0); }
		public TerminalNode NOVA_LINHA() { return getToken(FootballParser.NOVA_LINHA, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			time();
			setState(25);
			match(ESPACO);
			setState(26);
			match(CONTRA);
			setState(27);
			match(ESPACO);
			setState(28);
			time();
			setState(29);
			match(NOVA_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JogadaContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public List<TerminalNode> ESPACO() { return getTokens(FootballParser.ESPACO); }
		public TerminalNode ESPACO(int i) {
			return getToken(FootballParser.ESPACO, i);
		}
		public TerminalNode ACAO() { return getToken(FootballParser.ACAO, 0); }
		public TerminalNode QUANTIDADE() { return getToken(FootballParser.QUANTIDADE, 0); }
		public TerminalNode JARDAS() { return getToken(FootballParser.JARDAS, 0); }
		public TerminalNode NOVA_LINHA() { return getToken(FootballParser.NOVA_LINHA, 0); }
		public JogadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jogada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).enterJogada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).exitJogada(this);
		}
	}

	public final JogadaContext jogada() throws RecognitionException {
		JogadaContext _localctx = new JogadaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jogada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			time();
			setState(32);
			match(ESPACO);
			setState(33);
			match(ACAO);
			setState(34);
			match(ESPACO);
			setState(35);
			match(QUANTIDADE);
			setState(36);
			match(ESPACO);
			setState(37);
			match(JARDAS);
			setState(38);
			match(NOVA_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FimContext extends ParserRuleContext {
		public TerminalNode FIM() { return getToken(FootballParser.FIM, 0); }
		public FimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).enterFim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).exitFim(this);
		}
	}

	public final FimContext fim() throws RecognitionException {
		FimContext _localctx = new FimContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeContext extends ParserRuleContext {
		public TerminalNode NFL() { return getToken(FootballParser.NFL, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FootballListener ) ((FootballListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(NFL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b-\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u0000\'\u0000\f\u0001\u0000\u0000\u0000\u0002"+
		"\u000f\u0001\u0000\u0000\u0000\u0004\u0018\u0001\u0000\u0000\u0000\u0006"+
		"\u001f\u0001\u0000\u0000\u0000\b(\u0001\u0000\u0000\u0000\n*\u0001\u0000"+
		"\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u000e\u0005\u0000\u0000\u0001"+
		"\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0013\u0003\u0004\u0002\u0000"+
		"\u0010\u0012\u0003\u0006\u0003\u0000\u0011\u0010\u0001\u0000\u0000\u0000"+
		"\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0003\b\u0004\u0000\u0017"+
		"\u0003\u0001\u0000\u0000\u0000\u0018\u0019\u0003\n\u0005\u0000\u0019\u001a"+
		"\u0005\u0004\u0000\u0000\u001a\u001b\u0005\u0002\u0000\u0000\u001b\u001c"+
		"\u0005\u0004\u0000\u0000\u001c\u001d\u0003\n\u0005\u0000\u001d\u001e\u0005"+
		"\u0003\u0000\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f \u0003\n"+
		"\u0005\u0000 !\u0005\u0004\u0000\u0000!\"\u0005\u0005\u0000\u0000\"#\u0005"+
		"\u0004\u0000\u0000#$\u0005\u0006\u0000\u0000$%\u0005\u0004\u0000\u0000"+
		"%&\u0005\u0007\u0000\u0000&\'\u0005\u0003\u0000\u0000\'\u0007\u0001\u0000"+
		"\u0000\u0000()\u0005\b\u0000\u0000)\t\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0001\u0000\u0000+\u000b\u0001\u0000\u0000\u0000\u0001\u0013";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}