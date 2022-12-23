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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.selectType.IfcStructuralActivityAssignmentSelect;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssociates;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.entity.IfcProfileProperties;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcShapeAspect;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author yiwei
 * @date 2022/12/22 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcRelConnectsStructuralActivity extends IfcRelConnects {
    private IfcStructuralActivityAssignmentSelect relatingElement;
    private IfcStructuralActivity relatedStructuralActivity;

    public IfcRelConnectsStructuralActivity(
        IfcStructuralActivityAssignmentSelect relatingElement,
        IfcStructuralActivity relatedStructuralActivity
    ) {
        this.relatingElement = relatingElement;
        this.relatedStructuralActivity = relatedStructuralActivity;
    }

    @IfcParserConstructor
    public IfcRelConnectsStructuralActivity(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcStructuralActivityAssignmentSelect relatingElement,
        IfcStructuralActivity relatedStructuralActivity
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatingElement = relatingElement;
        this.relatedStructuralActivity = relatedStructuralActivity;
    }

    public IfcStructuralActivityAssignmentSelect getRelatingElement() {
        return relatingElement;
    }

    public void setRelatingElement(IfcStructuralActivityAssignmentSelect relatingElement) {
        this.relatingElement = relatingElement;
    }

    public IfcStructuralActivity getRelatedStructuralActivity() {
        return relatedStructuralActivity;
    }

    public void setRelatedStructuralActivity(IfcStructuralActivity relatedStructuralActivity) {
        this.relatedStructuralActivity = relatedStructuralActivity;
    }
}
