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
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.sikongsphere.ifc.parser.IfcFileIOTestUtils.*;

/**
 * @author:stan
 * @date:2022/12/21 21:37
 */
public class SteelIfcFileIOTest {

    @Ignore
    /**
     * todo 需要寻找一个云存储的解决方案，并将IFC文件上传，通过URL下载
     */
    public void sculptureBrepFile() throws IOException {
        String url =
            "http://sikongsphere-web:9870/webhdfs/v1/steel/171210AISC_Sculpture_brep.ifc?op=OPEN";

        getIfcFile(url);
        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }

    @Test
    public void sculptureParamFile() throws IOException {
        ioTest("src/test/resources/171210AISC_Sculpture_param.ifc", BLANK_OUTPUT_PATH);
    }

    @After
    public void delIfcFile() {

        // File inputFile = new File(BLANK_INPUT_PATH);
        // inputFile.delete();

        File outputFile = new File(BLANK_OUTPUT_PATH);
        outputFile.delete();
    }
}
