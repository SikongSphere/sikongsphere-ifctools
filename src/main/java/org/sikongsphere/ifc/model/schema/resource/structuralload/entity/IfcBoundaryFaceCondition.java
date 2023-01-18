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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcModulusOfSubgradeReactionMeasure;

/**
 * The entity IfcBoundaryFaceCondition describes boundary conditions that can be applied to structural face connections,
 * either directly for the connection (e.g. the connecting face) or for the relation between a structural member
 * and the connection.
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcBoundaryFaceCondition extends IfcBoundaryCondition {
    @IfcOptionField
    private IfcModulusOfSubgradeReactionMeasure linearStiffnessByAreaX;
    @IfcOptionField
    private IfcModulusOfSubgradeReactionMeasure linearStiffnessByAreaY;
    @IfcOptionField
    private IfcModulusOfSubgradeReactionMeasure linearStiffnessByAreaZ;

    @IfcParserConstructor
    public IfcBoundaryFaceCondition(
        IfcLabel name,
        IfcModulusOfSubgradeReactionMeasure linearStiffnessByAreaX,
        IfcModulusOfSubgradeReactionMeasure linearStiffnessByAreaY,
        IfcModulusOfSubgradeReactionMeasure linearStiffnessByAreaZ
    ) {
        super(name);
        this.linearStiffnessByAreaX = linearStiffnessByAreaX;
        this.linearStiffnessByAreaY = linearStiffnessByAreaY;
        this.linearStiffnessByAreaZ = linearStiffnessByAreaZ;
    }

    public IfcModulusOfSubgradeReactionMeasure getLinearStiffnessByAreaX() {
        return linearStiffnessByAreaX;
    }

    public void setLinearStiffnessByAreaX(
        IfcModulusOfSubgradeReactionMeasure linearStiffnessByAreaX
    ) {
        this.linearStiffnessByAreaX = linearStiffnessByAreaX;
    }

    public IfcModulusOfSubgradeReactionMeasure getLinearStiffnessByAreaY() {
        return linearStiffnessByAreaY;
    }

    public void setLinearStiffnessByAreaY(
        IfcModulusOfSubgradeReactionMeasure linearStiffnessByAreaY
    ) {
        this.linearStiffnessByAreaY = linearStiffnessByAreaY;
    }

    public IfcModulusOfSubgradeReactionMeasure getLinearStiffnessByAreaZ() {
        return linearStiffnessByAreaZ;
    }

    public void setLinearStiffnessByAreaZ(
        IfcModulusOfSubgradeReactionMeasure linearStiffnessByAreaZ
    ) {
        this.linearStiffnessByAreaZ = linearStiffnessByAreaZ;
    }
}
