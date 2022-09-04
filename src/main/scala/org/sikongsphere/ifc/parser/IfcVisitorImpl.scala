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
package org.sikongsphere.ifc.parser

import org.antlr.v4.runtime.tree.TerminalNode
import org.sikongsphere.ifc.model.basic.STRING
import org.sikongsphere.ifc.model.body.{IfcBody, IfcBodyTemplate}
import org.sikongsphere.ifc.model.resource.actor.entity.IfcPerson
import org.sikongsphere.ifc.model.header.{IfcFileDescription, IfcFileName, IfcFileSchema, IfcHeader}
import org.sikongsphere.ifc.model.{IfcModel, IfcNode, IfcNodeList}
import org.sikongsphere.ifc.parser.IFCParser._

import scala.collection.JavaConverters._

/**
  * This class is used to visit AST of IFC file
  *
  * @author zaiyuan
  * @date 2022-08-13 11:44:00
  */
class IfcVisitorImpl(ifcModel: IfcModel) extends IFCBaseVisitor[IfcNode] {

  override def visitIfcmodel(ctx: IfcmodelContext): IfcNode = {
    ifcModel.header = visitHeader(ctx.header())
    visitData(ctx.data())
    ifcModel
  }

  override def visitHeader(ctx: HeaderContext): IfcHeader = {
    val fileDescription = new IfcFileDescription
    ctx.fileDescription.funcParam().asScala.foreach { i =>
      fileDescription.elements.add(visitFuncParam(i))
    }
    val fileName = new IfcFileName
    ctx.fileName.funcParam().asScala.foreach { i =>
      fileName.elements.add(visitFuncParam(i))
    }
    val fileSchema = new IfcFileSchema
    ctx.fileSchema.funcParam().asScala.foreach { i =>
      fileSchema.elements.add(visitFuncParam(i))
    }
    val header = new IfcHeader
    header.fileSchema = fileSchema
    header.fileDescription = fileDescription
    header.fileName = fileName
    header
  }

  override def visitData(ctx: DataContext): IfcBody = {
    val body = new IfcBody
    ctx.dataItem().asScala.foreach { i =>
      body.elements.add(visitDataItem(i))
    }
    body
  }

  override def visitDataItem(ctx: DataItemContext): IfcNode = {
    val ifcElement = visitExprFunc(ctx.exprFunc())
    ifcModel.elements.put(ctx.stepNumber.getText.toInt, ifcElement)
  }

  override def visitExprFunc(ctx: ExprFuncContext): IfcBodyTemplate = {
    val body =
      if (ctx.ident().getText.toUpperCase().equals("IFCPERSON")) {
        new IfcPerson
      } else new IfcBodyTemplate
    body.IfcName = ctx.ident().getText
    if (null != ctx.exprFuncParams()) ctx.exprFuncParams().funcParam().asScala.foreach { i =>
      body.elements.add(visitFuncParam(i))
    }
    body
  }

  override def visitFuncParam(ctx: FuncParamContext): IfcNode = ctx.getChild(0) match {
    case c: ExprFuncContext => new IfcNodeList(ctx.expr().asScala.map(visitExpr).asJava)
    case _                  => new STRING(ctx.getText)
  }

  override def visitExpr(ctx: IFCParser.ExprContext): IfcNode = ctx.getChild(0) match {
    case c: ExprFuncContext => visitExprFunc(ctx.exprFunc())
    case c: ExprAtomContext => visitExprAtom(ctx.exprAtom())
    case c: TerminalNode if null != ctx.T_WELL() =>
      ifcModel.elements.get(ctx.intNumber().getText.toInt)
    case c: TerminalNode if null != ctx.T_DOT() => new STRING(ctx.getText)
    case c: TerminalNode if null != ctx.T_OPEN_P() =>
      new IfcNodeList(ctx.expr().asScala.map(visitExpr).asJava)
  }

  override def visitExprAtom(ctx: IFCParser.ExprAtomContext): IfcNode = ctx.getChild(0) match {
    case c: BoolLiteralContext              => new STRING(c.getText)
    case c: IdentContext                    => new STRING(c.getText)
    case c: StringContext                   => new STRING(c.getText)
    case c: DecNumberContext                => new STRING(c.getText)
    case c: IntNumberContext                => new STRING(c.getText)
    case c: ScientificCountingNumberContext => new STRING(c.getText)
    case c: NullConstContext                => new STRING(c.getText)
  }
}
