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
import org.sikongsphere.ifc.io.handler.ifc.IfcFileReader;
import org.sikongsphere.ifc.io.converter.IfcToJson;
import org.sikongsphere.ifc.io.constant.IfcJsonSerializerMapper;
import org.sikongsphere.ifc.io.handler.json.JsonFileWriter;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

import java.io.IOException;
import java.util.LinkedHashMap;

/**
 * @author:stan
 * @date:2023/2/5 21:19
 */
public class IfcToJsonTest {

    private final String IFC_FILE = "src/test/resources/blank.ifc";
    private final String IFC_TO_JSON_FILE = "src/test/resources/blank_sikongsphere.json";

    @Test
    public void blankIfcTest() throws IOException {
        IfcFileModel ifcFileModel = IfcFileReader.readFile(IFC_FILE);
        IfcToJson ifcToJson = new IfcToJson(ifcFileModel);
        LinkedHashMap<String, Object> map = ifcToJson.transform(ifcFileModel);
        JsonFileWriter.writeFile(map, IFC_TO_JSON_FILE);
    }
}
