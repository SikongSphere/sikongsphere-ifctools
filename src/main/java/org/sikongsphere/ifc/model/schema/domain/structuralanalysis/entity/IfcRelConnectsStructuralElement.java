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
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcElement;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.representation.enumeration.IfcGlobalOrLocalEnum;
import org.sikongsphere.ifc.model.schema.resource.structuralload.entity.IfcStructuralLoad;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author yiwei
 * @date 2022/12/23 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcRelConnectsStructuralElement extends IfcRelConnects {
    private IfcElement relatingElement;
    private IfcStructuralMember relatedStructuralMember;

    public IfcRelConnectsStructuralElement(
        IfcElement relatingElement,
        IfcStructuralMember relatedStructuralMember
    ) {
        this.relatingElement = relatingElement;
        this.relatedStructuralMember = relatedStructuralMember;
    }

    @IfcParserConstructor
    public IfcRelConnectsStructuralElement(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcElement relatingElement,
        IfcStructuralMember relatedStructuralMember
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatingElement = relatingElement;
        this.relatedStructuralMember = relatedStructuralMember;
    }

    public IfcElement getRelatingElement() {
        return relatingElement;
    }

    public void setRelatingElement(IfcElement relatingElement) {
        this.relatingElement = relatingElement;
    }

    public IfcStructuralMember getRelatedStructuralMember() {
        return relatedStructuralMember;
    }

    public void setRelatedStructuralMember(IfcStructuralMember relatedStructuralMember) {
        this.relatedStructuralMember = relatedStructuralMember;
    }
}
