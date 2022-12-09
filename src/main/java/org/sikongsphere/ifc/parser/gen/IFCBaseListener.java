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

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link IFCListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class IFCBaseListener implements IFCListener {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIfcmodel(IFCParser.IfcmodelContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIfcmodel(IFCParser.IfcmodelContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterHeader(IFCParser.HeaderContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitHeader(IFCParser.HeaderContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterData(IFCParser.DataContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitData(IFCParser.DataContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDataItem(IFCParser.DataItemContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDataItem(IFCParser.DataItemContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIsoTag(IFCParser.IsoTagContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIsoTag(IFCParser.IsoTagContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExpr(IFCParser.ExprContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExpr(IFCParser.ExprContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprAtom(IFCParser.ExprAtomContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprAtom(IFCParser.ExprAtomContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprFunc(IFCParser.ExprFuncContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprFunc(IFCParser.ExprFuncContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprFuncParams(IFCParser.ExprFuncParamsContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprFuncParams(IFCParser.ExprFuncParamsContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFuncParam(IFCParser.FuncParamContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFuncParam(IFCParser.FuncParamContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIdent(IFCParser.IdentContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIdent(IFCParser.IdentContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSingleQuotedString(IFCParser.SingleQuotedStringContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSingleQuotedString(IFCParser.SingleQuotedStringContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDoubleQuotedString(IFCParser.DoubleQuotedStringContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDoubleQuotedString(IFCParser.DoubleQuotedStringContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIntNumber(IFCParser.IntNumberContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIntNumber(IFCParser.IntNumberContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDecNumber(IFCParser.DecNumberContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDecNumber(IFCParser.DecNumberContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterScientificCountingNumber(IFCParser.ScientificCountingNumberContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitScientificCountingNumber(IFCParser.ScientificCountingNumberContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBoolLiteral(IFCParser.BoolLiteralContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBoolLiteral(IFCParser.BoolLiteralContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterNullConst(IFCParser.NullConstContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitNullConst(IFCParser.NullConstContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {}
}
