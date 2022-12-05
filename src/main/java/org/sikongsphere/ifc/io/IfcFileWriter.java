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
package org.sikongsphere.ifc.io;

import org.sikongsphere.ifc.newModel.fileelement.IfcFileModel;

import java.io.*;

/**
 * a static method used to save IFC file,
 * which is as the same as the input file.
 *
 * @author stan
 * @date 2022/09/07 22:25
 */
public class IfcFileWriter {

    public static void writeFile(IfcFileModel model, String path) {
        try (
            BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(path))
            )
        ) {
            writer.write(model.toString());
        } catch (IOException e) {
            // TODO Our Own Exception System
            throw new RuntimeException(e);
        }
    }
}
