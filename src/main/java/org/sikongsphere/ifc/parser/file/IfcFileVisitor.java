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
package org.sikongsphere.ifc.parser.file;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.exception.SikongSphereParseException;
import org.sikongsphere.ifc.common.util.StringUtil;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.IfcInterface;
import org.sikongsphere.ifc.model.datatype.*;
import org.sikongsphere.ifc.model.fileelement.*;
import org.sikongsphere.ifc.parser.gen.IFCBaseVisitor;
import org.sikongsphere.ifc.parser.gen.IFCParser;
import org.sikongsphere.ifc.parser.gen.IFCParser.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class is used to visit AST of IFC file
 *
 * @author zaiyuan
 * @date 2022-11-18 20:44:00
 */
public class IfcFileVisitor extends IFCBaseVisitor<IfcInterface> {

    private final Map<Integer, IfcAbstractClass> bodyElements = new TreeMap<>();

    @Override
    public IfcFileModel visitIfcmodel(IfcmodelContext ctx) {
        return new IfcFileModel(visitHeader(ctx.header()), visitData(ctx.data()));
    }

    @Override
    public IfcHeader visitHeader(HeaderContext ctx) {
        IfcFileDescription description = new IfcFileDescription(
            ctx.fileDescription.funcParam()
                .stream()
                .map(this::visitFuncParam)
                .collect(Collectors.toList())
        );
        IfcFileName fileName = new IfcFileName(
            ctx.fileName.funcParam().stream().map(this::visitFuncParam).collect(Collectors.toList())
        );
        IfcFileSchema fileSchema = new IfcFileSchema(
            ctx.fileSchema.funcParam()
                .stream()
                .map(this::visitFuncParam)
                .collect(Collectors.toList())
        );
        return new IfcHeader(fileName, description, fileSchema);
    }

    @Override
    public IfcBody visitData(DataContext ctx) {
        for (DataItemContext dataItemContext : ctx.dataItem()) {
            visitDataItem(dataItemContext);
        }
        return new IfcBody(bodyElements);
    }

    @Override
    public IfcAbstractClass visitDataItem(DataItemContext ctx) {
        IfcAbstractClass ifcAbstractClass = visitExprFunc(ctx.exprFunc());
        int stepNum = Integer.parseInt(ctx.stepNumber.getText());
        ifcAbstractClass.setStepNumber(stepNum);
        return bodyElements.put(stepNum, ifcAbstractClass);
    }

    @Override
    public IfcAbstractClass visitExprFunc(ExprFuncContext ctx) {
        List<Object> list = new ArrayList<>();
        List<FuncParamContext> originArgs = ctx.exprFuncParams().funcParam();
        List<IfcInterface> nodes = originArgs.stream()
            .map(this::visitFuncParam)
            .collect(Collectors.toList());
        nodes.forEach(i -> wrapArgs(i, list));
        return new IfcLogicNode(ctx.ident().getText(), list);
    }

    public void wrapArgs(IfcInterface node, List<Object> list) {
        if (node instanceof LIST) {
            list.addAll(((LIST<?>) node).getObjects());
        } else {
            list.add(node);
        }
    }

    @Override
    public IfcInterface visitFuncParam(FuncParamContext ctx) {
        ParseTree firstChild = ctx.getChild(0);
        if (firstChild instanceof ExprContext) {
            return new LIST<>(
                ctx.expr().stream().map(this::visitExpr).collect(Collectors.toList())
            );
        } else if (firstChild.getText().equals(StringConstant.DOLLAR)) {
            return null;
        } else {
            return new STRING(StringConstant.ASTERISK);
        }
    }

    @Override
    public IfcInterface visitExpr(ExprContext ctx) {
        ParseTree firstChild = ctx.getChild(0);
        if ("".equals(ctx.getText())) {
            return null;
        }
        if (firstChild instanceof ExprFuncContext) {
            return visitExprFunc(ctx.exprFunc());
        } else if (firstChild instanceof ExprAtomContext) {
            return visitExprAtom(ctx.exprAtom());
        } else if (firstChild instanceof TerminalNode) {
            if (null != ctx.T_WELL()) {
                int stepNum = Integer.parseInt(ctx.intNumber().getText());
                if (bodyElements.containsKey(stepNum)) {
                    return bodyElements.get(stepNum);
                } else {
                    return new IfcLogicNode(stepNum);
                }
            } else if (null != ctx.T_OPEN_P()) {
                return new LIST<>(
                    ctx.expr().stream().map(this::visitExpr).collect(Collectors.toList())
                );
            } else if (null != ctx.T_DOT()) {
                return new ENUM(new STRING(StringUtil.dropQuota(ctx.getText())));
            }
        }
        throw new SikongSphereParseException(
            String.format("This operation is not supported: %s", ctx.getText())
        );
    }

    @Override
    public IfcInterface visitExprAtom(IFCParser.ExprAtomContext ctx) {
        ParseTree firstChild = ctx.getChild(0);
        if (firstChild instanceof BoolLiteralContext) {
            return new BOOLEAN(Boolean.parseBoolean(firstChild.getText()));
        } else if (firstChild instanceof IdentContext || firstChild instanceof StringContext) {
            return new STRING(StringUtil.dropQuota(ctx.getText()).replace("[SLASH]", "\\"));
        } else if (firstChild instanceof DecNumberContext) {
            return new DOUBLE(Double.parseDouble(firstChild.getText()));
        } else if (firstChild instanceof IntNumberContext) {
            return new INTEGER(Integer.parseInt(ctx.getText()));
        } else if (firstChild instanceof NullConstContext) {
            return new NULL();
        } else if (firstChild instanceof ScientificCountingNumberContext) {
            double mantissa = Double.parseDouble(
                ((ScientificCountingNumberContext) firstChild).decNumber().getText()
            );
            int index = Integer.parseInt(
                ((ScientificCountingNumberContext) firstChild).intNumber().getText()
            );
            return new SCIENTIFICNOTATION(mantissa, index);
        } else {
            throw new SikongSphereParseException(
                String.format("This Data Type is not supported: %s", ctx.getText())
            );
        }
    }
}
