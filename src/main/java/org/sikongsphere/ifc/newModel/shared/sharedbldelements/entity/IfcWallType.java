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
package org.sikongsphere.ifc.newModel.shared.sharedbldelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.basic.LIST;
import org.sikongsphere.ifc.newModel.basic.SET;
import org.sikongsphere.ifc.newModel.core.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.newModel.core.productextension.entities.IfcBuildingElementType;
import org.sikongsphere.ifc.newModel.resource.geometry.entity.IfcRepresentationMap;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.newModel.shared.sharedbldelements.enumeration.IfcWallTypeEnum;

/**
 * @author GaoSU
 * @date 2022/10/20 15:31
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcWallType extends IfcBuildingElementType {
    private IfcWallTypeEnum predefinedType;

    public IfcWallType() {}

    public IfcWallTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcWallTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    @IfcParserConstructor
    public IfcWallType(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel applicableOccurrence,
        SET<IfcPropertySetDefinition> hasPropertySets,
        LIST<IfcRepresentationMap> representationMaps,
        IfcLabel tag,
        IfcLabel elementType,
        IfcWallTypeEnum predefinedType
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
}
