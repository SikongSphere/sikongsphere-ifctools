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
import org.junit.After;
import org.junit.Test;
import org.sikongsphere.ifc.io.IfcFileReader;
import org.sikongsphere.ifc.io.IfcFileWriter;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

import java.io.File;
import java.io.IOException;

/**
 * a test between an input IFC file
 * and an output IFC file from self-define method.
 *
 * @author stan
 * @date 2022/09/07 22:26
 */
public class IfcStepReadWriteTest {

    @Test
    public void blankFile() throws IOException {

        String BLANK_INPUT_PATH = "src/test/resources/blank.ifc";
        String BLANK_OUTPUT_PATH = "src/test/resources/output.ifc";

        IfcFileModel model = IfcFileReader.readFile(BLANK_INPUT_PATH);
        IfcFileWriter.writeFile(model, BLANK_OUTPUT_PATH);

        String ifcFileone = CharStreams.fromFileName(BLANK_INPUT_PATH)
            .toString()
            .replaceAll("\\s*|\r", "");

        String ifcFiletwo = CharStreams.fromFileName(BLANK_OUTPUT_PATH)
            .toString()
            .replaceAll("\\s*|\r", "");
        assert ifcFileone.equals(ifcFiletwo);
    }

    @Test
    public void basicFile() throws IOException {

        String BLANK_INPUT_PATH = "src/test/resources/basic_0.ifc";
        String BLANK_OUTPUT_PATH = "src/test/resources/output.ifc";

        IfcFileModel model = IfcFileReader.readFile(BLANK_INPUT_PATH);
        IfcFileWriter.writeFile(model, BLANK_OUTPUT_PATH);

        String ifcFileone = CharStreams.fromFileName(BLANK_INPUT_PATH)
            .toString()
            .replaceAll("\\s*|\r", "");

        String ifcFiletwo = CharStreams.fromFileName(BLANK_OUTPUT_PATH)
            .toString()
            .replaceAll("\\s*|\r", "");
        assert ifcFileone.equals(ifcFiletwo);
    }

    @Test
    public void complexFile() throws IOException {

        String BLANK_INPUT_PATH = "src/test/resources/complex.ifc";
        String BLANK_OUTPUT_PATH = "src/test/resources/output.ifc";

        IfcFileModel model = IfcFileReader.readFile(BLANK_INPUT_PATH);
        IfcFileWriter.writeFile(model, BLANK_OUTPUT_PATH);

        String ifcFileone = CharStreams.fromFileName(BLANK_INPUT_PATH)
            .toString()
            .replaceAll("\\s*|\r", "");

        String ifcFiletwo = CharStreams.fromFileName(BLANK_OUTPUT_PATH)
            .toString()
            .replaceAll("\\s*|\r", "");
        assert ifcFileone.equals(ifcFiletwo);
    }

    @After
    public void delIfcFile() {
        File file = new File("src/test/resources/output.ifc");
        file.delete();
    }
}
