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
package org.sikongsphere.ifc.newModel.parser;

import org.sikongsphere.ifc.newModel.Model;

import java.io.IOException;

/**
 * Parser for File
 * @author zaiyuan
 * @date 2022/12/04 15:27
 */
public abstract class AbstractFileParser implements IParser {
    abstract Model parseFile(String filePath) throws IOException;
}
