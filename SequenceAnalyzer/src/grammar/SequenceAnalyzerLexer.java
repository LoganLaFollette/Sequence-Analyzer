// Generated from SequenceAnalyzer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SequenceAnalyzerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, INT=17, 
		USER_ALPHA=18, FILE_EXT=19, LETTER=20, NEWLINE=21, LN_COMMENT=22, COMMENT=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ID", "INT", "USER_ALPHA", 
		"FILE_EXT", "LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sub'", "'cmp'", "'ct'", "'sp'", "'build'", "'sm'", "'wordcount'", 
		"'concat'", "'('", "')'", "':='", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "INT", "USER_ALPHA", "FILE_EXT", "LETTER", 
		"NEWLINE", "LN_COMMENT", "COMMENT", "WS"
	};
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


	public SequenceAnalyzerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SequenceAnalyzer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21n\n\21\f\21\16\21q\13\21"+
		"\3\22\6\22t\n\22\r\22\16\22u\3\23\6\23y\n\23\r\23\16\23z\3\24\3\24\7\24"+
		"\177\n\24\f\24\16\24\u0082\13\24\3\25\6\25\u0085\n\25\r\25\16\25\u0086"+
		"\3\26\5\26\u008a\n\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0092\n\27\f"+
		"\27\16\27\u0095\13\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u009f"+
		"\n\30\f\30\16\30\u00a2\13\30\3\30\3\30\3\30\3\30\3\30\3\31\6\31\u00aa"+
		"\n\31\r\31\16\31\u00ab\3\31\3\31\4\u0093\u00a0\2\32\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\3\2\6\3\2\62;\3\2\62\63\4\2C\\c|\4\2\13\13\""+
		"\"\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\67\3\2\2\2\7;\3\2\2\2\t>\3\2\2"+
		"\2\13A\3\2\2\2\rG\3\2\2\2\17J\3\2\2\2\21T\3\2\2\2\23[\3\2\2\2\25]\3\2"+
		"\2\2\27_\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2!j\3\2"+
		"\2\2#s\3\2\2\2%x\3\2\2\2\'|\3\2\2\2)\u0084\3\2\2\2+\u0089\3\2\2\2-\u008d"+
		"\3\2\2\2/\u009a\3\2\2\2\61\u00a9\3\2\2\2\63\64\7u\2\2\64\65\7w\2\2\65"+
		"\66\7d\2\2\66\4\3\2\2\2\678\7e\2\289\7o\2\29:\7r\2\2:\6\3\2\2\2;<\7e\2"+
		"\2<=\7v\2\2=\b\3\2\2\2>?\7u\2\2?@\7r\2\2@\n\3\2\2\2AB\7d\2\2BC\7w\2\2"+
		"CD\7k\2\2DE\7n\2\2EF\7f\2\2F\f\3\2\2\2GH\7u\2\2HI\7o\2\2I\16\3\2\2\2J"+
		"K\7y\2\2KL\7q\2\2LM\7t\2\2MN\7f\2\2NO\7e\2\2OP\7q\2\2PQ\7w\2\2QR\7p\2"+
		"\2RS\7v\2\2S\20\3\2\2\2TU\7e\2\2UV\7q\2\2VW\7p\2\2WX\7e\2\2XY\7c\2\2Y"+
		"Z\7v\2\2Z\22\3\2\2\2[\\\7*\2\2\\\24\3\2\2\2]^\7+\2\2^\26\3\2\2\2_`\7<"+
		"\2\2`a\7?\2\2a\30\3\2\2\2bc\7,\2\2c\32\3\2\2\2de\7\61\2\2e\34\3\2\2\2"+
		"fg\7-\2\2g\36\3\2\2\2hi\7/\2\2i \3\2\2\2jo\5)\25\2kn\5)\25\2ln\5#\22\2"+
		"mk\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\"\3\2\2\2qo\3\2\2"+
		"\2rt\t\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v$\3\2\2\2wy\t\3\2"+
		"\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{&\3\2\2\2|\u0080\7\60\2\2}"+
		"\177\5!\21\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081(\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\t\4\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"*\3\2\2\2\u0088\u008a\7\17\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008c\7\f\2\2\u008c,\3\2\2\2\u008d\u008e\7"+
		"\61\2\2\u008e\u008f\7\61\2\2\u008f\u0093\3\2\2\2\u0090\u0092\13\2\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0094\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\f\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\b\27\2\2\u0099.\3\2\2\2\u009a\u009b\7\61\2"+
		"\2\u009b\u009c\7,\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\13\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a5\7\61"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\30\2\2\u00a7\60\3\2\2\2\u00a8\u00aa"+
		"\t\5\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\31\2\2\u00ae\62\3\2\2"+
		"\2\r\2mouz\u0080\u0086\u0089\u0093\u00a0\u00ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}