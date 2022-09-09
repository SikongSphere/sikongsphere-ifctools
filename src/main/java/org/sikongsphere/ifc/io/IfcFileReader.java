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
package org.sikongsphere.ifc.io;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sikongsphere.ifc.model.IfcModel;
import org.sikongsphere.ifc.parser.IFCLexer;
import org.sikongsphere.ifc.parser.IFCParser;
import org.sikongsphere.ifc.parser.IfcVisitorImpl;

import java.io.IOException;

/**
 * This is a file reader for ifc model
 *
 * @author zaiyuan
 * @date 2022/09/08 22:26
 */
public class IfcFileReader {

    public static IfcModel readFile(String path) throws IOException {
        CharStream stream = CharStreams.fromFileName(path);
        IFCLexer ifcLexer = new IFCLexer(stream);
        IFCParser ifcParser = new IFCParser(new CommonTokenStream(ifcLexer));
        IFCParser.IfcmodelContext ifcmodel = ifcParser.ifcmodel();
        IfcModel model = new IfcModel();
        IfcVisitorImpl ifcVisitorImpl = new IfcVisitorImpl(model);
        ifcVisitorImpl.visit(ifcmodel);
        return model;
    }
}
