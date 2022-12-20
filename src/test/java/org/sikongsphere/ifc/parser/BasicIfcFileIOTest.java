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

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static org.sikongsphere.ifc.parser.IfcFileIOTestUtils.BLANK_OUTPUT_PATH;
import static org.sikongsphere.ifc.parser.IfcFileIOTestUtils.ioTest;

/**
 * a test between an input IFC file
 * and an output IFC file from self-define method.
 *
 * @author stan
 * @date 2022/09/07 22:26
 */
public class BasicIfcFileIOTest {

    String BLANK_INPUT_PATH = "src/test/resources/temp.ifc";

    @Test
    public void blankFile() throws IOException {

        URL url = new URL("http://sikongsphere-web:9870/webhdfs/v1/basic-ifc/blank.ifc?op=OPEN");
        File file = new File(BLANK_INPUT_PATH);
        FileUtils.copyURLToFile(url, file);

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void basicFile() throws IOException {

        String BLANK_INPUT_PATH = "src/test/resources/basic_0.ifc";

        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void complexFile() throws IOException {

        String BLANK_INPUT_PATH = "src/test/resources/complex.ifc";

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
