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
package org.sikongsphere.ifc.model.schema.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.core.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.schema.core.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * This objectified relationship, IfcRelContainedInSpatialStructure,
 * is used to assign elements to a certain level of the spatial project structure.
 * Any element can only be assigned once to a certain level of the spatial structure.
 *
 * @author stan
 * @date 2022/09/02 13:38
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcRelContainedInSpatialStructure extends IfcRelConnects {
    private SET<IfcProduct> relatedElements;
    private IfcSpatialStructureElement relatingStructure;

    public IfcRelContainedInSpatialStructure() {}

    @IfcParserConstructor
    public IfcRelContainedInSpatialStructure(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        SET<IfcProduct> relatedElements,
        IfcSpatialStructureElement relatingStructure
    ) {
        super(globalId, ownerHistory, name, description);
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
