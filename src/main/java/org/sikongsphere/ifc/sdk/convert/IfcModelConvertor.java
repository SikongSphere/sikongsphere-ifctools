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
package org.sikongsphere.ifc.sdk.convert;

import org.sikongsphere.ifc.io.handler.ifc.IfcFileReader;
import org.sikongsphere.ifc.io.handler.ifc.IfcFileWriter;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

/**
 * Convertor Interface
 *
 * @author zaiyuan
 * @date 2023-03-15 20:44:00
 */
public class IfcModelConvertor extends AbstractConvertor<IfcFileModel> {

    @Override
    public IfcFileModel readFile(String path) {
        return IfcFileReader.readFile(path);
    }

    @Override
    public void writeFile(IfcFileModel model, String path) {
        IfcFileWriter.writeFile(model, path);
    }

    /**
     * convert ifc model to json string
     *
     * @param model ifc model
     * @return json string
     */
    public String ifc2Json(IfcFileModel model) {
        // TODO ifc model to json
        return null;
    }

    /**
     * write ifc model to json file
     *
     * @param model ifc model
     * @param path  json file path
     */
    public void writeJsonFile(IfcFileModel model, String path) {
        // TODO write Json File
    }

    /**
     * read ifc json file to ifc model
     *
     * @param path ifc json file path
     * @return ifc model
     */
    public IfcFileModel readJsonFile(String path) {
        // TODO read Json File
        return null;
    }

    /**
     * read ifc json string to ifc model
     *
     * @param json ifc json string
     * @return ifc model
     */
    public IfcFileModel readJson(String json) {
        // TODO read Json String
        return null;
    }
}
