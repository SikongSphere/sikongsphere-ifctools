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
package org.sikongsphere.ifc.io.enumeration;

/**
 * data format enumeration
 *
 * @author: zaiyuan
 * @date: 2023/2/11 12:32
 */
public enum DataFormatEnum {
    // support IfcJSON
    IFC_JSON("IfcJSON"),
    IFC_TO_JSON_PROSSESOR_SYSTEM("IFC2JSON_Java Version ");

    private String description = "";

    DataFormatEnum(String description) {
        this.description = description;
    }

    public String value() {
        return this.description;
    }
}
