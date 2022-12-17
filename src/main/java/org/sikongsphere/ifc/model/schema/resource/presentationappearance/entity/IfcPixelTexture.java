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
package org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.BINARY;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.LOGICAL;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianTransformationOperator2D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcInteger;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.enumeration.IfcSurfaceTextureEnum;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPixelTexture extends IfcSurfaceTexture {
    private IfcInteger width;
    private IfcInteger height;
    private IfcInteger colourComponents;
    private LIST<BINARY> pixel;

    @IfcParserConstructor
    public IfcPixelTexture(
        LOGICAL repeatS,
        LOGICAL repeatT,
        IfcSurfaceTextureEnum textureType,
        IfcCartesianTransformationOperator2D textureTransform,
        IfcInteger width,
        IfcInteger height,
        IfcInteger colourComponents,
        LIST<BINARY> pixel
    ) {
        super(repeatS, repeatT, textureType, textureTransform);
        this.width = width;
        this.height = height;
        this.colourComponents = colourComponents;
        this.pixel = pixel;
    }

    public IfcInteger getWidth() {
        return width;
    }

    public void setWidth(IfcInteger width) {
        this.width = width;
    }

    public IfcInteger getHeight() {
        return height;
    }

    public void setHeight(IfcInteger height) {
        this.height = height;
    }

    public IfcInteger getColourComponents() {
        return colourComponents;
    }

    public void setColourComponents(IfcInteger colourComponents) {
        this.colourComponents = colourComponents;
    }

    public LIST<BINARY> getPixel() {
        return pixel;
    }

    public void setPixel(LIST<BINARY> pixel) {
        this.pixel = pixel;
    }
}
