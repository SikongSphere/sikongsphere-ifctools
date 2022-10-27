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
package org.sikongsphere.ifc.model.shared.sharedbldelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.core.productextension.entities.IfcBuildingElementType;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcRepresentationMap;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.shared.sharedbldelements.enumeration.IfcStairFlightTypeEnum;

/**
 * The element type (IfcStairFlightType) defines a list of commonly shared property set definitions of a stair flight and an optional set of product representations.
 *
 * @author Wang Bohong
 * @date 2022/10/27 14:21
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcStairFlightType extends IfcBuildingElementType {
    private IfcStairFlightTypeEnum predefinedType;

    public IfcStairFlightType() {}

    @IfcParserConstructor
    public IfcStairFlightType(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel applicableOccurrence,
        SET<IfcPropertySetDefinition> hasPropertySets,
        LIST<IfcRepresentationMap> representationMaps,
        IfcLabel tag,
        IfcLabel elementType,
        IfcStairFlightTypeEnum predefinedType
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

    public IfcStairFlightTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcStairFlightTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }
}
