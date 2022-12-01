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

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.util.StringUtil;
import org.sikongsphere.ifc.model.IfcModel;
import org.sikongsphere.ifc.model.IfcNode;
import org.sikongsphere.ifc.model.IfcNodeList;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.body.IfcBody;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.header.IfcFileDescription;
import org.sikongsphere.ifc.model.header.IfcFileName;
import org.sikongsphere.ifc.model.header.IfcFileSchema;
import org.sikongsphere.ifc.model.header.IfcHeader;
import org.sikongsphere.ifc.model.infra.IfcInstanceFactory;
import org.sikongsphere.ifc.parser.IFCParser.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class is used to visit AST of IFC file
 *
 * @author zaiyuan
 * @date 2022-11-18 20:44:00
 */
public class IfcVisitorImpl extends IFCBaseVisitor<IfcNode> {

    private final IfcModel ifcModel;

    public IfcVisitorImpl(IfcModel ifcModel) {
        this.ifcModel = ifcModel;
    }

    @Override
    public IfcNode visitIfcmodel(IfcmodelContext ctx) {
        ifcModel.header = (IfcHeader) visitHeader(ctx.header());
        visitData(ctx.data());
        return ifcModel;
    }

    @Override
    public IfcNode visitHeader(HeaderContext ctx) {
        IfcFileDescription description = new IfcFileDescription();
        ctx.fileDescription.funcParam().forEach(i -> description.elements.add(visitFuncParam(i)));
        IfcFileName fileName = new IfcFileName();
        ctx.fileName.funcParam().forEach(i -> fileName.elements.add(visitFuncParam(i)));
        IfcFileSchema schema = new IfcFileSchema();
        ctx.fileSchema.funcParam().forEach(i -> schema.elements.add(visitFuncParam(i)));
        IfcHeader header = new IfcHeader();
        header.setFileDescription(description);
        header.setFileName(fileName);
        header.setFileSchema(schema);
        return header;
    }

    @Override
    public IfcBody visitData(DataContext ctx) {
        IfcBody body = new IfcBody();
        ctx.dataItem().forEach(i -> body.elements.add(visitDataItem(i)));
        return body;
    }

    @Override
    public IfcNode visitDataItem(DataItemContext ctx) {
        IfcBodyTemplate ifcElement = visitExprFunc(ctx.exprFunc());
        ifcElement.stepNumber = Integer.parseInt(ctx.stepNumber.getText());
        return ifcModel.elements.put(Integer.parseInt(ctx.stepNumber.getText()), ifcElement);
    }

    @Override
    public IfcBodyTemplate visitExprFunc(ExprFuncContext ctx) {
        List<Object> list = new ArrayList<>();
        List<FuncParamContext> originArgs = ctx.exprFuncParams().funcParam();
        List<IfcNode> nodes = originArgs.stream()
            .map(this::visitFuncParam)
            .collect(Collectors.toList());
        nodes.forEach(i -> wrapArgs(i, list));
        Object[] args = list.toArray();
        return (IfcBodyTemplate) IfcInstanceFactory.getIfcInstance(ctx.ident().getText(), args);
    }

    public void wrapArgs(IfcNode node, List<Object> list) {
        if (node instanceof IfcNodeList) {
            list.addAll(((IfcNodeList) node).elements);
        } else {
            list.add(node);
        }
    }

    @Override
    public IfcNode visitFuncParam(FuncParamContext ctx) {
        ParseTree firstChild = ctx.getChild(0);
        if (firstChild instanceof ExprContext) {
            return new IfcNodeList(
                ctx.expr().stream().map(this::visitExpr).collect(Collectors.toList())
            );
        } else if (firstChild.getText().equals(StringConstant.DOLLAR)) {
            return null;
        } else {
            return new STRING(StringUtil.dropQuota(ctx.getText()));
        }
    }

    @Override
    public IfcNode visitExpr(ExprContext ctx) {
        ParseTree firstChild = ctx.getChild(0);
        if (firstChild instanceof ExprFuncContext) {
            return visitExprFunc(ctx.exprFunc());
        } else if (firstChild instanceof ExprAtomContext) {
            return visitExprAtom(ctx.exprAtom());
        } else if (firstChild instanceof TerminalNode) {
            if (null != ctx.T_WELL()) {
                return ifcModel.elements.get(Integer.parseInt(ctx.intNumber().getText()));
            } else if (null != ctx.T_OPEN_P()) {
                return new IfcNodeList(
                    ctx.expr().stream().map(this::visitExpr).collect(Collectors.toList())
                );
            } else if (null != ctx.T_DOT()) {
                return new STRING(ctx.getText());
            }
        }
        return super.visitExpr(ctx);
    }

    @Override
    public IfcNode visitExprAtom(ExprAtomContext ctx) {
        ParseTree firstChild = ctx.getChild(0);
        if (firstChild instanceof BoolLiteralContext) {
            return new STRING(ctx.getText());
        } else if (firstChild instanceof IdentContext) {
            return new STRING(ctx.getText());
        } else if (firstChild instanceof StringContext) {
            return new STRING(ctx.getText());
        } else if (firstChild instanceof DecNumberContext) {
            return new STRING(ctx.getText());
        } else if (firstChild instanceof IntNumberContext) {
            return new STRING(ctx.getText());
        } else if (firstChild instanceof ScientificCountingNumberContext) {
            return new STRING(ctx.getText());
        } else if (firstChild instanceof NullConstContext) {
            return new STRING(ctx.getText());
        }
        return super.visitExprAtom(ctx);
    }
}
