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
package org.sikongsphere.ifc.serialization;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import org.sikongsphere.ifc.io.IfcFileReader;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

import java.io.FileOutputStream;
import java.io.IOException;

public class IfcSerializationTest {
    public static void main(String[] args) throws IOException {
        IfcFileModel ifcFileModel = IfcFileReader.readFile(
            "F:\\workspace\\idea\\sikongsphere-ifctools\\src\\test\\resources\\blank.ifc"
        );
        Kryo kryo = new Kryo();
        kryo.addDefaultSerializer(IfcFileModel.class, IfcFileModelKryoSerializer.class);
        Output output = new Output(
            new FileOutputStream(
                "F:\\workspace\\idea\\sikongsphere-ifctools\\src\\test\\resources\\ifc_serial.sk"
            )
        );
        kryo.writeObject(output, ifcFileModel);
        output.close();
    }
}
