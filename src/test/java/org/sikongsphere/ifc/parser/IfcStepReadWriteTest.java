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
import org.sikongsphere.ifc.model.IfcModel;
import org.sikongsphere.ifc.io.IfcFileWriter;

import java.io.*;

/**
 * a test between an input IFC file
 * and a output IFC file from self-define method.
 *
 * @author stan
 * @date 2022/09/07 22:26
 */
public class IfcStepReadWriteTest {
    private final static String BLANK_INPUT_PATH = "src/test/resources/blank.ifc";
    private final static String BLANK_OUTPUT_PATH = "src/test/resources/output.ifc";

    /**
     * Test whether both of them are as the same.
     */
    @Test
    public void blankFile() throws IOException {
        IfcModel model = IfcFileReader.readFile(BLANK_INPUT_PATH);
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
