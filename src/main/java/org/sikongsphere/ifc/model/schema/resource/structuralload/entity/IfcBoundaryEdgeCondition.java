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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcModulusOfLinearSubgradeReactionMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcModulusOfRotationalSubgradeReactionMeasure;

/**
 * The entity IfcBoundaryEdgeCondition describes boundary conditions that can be applied to structural edge connections,
 * either directly for the connection (e.g. the connecting edge) or for the relation between a structural member
 * and the connection.
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcBoundaryEdgeCondition extends IfcBoundaryCondition {
    @IfcOptionField
    private IfcModulusOfLinearSubgradeReactionMeasure linearStiffnessByLengthX;
    @IfcOptionField
    private IfcModulusOfLinearSubgradeReactionMeasure linearStiffnessByLengthY;
    @IfcOptionField
    private IfcModulusOfLinearSubgradeReactionMeasure linearStiffnessByLengthZ;
    @IfcOptionField
    private IfcModulusOfRotationalSubgradeReactionMeasure rotationalStiffnessByLengthX;
    @IfcOptionField
    private IfcModulusOfRotationalSubgradeReactionMeasure rotationalStiffnessByLengthY;
    @IfcOptionField
    private IfcModulusOfRotationalSubgradeReactionMeasure rotationalStiffnessByLengthZ;

    @IfcParserConstructor
    public IfcBoundaryEdgeCondition(
        IfcLabel name,
        IfcModulusOfLinearSubgradeReactionMeasure linearStiffnessByLengthX,
        IfcModulusOfLinearSubgradeReactionMeasure linearStiffnessByLengthY,
        IfcModulusOfLinearSubgradeReactionMeasure linearStiffnessByLengthZ,
        IfcModulusOfRotationalSubgradeReactionMeasure rotationalStiffnessByLengthX,
        IfcModulusOfRotationalSubgradeReactionMeasure rotationalStiffnessByLengthY,
        IfcModulusOfRotationalSubgradeReactionMeasure rotationalStiffnessByLengthZ
    ) {
        super(name);
        this.linearStiffnessByLengthX = linearStiffnessByLengthX;
        this.linearStiffnessByLengthY = linearStiffnessByLengthY;
        this.linearStiffnessByLengthZ = linearStiffnessByLengthZ;
        this.rotationalStiffnessByLengthX = rotationalStiffnessByLengthX;
        this.rotationalStiffnessByLengthY = rotationalStiffnessByLengthY;
        this.rotationalStiffnessByLengthZ = rotationalStiffnessByLengthZ;
    }

    public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthX() {
        return linearStiffnessByLengthX;
    }

    public void setLinearStiffnessByLengthX(
        IfcModulusOfLinearSubgradeReactionMeasure linearStiffnessByLengthX
    ) {
        this.linearStiffnessByLengthX = linearStiffnessByLengthX;
    }

    public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthY() {
        return linearStiffnessByLengthY;
    }

    public void setLinearStiffnessByLengthY(
        IfcModulusOfLinearSubgradeReactionMeasure linearStiffnessByLengthY
    ) {
        this.linearStiffnessByLengthY = linearStiffnessByLengthY;
    }

    public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthZ() {
        return linearStiffnessByLengthZ;
    }

    public void setLinearStiffnessByLengthZ(
        IfcModulusOfLinearSubgradeReactionMeasure linearStiffnessByLengthZ
    ) {
        this.linearStiffnessByLengthZ = linearStiffnessByLengthZ;
    }

    public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthX() {
        return rotationalStiffnessByLengthX;
    }

    public void setRotationalStiffnessByLengthX(
        IfcModulusOfRotationalSubgradeReactionMeasure rotationalStiffnessByLengthX
    ) {
        this.rotationalStiffnessByLengthX = rotationalStiffnessByLengthX;
    }

    public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthY() {
        return rotationalStiffnessByLengthY;
    }

    public void setRotationalStiffnessByLengthY(
        IfcModulusOfRotationalSubgradeReactionMeasure rotationalStiffnessByLengthY
    ) {
        this.rotationalStiffnessByLengthY = rotationalStiffnessByLengthY;
    }

    public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthZ() {
        return rotationalStiffnessByLengthZ;
    }

    public void setRotationalStiffnessByLengthZ(
        IfcModulusOfRotationalSubgradeReactionMeasure rotationalStiffnessByLengthZ
    ) {
        this.rotationalStiffnessByLengthZ = rotationalStiffnessByLengthZ;
    }
}
