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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianPoint;

/**
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcVertexBasedTextureMap extends IfcAbstractClass {
    private LIST<IfcTextureVertex> textureVertices;
    private LIST<IfcCartesianPoint> texturePoints;

    @IfcParserConstructor
    public IfcVertexBasedTextureMap(
        LIST<IfcTextureVertex> textureVertices,
        LIST<IfcCartesianPoint> texturePoints
    ) {
        this.textureVertices = textureVertices;
        this.texturePoints = texturePoints;
    }

    public LIST<IfcTextureVertex> getTextureVertices() {
        return textureVertices;
    }

    public void setTextureVertices(LIST<IfcTextureVertex> textureVertices) {
        this.textureVertices = textureVertices;
    }

    public LIST<IfcCartesianPoint> getTexturePoints() {
        return texturePoints;
    }

    public void setTexturePoints(LIST<IfcCartesianPoint> texturePoints) {
        this.texturePoints = texturePoints;
    }
}
