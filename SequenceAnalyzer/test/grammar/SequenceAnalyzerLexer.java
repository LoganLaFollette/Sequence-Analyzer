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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, INT=9, USER_ALPHA=10, 
		FILE_EXT=11, LETTER=12, NEWLINE=13, LN_COMMENT=14, COMMENT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "INT", "USER_ALPHA", 
		"FILE_EXT", "LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':='", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ID", "INT", "USER_ALPHA", 
		"FILE_EXT", "LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\t\66"+
		"\n\t\f\t\16\t9\13\t\3\n\6\n<\n\n\r\n\16\n=\3\13\6\13A\n\13\r\13\16\13"+
		"B\3\f\3\f\7\fG\n\f\f\f\16\fJ\13\f\3\r\3\r\3\16\5\16O\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\7\17W\n\17\f\17\16\17Z\13\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\7\20d\n\20\f\20\16\20g\13\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\6\21o\n\21\r\21\16\21p\3\21\3\21\4Xe\2\22\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\6\3\2"+
		"\62;\3\2\62\63\4\2C\\c|\4\2\13\13\"\"\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t*"+
		"\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\60\3\2\2\2\21\62\3\2\2\2\23;\3\2\2"+
		"\2\25@\3\2\2\2\27D\3\2\2\2\31K\3\2\2\2\33N\3\2\2\2\35R\3\2\2\2\37_\3\2"+
		"\2\2!n\3\2\2\2#$\7*\2\2$\4\3\2\2\2%&\7+\2\2&\6\3\2\2\2\'(\7<\2\2()\7?"+
		"\2\2)\b\3\2\2\2*+\7,\2\2+\n\3\2\2\2,-\7\61\2\2-\f\3\2\2\2./\7-\2\2/\16"+
		"\3\2\2\2\60\61\7/\2\2\61\20\3\2\2\2\62\67\5\31\r\2\63\66\5\31\r\2\64\66"+
		"\5\23\n\2\65\63\3\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3"+
		"\2\2\28\22\3\2\2\29\67\3\2\2\2:<\t\2\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>\24\3\2\2\2?A\t\3\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2C\26\3\2\2\2DH\7\60\2\2EG\5\21\t\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2I\30\3\2\2\2JH\3\2\2\2KL\t\4\2\2L\32\3\2\2\2MO\7\17\2\2NM\3\2\2"+
		"\2NO\3\2\2\2OP\3\2\2\2PQ\7\f\2\2Q\34\3\2\2\2RS\7\61\2\2ST\7\61\2\2TX\3"+
		"\2\2\2UW\13\2\2\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX"+
		"\3\2\2\2[\\\7\f\2\2\\]\3\2\2\2]^\b\17\2\2^\36\3\2\2\2_`\7\61\2\2`a\7,"+
		"\2\2ae\3\2\2\2bd\13\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3"+
		"\2\2\2ge\3\2\2\2hi\7,\2\2ij\7\61\2\2jk\3\2\2\2kl\b\20\2\2l \3\2\2\2mo"+
		"\t\5\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\21\2\2"+
		"s\"\3\2\2\2\f\2\65\67=BHNXep\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}