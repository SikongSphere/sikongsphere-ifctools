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
package org.sikongsphere.ifc.model.schema.resource.structuralload.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;

/**
 * This class is used to encapsulate actor role information
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcFailureConnectionCondition extends IfcStructuralConnectionCondition {
    @IfcOptionField
    private IfcForceMeasure tensionFailureX;
    @IfcOptionField
    private IfcForceMeasure tensionFailureY;
    @IfcOptionField
    private IfcForceMeasure tensionFailureZ;
    @IfcOptionField
    private IfcForceMeasure compressionFailureX;
    @IfcOptionField
    private IfcForceMeasure compressionFailureY;
    @IfcOptionField
    private IfcForceMeasure compressionFailureZ;

    @IfcParserConstructor
    public IfcFailureConnectionCondition(
        IfcLabel name,
        IfcForceMeasure tensionFailureX,
        IfcForceMeasure tensionFailureY,
        IfcForceMeasure tensionFailureZ,
        IfcForceMeasure compressionFailureX,
        IfcForceMeasure compressionFailureY,
        IfcForceMeasure compressionFailureZ
    ) {
        super(name);
        this.tensionFailureX = tensionFailureX;
        this.tensionFailureY = tensionFailureY;
        this.tensionFailureZ = tensionFailureZ;
        this.compressionFailureX = compressionFailureX;
        this.compressionFailureY = compressionFailureY;
        this.compressionFailureZ = compressionFailureZ;
    }

    public IfcForceMeasure getTensionFailureX() {
        return tensionFailureX;
    }

    public void setTensionFailureX(IfcForceMeasure tensionFailureX) {
        this.tensionFailureX = tensionFailureX;
    }

    public IfcForceMeasure getTensionFailureY() {
        return tensionFailureY;
    }

    public void setTensionFailureY(IfcForceMeasure tensionFailureY) {
        this.tensionFailureY = tensionFailureY;
    }

    public IfcForceMeasure getTensionFailureZ() {
        return tensionFailureZ;
    }

    public void setTensionFailureZ(IfcForceMeasure tensionFailureZ) {
        this.tensionFailureZ = tensionFailureZ;
    }

    public IfcForceMeasure getCompressionFailureX() {
        return compressionFailureX;
    }

    public void setCompressionFailureX(IfcForceMeasure compressionFailureX) {
        this.compressionFailureX = compressionFailureX;
    }

    public IfcForceMeasure getCompressionFailureY() {
        return compressionFailureY;
    }

    public void setCompressionFailureY(IfcForceMeasure compressionFailureY) {
        this.compressionFailureY = compressionFailureY;
    }

    public IfcForceMeasure getCompressionFailureZ() {
        return compressionFailureZ;
    }

    public void setCompressionFailureZ(IfcForceMeasure compressionFailureZ) {
        this.compressionFailureZ = compressionFailureZ;
    }
}
