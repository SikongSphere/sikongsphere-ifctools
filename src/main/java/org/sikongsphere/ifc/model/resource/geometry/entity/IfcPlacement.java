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
package org.sikongsphere.ifc.model.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * A placement entity defines the local environment for
 * the definition of a geometry item.
 *
 * @author stan
 * @date 2022/09/01 22:01
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcPlacement extends IfcGeometricRepresentationItem {
    private IfcCartesianPoint location;

    public IfcPlacement() {}

    @IfcParserConstructor
    public IfcPlacement(IfcCartesianPoint location) {
        this.location = location;
    }

    public IfcCartesianPoint getLocation() {
        return location;
    }

    public void setLocation(IfcCartesianPoint location) {
        this.location = location;
    }
}
