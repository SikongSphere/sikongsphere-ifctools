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
import org.sikongsphere.ifc.io.converter.JsonToIfc;

import java.io.IOException;

/**
 * @author:stan
 * @date:2023/4/8 20:30
 */
public class JsonToIfcTest {
    private final String JsonFile = "src/test/resources/blank_sikongsphere.json";
    private final String outPutIfcFile = "src/test/resources/blank_json2ifc.ifc";

    @Test
    public void js2ifc() throws IOException {
        JsonToIfc jsonToIfc = new JsonToIfc(this.JsonFile);
        jsonToIfc.setWriteToIfcPath(outPutIfcFile);

        jsonToIfc.writeToIfc();
    }
}
