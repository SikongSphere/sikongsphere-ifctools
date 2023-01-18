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
package org.sikongsphere.ifc.model.schema.extension.product.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcElementCompositionEnum;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcInternalOrExternalEnum;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 12:58
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcSpace extends IfcSpatialStructureElement {
    private IfcInternalOrExternalEnum interiorOrExteriorSpace;
    @IfcOptionField
    private IfcLengthMeasure elevationWithFlooring;

    @IfcInverseParameter
    private SET<IfcRelCoversSpaces> hasCoverings;
    @IfcInverseParameter
    private SET<IfcRelSpaceBoundary> boundedBy;

    @IfcParserConstructor
    public IfcSpace(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcLabel longName,
        IfcElementCompositionEnum compositionType,
        IfcInternalOrExternalEnum interiorOrExteriorSpace,
        IfcLengthMeasure elevationWithFlooring
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            longName,
            compositionType
        );
        this.interiorOrExteriorSpace = interiorOrExteriorSpace;
        this.elevationWithFlooring = elevationWithFlooring;
    }

    public IfcInternalOrExternalEnum getInteriorOrExteriorSpace() {
        return interiorOrExteriorSpace;
    }

    public void setInteriorOrExteriorSpace(IfcInternalOrExternalEnum interiorOrExteriorSpace) {
        this.interiorOrExteriorSpace = interiorOrExteriorSpace;
    }

    public IfcLengthMeasure getElevationWithFlooring() {
        return elevationWithFlooring;
    }

    public void setElevationWithFlooring(IfcLengthMeasure elevationWithFlooring) {
        this.elevationWithFlooring = elevationWithFlooring;
    }

    public SET<IfcRelCoversSpaces> getHasCoverings() {
        return hasCoverings;
    }

    public void setHasCoverings(SET<IfcRelCoversSpaces> hasCoverings) {
        this.hasCoverings = hasCoverings;
    }

    public SET<IfcRelSpaceBoundary> getBoundedBy() {
        return boundedBy;
    }

    public void setBoundedBy(SET<IfcRelSpaceBoundary> boundedBy) {
        this.boundedBy = boundedBy;
    }
}
