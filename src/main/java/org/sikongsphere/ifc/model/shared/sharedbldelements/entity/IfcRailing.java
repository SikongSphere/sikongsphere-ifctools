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
import org.sikongsphere.ifc.model.core.productextension.entities.IfcBuildingElement;
import org.sikongsphere.ifc.model.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.shared.sharedbldelements.enumeration.IfcRailingTypeEnum;

/**
 * @author GaoSU
 * @date 2022/10/25 12:57
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcRailing extends IfcBuildingElement {
    private IfcRailingTypeEnum predefinedType;

    public IfcRailing() {}

    @IfcParserConstructor
    public IfcRailing(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcRailingTypeEnum predefinedType
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
        this.predefinedType = predefinedType;
    }

    public IfcRailingTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcRailingTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }
}
