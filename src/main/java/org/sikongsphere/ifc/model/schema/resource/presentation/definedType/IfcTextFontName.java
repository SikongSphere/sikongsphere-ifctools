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
package org.sikongsphere.ifc.model.schema.resource.presentation.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.STRING;

/**
 * The value is a  font family name and/or generic family name
 *
 * @author zaiyuan
 * @date 2022/12/17 21:38
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcTextFontName extends STRING {
    public IfcTextFontName() {}

    @IfcParserConstructor
    public IfcTextFontName(STRING value) {
        super(value);
    }
}
