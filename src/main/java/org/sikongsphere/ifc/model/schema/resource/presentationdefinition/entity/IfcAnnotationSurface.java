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
package org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;

/**
 * An IfcAnnotationSurface is a surface or solid with texture coordinates assigned.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAnnotationSurface extends IfcGeometricRepresentationItem {
    private IfcGeometricRepresentationItem item;
    @IfcOptionField
    private IfcTextureCoordinate textureCoordinates;

    @IfcParserConstructor
    public IfcAnnotationSurface(
        IfcGeometricRepresentationItem item,
        IfcTextureCoordinate textureCoordinates
    ) {
        this.item = item;
        this.textureCoordinates = textureCoordinates;
    }

    public IfcGeometricRepresentationItem getItem() {
        return item;
    }

    public void setItem(IfcGeometricRepresentationItem item) {
        this.item = item;
    }

    public IfcTextureCoordinate getTextureCoordinates() {
        return textureCoordinates;
    }

    public void setTextureCoordinates(IfcTextureCoordinate textureCoordinates) {
        this.textureCoordinates = textureCoordinates;
    }
}
