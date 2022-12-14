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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPlaneAngleMeasure;

/**
 * This class is used to encapsulate actor role information
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic {
    @IfcOptionField
    private IfcLengthMeasure displacementX;
    @IfcOptionField
    private IfcLengthMeasure displacementY;
    @IfcOptionField
    private IfcLengthMeasure displacementZ;
    @IfcOptionField
    private IfcPlaneAngleMeasure rotationalDisplacementRX;
    @IfcOptionField
    private IfcPlaneAngleMeasure rotationalDisplacementRY;
    @IfcOptionField
    private IfcPlaneAngleMeasure rotationalDisplacementRZ;

    @IfcParserConstructor

    public IfcStructuralLoadSingleDisplacement(
        IfcLabel name,
        IfcLengthMeasure displacementX,
        IfcLengthMeasure displacementY,
        IfcLengthMeasure displacementZ,
        IfcPlaneAngleMeasure rotationalDisplacementRX,
        IfcPlaneAngleMeasure rotationalDisplacementRY,
        IfcPlaneAngleMeasure rotationalDisplacementRZ
    ) {
        super(name);
        this.displacementX = displacementX;
        this.displacementY = displacementY;
        this.displacementZ = displacementZ;
        this.rotationalDisplacementRX = rotationalDisplacementRX;
        this.rotationalDisplacementRY = rotationalDisplacementRY;
        this.rotationalDisplacementRZ = rotationalDisplacementRZ;
    }

    public IfcLengthMeasure getDisplacementX() {
        return displacementX;
    }

    public void setDisplacementX(IfcLengthMeasure displacementX) {
        this.displacementX = displacementX;
    }

    public IfcLengthMeasure getDisplacementY() {
        return displacementY;
    }

    public void setDisplacementY(IfcLengthMeasure displacementY) {
        this.displacementY = displacementY;
    }

    public IfcLengthMeasure getDisplacementZ() {
        return displacementZ;
    }

    public void setDisplacementZ(IfcLengthMeasure displacementZ) {
        this.displacementZ = displacementZ;
    }

    public IfcPlaneAngleMeasure getRotationalDisplacementRX() {
        return rotationalDisplacementRX;
    }

    public void setRotationalDisplacementRX(IfcPlaneAngleMeasure rotationalDisplacementRX) {
        this.rotationalDisplacementRX = rotationalDisplacementRX;
    }

    public IfcPlaneAngleMeasure getRotationalDisplacementRY() {
        return rotationalDisplacementRY;
    }

    public void setRotationalDisplacementRY(IfcPlaneAngleMeasure rotationalDisplacementRY) {
        this.rotationalDisplacementRY = rotationalDisplacementRY;
    }

    public IfcPlaneAngleMeasure getRotationalDisplacementRZ() {
        return rotationalDisplacementRZ;
    }

    public void setRotationalDisplacementRZ(IfcPlaneAngleMeasure rotationalDisplacementRZ) {
        this.rotationalDisplacementRZ = rotationalDisplacementRZ;
    }
}
