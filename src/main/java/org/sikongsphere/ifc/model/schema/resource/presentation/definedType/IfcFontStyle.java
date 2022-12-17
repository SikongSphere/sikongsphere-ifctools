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
 * The font-style property selects between normal (sometimes referred to as "roman" or "upright"), italic and oblique
 * faces within a font family.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:38
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcFontStyle extends STRING {
    public IfcFontStyle() {}

    @IfcParserConstructor
    public IfcFontStyle(STRING value) {
        super(value);
    }

    @Override
    public boolean illegal() {
        return "normal".equalsIgnoreCase(value)
            || "italic".equalsIgnoreCase(value)
            || "oblique".equalsIgnoreCase(value);
    }
}
