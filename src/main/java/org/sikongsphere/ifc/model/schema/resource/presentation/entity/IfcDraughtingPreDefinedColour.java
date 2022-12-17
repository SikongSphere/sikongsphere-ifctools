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
package org.sikongsphere.ifc.model.schema.resource.presentation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;

/**
 * The draughting pre defined colour is a pre defined colour for the purpose to identify a colour by name.
 *
 * @author zaiyuan
 * @date 2022/12/17 13:18
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDraughtingPreDefinedColour extends IfcPreDefinedColour {
    @Override
    public boolean illegal() {
        return "black".equalsIgnoreCase(getName().value)
            || "red".equalsIgnoreCase(getName().value)
            || "green".equalsIgnoreCase(getName().value)
            || "blue".equalsIgnoreCase(getName().value)
            || "yellow".equalsIgnoreCase(getName().value)
            || "magenta".equalsIgnoreCase(getName().value)
            || "cyan".equalsIgnoreCase(getName().value)
            || "white".equalsIgnoreCase(getName().value)
            || "by layer".equalsIgnoreCase(getName().value);
    }
}
