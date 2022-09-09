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

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.sikongsphere.ifc.model.IfcModel

/**
  * This object is a demo used to check parser
  *
  * @author zaiyuan
  * @date 2022-08-13 11:44:00
  */
object ParseDriver {

  def main(args: Array[String]): Unit = {
    val stream = CharStreams.fromFileName("src/test/resources/blank.ifc")
    val ifcLexer = new IFCLexer(stream)
    val ifcParser = new IFCParser(new CommonTokenStream(ifcLexer))
    val ifcmodel = ifcParser.ifcmodel
    val model = new IfcModel
    val ifcVisitor = new IfcVisitorImpl(model)
    val node = ifcVisitor.visit(ifcmodel)
    System.out.println(ifcmodel.getText)
  }

}
