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
import org.sikongsphere.ifc.model.datatype.SCIENTIFICNOTATION;

import java.io.IOException;

/**
 * 转json时暂时用字符串替代
 *
 * @author:stan
 * @date:2023/2/8 22:23
 */
public class SCIENTIFICNOTATIONSerializer extends JsonSerializer<SCIENTIFICNOTATION> {
    @Override
    public void serialize(
        SCIENTIFICNOTATION scientificnotation,
        JsonGenerator jsonGenerator,
        SerializerProvider serializerProvider
    ) throws IOException {
        jsonGenerator.writeString(scientificnotation.toString());
    }
}
