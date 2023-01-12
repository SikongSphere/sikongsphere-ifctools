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
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.entity.IfcRelConnectsStructuralElement;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Wang Bohong
 * @date 2022/10/13 12:13
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public abstract class IfcElement extends IfcProduct implements IfcObjectReferenceSelect {
    @IfcOptionField
    private IfcIdentifier tag;

    @IfcInverseParameter
    private SET<IfcRelFillsElement> fillsVoids;
    @IfcInverseParameter
    private SET<IfcRelConnectsElements> connectedTo;
    @IfcInverseParameter
    private SET<IfcRelCoversBldgElements> hasCoverings;
    @IfcInverseParameter
    private SET<IfcRelProjectsElement> hasProjections;
    @IfcInverseParameter
    private SET<IfcRelConnectsStructuralElement> hasStructuralMember;
    @IfcInverseParameter
    private SET<IfcRelReferencedInSpatialStructure> referencedInStructures;
    @IfcInverseParameter
    private SET<IfcRelConnectsPortToElement> hasPorts;
    @IfcInverseParameter
    private SET<IfcRelVoidsElement> hasOpenings;
    @IfcInverseParameter
    private SET<IfcRelConnectsWithRealizingElements> isConnectionRealization;
    @IfcInverseParameter
    private SET<IfcRelSpaceBoundary> providesBoundaries;
    @IfcInverseParameter
    private SET<IfcRelConnectsElements> connectedFrom;
    @IfcInverseParameter
    private SET<IfcRelContainedInSpatialStructure> containedInStructure;

    public IfcElement() {}

    @IfcParserConstructor
    public IfcElement(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag
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
        this.tag = tag;
    }

    public IfcIdentifier getTag() {
        return tag;
    }

    public void setTag(IfcIdentifier tag) {
        this.tag = tag;
    }
}
