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
package org.sikongsphere.ifc.newModel.schema.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.core.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.newModel.schema.core.kernel.entity.IfcRelConnects;

/**
 * This objectified relationship, IfcRelReferencedInSpatialStructure,
 * is used to assign elements in addition to those levels of the project spatial structure,
 * in which they are referenced, but not primarily contained.
 *
 * @author stan
 * @date 2022/09/02 13:34
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcRelReferencedInSpatialStructure extends IfcRelConnects {
    private SET<IfcProduct> relatedElements;
    private IfcSpatialStructureElement relatingStructure;

    public IfcRelReferencedInSpatialStructure() {}

    public IfcRelReferencedInSpatialStructure(
        SET<IfcProduct> relatedElements,
        IfcSpatialStructureElement relatingStructure
    ) {
        this.relatedElements = relatedElements;
        this.relatingStructure = relatingStructure;
    }

    public SET<IfcProduct> getRelatedElements() {
        return relatedElements;
    }

    public void setRelatedElements(SET<IfcProduct> relatedElements) {
        this.relatedElements = relatedElements;
    }

    public IfcSpatialStructureElement getRelatingStructure() {
        return relatingStructure;
    }

    public void setRelatingStructure(IfcSpatialStructureElement relatingStructure) {
        this.relatingStructure = relatingStructure;
    }
}
