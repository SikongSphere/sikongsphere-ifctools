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
package org.sikongsphere.ifc.newModel.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sikongsphere.ifc.newModel.IfcInterface;
import org.sikongsphere.ifc.parser.IFCLexer;
import org.sikongsphere.ifc.parser.IFCParser;

import java.io.IOException;

public class ParserDemo {

    public static void main(String[] args) throws IOException {
        CharStream stream = CharStreams.fromFileName(
            "F:\\workspace\\idea\\sikongsphere-ifctools\\src\\test\\resources\\blank.ifc"
        );
        IFCLexer ifcLexer = new IFCLexer(stream);
        IFCParser ifcParser = new IFCParser(new CommonTokenStream(ifcLexer));
        IFCParser.IfcmodelContext ifcmodel = ifcParser.ifcmodel();
        IfcFileVisitor fileVisitor = new IfcFileVisitor();
        IfcInterface ifcInterface = fileVisitor.visitIfcmodel(ifcmodel);
        System.out.println();
    }
}
