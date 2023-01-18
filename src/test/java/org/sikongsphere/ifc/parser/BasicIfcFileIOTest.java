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

import org.junit.After;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.sikongsphere.ifc.parser.IfcFileIOTestUtils.*;

/**
 * a test between an input IFC file
 * and an output IFC file from self-define method.
 *
 * @author stan
 * @date 2022/09/07 22:26
 */
public class BasicIfcFileIOTest {

    @Test
    public void blankFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/basic-ifc/blank.ifc";

        getIfcFile(url);
        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void basicFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/basic-ifc/basic_0.ifc";

        getIfcFile(url);
        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void complexFile() throws IOException {
        String url = "https://ifc-file.gd2.qingstor.com/basic-ifc/complex.ifc";

        getIfcFile(url);
        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @After
    public void delIfcFile() {

        File inputFile = new File(BLANK_INPUT_PATH);
        inputFile.delete();

        File outputFile = new File(BLANK_OUTPUT_PATH);
        outputFile.delete();
    }
}
