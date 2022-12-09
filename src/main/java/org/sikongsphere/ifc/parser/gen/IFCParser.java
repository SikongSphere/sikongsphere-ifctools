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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class IFCParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION);
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
    public static final int RULE_ifcmodel = 0, RULE_header = 1, RULE_data = 2, RULE_dataItem = 3,
        RULE_isoTag = 4, RULE_expr = 5, RULE_exprAtom = 6, RULE_exprFunc = 7, RULE_exprFuncParams =
            8, RULE_funcParam = 9, RULE_ident = 10, RULE_string = 11, RULE_intNumber = 12,
        RULE_decNumber = 13, RULE_scientificCountingNumber = 14, RULE_boolLiteral = 15,
        RULE_nullConst = 16;

    private static String[] makeRuleNames() {
        return new String[] {
            "ifcmodel",
            "header",
            "data",
            "dataItem",
            "isoTag",
            "expr",
            "exprAtom",
            "exprFunc",
            "exprFuncParams",
            "funcParam",
            "ident",
            "string",
            "intNumber",
            "decNumber",
            "scientificCountingNumber",
            "boolLiteral",
            "nullConst" };
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
    public ATN getATN() {
        return _ATN;
    }

    public IFCParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class IfcmodelContext extends ParserRuleContext {
        public List<IsoTagContext> isoTag() {
            return getRuleContexts(IsoTagContext.class);
        }

        public IsoTagContext isoTag(int i) {
            return getRuleContext(IsoTagContext.class, i);
        }

        public TerminalNode T_SEMICOLON() {
            return getToken(IFCParser.T_SEMICOLON, 0);
        }

        public HeaderContext header() {
            return getRuleContext(HeaderContext.class, 0);
        }

        public DataContext data() {
            return getRuleContext(DataContext.class, 0);
        }

        public TerminalNode T_END() {
            return getToken(IFCParser.T_END, 0);
        }

        public TerminalNode T_SUB() {
            return getToken(IFCParser.T_SUB, 0);
        }

        public IfcmodelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifcmodel;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterIfcmodel(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitIfcmodel(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitIfcmodel(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IfcmodelContext ifcmodel() throws RecognitionException {
        IfcmodelContext _localctx = new IfcmodelContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_ifcmodel);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(34);
                isoTag();
                setState(35);
                match(T_SEMICOLON);
                setState(36);
                header();
                setState(37);
                data();
                setState(38);
                match(T_END);
                setState(39);
                match(T_SUB);
                setState(40);
                isoTag();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class HeaderContext extends ParserRuleContext {
        public ExprFuncParamsContext fileDescription;
        public ExprFuncParamsContext fileName;
        public ExprFuncParamsContext fileSchema;

        public TerminalNode T_HEADER() {
            return getToken(IFCParser.T_HEADER, 0);
        }

        public List<TerminalNode> T_SEMICOLON() {
            return getTokens(IFCParser.T_SEMICOLON);
        }

        public TerminalNode T_SEMICOLON(int i) {
            return getToken(IFCParser.T_SEMICOLON, i);
        }

        public TerminalNode T_FILE_DESCRIPTION() {
            return getToken(IFCParser.T_FILE_DESCRIPTION, 0);
        }

        public List<TerminalNode> T_OPEN_P() {
            return getTokens(IFCParser.T_OPEN_P);
        }

        public TerminalNode T_OPEN_P(int i) {
            return getToken(IFCParser.T_OPEN_P, i);
        }

        public List<TerminalNode> T_CLOSE_P() {
            return getTokens(IFCParser.T_CLOSE_P);
        }

        public TerminalNode T_CLOSE_P(int i) {
            return getToken(IFCParser.T_CLOSE_P, i);
        }

        public TerminalNode T_FILE_NAME() {
            return getToken(IFCParser.T_FILE_NAME, 0);
        }

        public TerminalNode T_FILE_SCHEMA() {
            return getToken(IFCParser.T_FILE_SCHEMA, 0);
        }

        public TerminalNode T_ENDSEC() {
            return getToken(IFCParser.T_ENDSEC, 0);
        }

        public List<ExprFuncParamsContext> exprFuncParams() {
            return getRuleContexts(ExprFuncParamsContext.class);
        }

        public ExprFuncParamsContext exprFuncParams(int i) {
            return getRuleContext(ExprFuncParamsContext.class, i);
        }

        public HeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_header;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitHeader(this);
            else return visitor.visitChildren(this);
        }
    }

    public final HeaderContext header() throws RecognitionException {
        HeaderContext _localctx = new HeaderContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_header);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(42);
                match(T_HEADER);
                setState(43);
                match(T_SEMICOLON);
                setState(44);
                match(T_FILE_DESCRIPTION);
                setState(45);
                match(T_OPEN_P);
                setState(47);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                    case 1: {
                        setState(46);
                        ((HeaderContext) _localctx).fileDescription = exprFuncParams();
                    }
                        break;
                }
                setState(49);
                match(T_CLOSE_P);
                setState(50);
                match(T_SEMICOLON);
                setState(51);
                match(T_FILE_NAME);
                setState(52);
                match(T_OPEN_P);
                setState(54);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                    case 1: {
                        setState(53);
                        ((HeaderContext) _localctx).fileName = exprFuncParams();
                    }
                        break;
                }
                setState(56);
                match(T_CLOSE_P);
                setState(57);
                match(T_SEMICOLON);
                setState(58);
                match(T_FILE_SCHEMA);
                setState(59);
                match(T_OPEN_P);
                setState(61);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                    case 1: {
                        setState(60);
                        ((HeaderContext) _localctx).fileSchema = exprFuncParams();
                    }
                        break;
                }
                setState(63);
                match(T_CLOSE_P);
                setState(64);
                match(T_SEMICOLON);
                setState(65);
                match(T_ENDSEC);
                setState(66);
                match(T_SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DataContext extends ParserRuleContext {
        public TerminalNode T_DATA() {
            return getToken(IFCParser.T_DATA, 0);
        }

        public List<TerminalNode> T_SEMICOLON() {
            return getTokens(IFCParser.T_SEMICOLON);
        }

        public TerminalNode T_SEMICOLON(int i) {
            return getToken(IFCParser.T_SEMICOLON, i);
        }

        public TerminalNode T_ENDSEC() {
            return getToken(IFCParser.T_ENDSEC, 0);
        }

        public List<DataItemContext> dataItem() {
            return getRuleContexts(DataItemContext.class);
        }

        public DataItemContext dataItem(int i) {
            return getRuleContext(DataItemContext.class, i);
        }

        public DataContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_data;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterData(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitData(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor).visitData(
                this
            );
            else return visitor.visitChildren(this);
        }
    }

    public final DataContext data() throws RecognitionException {
        DataContext _localctx = new DataContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_data);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(68);
                match(T_DATA);
                setState(69);
                match(T_SEMICOLON);
                setState(73);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T_WELL) {
                    {
                        {
                            setState(70);
                            dataItem();
                        }
                    }
                    setState(75);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(76);
                match(T_ENDSEC);
                setState(77);
                match(T_SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DataItemContext extends ParserRuleContext {
        public IntNumberContext stepNumber;

        public TerminalNode T_WELL() {
            return getToken(IFCParser.T_WELL, 0);
        }

        public TerminalNode T_EQUAL() {
            return getToken(IFCParser.T_EQUAL, 0);
        }

        public ExprFuncContext exprFunc() {
            return getRuleContext(ExprFuncContext.class, 0);
        }

        public TerminalNode T_SEMICOLON() {
            return getToken(IFCParser.T_SEMICOLON, 0);
        }

        public IntNumberContext intNumber() {
            return getRuleContext(IntNumberContext.class, 0);
        }

        public DataItemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dataItem;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterDataItem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitDataItem(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitDataItem(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DataItemContext dataItem() throws RecognitionException {
        DataItemContext _localctx = new DataItemContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_dataItem);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                match(T_WELL);
                setState(80);
                ((DataItemContext) _localctx).stepNumber = intNumber();
                setState(81);
                match(T_EQUAL);
                setState(82);
                exprFunc();
                setState(83);
                match(T_SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IsoTagContext extends ParserRuleContext {
        public TerminalNode T_ISO_10303_21() {
            return getToken(IFCParser.T_ISO_10303_21, 0);
        }

        public IsoTagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isoTag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterIsoTag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitIsoTag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitIsoTag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsoTagContext isoTag() throws RecognitionException {
        IsoTagContext _localctx = new IsoTagContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_isoTag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(85);
                match(T_ISO_10303_21);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprFuncContext exprFunc() {
            return getRuleContext(ExprFuncContext.class, 0);
        }

        public ExprAtomContext exprAtom() {
            return getRuleContext(ExprAtomContext.class, 0);
        }

        public TerminalNode T_WELL() {
            return getToken(IFCParser.T_WELL, 0);
        }

        public IntNumberContext intNumber() {
            return getRuleContext(IntNumberContext.class, 0);
        }

        public List<TerminalNode> T_DOT() {
            return getTokens(IFCParser.T_DOT);
        }

        public TerminalNode T_DOT(int i) {
            return getToken(IFCParser.T_DOT, i);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(IFCParser.T_OPEN_P, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(IFCParser.T_CLOSE_P, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(IFCParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(IFCParser.T_COMMA, i);
        }

        public TerminalNode T_MUL() {
            return getToken(IFCParser.T_MUL, 0);
        }

        public TerminalNode T_DIV() {
            return getToken(IFCParser.T_DIV, 0);
        }

        public TerminalNode T_ADD() {
            return getToken(IFCParser.T_ADD, 0);
        }

        public TerminalNode T_SUB() {
            return getToken(IFCParser.T_SUB, 0);
        }

        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor).visitExpr(
                this
            );
            else return visitor.visitChildren(this);
        }
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 10;
        enterRecursionRule(_localctx, 10, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(107);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                    case 1: {
                        setState(88);
                        exprFunc();
                    }
                        break;
                    case 2: {
                        setState(89);
                        exprAtom();
                    }
                        break;
                    case 3: {
                        setState(90);
                        match(T_WELL);
                        setState(91);
                        intNumber();
                    }
                        break;
                    case 4: {
                        setState(92);
                        match(T_DOT);
                        setState(93);
                        ident();
                        setState(94);
                        match(T_DOT);
                    }
                        break;
                    case 5: {
                        setState(96);
                        match(T_OPEN_P);
                        setState(97);
                        expr(0);
                        setState(102);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T_COMMA) {
                            {
                                {
                                    setState(98);
                                    match(T_COMMA);
                                    setState(99);
                                    expr(0);
                                }
                            }
                            setState(104);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(105);
                        match(T_CLOSE_P);
                    }
                        break;
                }
                _ctx.stop = _input.LT(-1);
                setState(123);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(121);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                                case 1: {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(109);
                                    if (!(precpred(_ctx, 9))) throw new FailedPredicateException(
                                        this,
                                        "precpred(_ctx, 9)"
                                    );
                                    setState(110);
                                    match(T_MUL);
                                    setState(111);
                                    expr(10);
                                }
                                    break;
                                case 2: {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(112);
                                    if (!(precpred(_ctx, 8))) throw new FailedPredicateException(
                                        this,
                                        "precpred(_ctx, 8)"
                                    );
                                    setState(113);
                                    match(T_DIV);
                                    setState(114);
                                    expr(9);
                                }
                                    break;
                                case 3: {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(115);
                                    if (!(precpred(_ctx, 7))) throw new FailedPredicateException(
                                        this,
                                        "precpred(_ctx, 7)"
                                    );
                                    setState(116);
                                    match(T_ADD);
                                    setState(117);
                                    expr(8);
                                }
                                    break;
                                case 4: {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(118);
                                    if (!(precpred(_ctx, 6))) throw new FailedPredicateException(
                                        this,
                                        "precpred(_ctx, 6)"
                                    );
                                    setState(119);
                                    match(T_SUB);
                                    setState(120);
                                    expr(7);
                                }
                                    break;
                            }
                        }
                    }
                    setState(125);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class ExprAtomContext extends ParserRuleContext {
        public BoolLiteralContext boolLiteral() {
            return getRuleContext(BoolLiteralContext.class, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public StringContext string() {
            return getRuleContext(StringContext.class, 0);
        }

        public DecNumberContext decNumber() {
            return getRuleContext(DecNumberContext.class, 0);
        }

        public IntNumberContext intNumber() {
            return getRuleContext(IntNumberContext.class, 0);
        }

        public ScientificCountingNumberContext scientificCountingNumber() {
            return getRuleContext(ScientificCountingNumberContext.class, 0);
        }

        public NullConstContext nullConst() {
            return getRuleContext(NullConstContext.class, 0);
        }

        public ExprAtomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exprAtom;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterExprAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitExprAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitExprAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprAtomContext exprAtom() throws RecognitionException {
        ExprAtomContext _localctx = new ExprAtomContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_exprAtom);
        try {
            setState(133);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(126);
                    boolLiteral();
                }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(127);
                    ident();
                }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3); {
                    setState(128);
                    string();
                }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4); {
                    setState(129);
                    decNumber();
                }
                    break;
                case 5:
                    enterOuterAlt(_localctx, 5); {
                    setState(130);
                    intNumber();
                }
                    break;
                case 6:
                    enterOuterAlt(_localctx, 6); {
                    setState(131);
                    scientificCountingNumber();
                }
                    break;
                case 7:
                    enterOuterAlt(_localctx, 7); {
                    setState(132);
                    nullConst();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprFuncContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(IFCParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(IFCParser.T_CLOSE_P, 0);
        }

        public ExprFuncParamsContext exprFuncParams() {
            return getRuleContext(ExprFuncParamsContext.class, 0);
        }

        public ExprFuncContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exprFunc;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterExprFunc(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitExprFunc(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitExprFunc(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprFuncContext exprFunc() throws RecognitionException {
        ExprFuncContext _localctx = new ExprFuncContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_exprFunc);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(135);
                ident();
                setState(136);
                match(T_OPEN_P);
                setState(138);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                    case 1: {
                        setState(137);
                        exprFuncParams();
                    }
                        break;
                }
                setState(140);
                match(T_CLOSE_P);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprFuncParamsContext extends ParserRuleContext {
        public List<FuncParamContext> funcParam() {
            return getRuleContexts(FuncParamContext.class);
        }

        public FuncParamContext funcParam(int i) {
            return getRuleContext(FuncParamContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(IFCParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(IFCParser.T_COMMA, i);
        }

        public ExprFuncParamsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exprFuncParams;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterExprFuncParams(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitExprFuncParams(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitExprFuncParams(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprFuncParamsContext exprFuncParams() throws RecognitionException {
        ExprFuncParamsContext _localctx = new ExprFuncParamsContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_exprFuncParams);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(142);
                funcParam();
                setState(147);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T_COMMA) {
                    {
                        {
                            setState(143);
                            match(T_COMMA);
                            setState(144);
                            funcParam();
                        }
                    }
                    setState(149);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FuncParamContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(IFCParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(IFCParser.T_COMMA, i);
        }

        public TerminalNode T_MUL() {
            return getToken(IFCParser.T_MUL, 0);
        }

        public TerminalNode T_DOLLAR() {
            return getToken(IFCParser.T_DOLLAR, 0);
        }

        public FuncParamContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcParam;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterFuncParam(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitFuncParam(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitFuncParam(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FuncParamContext funcParam() throws RecognitionException {
        FuncParamContext _localctx = new FuncParamContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_funcParam);
        try {
            int _alt;
            setState(161);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T_COMMA:
                case T_CLOSE_P:
                    enterOuterAlt(_localctx, 1); {}
                    break;
                case T_FALSE:
                case T_NULL:
                case T_TRUE:
                case T_ADD:
                case T_DOT:
                case T_OPEN_P:
                case T_SUB:
                case T_WELL:
                case L_ID:
                case L_S_STRING:
                case L_D_STRING:
                case L_INT:
                case L_DEC:
                    enterOuterAlt(_localctx, 2); {
                    setState(151);
                    expr(0);
                    setState(156);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(152);
                                    match(T_COMMA);
                                    setState(153);
                                    expr(0);
                                }
                            }
                        }
                        setState(158);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                    }
                }
                    break;
                case T_MUL:
                    enterOuterAlt(_localctx, 3); {
                    setState(159);
                    match(T_MUL);
                }
                    break;
                case T_DOLLAR:
                    enterOuterAlt(_localctx, 4); {
                    setState(160);
                    match(T_DOLLAR);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IdentContext extends ParserRuleContext {
        public TerminalNode L_ID() {
            return getToken(IFCParser.L_ID, 0);
        }

        public IdentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ident;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterIdent(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitIdent(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitIdent(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentContext ident() throws RecognitionException {
        IdentContext _localctx = new IdentContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_ident);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(163);
                match(L_ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StringContext extends ParserRuleContext {
        public StringContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_string;
        }

        public StringContext() {}

        public void copyFrom(StringContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class SingleQuotedStringContext extends StringContext {
        public TerminalNode L_S_STRING() {
            return getToken(IFCParser.L_S_STRING, 0);
        }

        public SingleQuotedStringContext(StringContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterSingleQuotedString(
                this
            );
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitSingleQuotedString(
                this
            );
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitSingleQuotedString(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DoubleQuotedStringContext extends StringContext {
        public TerminalNode L_D_STRING() {
            return getToken(IFCParser.L_D_STRING, 0);
        }

        public DoubleQuotedStringContext(StringContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterDoubleQuotedString(
                this
            );
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitDoubleQuotedString(
                this
            );
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitDoubleQuotedString(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StringContext string() throws RecognitionException {
        StringContext _localctx = new StringContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_string);
        try {
            setState(167);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case L_S_STRING:
                    _localctx = new SingleQuotedStringContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(165);
                    match(L_S_STRING);
                }
                    break;
                case L_D_STRING:
                    _localctx = new DoubleQuotedStringContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(166);
                    match(L_D_STRING);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IntNumberContext extends ParserRuleContext {
        public TerminalNode L_INT() {
            return getToken(IFCParser.L_INT, 0);
        }

        public TerminalNode T_SUB() {
            return getToken(IFCParser.T_SUB, 0);
        }

        public TerminalNode T_ADD() {
            return getToken(IFCParser.T_ADD, 0);
        }

        public IntNumberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_intNumber;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterIntNumber(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitIntNumber(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitIntNumber(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IntNumberContext intNumber() throws RecognitionException {
        IntNumberContext _localctx = new IntNumberContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_intNumber);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(170);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T_ADD || _la == T_SUB) {
                    {
                        setState(169);
                        _la = _input.LA(1);
                        if (!(_la == T_ADD || _la == T_SUB)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(172);
                match(L_INT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DecNumberContext extends ParserRuleContext {
        public TerminalNode L_DEC() {
            return getToken(IFCParser.L_DEC, 0);
        }

        public TerminalNode T_SUB() {
            return getToken(IFCParser.T_SUB, 0);
        }

        public TerminalNode T_ADD() {
            return getToken(IFCParser.T_ADD, 0);
        }

        public DecNumberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_decNumber;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterDecNumber(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitDecNumber(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitDecNumber(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DecNumberContext decNumber() throws RecognitionException {
        DecNumberContext _localctx = new DecNumberContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_decNumber);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(175);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T_ADD || _la == T_SUB) {
                    {
                        setState(174);
                        _la = _input.LA(1);
                        if (!(_la == T_ADD || _la == T_SUB)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(177);
                match(L_DEC);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ScientificCountingNumberContext extends ParserRuleContext {
        public DecNumberContext decNumber() {
            return getRuleContext(DecNumberContext.class, 0);
        }

        public TerminalNode T_SUB() {
            return getToken(IFCParser.T_SUB, 0);
        }

        public IntNumberContext intNumber() {
            return getRuleContext(IntNumberContext.class, 0);
        }

        public ScientificCountingNumberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_scientificCountingNumber;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener)
                .enterScientificCountingNumber(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener)
                .exitScientificCountingNumber(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitScientificCountingNumber(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ScientificCountingNumberContext scientificCountingNumber()
        throws RecognitionException {
        ScientificCountingNumberContext _localctx = new ScientificCountingNumberContext(
            _ctx,
            getState()
        );
        enterRule(_localctx, 28, RULE_scientificCountingNumber);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(179);
                decNumber();
                setState(180);
                match(T__0);
                setState(181);
                match(T_SUB);
                setState(182);
                intNumber();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BoolLiteralContext extends ParserRuleContext {
        public TerminalNode T_TRUE() {
            return getToken(IFCParser.T_TRUE, 0);
        }

        public TerminalNode T_FALSE() {
            return getToken(IFCParser.T_FALSE, 0);
        }

        public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_boolLiteral;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterBoolLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitBoolLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitBoolLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BoolLiteralContext boolLiteral() throws RecognitionException {
        BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_boolLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(184);
                _la = _input.LA(1);
                if (!(_la == T_FALSE || _la == T_TRUE)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NullConstContext extends ParserRuleContext {
        public TerminalNode T_NULL() {
            return getToken(IFCParser.T_NULL, 0);
        }

        public NullConstContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nullConst;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).enterNullConst(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IFCListener) ((IFCListener) listener).exitNullConst(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof IFCVisitor) return ((IFCVisitor<? extends T>) visitor)
                .visitNullConst(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NullConstContext nullConst() throws RecognitionException {
        NullConstContext _localctx = new NullConstContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_nullConst);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(186);
                match(T_NULL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 5:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 9);
            case 1:
                return precpred(_ctx, 8);
            case 2:
                return precpred(_ctx, 7);
            case 3:
                return precpred(_ctx, 6);
        }
        return true;
    }

    public static final String _serializedATN =
        "\u0004\u0001/\u00bd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
            + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
            + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
            + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
            + "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"
            + "\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"
            + "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"
            + "\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001"
            + "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001"
            + "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"
            + ">\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
            + "\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002"
            + "K\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"
            + "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"
            + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"
            + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"
            + "\u0001\u0005\u0005\u0005e\b\u0005\n\u0005\f\u0005h\t\u0005\u0001\u0005"
            + "\u0001\u0005\u0003\u0005l\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"
            + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"
            + "\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005z\b\u0005\n\u0005\f\u0005"
            + "}\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
            + "\u0001\u0006\u0001\u0006\u0003\u0006\u0086\b\u0006\u0001\u0007\u0001\u0007"
            + "\u0001\u0007\u0003\u0007\u008b\b\u0007\u0001\u0007\u0001\u0007\u0001\b"
            + "\u0001\b\u0001\b\u0005\b\u0092\b\b\n\b\f\b\u0095\t\b\u0001\t\u0001\t\u0001"
            + "\t\u0001\t\u0005\t\u009b\b\t\n\t\f\t\u009e\t\t\u0001\t\u0001\t\u0003\t"
            + "\u00a2\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00a8\b"
            + "\u000b\u0001\f\u0003\f\u00ab\b\f\u0001\f\u0001\f\u0001\r\u0003\r\u00b0"
            + "\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"
            + "\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000"
            + "\u0001\n\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"
            + "\u0018\u001a\u001c\u001e \u0000\u0002\u0002\u0000\r\r%%\u0002\u0000\u0005"
            + "\u0005\u000b\u000b\u00c7\u0000\"\u0001\u0000\u0000\u0000\u0002*\u0001"
            + "\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000"
            + "\u0000\bU\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000\f\u0085\u0001"
            + "\u0000\u0000\u0000\u000e\u0087\u0001\u0000\u0000\u0000\u0010\u008e\u0001"
            + "\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00a3\u0001"
            + "\u0000\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000\u0018\u00aa\u0001"
            + "\u0000\u0000\u0000\u001a\u00af\u0001\u0000\u0000\u0000\u001c\u00b3\u0001"
            + "\u0000\u0000\u0000\u001e\u00b8\u0001\u0000\u0000\u0000 \u00ba\u0001\u0000"
            + "\u0000\u0000\"#\u0003\b\u0004\u0000#$\u0005$\u0000\u0000$%\u0003\u0002"
            + "\u0001\u0000%&\u0003\u0004\u0002\u0000&\'\u0005\u0003\u0000\u0000\'(\u0005"
            + "%\u0000\u0000()\u0003\b\u0004\u0000)\u0001\u0001\u0000\u0000\u0000*+\u0005"
            + "\t\u0000\u0000+,\u0005$\u0000\u0000,-\u0005\u0006\u0000\u0000-/\u0005"
            + "\u001f\u0000\u0000.0\u0003\u0010\b\u0000/.\u0001\u0000\u0000\u0000/0\u0001"
            + "\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005\"\u0000\u000023\u0005"
            + "$\u0000\u000034\u0005\u0007\u0000\u000046\u0005\u001f\u0000\u000057\u0003"
            + "\u0010\b\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001"
            + "\u0000\u0000\u000089\u0005\"\u0000\u00009:\u0005$\u0000\u0000:;\u0005"
            + "\b\u0000\u0000;=\u0005\u001f\u0000\u0000<>\u0003\u0010\b\u0000=<\u0001"
            + "\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"
            + "?@\u0005\"\u0000\u0000@A\u0005$\u0000\u0000AB\u0005\u0004\u0000\u0000"
            + "BC\u0005$\u0000\u0000C\u0003\u0001\u0000\u0000\u0000DE\u0005\u0002\u0000"
            + "\u0000EI\u0005$\u0000\u0000FH\u0003\u0006\u0003\u0000GF\u0001\u0000\u0000"
            + "\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"
            + "\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005"
            + "\u0004\u0000\u0000MN\u0005$\u0000\u0000N\u0005\u0001\u0000\u0000\u0000"
            + "OP\u0005&\u0000\u0000PQ\u0003\u0018\f\u0000QR\u0005\u0015\u0000\u0000"
            + "RS\u0003\u000e\u0007\u0000ST\u0005$\u0000\u0000T\u0007\u0001\u0000\u0000"
            + "\u0000UV\u0005\f\u0000\u0000V\t\u0001\u0000\u0000\u0000WX\u0006\u0005"
            + "\uffff\uffff\u0000Xl\u0003\u000e\u0007\u0000Yl\u0003\f\u0006\u0000Z[\u0005"
            + "&\u0000\u0000[l\u0003\u0018\f\u0000\\]\u0005\u0012\u0000\u0000]^\u0003"
            + "\u0014\n\u0000^_\u0005\u0012\u0000\u0000_l\u0001\u0000\u0000\u0000`a\u0005"
            + "\u001f\u0000\u0000af\u0003\n\u0005\u0000bc\u0005\u000f\u0000\u0000ce\u0003"
            + "\n\u0005\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"
            + "\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000"
            + "hf\u0001\u0000\u0000\u0000ij\u0005\"\u0000\u0000jl\u0001\u0000\u0000\u0000"
            + "kW\u0001\u0000\u0000\u0000kY\u0001\u0000\u0000\u0000kZ\u0001\u0000\u0000"
            + "\u0000k\\\u0001\u0000\u0000\u0000k`\u0001\u0000\u0000\u0000l{\u0001\u0000"
            + "\u0000\u0000mn\n\t\u0000\u0000no\u0005\u001d\u0000\u0000oz\u0003\n\u0005"
            + "\npq\n\b\u0000\u0000qr\u0005\u0011\u0000\u0000rz\u0003\n\u0005\tst\n\u0007"
            + "\u0000\u0000tu\u0005\r\u0000\u0000uz\u0003\n\u0005\bvw\n\u0006\u0000\u0000"
            + "wx\u0005%\u0000\u0000xz\u0003\n\u0005\u0007ym\u0001\u0000\u0000\u0000"
            + "yp\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000"
            + "\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"
            + "\u0000\u0000|\u000b\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"
            + "~\u0086\u0003\u001e\u000f\u0000\u007f\u0086\u0003\u0014\n\u0000\u0080"
            + "\u0086\u0003\u0016\u000b\u0000\u0081\u0086\u0003\u001a\r\u0000\u0082\u0086"
            + "\u0003\u0018\f\u0000\u0083\u0086\u0003\u001c\u000e\u0000\u0084\u0086\u0003"
            + " \u0010\u0000\u0085~\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000"
            + "\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000"
            + "\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"
            + "\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\r\u0001\u0000\u0000\u0000"
            + "\u0087\u0088\u0003\u0014\n\u0000\u0088\u008a\u0005\u001f\u0000\u0000\u0089"
            + "\u008b\u0003\u0010\b\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"
            + "\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"
            + "\u0005\"\u0000\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u0093\u0003"
            + "\u0012\t\u0000\u008f\u0090\u0005\u000f\u0000\u0000\u0090\u0092\u0003\u0012"
            + "\t\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"
            + "\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"
            + "\u0000\u0094\u0011\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"
            + "\u0000\u0096\u00a2\u0001\u0000\u0000\u0000\u0097\u009c\u0003\n\u0005\u0000"
            + "\u0098\u0099\u0005\u000f\u0000\u0000\u0099\u009b\u0003\n\u0005\u0000\u009a"
            + "\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c"
            + "\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"
            + "\u00a2\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f"
            + "\u00a2\u0005\u001d\u0000\u0000\u00a0\u00a2\u0005\u0014\u0000\u0000\u00a1"
            + "\u0096\u0001\u0000\u0000\u0000\u00a1\u0097\u0001\u0000\u0000\u0000\u00a1"
            + "\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"
            + "\u0013\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\'\u0000\u0000\u00a4\u0015"
            + "\u0001\u0000\u0000\u0000\u00a5\u00a8\u0005(\u0000\u0000\u00a6\u00a8\u0005"
            + ")\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000"
            + "\u0000\u0000\u00a8\u0017\u0001\u0000\u0000\u0000\u00a9\u00ab\u0007\u0000"
            + "\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"
            + "\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005*\u0000"
            + "\u0000\u00ad\u0019\u0001\u0000\u0000\u0000\u00ae\u00b0\u0007\u0000\u0000"
            + "\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"
            + "\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005+\u0000\u0000"
            + "\u00b2\u001b\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003\u001a\r\u0000\u00b4"
            + "\u00b5\u0005\u0001\u0000\u0000\u00b5\u00b6\u0005%\u0000\u0000\u00b6\u00b7"
            + "\u0003\u0018\f\u0000\u00b7\u001d\u0001\u0000\u0000\u0000\u00b8\u00b9\u0007"
            + "\u0001\u0000\u0000\u00b9\u001f\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"
            + "\n\u0000\u0000\u00bb!\u0001\u0000\u0000\u0000\u0010/6=Ifky{\u0085\u008a"
            + "\u0093\u009c\u00a1\u00a7\u00aa\u00af";
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
