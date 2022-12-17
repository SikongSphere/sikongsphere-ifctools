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
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;

/**
 * The planar extent defines the extent along the two axes of the two-dimensional coordinate system, independently of
 * its position.
 * @author zaiyuan
 * @date 2022/12/17 13:18
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPlanarExtent extends IfcGeometricRepresentationItem {
    private IfcLengthMeasure sizeInX;
    private IfcLengthMeasure sizeInY;

    @IfcParserConstructor
    public IfcPlanarExtent(IfcLengthMeasure sizeInX, IfcLengthMeasure sizeInY) {
        this.sizeInX = sizeInX;
        this.sizeInY = sizeInY;
    }

    public IfcLengthMeasure getSizeInX() {
        return sizeInX;
    }

    public void setSizeInX(IfcLengthMeasure sizeInX) {
        this.sizeInX = sizeInX;
    }

    public IfcLengthMeasure getSizeInY() {
        return sizeInY;
    }

    public void setSizeInY(IfcLengthMeasure sizeInY) {
        this.sizeInY = sizeInY;
    }
}
