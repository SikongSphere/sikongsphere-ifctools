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
 * The 'font-weight' property selects the weight of the font. The values '100' to '900' form an ordered sequence, where
 * each number indicates a weight that is at least as dark as its predecessor. The keyword 'normal' is synonymous with
 * '400', and 'bold' is synonymous with '700'. Keywords other than 'normal' and 'bold' have been shown to be often
 * confused with font names and a numerical scale was therefore chosen for the 9-value list.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:38
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcFontWeight extends STRING {
    public IfcFontWeight() {}

    @IfcParserConstructor
    public IfcFontWeight(STRING value) {
        super(value);
    }

    @Override
    public boolean illegal() {
        return "normal".equalsIgnoreCase(value)
            || "small-caps".equalsIgnoreCase(value)
            || "100".equalsIgnoreCase(value)
            || "200".equalsIgnoreCase(value)
            || "300".equalsIgnoreCase(value)
            || "400".equalsIgnoreCase(value)
            || "500".equalsIgnoreCase(value)
            || "600".equalsIgnoreCase(value)
            || "700".equalsIgnoreCase(value)
            || "800".equalsIgnoreCase(value)
            || "900".equalsIgnoreCase(value);
    }
}
