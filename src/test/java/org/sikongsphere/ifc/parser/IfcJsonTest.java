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
import org.sikongsphere.ifc.io.converter.IfcToJson;
import org.sikongsphere.ifc.io.converter.JsonToIfc;
import org.sikongsphere.ifc.io.handler.ifc.IfcFileReader;
import org.sikongsphere.ifc.io.handler.json.JsonFileWriter;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

import java.io.IOException;
import java.util.LinkedHashMap;

/**
 * @author:stan
 * @date:2023/4/9 10:23
 */
public class IfcJsonTest {
    private final String ifcFile = "src/test/resources/blank.ifc";
    private final String ifc2jsonfile = "src/test/resources/blank_ifc2json.json";
    private final String json2ifcfile = "src/test/resources/blank_json2ifc.ifc";

    @Test
    public void ifc2jsonTest() {
        IfcFileModel ifcFileModel = IfcFileReader.readFile(ifcFile);
        IfcToJson ifcToJson = new IfcToJson(ifcFileModel);
        LinkedHashMap<String, Object> map = ifcToJson.transform(ifcFileModel);
        JsonFileWriter.writeFile(map, ifc2jsonfile);
    }

    @Test
    public void json2ifc() throws IOException {
        JsonToIfc jsonToIfc = new JsonToIfc(ifc2jsonfile);
        jsonToIfc.setWriteToIfcPath(json2ifcfile);

        jsonToIfc.writeToIfc();
    }
}
