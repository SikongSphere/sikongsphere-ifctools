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
    val stream = CharStreams.fromFileName("F:\\workspace\\idea\\sikongsphere-ifctools\\src\\test\\resources\\blank.ifc")
    val ifcLexer = new IFCLexer(stream)
    val ifcParser = new IFCParser(new CommonTokenStream(ifcLexer))
    val ifcmodel = ifcParser.ifcmodel
    val model = new IfcModel
    val ifcVisitor = new IfcVisitorImpl(model)
    val node = ifcVisitor.visit(ifcmodel)
    System.out.println(ifcmodel.getText)
  }

}
