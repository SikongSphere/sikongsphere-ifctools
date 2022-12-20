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

import org.antlr.v4.runtime.CharStreams;
import org.sikongsphere.ifc.io.IfcFileReader;
import org.sikongsphere.ifc.io.IfcFileWriter;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

import java.io.IOException;

public class IfcFileIOTestUtils {

    public static final String BLANK_OUTPUT_PATH = "src/test/resources/output.ifc";

    public static void ioTest(String input, String output) throws IOException {
        IfcFileModel model = IfcFileReader.readFile(input);
        IfcFileWriter.writeFile(model, output);

        String ifcFileOne = CharStreams.fromFileName(input).toString().replaceAll("\\s*|\r", "");

        String ifcFileTwo = CharStreams.fromFileName(output).toString().replaceAll("\\s*|\r", "");

        assert ifcFileOne.equals(ifcFileTwo);
    }
}
