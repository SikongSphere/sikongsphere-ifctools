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

import org.junit.Test;

import java.io.IOException;

import static org.sikongsphere.ifc.parser.IfcFileIOTestUtils.*;

/**
 * @author:stan
 * @date:2022/12/21 21:37
 */
public class SteelIfcFileIOTest {

    @Test
    public void sculptureBrepFile() throws IOException {
        // String url =
        // "http://sikongsphere-web:9870/webhdfs/v1/steel/171210AISC_Sculpture_brep.ifc?op=OPEN";

        // getIfcFile(url);
        ioTest(BLANK_INPUT_PATH, BLANK_OUTPUT_PATH);
    }
}
