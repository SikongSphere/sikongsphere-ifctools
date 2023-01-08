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
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLinearStiffnessMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcModulusOfSubgradeReactionMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcRotationalStiffnessMeasure;

/**
 * This class is used to encapsulate actor role information
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcBoundaryNodeCondition extends IfcBoundaryCondition {
    @IfcOptionField
    private IfcLinearStiffnessMeasure linearStiffnessX;
    @IfcOptionField
    private IfcLinearStiffnessMeasure linearStiffnessY;
    @IfcOptionField
    private IfcLinearStiffnessMeasure linearStiffnessZ;
    @IfcOptionField
    private IfcRotationalStiffnessMeasure rotationalStiffnessX;
    @IfcOptionField
    private IfcRotationalStiffnessMeasure rotationalStiffnessY;
    @IfcOptionField
    private IfcRotationalStiffnessMeasure rotationalStiffnessZ;

    @IfcParserConstructor
    public IfcBoundaryNodeCondition(
        IfcLabel name,
        IfcLinearStiffnessMeasure linearStiffnessX,
        IfcLinearStiffnessMeasure linearStiffnessY,
        IfcLinearStiffnessMeasure linearStiffnessZ,
        IfcRotationalStiffnessMeasure rotationalStiffnessX,
        IfcRotationalStiffnessMeasure rotationalStiffnessY,
        IfcRotationalStiffnessMeasure rotationalStiffnessZ
    ) {
        super(name);
        this.linearStiffnessX = linearStiffnessX;
        this.linearStiffnessY = linearStiffnessY;
        this.linearStiffnessZ = linearStiffnessZ;
        this.rotationalStiffnessX = rotationalStiffnessX;
        this.rotationalStiffnessY = rotationalStiffnessY;
        this.rotationalStiffnessZ = rotationalStiffnessZ;
    }

    public IfcLinearStiffnessMeasure getLinearStiffnessX() {
        return linearStiffnessX;
    }

    public void setLinearStiffnessX(IfcLinearStiffnessMeasure linearStiffnessX) {
        this.linearStiffnessX = linearStiffnessX;
    }

    public IfcLinearStiffnessMeasure getLinearStiffnessY() {
        return linearStiffnessY;
    }

    public void setLinearStiffnessY(IfcLinearStiffnessMeasure linearStiffnessY) {
        this.linearStiffnessY = linearStiffnessY;
    }

    public IfcLinearStiffnessMeasure getLinearStiffnessZ() {
        return linearStiffnessZ;
    }

    public void setLinearStiffnessZ(IfcLinearStiffnessMeasure linearStiffnessZ) {
        this.linearStiffnessZ = linearStiffnessZ;
    }

    public IfcRotationalStiffnessMeasure getRotationalStiffnessX() {
        return rotationalStiffnessX;
    }

    public void setRotationalStiffnessX(IfcRotationalStiffnessMeasure rotationalStiffnessX) {
        this.rotationalStiffnessX = rotationalStiffnessX;
    }

    public IfcRotationalStiffnessMeasure getRotationalStiffnessY() {
        return rotationalStiffnessY;
    }

    public void setRotationalStiffnessY(IfcRotationalStiffnessMeasure rotationalStiffnessY) {
        this.rotationalStiffnessY = rotationalStiffnessY;
    }

    public IfcRotationalStiffnessMeasure getRotationalStiffnessZ() {
        return rotationalStiffnessZ;
    }

    public void setRotationalStiffnessZ(IfcRotationalStiffnessMeasure rotationalStiffnessZ) {
        this.rotationalStiffnessZ = rotationalStiffnessZ;
    }
}
