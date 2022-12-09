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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IFCParser}.
 */
public interface IFCListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link IFCParser#ifcmodel}.
     * @param ctx the parse tree
     */
    void enterIfcmodel(IFCParser.IfcmodelContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#ifcmodel}.
     * @param ctx the parse tree
     */
    void exitIfcmodel(IFCParser.IfcmodelContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#header}.
     * @param ctx the parse tree
     */
    void enterHeader(IFCParser.HeaderContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#header}.
     * @param ctx the parse tree
     */
    void exitHeader(IFCParser.HeaderContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#data}.
     * @param ctx the parse tree
     */
    void enterData(IFCParser.DataContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#data}.
     * @param ctx the parse tree
     */
    void exitData(IFCParser.DataContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#dataItem}.
     * @param ctx the parse tree
     */
    void enterDataItem(IFCParser.DataItemContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#dataItem}.
     * @param ctx the parse tree
     */
    void exitDataItem(IFCParser.DataItemContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#isoTag}.
     * @param ctx the parse tree
     */
    void enterIsoTag(IFCParser.IsoTagContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#isoTag}.
     * @param ctx the parse tree
     */
    void exitIsoTag(IFCParser.IsoTagContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#expr}.
     * @param ctx the parse tree
     */
    void enterExpr(IFCParser.ExprContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#expr}.
     * @param ctx the parse tree
     */
    void exitExpr(IFCParser.ExprContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#exprAtom}.
     * @param ctx the parse tree
     */
    void enterExprAtom(IFCParser.ExprAtomContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#exprAtom}.
     * @param ctx the parse tree
     */
    void exitExprAtom(IFCParser.ExprAtomContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#exprFunc}.
     * @param ctx the parse tree
     */
    void enterExprFunc(IFCParser.ExprFuncContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#exprFunc}.
     * @param ctx the parse tree
     */
    void exitExprFunc(IFCParser.ExprFuncContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#exprFuncParams}.
     * @param ctx the parse tree
     */
    void enterExprFuncParams(IFCParser.ExprFuncParamsContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#exprFuncParams}.
     * @param ctx the parse tree
     */
    void exitExprFuncParams(IFCParser.ExprFuncParamsContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#funcParam}.
     * @param ctx the parse tree
     */
    void enterFuncParam(IFCParser.FuncParamContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#funcParam}.
     * @param ctx the parse tree
     */
    void exitFuncParam(IFCParser.FuncParamContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#ident}.
     * @param ctx the parse tree
     */
    void enterIdent(IFCParser.IdentContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#ident}.
     * @param ctx the parse tree
     */
    void exitIdent(IFCParser.IdentContext ctx);

    /**
     * Enter a parse tree produced by the {@code singleQuotedString}
     * labeled alternative in {@link IFCParser#string}.
     * @param ctx the parse tree
     */
    void enterSingleQuotedString(IFCParser.SingleQuotedStringContext ctx);

    /**
     * Exit a parse tree produced by the {@code singleQuotedString}
     * labeled alternative in {@link IFCParser#string}.
     * @param ctx the parse tree
     */
    void exitSingleQuotedString(IFCParser.SingleQuotedStringContext ctx);

    /**
     * Enter a parse tree produced by the {@code doubleQuotedString}
     * labeled alternative in {@link IFCParser#string}.
     * @param ctx the parse tree
     */
    void enterDoubleQuotedString(IFCParser.DoubleQuotedStringContext ctx);

    /**
     * Exit a parse tree produced by the {@code doubleQuotedString}
     * labeled alternative in {@link IFCParser#string}.
     * @param ctx the parse tree
     */
    void exitDoubleQuotedString(IFCParser.DoubleQuotedStringContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#intNumber}.
     * @param ctx the parse tree
     */
    void enterIntNumber(IFCParser.IntNumberContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#intNumber}.
     * @param ctx the parse tree
     */
    void exitIntNumber(IFCParser.IntNumberContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#decNumber}.
     * @param ctx the parse tree
     */
    void enterDecNumber(IFCParser.DecNumberContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#decNumber}.
     * @param ctx the parse tree
     */
    void exitDecNumber(IFCParser.DecNumberContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#scientificCountingNumber}.
     * @param ctx the parse tree
     */
    void enterScientificCountingNumber(IFCParser.ScientificCountingNumberContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#scientificCountingNumber}.
     * @param ctx the parse tree
     */
    void exitScientificCountingNumber(IFCParser.ScientificCountingNumberContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#boolLiteral}.
     * @param ctx the parse tree
     */
    void enterBoolLiteral(IFCParser.BoolLiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#boolLiteral}.
     * @param ctx the parse tree
     */
    void exitBoolLiteral(IFCParser.BoolLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link IFCParser#nullConst}.
     * @param ctx the parse tree
     */
    void enterNullConst(IFCParser.NullConstContext ctx);

    /**
     * Exit a parse tree produced by {@link IFCParser#nullConst}.
     * @param ctx the parse tree
     */
    void exitNullConst(IFCParser.NullConstContext ctx);
}
