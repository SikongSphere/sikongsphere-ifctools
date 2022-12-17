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
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.LOGICAL;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianTransformationOperator2D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.enumeration.IfcSurfaceTextureEnum;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcBlobTexture extends IfcSurfaceTexture {
    private IfcIdentifier rasterFormat;
    private BOOLEAN rasterCode;

    @IfcParserConstructor
    public IfcBlobTexture(
        LOGICAL repeatS,
        LOGICAL repeatT,
        IfcSurfaceTextureEnum textureType,
        IfcCartesianTransformationOperator2D textureTransform,
        IfcIdentifier rasterFormat,
        BOOLEAN rasterCode
    ) {
        super(repeatS, repeatT, textureType, textureTransform);
        this.rasterFormat = rasterFormat;
        this.rasterCode = rasterCode;
    }

    public IfcIdentifier getRasterFormat() {
        return rasterFormat;
    }

    public void setRasterFormat(IfcIdentifier rasterFormat) {
        this.rasterFormat = rasterFormat;
    }

    public BOOLEAN getRasterCode() {
        return rasterCode;
    }

    public void setRasterCode(BOOLEAN rasterCode) {
        this.rasterCode = rasterCode;
    }
}
