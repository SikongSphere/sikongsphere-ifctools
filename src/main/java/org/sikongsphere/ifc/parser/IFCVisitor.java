// Generated from /Users/wangbohong/IdeaProjects/sikongsphere-ifctools-09/src/main/antlr/org.sikongsphere.ifc.parser/IFC.g4 by ANTLR 4.10.1
package org.sikongsphere.ifc.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IFCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IFCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IFCParser#ifcmodel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcmodel(IFCParser.IfcmodelContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(IFCParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(IFCParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#dataItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataItem(IFCParser.DataItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#isoTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsoTag(IFCParser.IsoTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IFCParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(IFCParser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#exprFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunc(IFCParser.ExprFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#exprFuncParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFuncParams(IFCParser.ExprFuncParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#funcParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParam(IFCParser.FuncParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(IFCParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleQuotedString}
	 * labeled alternative in {@link IFCParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQuotedString(IFCParser.SingleQuotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleQuotedString}
	 * labeled alternative in {@link IFCParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleQuotedString(IFCParser.DoubleQuotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#intNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntNumber(IFCParser.IntNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#decNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecNumber(IFCParser.DecNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#scientificCountingNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificCountingNumber(IFCParser.ScientificCountingNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(IFCParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link IFCParser#nullConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullConst(IFCParser.NullConstContext ctx);
}