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
package org.sikongsphere.ifc.newModel.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.core.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.newModel.core.productextension.enumeration.IfcElementCompositionEnum;
import org.sikongsphere.ifc.newModel.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.newModel.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.resource.utility.entity.IfcOwnerHistory;

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
public class IfcSpatialStructureElement extends IfcProduct {
    private IfcLabel longName;
    private IfcElementCompositionEnum compositionType;

    // private SET<IfcRelReferencedInSpatialStructure> referenceElements;
    // private SET<IfcRelServicesBuildings> servicedBySystems;
    // private SET<IfcRelContainedInSpatialStructure> containsElements;

    public IfcSpatialStructureElement() {}

    public IfcSpatialStructureElement(IfcLabel longName, IfcElementCompositionEnum compositionType
    // SET<IfcRelReferencedInSpatialStructure> referenceElements,
    // SET<IfcRelServicesBuildings> servicedBySystems,
    // SET<IfcRelContainedInSpatialStructure> containsElements
    ) {
        this.longName = longName;
        this.compositionType = compositionType;
        // this.referenceElements = referenceElements;
        // this.servicedBySystems = servicedBySystems;
        // this.containsElements = containsElements;
    }

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

    // public SET<IfcRelReferencedInSpatialStructure> getReferenceElements() {
    // return referenceElements;
    // }
    //
    // public void setReferenceElements(SET<IfcRelReferencedInSpatialStructure> referenceElements) {
    // this.referenceElements = referenceElements;
    // }
    //
    // public SET<IfcRelServicesBuildings> getServicedBySystems() {
    // return servicedBySystems;
    // }
    //
    // public void setServicedBySystems(SET<IfcRelServicesBuildings> servicedBySystems) {
    // this.servicedBySystems = servicedBySystems;
    // }
    //
    // public SET<IfcRelContainedInSpatialStructure> getContainsElements() {
    // return containsElements;
    // }
    //
    // public void setContainsElements(SET<IfcRelContainedInSpatialStructure> containsElements) {
    // this.containsElements = containsElements;
    // }
}
