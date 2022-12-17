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
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The draughting pre defined text font is a pre defined text font for the purpose to identify a font by name.
 *
 * @author zaiyuan
 * @date 2022/12/17 13:18
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDraughtingPreDefinedTextFont extends IfcPreDefinedTextFont {
    @Override
    public boolean illegal() {
        return "ISO 3098-1 font A".equalsIgnoreCase(getName().value)
            || "ISO 3098-1 font B".equalsIgnoreCase(getName().value);
    }
}
