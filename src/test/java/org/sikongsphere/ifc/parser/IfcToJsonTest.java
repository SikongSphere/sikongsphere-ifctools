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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;
import org.sikongsphere.ifc.io.IfcFileReader;
import org.sikongsphere.ifc.io.converter.IfcToJson;
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author:stan
 * @date:2023/2/5 21:19
 */
public class IfcToJsonTest {

    private final String IFC_FILE = "src/test/resources/blank.ifc";

    @Test
    public void blankIfcTest() throws IOException {
        IfcFileModel ifcFileModel = IfcFileReader.readFile(IFC_FILE);
        IfcToJson ifcToJson = new IfcToJson(ifcFileModel);
        LinkedHashMap<String, Object> map = ifcToJson.transform();
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT)
            .configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, false);
        String s = mapper.writeValueAsString(map);
        System.out.println(s);
    }

    @Test
    public void demo() throws Exception {
        IfcLengthMeasure measure1 = new IfcLengthMeasure(new DOUBLE(new STRING("0.0")));
        IfcLengthMeasure measure2 = new IfcLengthMeasure(new DOUBLE(new STRING("0.0")));
        IfcLengthMeasure measure3 = new IfcLengthMeasure(new DOUBLE(new STRING("0.0")));
        LIST<IfcLengthMeasure> list = new LIST<>();
        list.add(measure1);
        list.add(measure2);
        list.add(measure3);

        IfcCartesianPoint point = new IfcCartesianPoint(list);
        ObjectMapper mapper = new ObjectMapper();
        String value = mapper.writeValueAsString(point);
        System.out.println(value);
    }
}
