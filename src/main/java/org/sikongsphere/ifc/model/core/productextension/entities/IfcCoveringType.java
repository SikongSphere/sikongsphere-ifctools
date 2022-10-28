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

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.core.productextension.enumeration.IfcCoveringTypeEnum;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcRepresentationMap;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;

/**
 * The element type (IfcCoveringType) defines a list of commonly shared property set definitions of an element and an optional set of product representations.
 * @author Wang Bohong
 * @date 2022/10/27 14:26
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcCoveringType extends IfcBuildingElementType {
    private IfcCoveringTypeEnum predefinedType;

    public IfcCoveringType() {}

    @IfcParserConstructor
    public IfcCoveringType(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel applicableOccurrence,
        SET<IfcPropertySetDefinition> hasPropertySets,
        LIST<IfcRepresentationMap> representationMaps,
        IfcLabel tag,
        IfcLabel elementType,
        IfcCoveringTypeEnum predefinedType
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            applicableOccurrence,
            hasPropertySets,
            representationMaps,
            tag,
            elementType
        );
        this.predefinedType = predefinedType;
    }

    public IfcCoveringTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcCoveringTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }
}
