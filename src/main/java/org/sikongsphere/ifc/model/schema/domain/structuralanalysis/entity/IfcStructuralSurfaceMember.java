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
package org.sikongsphere.ifc.model.schema.domain.structuralanalysis.entity;

import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration.IfcStructuralSurfaceTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.structuralload.entity.IfcBoundaryCondition;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Yiwei
 * @date 2022/12/23
 */
public class IfcStructuralSurfaceMember extends IfcStructuralMember {
    private IfcStructuralSurfaceTypeEnum predefinedType;
    @IfcOptionField
    private IfcPositiveLengthMeasure thickness;

    public IfcStructuralSurfaceMember(
        IfcStructuralSurfaceTypeEnum predefinedType,
        IfcPositiveLengthMeasure thickness
    ) {
        this.predefinedType = predefinedType;
        this.thickness = thickness;
    }

    @IfcParserConstructor
    public IfcStructuralSurfaceMember(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcStructuralSurfaceTypeEnum predefinedType,
        IfcPositiveLengthMeasure thickness
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation
        );
        this.predefinedType = predefinedType;
        this.thickness = thickness;
    }

    public IfcStructuralSurfaceTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcStructuralSurfaceTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    public IfcPositiveLengthMeasure getThickness() {
        return thickness;
    }

    public void setThickness(IfcPositiveLengthMeasure thickness) {
        this.thickness = thickness;
    }
}
