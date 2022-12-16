/*
 * Copyright 2022 SikongSphere
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
*/
package org.sikongsphere.ifc.parser.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class IFCLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    public static final int T__0 = 1, T_DATA = 2, T_END = 3, T_ENDSEC = 4, T_FALSE = 5,
        T_FILE_DESCRIPTION = 6, T_FILE_NAME = 7, T_FILE_SCHEMA = 8, T_HEADER = 9, T_NULL = 10,
        T_TRUE = 11, T_ISO_10303_21 = 12, T_ADD = 13, T_COLON = 14, T_COMMA = 15, T_PIPE = 16,
        T_DIV = 17, T_DOT = 18, T_DOT2 = 19, T_DOLLAR = 20, T_EQUAL = 21, T_EQUAL2 = 22,
        T_NOTEQUAL = 23, T_NOTEQUAL2 = 24, T_GREATER = 25, T_GREATEREQUAL = 26, T_LESS = 27,
        T_LESSEQUAL = 28, T_MUL = 29, T_OPEN_B = 30, T_OPEN_P = 31, T_OPEN_SB = 32, T_CLOSE_B = 33,
        T_CLOSE_P = 34, T_CLOSE_SB = 35, T_SEMICOLON = 36, T_SUB = 37, T_WELL = 38, L_ID = 39,
        L_S_STRING = 40, L_D_STRING = 41, L_INT = 42, L_DEC = 43, L_WS = 44, L_M_COMMENT = 45,
        L_S_COMMENT = 46, L_FILE = 47;
    public static String[] channelNames = { "DEFAULT_TOKEN_CHANNEL", "HIDDEN" };

    public static String[] modeNames = { "DEFAULT_MODE" };

    private static String[] makeRuleNames() {
        return new String[] {
            "T__0",
            "T_DATA",
            "T_END",
            "T_ENDSEC",
            "T_FALSE",
            "T_FILE_DESCRIPTION",
            "T_FILE_NAME",
            "T_FILE_SCHEMA",
            "T_HEADER",
            "T_NULL",
            "T_TRUE",
            "T_ISO_10303_21",
            "T_ADD",
            "T_COLON",
            "T_COMMA",
            "T_PIPE",
            "T_DIV",
            "T_DOT",
            "T_DOT2",
            "T_DOLLAR",
            "T_EQUAL",
            "T_EQUAL2",
            "T_NOTEQUAL",
            "T_NOTEQUAL2",
            "T_GREATER",
            "T_GREATEREQUAL",
            "T_LESS",
            "T_LESSEQUAL",
            "T_MUL",
            "T_OPEN_B",
            "T_OPEN_P",
            "T_OPEN_SB",
            "T_CLOSE_B",
            "T_CLOSE_P",
            "T_CLOSE_SB",
            "T_SEMICOLON",
            "T_SUB",
            "T_WELL",
            "L_ID",
            "L_S_STRING",
            "L_D_STRING",
            "L_INT",
            "L_DEC",
            "L_WS",
            "L_M_COMMENT",
            "L_S_COMMENT",
            "L_FILE",
            "L_ID_PART",
            "L_STR_ESC_D",
            "L_DIGIT",
            "L_BLANK",
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",
            "Z" };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[] {
            null,
            "'E'",
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            "'+'",
            "':'",
            "','",
            "'||'",
            "'/'",
            "'.'",
            "'..'",
            "'$'",
            "'='",
            "'=='",
            "'<>'",
            "'!='",
            "'>'",
            "'>='",
            "'<'",
            "'<='",
            "'*'",
            "'{'",
            "'('",
            "'['",
            "'}'",
            "')'",
            "']'",
            "';'",
            "'-'",
            "'#'" };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[] {
            null,
            null,
            "T_DATA",
            "T_END",
            "T_ENDSEC",
            "T_FALSE",
            "T_FILE_DESCRIPTION",
            "T_FILE_NAME",
            "T_FILE_SCHEMA",
            "T_HEADER",
            "T_NULL",
            "T_TRUE",
            "T_ISO_10303_21",
            "T_ADD",
            "T_COLON",
            "T_COMMA",
            "T_PIPE",
            "T_DIV",
            "T_DOT",
            "T_DOT2",
            "T_DOLLAR",
            "T_EQUAL",
            "T_EQUAL2",
            "T_NOTEQUAL",
            "T_NOTEQUAL2",
            "T_GREATER",
            "T_GREATEREQUAL",
            "T_LESS",
            "T_LESSEQUAL",
            "T_MUL",
            "T_OPEN_B",
            "T_OPEN_P",
            "T_OPEN_SB",
            "T_CLOSE_B",
            "T_CLOSE_P",
            "T_CLOSE_SB",
            "T_SEMICOLON",
            "T_SUB",
            "T_WELL",
            "L_ID",
            "L_S_STRING",
            "L_D_STRING",
            "L_INT",
            "L_DEC",
            "L_WS",
            "L_M_COMMENT",
            "L_S_COMMENT",
            "L_FILE" };
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

    public IFCLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "IFC.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
        "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0204\b\1\4\2"
            + "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
            + "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
            + "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"
            + "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"
            + " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"
            + "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"
            + "\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"
            + "=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"
            + "I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"
            + "\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"
            + "\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"
            + "\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"
            + "\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"
            + "\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"
            + "\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"
            + "\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"
            + "\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"
            + "\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3"
            + ")\3)\3)\7)\u013f\n)\f)\16)\u0142\13)\3)\3)\3*\3*\3*\7*\u0149\n*\f*\16"
            + "*\u014c\13*\3*\3*\3+\6+\u0151\n+\r+\16+\u0152\3,\6,\u0156\n,\r,\16,\u0157"
            + "\3,\3,\7,\u015c\n,\f,\16,\u015f\13,\3,\3,\6,\u0163\n,\r,\16,\u0164\3,"
            + "\3,\3,\5,\u016a\n,\3-\6-\u016d\n-\r-\16-\u016e\3-\3-\3.\3.\3.\3.\7.\u0177"
            + "\n.\f.\16.\u017a\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\5/\u0185\n/\3/\7/\u0188"
            + "\n/\f/\16/\u018b\13/\3/\5/\u018e\n/\3/\3/\3/\3/\3\60\3\60\3\60\5\60\u0197"
            + "\n\60\5\60\u0199\n\60\3\60\3\60\3\60\7\60\u019e\n\60\f\60\16\60\u01a1"
            + "\13\60\3\61\3\61\3\61\3\61\7\61\u01a7\n\61\f\61\16\61\u01aa\13\61\3\61"
            + "\3\61\3\61\7\61\u01af\n\61\f\61\16\61\u01b2\13\61\3\61\3\61\3\61\7\61"
            + "\u01b7\n\61\f\61\16\61\u01ba\13\61\3\61\3\61\3\61\7\61\u01bf\n\61\f\61"
            + "\16\61\u01c2\13\61\3\61\5\61\u01c5\n\61\3\62\3\62\3\62\3\62\5\62\u01cb"
            + "\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"
            + ":\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3"
            + "E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\b\u014a\u0178"
            + "\u0189\u01b0\u01b8\u01c0\2O\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"
            + "\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"
            + "\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"
            + "\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"
            + "\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097"
            + "\2\u0099\2\u009b\2\3\2 \3\2))\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\4\2"
            + "CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4"
            + "\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTt"
            + "t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2"
            + "\u0202\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"
            + "\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"
            + "\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"
            + "\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"
            + "/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"
            + "\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"
            + "G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"
            + "\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"
            + "\2\3\u009d\3\2\2\2\5\u009f\3\2\2\2\7\u00a4\3\2\2\2\t\u00a8\3\2\2\2\13"
            + "\u00af\3\2\2\2\r\u00b5\3\2\2\2\17\u00c6\3\2\2\2\21\u00d0\3\2\2\2\23\u00dc"
            + "\3\2\2\2\25\u00e3\3\2\2\2\27\u00e8\3\2\2\2\31\u00ed\3\2\2\2\33\u00fb\3"
            + "\2\2\2\35\u00fd\3\2\2\2\37\u00ff\3\2\2\2!\u0101\3\2\2\2#\u0104\3\2\2\2"
            + "%\u0106\3\2\2\2\'\u0108\3\2\2\2)\u010b\3\2\2\2+\u010d\3\2\2\2-\u010f\3"
            + "\2\2\2/\u0112\3\2\2\2\61\u0115\3\2\2\2\63\u0118\3\2\2\2\65\u011a\3\2\2"
            + "\2\67\u011d\3\2\2\29\u011f\3\2\2\2;\u0122\3\2\2\2=\u0124\3\2\2\2?\u0126"
            + "\3\2\2\2A\u0128\3\2\2\2C\u012a\3\2\2\2E\u012c\3\2\2\2G\u012e\3\2\2\2I"
            + "\u0130\3\2\2\2K\u0132\3\2\2\2M\u0134\3\2\2\2O\u0136\3\2\2\2Q\u0138\3\2"
            + "\2\2S\u0145\3\2\2\2U\u0150\3\2\2\2W\u0169\3\2\2\2Y\u016c\3\2\2\2[\u0172"
            + "\3\2\2\2]\u0184\3\2\2\2_\u0198\3\2\2\2a\u01c4\3\2\2\2c\u01ca\3\2\2\2e"
            + "\u01cc\3\2\2\2g\u01ce\3\2\2\2i\u01d0\3\2\2\2k\u01d2\3\2\2\2m\u01d4\3\2"
            + "\2\2o\u01d6\3\2\2\2q\u01d8\3\2\2\2s\u01da\3\2\2\2u\u01dc\3\2\2\2w\u01de"
            + "\3\2\2\2y\u01e0\3\2\2\2{\u01e2\3\2\2\2}\u01e4\3\2\2\2\177\u01e6\3\2\2"
            + "\2\u0081\u01e8\3\2\2\2\u0083\u01ea\3\2\2\2\u0085\u01ec\3\2\2\2\u0087\u01ee"
            + "\3\2\2\2\u0089\u01f0\3\2\2\2\u008b\u01f2\3\2\2\2\u008d\u01f4\3\2\2\2\u008f"
            + "\u01f6\3\2\2\2\u0091\u01f8\3\2\2\2\u0093\u01fa\3\2\2\2\u0095\u01fc\3\2"
            + "\2\2\u0097\u01fe\3\2\2\2\u0099\u0200\3\2\2\2\u009b\u0202\3\2\2\2\u009d"
            + "\u009e\7G\2\2\u009e\4\3\2\2\2\u009f\u00a0\5o8\2\u00a0\u00a1\5i\65\2\u00a1"
            + "\u00a2\5\u008fH\2\u00a2\u00a3\5i\65\2\u00a3\6\3\2\2\2\u00a4\u00a5\5q9"
            + "\2\u00a5\u00a6\5\u0083B\2\u00a6\u00a7\5o8\2\u00a7\b\3\2\2\2\u00a8\u00a9"
            + "\5q9\2\u00a9\u00aa\5\u0083B\2\u00aa\u00ab\5o8\2\u00ab\u00ac\5\u008dG\2"
            + "\u00ac\u00ad\5q9\2\u00ad\u00ae\5m\67\2\u00ae\n\3\2\2\2\u00af\u00b0\5s"
            + ":\2\u00b0\u00b1\5i\65\2\u00b1\u00b2\5\177@\2\u00b2\u00b3\5\u008dG\2\u00b3"
            + "\u00b4\5q9\2\u00b4\f\3\2\2\2\u00b5\u00b6\5s:\2\u00b6\u00b7\5y=\2\u00b7"
            + "\u00b8\5\177@\2\u00b8\u00b9\5q9\2\u00b9\u00ba\7a\2\2\u00ba\u00bb\5o8\2"
            + "\u00bb\u00bc\5q9\2\u00bc\u00bd\5\u008dG\2\u00bd\u00be\5m\67\2\u00be\u00bf"
            + "\5\u008bF\2\u00bf\u00c0\5y=\2\u00c0\u00c1\5\u0087D\2\u00c1\u00c2\5\u008f"
            + "H\2\u00c2\u00c3\5y=\2\u00c3\u00c4\5\u0085C\2\u00c4\u00c5\5\u0083B\2\u00c5"
            + "\16\3\2\2\2\u00c6\u00c7\5s:\2\u00c7\u00c8\5y=\2\u00c8\u00c9\5\177@\2\u00c9"
            + "\u00ca\5q9\2\u00ca\u00cb\7a\2\2\u00cb\u00cc\5\u0083B\2\u00cc\u00cd\5i"
            + "\65\2\u00cd\u00ce\5\u0081A\2\u00ce\u00cf\5q9\2\u00cf\20\3\2\2\2\u00d0"
            + "\u00d1\5s:\2\u00d1\u00d2\5y=\2\u00d2\u00d3\5\177@\2\u00d3\u00d4\5q9\2"
            + "\u00d4\u00d5\7a\2\2\u00d5\u00d6\5\u008dG\2\u00d6\u00d7\5m\67\2\u00d7\u00d8"
            + "\5w<\2\u00d8\u00d9\5q9\2\u00d9\u00da\5\u0081A\2\u00da\u00db\5i\65\2\u00db"
            + "\22\3\2\2\2\u00dc\u00dd\5w<\2\u00dd\u00de\5q9\2\u00de\u00df\5i\65\2\u00df"
            + "\u00e0\5o8\2\u00e0\u00e1\5q9\2\u00e1\u00e2\5\u008bF\2\u00e2\24\3\2\2\2"
            + "\u00e3\u00e4\5\u0083B\2\u00e4\u00e5\5\u0091I\2\u00e5\u00e6\5\177@\2\u00e6"
            + "\u00e7\5\177@\2\u00e7\26\3\2\2\2\u00e8\u00e9\5\u008fH\2\u00e9\u00ea\5"
            + "\u008bF\2\u00ea\u00eb\5\u0091I\2\u00eb\u00ec\5q9\2\u00ec\30\3\2\2\2\u00ed"
            + "\u00ee\5y=\2\u00ee\u00ef\5\u008dG\2\u00ef\u00f0\5\u0085C\2\u00f0\u00f1"
            + "\5K&\2\u00f1\u00f2\7\63\2\2\u00f2\u00f3\7\62\2\2\u00f3\u00f4\7\65\2\2"
            + "\u00f4\u00f5\7\62\2\2\u00f5\u00f6\7\65\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"
            + "\5K&\2\u00f8\u00f9\7\64\2\2\u00f9\u00fa\7\63\2\2\u00fa\32\3\2\2\2\u00fb"
            + "\u00fc\7-\2\2\u00fc\34\3\2\2\2\u00fd\u00fe\7<\2\2\u00fe\36\3\2\2\2\u00ff"
            + "\u0100\7.\2\2\u0100 \3\2\2\2\u0101\u0102\7~\2\2\u0102\u0103\7~\2\2\u0103"
            + "\"\3\2\2\2\u0104\u0105\7\61\2\2\u0105$\3\2\2\2\u0106\u0107\7\60\2\2\u0107"
            + "&\3\2\2\2\u0108\u0109\7\60\2\2\u0109\u010a\7\60\2\2\u010a(\3\2\2\2\u010b"
            + "\u010c\7&\2\2\u010c*\3\2\2\2\u010d\u010e\7?\2\2\u010e,\3\2\2\2\u010f\u0110"
            + "\7?\2\2\u0110\u0111\7?\2\2\u0111.\3\2\2\2\u0112\u0113\7>\2\2\u0113\u0114"
            + "\7@\2\2\u0114\60\3\2\2\2\u0115\u0116\7#\2\2\u0116\u0117\7?\2\2\u0117\62"
            + "\3\2\2\2\u0118\u0119\7@\2\2\u0119\64\3\2\2\2\u011a\u011b\7@\2\2\u011b"
            + "\u011c\7?\2\2\u011c\66\3\2\2\2\u011d\u011e\7>\2\2\u011e8\3\2\2\2\u011f"
            + "\u0120\7>\2\2\u0120\u0121\7?\2\2\u0121:\3\2\2\2\u0122\u0123\7,\2\2\u0123"
            + "<\3\2\2\2\u0124\u0125\7}\2\2\u0125>\3\2\2\2\u0126\u0127\7*\2\2\u0127@"
            + "\3\2\2\2\u0128\u0129\7]\2\2\u0129B\3\2\2\2\u012a\u012b\7\177\2\2\u012b"
            + "D\3\2\2\2\u012c\u012d\7+\2\2\u012dF\3\2\2\2\u012e\u012f\7_\2\2\u012fH"
            + "\3\2\2\2\u0130\u0131\7=\2\2\u0131J\3\2\2\2\u0132\u0133\7/\2\2\u0133L\3"
            + "\2\2\2\u0134\u0135\7%\2\2\u0135N\3\2\2\2\u0136\u0137\5a\61\2\u0137P\3"
            + "\2\2\2\u0138\u0140\7)\2\2\u0139\u013a\7)\2\2\u013a\u013f\7)\2\2\u013b"
            + "\u013c\7^\2\2\u013c\u013f\7)\2\2\u013d\u013f\n\2\2\2\u013e\u0139\3\2\2"
            + "\2\u013e\u013b\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e"
            + "\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143"
            + "\u0144\7)\2\2\u0144R\3\2\2\2\u0145\u014a\7$\2\2\u0146\u0149\5c\62\2\u0147"
            + "\u0149\13\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3"
            + "\2\2\2\u014a\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\3\2\2\2\u014c"
            + "\u014a\3\2\2\2\u014d\u014e\7$\2\2\u014eT\3\2\2\2\u014f\u0151\5e\63\2\u0150"
            + "\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"
            + "\2\2\u0153V\3\2\2\2\u0154\u0156\5e\63\2\u0155\u0154\3\2\2\2\u0156\u0157"
            + "\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"
            + "\u015d\7\60\2\2\u015a\u015c\5e\63\2\u015b\u015a\3\2\2\2\u015c\u015f\3"
            + "\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u016a\3\2\2\2\u015f"
            + "\u015d\3\2\2\2\u0160\u0162\7\60\2\2\u0161\u0163\5e\63\2\u0162\u0161\3"
            + "\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"
            + "\u016a\3\2\2\2\u0166\u0167\5e\63\2\u0167\u0168\7\60\2\2\u0168\u016a\3"
            + "\2\2\2\u0169\u0155\3\2\2\2\u0169\u0160\3\2\2\2\u0169\u0166\3\2\2\2\u016a"
            + "X\3\2\2\2\u016b\u016d\5g\64\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2"
            + "\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171"
            + "\b-\2\2\u0171Z\3\2\2\2\u0172\u0173\7\61\2\2\u0173\u0174\7,\2\2\u0174\u0178"
            + "\3\2\2\2\u0175\u0177\13\2\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2"
            + "\u0178\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178"
            + "\3\2\2\2\u017b\u017c\7,\2\2\u017c\u017d\7\61\2\2\u017d\u017e\3\2\2\2\u017e"
            + "\u017f\b.\3\2\u017f\\\3\2\2\2\u0180\u0181\7/\2\2\u0181\u0185\7/\2\2\u0182"
            + "\u0183\7\61\2\2\u0183\u0185\7\61\2\2\u0184\u0180\3\2\2\2\u0184\u0182\3"
            + "\2\2\2\u0185\u0189\3\2\2\2\u0186\u0188\13\2\2\2\u0187\u0186\3\2\2\2\u0188"
            + "\u018b\3\2\2\2\u0189\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2"
            + "\2\2\u018b\u0189\3\2\2\2\u018c\u018e\7\17\2\2\u018d\u018c\3\2\2\2\u018d"
            + "\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7\f\2\2\u0190\u0191\3\2"
            + "\2\2\u0191\u0192\b/\3\2\u0192^\3\2\2\2\u0193\u0194\t\3\2\2\u0194\u0196"
            + "\7<\2\2\u0195\u0197\7^\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197"
            + "\u0199\3\2\2\2\u0198\u0193\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2"
            + "\2\2\u019a\u019f\5O(\2\u019b\u019c\7^\2\2\u019c\u019e\5O(\2\u019d\u019b"
            + "\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"
            + "`\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a8\t\3\2\2\u01a3\u01a7\t\3\2\2"
            + "\u01a4\u01a7\5e\63\2\u01a5\u01a7\7a\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4"
            + "\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"
            + "\u01a9\3\2\2\2\u01a9\u01c5\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7&"
            + "\2\2\u01ac\u01b0\7}\2\2\u01ad\u01af\13\2\2\2\u01ae\u01ad\3\2\2\2\u01af"
            + "\u01b2\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b3\3\2"
            + "\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01c5\7\177\2\2\u01b4\u01b8\7]\2\2\u01b5"
            + "\u01b7\13\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b9\3"
            + "\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"
            + "\u01c5\7_\2\2\u01bc\u01c0\7b\2\2\u01bd\u01bf\13\2\2\2\u01be\u01bd\3\2"
            + "\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1"
            + "\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5\7b\2\2\u01c4\u01a2\3\2"
            + "\2\2\u01c4\u01ab\3\2\2\2\u01c4\u01b4\3\2\2\2\u01c4\u01bc\3\2\2\2\u01c5"
            + "b\3\2\2\2\u01c6\u01c7\7$\2\2\u01c7\u01cb\7$\2\2\u01c8\u01c9\7^\2\2\u01c9"
            + "\u01cb\7$\2\2\u01ca\u01c6\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cbd\3\2\2\2\u01cc"
            + "\u01cd\t\4\2\2\u01cdf\3\2\2\2\u01ce\u01cf\t\5\2\2\u01cfh\3\2\2\2\u01d0"
            + "\u01d1\t\6\2\2\u01d1j\3\2\2\2\u01d2\u01d3\t\7\2\2\u01d3l\3\2\2\2\u01d4"
            + "\u01d5\t\b\2\2\u01d5n\3\2\2\2\u01d6\u01d7\t\t\2\2\u01d7p\3\2\2\2\u01d8"
            + "\u01d9\t\n\2\2\u01d9r\3\2\2\2\u01da\u01db\t\13\2\2\u01dbt\3\2\2\2\u01dc"
            + "\u01dd\t\f\2\2\u01ddv\3\2\2\2\u01de\u01df\t\r\2\2\u01dfx\3\2\2\2\u01e0"
            + "\u01e1\t\16\2\2\u01e1z\3\2\2\2\u01e2\u01e3\t\17\2\2\u01e3|\3\2\2\2\u01e4"
            + "\u01e5\t\20\2\2\u01e5~\3\2\2\2\u01e6\u01e7\t\21\2\2\u01e7\u0080\3\2\2"
            + "\2\u01e8\u01e9\t\22\2\2\u01e9\u0082\3\2\2\2\u01ea\u01eb\t\23\2\2\u01eb"
            + "\u0084\3\2\2\2\u01ec\u01ed\t\24\2\2\u01ed\u0086\3\2\2\2\u01ee\u01ef\t"
            + "\25\2\2\u01ef\u0088\3\2\2\2\u01f0\u01f1\t\26\2\2\u01f1\u008a\3\2\2\2\u01f2"
            + "\u01f3\t\27\2\2\u01f3\u008c\3\2\2\2\u01f4\u01f5\t\30\2\2\u01f5\u008e\3"
            + "\2\2\2\u01f6\u01f7\t\31\2\2\u01f7\u0090\3\2\2\2\u01f8\u01f9\t\32\2\2\u01f9"
            + "\u0092\3\2\2\2\u01fa\u01fb\t\33\2\2\u01fb\u0094\3\2\2\2\u01fc\u01fd\t"
            + "\34\2\2\u01fd\u0096\3\2\2\2\u01fe\u01ff\t\35\2\2\u01ff\u0098\3\2\2\2\u0200"
            + "\u0201\t\36\2\2\u0201\u009a\3\2\2\2\u0202\u0203\t\37\2\2\u0203\u009c\3"
            + "\2\2\2\33\2\u013e\u0140\u0148\u014a\u0152\u0157\u015d\u0164\u0169\u016e"
            + "\u0178\u0184\u0189\u018d\u0196\u0198\u019f\u01a6\u01a8\u01b0\u01b8\u01c0"
            + "\u01c4\u01ca\4\b\2\2\2\3\2";
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
