// Generated from Gramatica2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Gramatica2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, LINHA=2, NOME=3, PALAVRA=4, CONTRA=5, ACAO=6, PROPRIEDADE=7, 
		VEZES=8, VARIAS=9, CONDICAO=10, CONSEQUENCIA=11, ESPACO=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INICIO", "LINHA", "NOME", "PALAVRA", "CONTRA", "ACAO", "PROPRIEDADE", 
			"VEZES", "VARIAS", "CONDICAO", "CONSEQUENCIA", "ESPACO"
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


	public Gramatica2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\fl\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0003\u0001\u0003\u0005\u0003"+
		"+\b\u0003\n\u0003\f\u0003.\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		">\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bP\b\b\n\b"+
		"\f\bS\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000bg\b\u000b\u000b\u000b\f\u000bh\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0001\u0000\u0004\u0004\u000009AZ__az\u0001\u000019\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  p\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000"+
		"\u0000\u0005!\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000\u0000\t"+
		"/\u0001\u0000\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\r?\u0001\u0000"+
		"\u0000\u0000\u000fG\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000"+
		"\u0013T\u0001\u0000\u0000\u0000\u0015Y\u0001\u0000\u0000\u0000\u0017f"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005N\u0000\u0000\u001a\u001b\u0005"+
		"F\u0000\u0000\u001b\u001c\u0005L\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0003\u0003\u0001\u0000\u001e\u0002\u0001\u0000\u0000"+
		"\u0000\u001f \u0005\n\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!%\u0003"+
		"\u0007\u0003\u0000\"$\u0003\u0007\u0003\u0000#\"\u0001\u0000\u0000\u0000"+
		"$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\u0006\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(,\u0007"+
		"\u0000\u0000\u0000)+\u0007\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-\b\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005@\u0000"+
		"\u00000\n\u0001\u0000\u0000\u000012\u0005c\u0000\u000023\u0005o\u0000"+
		"\u000034\u0005r\u0000\u000045\u0005r\u0000\u000056\u0005e\u0000\u0000"+
		"6>\u0005u\u0000\u000078\u0005l\u0000\u000089\u0005a\u0000\u00009:\u0005"+
		"n\u0000\u0000:;\u0005\u00e7\u0000\u0000;<\u0005o\u0000\u0000<>\u0005u"+
		"\u0000\u0000=1\u0001\u0000\u0000\u0000=7\u0001\u0000\u0000\u0000>\f\u0001"+
		"\u0000\u0000\u0000?@\u0003\u0017\u000b\u0000@A\u0005p\u0000\u0000AB\u0005"+
		"e\u0000\u0000BC\u0005s\u0000\u0000CD\u0005a\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EF\u0003\u0017\u000b\u0000F\u000e\u0001\u0000\u0000\u0000"+
		"GH\u0005v\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005z\u0000\u0000JK\u0005"+
		"e\u0000\u0000KL\u0005s\u0000\u0000L\u0010\u0001\u0000\u0000\u0000MQ\u0007"+
		"\u0001\u0000\u0000NP\u0007\u0002\u0000\u0000ON\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000R\u0012\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005"+
		"S\u0000\u0000UV\u0005e\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0003\u0017"+
		"\u000b\u0000X\u0014\u0001\u0000\u0000\u0000YZ\u0005F\u0000\u0000Z[\u0005"+
		"i\u0000\u0000[\\\u0005r\u0000\u0000\\]\u0005s\u0000\u0000]^\u0005t\u0000"+
		"\u0000^_\u0005 \u0000\u0000_`\u0005D\u0000\u0000`a\u0005o\u0000\u0000"+
		"ab\u0005w\u0000\u0000bc\u0005n\u0000\u0000cd\u0005!\u0000\u0000d\u0016"+
		"\u0001\u0000\u0000\u0000eg\u0007\u0003\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0006\u000b\u0000\u0000k\u0018"+
		"\u0001\u0000\u0000\u0000\u0006\u0000%,=Qh\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}