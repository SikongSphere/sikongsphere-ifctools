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
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * A spatial structure element (IfcSpatialStructureElement) is the generalization
 * of all spatial elements that might be used to define a spatial structure.
 * That spatial structure is often used to provide a project structure
 * to organize a building project.
 *
 * @author stan
 * @date 2022/09/01 22:57
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public abstract class IfcSpatialStructureElement extends IfcProduct {
    @IfcOptionField
    private IfcLabel longName;
    private IfcElementCompositionEnum compositionType;

    @IfcInverseParameter
    private SET<IfcRelReferencedInSpatialStructure> referenceElements;
    @IfcInverseParameter
    private SET<IfcRelServicesBuildings> servicedBySystems;
    @IfcInverseParameter
    private SET<IfcRelContainedInSpatialStructure> containsElements;

    public IfcSpatialStructureElement() {}

    @IfcParserConstructor
    public IfcSpatialStructureElement(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcLabel longName,
        IfcElementCompositionEnum compositionType
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
        this.longName = longName;
        this.compositionType = compositionType;
    }

    public IfcLabel getLongName() {
        return longName;
    }

    public void setLongName(IfcLabel longName) {
        this.longName = longName;
    }

    public IfcElementCompositionEnum getCompositionType() {
        return compositionType;
    }

    public void setCompositionType(IfcElementCompositionEnum compositionType) {
        this.compositionType = compositionType;
    }

    public SET<IfcRelReferencedInSpatialStructure> getReferenceElements() {
        return referenceElements;
    }

    public void setReferenceElements(SET<IfcRelReferencedInSpatialStructure> referenceElements) {
        this.referenceElements = referenceElements;
    }

    public SET<IfcRelServicesBuildings> getServicedBySystems() {
        return servicedBySystems;
    }

    public void setServicedBySystems(SET<IfcRelServicesBuildings> servicedBySystems) {
        this.servicedBySystems = servicedBySystems;
    }

    public SET<IfcRelContainedInSpatialStructure> getContainsElements() {
        return containsElements;
    }

    public void setContainsElements(SET<IfcRelContainedInSpatialStructure> containsElements) {
        this.containsElements = containsElements;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
