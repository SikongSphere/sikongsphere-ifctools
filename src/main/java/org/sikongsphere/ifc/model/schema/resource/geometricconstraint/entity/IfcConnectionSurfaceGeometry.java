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
package org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.selectType.IfcSurfaceOrFaceSurface;

/**
 * The IfcConnectionSurfaceGeometry is used to describe the geometric constraints that facilitate the physical
 * connection of two objects at a surface or at a face with surface geometry associated.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcConnectionSurfaceGeometry extends IfcConnectionGeometry {
    private IfcSurfaceOrFaceSurface surfaceOnRelatingElement;
    @IfcOptionField
    private IfcSurfaceOrFaceSurface surfaceOnRelatedElement;

    @IfcParserConstructor
    public IfcConnectionSurfaceGeometry(
        IfcSurfaceOrFaceSurface surfaceOnRelatingElement,
        IfcSurfaceOrFaceSurface surfaceOnRelatedElement
    ) {
        this.surfaceOnRelatingElement = surfaceOnRelatingElement;
        this.surfaceOnRelatedElement = surfaceOnRelatedElement;
    }

    public IfcSurfaceOrFaceSurface getSurfaceOnRelatingElement() {
        return surfaceOnRelatingElement;
    }

    public void setSurfaceOnRelatingElement(IfcSurfaceOrFaceSurface surfaceOnRelatingElement) {
        this.surfaceOnRelatingElement = surfaceOnRelatingElement;
    }

    public IfcSurfaceOrFaceSurface getSurfaceOnRelatedElement() {
        return surfaceOnRelatedElement;
    }

    public void setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface surfaceOnRelatedElement) {
        this.surfaceOnRelatedElement = surfaceOnRelatedElement;
    }
}
