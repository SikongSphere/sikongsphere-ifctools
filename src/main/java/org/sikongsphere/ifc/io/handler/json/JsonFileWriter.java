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
package org.sikongsphere.ifc.io.handler.json;

import org.sikongsphere.ifc.io.constant.IfcJsonSerializerMapper;

import java.io.*;
import java.util.LinkedHashMap;

/**
 * @author stan
 * @date 2023/02/10 12:46
 */
public class JsonFileWriter {

    public static void writeFile(LinkedHashMap map, String path) {
        try {
            BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(path))
            );
            IfcJsonSerializerMapper.map.writeValue(writer, map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
