// Generated from Gramatica2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Gramatica2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, LINHA=2, NOME=3, PALAVRA=4, CONTRA=5, ACAO=6, PROPRIEDADE=7, 
		VEZES=8, VARIAS=9, CONDICAO=10, CONSEQUENCIA=11, ESPACO=12;
	public static final int
		RULE_raiz_programa = 0, RULE_jogo = 1, RULE_declaracao = 2, RULE_declaracao2 = 3, 
		RULE_time = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz_programa", "jogo", "declaracao", "declaracao2", "time"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\n'", null, null, "'@'", null, null, "'vezes'", null, 
			null, "'First Down!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INICIO", "LINHA", "NOME", "PALAVRA", "CONTRA", "ACAO", "PROPRIEDADE", 
			"VEZES", "VARIAS", "CONDICAO", "CONSEQUENCIA", "ESPACO"
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
	public String getGrammarFileName() { return "Gramatica2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Gramatica2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raiz_programaContext extends ParserRuleContext {
		public JogoContext jogo() {
			return getRuleContext(JogoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Gramatica2Parser.EOF, 0); }
		public Raiz_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterRaiz_programa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitRaiz_programa(this);
		}
	}

	public final Raiz_programaContext raiz_programa() throws RecognitionException {
		Raiz_programaContext _localctx = new Raiz_programaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_raiz_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			jogo();
			setState(11);
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
		public TerminalNode EOF() { return getToken(Gramatica2Parser.EOF, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public JogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterJogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitJogo(this);
		}
	}

	public final JogoContext jogo() throws RecognitionException {
		JogoContext _localctx = new JogoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jogo);
		int _la;
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1034L) != 0)) {
					{
					{
					setState(14);
					declaracao();
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(Gramatica2Parser.INICIO, 0); }
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public TerminalNode CONTRA() { return getToken(Gramatica2Parser.CONTRA, 0); }
		public TerminalNode ACAO() { return getToken(Gramatica2Parser.ACAO, 0); }
		public TerminalNode VARIAS() { return getToken(Gramatica2Parser.VARIAS, 0); }
		public TerminalNode VEZES() { return getToken(Gramatica2Parser.VEZES, 0); }
		public TerminalNode CONDICAO() { return getToken(Gramatica2Parser.CONDICAO, 0); }
		public Declaracao2Context declaracao2() {
			return getRuleContext(Declaracao2Context.class,0);
		}
		public TerminalNode CONSEQUENCIA() { return getToken(Gramatica2Parser.CONSEQUENCIA, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(INICIO);
				setState(23);
				time();
				setState(24);
				match(CONTRA);
				setState(25);
				time();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				time();
				setState(28);
				match(ACAO);
				setState(29);
				match(VARIAS);
				setState(30);
				match(VEZES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(CONDICAO);
				setState(33);
				declaracao2();
				setState(34);
				match(CONSEQUENCIA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				declaracao2();
				}
				break;
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
	public static class Declaracao2Context extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode PROPRIEDADE() { return getToken(Gramatica2Parser.PROPRIEDADE, 0); }
		public TerminalNode VARIAS() { return getToken(Gramatica2Parser.VARIAS, 0); }
		public Declaracao2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterDeclaracao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitDeclaracao2(this);
		}
	}

	public final Declaracao2Context declaracao2() throws RecognitionException {
		Declaracao2Context _localctx = new Declaracao2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			time();
			setState(40);
			match(PROPRIEDADE);
			setState(41);
			match(VARIAS);
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
		public TerminalNode NOME() { return getToken(Gramatica2Parser.NOME, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(NOME);
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
		"\u0004\u0001\f.\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u0010"+
		"\b\u0001\n\u0001\f\u0001\u0013\t\u0001\u0003\u0001\u0015\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000"+
		"\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000-\u0000\n\u0001\u0000"+
		"\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000"+
		"\u0000\u0006\'\u0001\u0000\u0000\u0000\b+\u0001\u0000\u0000\u0000\n\u000b"+
		"\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001"+
		"\u0000\u0000\u0000\r\u0015\u0005\u0000\u0000\u0001\u000e\u0010\u0003\u0004"+
		"\u0002\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000"+
		"\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000"+
		"\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0014\r\u0001\u0000\u0000\u0000\u0014\u0011\u0001\u0000\u0000"+
		"\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0001\u0000"+
		"\u0000\u0017\u0018\u0003\b\u0004\u0000\u0018\u0019\u0005\u0005\u0000\u0000"+
		"\u0019\u001a\u0003\b\u0004\u0000\u001a&\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0003\b\u0004\u0000\u001c\u001d\u0005\u0006\u0000\u0000\u001d\u001e"+
		"\u0005\t\u0000\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f&\u0001\u0000"+
		"\u0000\u0000 !\u0005\n\u0000\u0000!\"\u0003\u0006\u0003\u0000\"#\u0005"+
		"\u000b\u0000\u0000#&\u0001\u0000\u0000\u0000$&\u0003\u0006\u0003\u0000"+
		"%\u0016\u0001\u0000\u0000\u0000%\u001b\u0001\u0000\u0000\u0000% \u0001"+
		"\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000"+
		"\u0000\'(\u0003\b\u0004\u0000()\u0005\u0007\u0000\u0000)*\u0005\t\u0000"+
		"\u0000*\u0007\u0001\u0000\u0000\u0000+,\u0005\u0003\u0000\u0000,\t\u0001"+
		"\u0000\u0000\u0000\u0003\u0011\u0014%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}