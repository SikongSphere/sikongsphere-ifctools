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
package org.sikongsphere.ifc.model.core.productextension.entities;

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.core.productextension.enumeration.IfcElementCompositionEnum;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

/**
 * A spatial structure element (IfcSpatialStructureElement) is the generalization
 * of all spatial elements that might be used to define a spatial structure.
 * That spatial structure is often used to provide a project structure
 * to organize a building project.
 *
 * @author stan
 * @date 2022/09/01 22:57
 */
public class IfcSpatialStructureElement extends IfcProduct {
    private IfcLabel longName;
    private IfcElementCompositionEnum compositionType;

    private SET<IfcRelReferencedInSpatialStructure> referenceElements;
    private SET<IfcRelServicesBuildings> servicedBySystems;
    private SET<IfcRelContainedInSpatialStructure> containsElements;

    public IfcSpatialStructureElement() {
    }

    public IfcSpatialStructureElement(IfcLabel longName, IfcElementCompositionEnum compositionType, SET<IfcRelReferencedInSpatialStructure> referenceElements, SET<IfcRelServicesBuildings> servicedBySystems, SET<IfcRelContainedInSpatialStructure> containsElements) {
        this.longName = longName;
        this.compositionType = compositionType;
        this.referenceElements = referenceElements;
        this.servicedBySystems = servicedBySystems;
        this.containsElements = containsElements;
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
}
