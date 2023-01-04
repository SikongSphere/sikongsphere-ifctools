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

import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration.IfcStructuralSurfaceTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcShapeAspect;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Yiwei
 * @date 2022/12/23
 */
public class IfcStructuralSurfaceMemberVarying extends IfcStructuralSurfaceMember {
    private LIST<IfcPositiveLengthMeasure> subsequentThickness;
    private IfcShapeAspect varyingThicknessLocation;
    @IfcDeriveParameter
    private LIST<IfcPositiveLengthMeasure> varyingThickness;

    public IfcStructuralSurfaceMemberVarying(
        IfcStructuralSurfaceTypeEnum predefinedType,
        IfcPositiveLengthMeasure thickness,
        LIST<IfcPositiveLengthMeasure> subsequentThickness,
        IfcShapeAspect varyingThicknessLocation
    ) {
        super(predefinedType, thickness);
        this.subsequentThickness = subsequentThickness;
        this.varyingThicknessLocation = varyingThicknessLocation;
    }

    @IfcParserConstructor
    public IfcStructuralSurfaceMemberVarying(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcStructuralSurfaceTypeEnum predefinedType,
        IfcPositiveLengthMeasure thickness,
        LIST<IfcPositiveLengthMeasure> subsequentThickness,
        IfcShapeAspect varyingThicknessLocation
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            predefinedType,
            thickness
        );
        this.subsequentThickness = subsequentThickness;
        this.varyingThicknessLocation = varyingThicknessLocation;
    }

    public LIST<IfcPositiveLengthMeasure> getSubsequentThickness() {
        return subsequentThickness;
    }

    public void setSubsequentThickness(LIST<IfcPositiveLengthMeasure> subsequentThickness) {
        this.subsequentThickness = subsequentThickness;
    }

    public IfcShapeAspect getVaryingThicknessLocation() {
        return varyingThicknessLocation;
    }

    public void setVaryingThicknessLocation(IfcShapeAspect varyingThicknessLocation) {
        this.varyingThicknessLocation = varyingThicknessLocation;
    }

    public LIST<IfcPositiveLengthMeasure> getVaryingThickness() {
        return varyingThickness;
    }

    public void setVaryingThickness(LIST<IfcPositiveLengthMeasure> varyingThickness) {
        this.varyingThickness = varyingThickness;
    }
}
