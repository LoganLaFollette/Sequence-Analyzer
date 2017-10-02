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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, INT=8, FILE_EXT=9, 
		LETTER=10, NEWLINE=11, LN_COMMENT=12, COMMENT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ID", "INT", "FILE_EXT", 
		"LETTER", "NEWLINE", "LN_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "ID", "INT", "FILE_EXT", "LETTER", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b/\n\b\f\b\16\b\62\13\b\3\t\6\t\65\n"+
		"\t\r\t\16\t\66\3\n\3\n\7\n;\n\n\f\n\16\n>\13\n\3\13\3\13\3\f\5\fC\n\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\7\rK\n\r\f\r\16\rN\13\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\7\16X\n\16\f\16\16\16[\13\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\6\17c\n\17\r\17\16\17d\3\17\3\17\4LY\2\20\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\5\3\2\62;\4\2C\\c|"+
		"\4\2\13\13\"\"\2o\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5"+
		"!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21"+
		"\64\3\2\2\2\238\3\2\2\2\25?\3\2\2\2\27B\3\2\2\2\31F\3\2\2\2\33S\3\2\2"+
		"\2\35b\3\2\2\2\37 \7*\2\2 \4\3\2\2\2!\"\7+\2\2\"\6\3\2\2\2#$\7,\2\2$\b"+
		"\3\2\2\2%&\7\61\2\2&\n\3\2\2\2\'(\7-\2\2(\f\3\2\2\2)*\7/\2\2*\16\3\2\2"+
		"\2+\60\5\25\13\2,/\5\25\13\2-/\5\21\t\2.,\3\2\2\2.-\3\2\2\2/\62\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\20\3\2\2\2\62\60\3\2\2\2\63\65\t\2\2\2"+
		"\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\22\3\2\2\2"+
		"8<\7\60\2\29;\5\17\b\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\24\3\2"+
		"\2\2><\3\2\2\2?@\t\3\2\2@\26\3\2\2\2AC\7\17\2\2BA\3\2\2\2BC\3\2\2\2CD"+
		"\3\2\2\2DE\7\f\2\2E\30\3\2\2\2FG\7\61\2\2GH\7\61\2\2HL\3\2\2\2IK\13\2"+
		"\2\2JI\3\2\2\2KN\3\2\2\2LM\3\2\2\2LJ\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\f"+
		"\2\2PQ\3\2\2\2QR\b\r\2\2R\32\3\2\2\2ST\7\61\2\2TU\7,\2\2UY\3\2\2\2VX\13"+
		"\2\2\2WV\3\2\2\2X[\3\2\2\2YZ\3\2\2\2YW\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\"+
		"]\7,\2\2]^\7\61\2\2^_\3\2\2\2_`\b\16\2\2`\34\3\2\2\2ac\t\4\2\2ba\3\2\2"+
		"\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\17\2\2g\36\3\2\2\2\13\2"+
		".\60\66<BLYd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}