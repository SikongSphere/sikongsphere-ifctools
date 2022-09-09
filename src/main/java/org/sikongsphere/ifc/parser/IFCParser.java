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
package org.sikongsphere.ifc.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class IFCParser extends Parser {
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
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
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
                    while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
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
        "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00bf\4\2\t\2"
            + "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
            + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3\3"
            + "\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\3\3\3\3\3\3\3\3"
            + "\3\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"
            + "\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7g"
            + "\n\7\f\7\16\7j\13\7\3\7\3\7\5\7n\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"
            + "\7\3\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"
            + "\5\b\u0088\n\b\3\t\3\t\3\t\5\t\u008d\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u0094"
            + "\n\n\f\n\16\n\u0097\13\n\3\13\3\13\3\13\3\13\7\13\u009d\n\13\f\13\16\13"
            + "\u00a0\13\13\3\13\3\13\5\13\u00a4\n\13\3\f\3\f\3\r\3\r\5\r\u00aa\n\r\3"
            + "\16\5\16\u00ad\n\16\3\16\3\16\3\17\5\17\u00b2\n\17\3\17\3\17\3\20\3\20"
            + "\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\3\f\23\2\4\6\b\n\f\16\20\22"
            + "\24\26\30\32\34\36 \"\2\4\4\2\17\17\'\'\4\2\7\7\r\r\2\u00c9\2$\3\2\2\2"
            + "\4,\3\2\2\2\6F\3\2\2\2\bQ\3\2\2\2\nW\3\2\2\2\fm\3\2\2\2\16\u0087\3\2\2"
            + "\2\20\u0089\3\2\2\2\22\u0090\3\2\2\2\24\u00a3\3\2\2\2\26\u00a5\3\2\2\2"
            + "\30\u00a9\3\2\2\2\32\u00ac\3\2\2\2\34\u00b1\3\2\2\2\36\u00b5\3\2\2\2 "
            + "\u00ba\3\2\2\2\"\u00bc\3\2\2\2$%\5\n\6\2%&\7&\2\2&\'\5\4\3\2\'(\5\6\4"
            + "\2()\7\5\2\2)*\7\'\2\2*+\5\n\6\2+\3\3\2\2\2,-\7\13\2\2-.\7&\2\2./\7\b"
            + "\2\2/\61\7!\2\2\60\62\5\22\n\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2"
            + "\2\63\64\7$\2\2\64\65\7&\2\2\65\66\7\t\2\2\668\7!\2\2\679\5\22\n\28\67"
            + "\3\2\2\289\3\2\2\29:\3\2\2\2:;\7$\2\2;<\7&\2\2<=\7\n\2\2=?\7!\2\2>@\5"
            + "\22\n\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7$\2\2BC\7&\2\2CD\7\6\2\2DE\7"
            + "&\2\2E\5\3\2\2\2FG\7\4\2\2GK\7&\2\2HJ\5\b\5\2IH\3\2\2\2JM\3\2\2\2KI\3"
            + "\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\6\2\2OP\7&\2\2P\7\3\2\2\2QR\7"
            + "(\2\2RS\5\32\16\2ST\7\27\2\2TU\5\20\t\2UV\7&\2\2V\t\3\2\2\2WX\7\16\2\2"
            + "X\13\3\2\2\2YZ\b\7\1\2Zn\5\20\t\2[n\5\16\b\2\\]\7(\2\2]n\5\32\16\2^_\7"
            + "\24\2\2_`\5\26\f\2`a\7\24\2\2an\3\2\2\2bc\7!\2\2ch\5\f\7\2de\7\21\2\2"
            + "eg\5\f\7\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2"
            + "kl\7$\2\2ln\3\2\2\2mY\3\2\2\2m[\3\2\2\2m\\\3\2\2\2m^\3\2\2\2mb\3\2\2\2"
            + "n}\3\2\2\2op\f\13\2\2pq\7\37\2\2q|\5\f\7\frs\f\n\2\2st\7\23\2\2t|\5\f"
            + "\7\13uv\f\t\2\2vw\7\17\2\2w|\5\f\7\nxy\f\b\2\2yz\7\'\2\2z|\5\f\7\t{o\3"
            + "\2\2\2{r\3\2\2\2{u\3\2\2\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2"
            + "~\r\3\2\2\2\177}\3\2\2\2\u0080\u0088\5 \21\2\u0081\u0088\5\26\f\2\u0082"
            + "\u0088\5\30\r\2\u0083\u0088\5\34\17\2\u0084\u0088\5\32\16\2\u0085\u0088"
            + "\5\36\20\2\u0086\u0088\5\"\22\2\u0087\u0080\3\2\2\2\u0087\u0081\3\2\2"
            + "\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085"
            + "\3\2\2\2\u0087\u0086\3\2\2\2\u0088\17\3\2\2\2\u0089\u008a\5\26\f\2\u008a"
            + "\u008c\7!\2\2\u008b\u008d\5\22\n\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2"
            + "\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7$\2\2\u008f\21\3\2\2\2\u0090\u0095"
            + "\5\24\13\2\u0091\u0092\7\21\2\2\u0092\u0094\5\24\13\2\u0093\u0091\3\2"
            + "\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"
            + "\23\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u00a4\3\2\2\2\u0099\u009e\5\f\7"
            + "\2\u009a\u009b\7\21\2\2\u009b\u009d\5\f\7\2\u009c\u009a\3\2\2\2\u009d"
            + "\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a4\3\2"
            + "\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\7\37\2\2\u00a2\u00a4\7\26\2\2\u00a3"
            + "\u0098\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2"
            + "\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\7)\2\2\u00a6\27\3\2\2\2\u00a7\u00aa"
            + "\7*\2\2\u00a8\u00aa\7+\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"
            + "\31\3\2\2\2\u00ab\u00ad\t\2\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2"
            + "\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7,\2\2\u00af\33\3\2\2\2\u00b0\u00b2"
            + "\t\2\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"
            + "\u00b4\7-\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\5\34\17\2\u00b6\u00b7\7\3\2"
            + "\2\u00b7\u00b8\7\'\2\2\u00b8\u00b9\5\32\16\2\u00b9\37\3\2\2\2\u00ba\u00bb"
            + "\t\3\2\2\u00bb!\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd#\3\2\2\2\22\618?Khm"
            + "{}\u0087\u008c\u0095\u009e\u00a3\u00a9\u00ac\u00b1";
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
