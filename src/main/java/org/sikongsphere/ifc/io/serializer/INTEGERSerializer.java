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
import org.sikongsphere.ifc.model.datatype.INTEGER;

import java.io.IOException;

/**
 * @author stan
 * @date 2023/02/10 12:36
 */
public class INTEGERSerializer extends JsonSerializer<INTEGER> {
    @Override
    public void serialize(
        INTEGER integer,
        JsonGenerator jsonGenerator,
        SerializerProvider serializerProvider
    ) throws IOException {
        Integer value = integer.getValue();
        jsonGenerator.writeNumber(value);
    }
}
