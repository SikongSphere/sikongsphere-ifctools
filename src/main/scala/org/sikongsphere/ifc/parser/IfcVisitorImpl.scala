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
import org.sikongsphere.ifc.common.util.StringUtil
import org.sikongsphere.ifc.model.basic.STRING
import org.sikongsphere.ifc.model.{IfcModel, IfcNode, IfcNodeList}
import org.sikongsphere.ifc.model.body.{IfcBody, IfcBodyTemplate}
import org.sikongsphere.ifc.model.header._
import org.sikongsphere.ifc.model.infra.IfcInstanceFactory
import org.sikongsphere.ifc.parser.IFCParser._

import java.util
import scala.collection.JavaConverters._
import scala.collection.mutable

/**
  * This class is used to visit AST of IFC file
  *
  * @author zaiyuan
  * @date 2022-08-13 11:44:00
  */
class IfcVisitorImpl(ifcModel: IfcModel) extends IfcJavaVisitor(ifcModel) {

  override def visitExprFunc(ctx: ExprFuncContext): IfcBodyTemplate = {
    val list = new util.ArrayList[Object]
    val originArgs: mutable.Seq[FuncParamContext] = ctx.exprFuncParams().funcParam().asScala
    val nodes = originArgs.map(visitFuncParam)
    nodes.foreach {
      case nodeList: IfcNodeList =>
        val elements = nodeList.elements
        elements.forEach(e => list.add(e))
      case f =>
        list.add(f)
    }
    val args = list.toArray()
    //    val args = ctx.exprFuncParams().funcParam().asScala.map(visitFuncParam).toArray
    val body =
      IfcInstanceFactory.getIfcInstance(ctx.ident().getText, args).asInstanceOf[IfcBodyTemplate]
    body
  }
}
