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
package org.sikongsphere.ifc.model.schema.domain.structuralanalysis.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcElement;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author yiwei
 * @date 2022/12/23 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcStructuralMember extends IfcStructuralItem {
    @IfcInverseParameter
    private SET<IfcRelConnectsStructuralElement> referencesElement;
    @IfcInverseParameter
    private SET<IfcRelConnectsStructuralMember> connectedBy;

    public IfcStructuralMember() {}

    @IfcParserConstructor
    public IfcStructuralMember(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation
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
    }

    public SET<IfcRelConnectsStructuralElement> getReferencesElement() {
        return referencesElement;
    }

    public void setReferencesElement(SET<IfcRelConnectsStructuralElement> referencesElement) {
        this.referencesElement = referencesElement;
    }

    public SET<IfcRelConnectsStructuralMember> getConnectedBy() {
        return connectedBy;
    }

    public void setConnectedBy(SET<IfcRelConnectsStructuralMember> connectedBy) {
        this.connectedBy = connectedBy;
    }
}
