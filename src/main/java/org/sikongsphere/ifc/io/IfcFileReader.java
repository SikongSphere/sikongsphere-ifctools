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
import org.sikongsphere.ifc.newModel.parser.file.IfcFileParser;

import java.io.IOException;

/**
 * This is a file reader for ifc model
 *
 * @author zaiyuan
 * @date 2022/09/08 22:26
 */
public class IfcFileReader {

    public static IfcFileModel readFile(String path) throws IOException {
        IfcFileParser ifcFileParser = new IfcFileParser();
        IfcFileModel model = (IfcFileModel) ifcFileParser.parseFile(path);

        return model;
    }
}
