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
package org.sikongsphere.ifc.model.core.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcRepresentationMap;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcTypeProduct
 *
 * @author GaoSu
 * @date 2022/10/20 15:20
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcTypeProduct extends IfcTypeObject {
    private LIST<IfcRepresentationMap> representationMaps;
    private IfcLabel tag;

    public IfcTypeProduct() {}

    @IfcParserConstructor
    public IfcTypeProduct(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel applicableOccurrence,
        SET<IfcPropertySetDefinition> hasPropertySets,
        LIST<IfcRepresentationMap> representationMaps,
        IfcLabel tag
    ) {
        super(globalId, ownerHistory, name, description, applicableOccurrence, hasPropertySets);
        this.representationMaps = representationMaps;
        this.tag = tag;
    }

    public LIST<IfcRepresentationMap> getRepresentationMaps() {
        return representationMaps;
    }

    public void setRepresentationMaps(LIST<IfcRepresentationMap> representationMaps) {
        this.representationMaps = representationMaps;
    }

    public IfcLabel getTag() {
        return tag;
    }

    public void setTag(IfcLabel tag) {
        this.tag = tag;
    }
}
