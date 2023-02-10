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
package org.sikongsphere.ifc.io.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.sikongsphere.ifc.model.IfcDataType;
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.LIST;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author:stan
 * @date:2023/2/8 20:27
 */
public class LISTSerializer extends JsonSerializer<LIST<IfcDataType>> {

    @Override
    public void serialize(
        LIST<IfcDataType> ifcDataTypeLIST,
        JsonGenerator jsonGenerator,
        SerializerProvider serializerProvider
    ) throws IOException {
        List<IfcDataType> dataTypeList = ifcDataTypeLIST.getObjects();
        double[] doubles = new double[dataTypeList.size()];

        for (int i = 0; i < dataTypeList.size(); i++) {
            IfcDataType dataType = dataTypeList.get(i);
            if (DOUBLE.class.isAssignableFrom(dataType.getClass())) {
                BigDecimal value = ((DOUBLE) dataType).getValue();
                doubles[i] = value.doubleValue();
            }
        }

        jsonGenerator.writeArray(doubles, 0, doubles.length);
    }
}
