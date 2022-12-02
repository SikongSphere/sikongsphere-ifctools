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
import org.sikongsphere.ifc.newModel.core.productextension.entities.IfcBuildingElement;
import org.sikongsphere.ifc.newModel.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.newModel.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.newModel.shared.sharedbldelements.enumeration.IfcStairTypeEnum;

/**
 * @author zhongqi
 * @date 2022/11/1
 */

@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcStair extends IfcBuildingElement {
    private IfcStairTypeEnum shapeType;

    public IfcStair() {}

    @IfcParserConstructor
    public IfcStair(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcStairTypeEnum shapeType
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            tag
        );
        this.shapeType = shapeType;
    }

    public IfcStairTypeEnum getShapeType() {
        return shapeType;
    }

    public void setShapeType(IfcStairTypeEnum shapeType) {
        this.shapeType = shapeType;
    }
}
