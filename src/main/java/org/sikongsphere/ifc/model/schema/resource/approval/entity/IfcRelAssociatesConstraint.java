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
package org.sikongsphere.ifc.model.schema.resource.approval.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssociates;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRoot;
import org.sikongsphere.ifc.model.schema.resource.constraint.entity.IfcConstraint;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * This class is used to encapsulate actor role information
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRelAssociatesConstraint extends IfcRelAssociates {
    private IfcLabel intent;
    private IfcConstraint relatingConstraint;

    public IfcRelAssociatesConstraint(IfcLabel intent, IfcConstraint relatingConstraint) {
        this.intent = intent;
        this.relatingConstraint = relatingConstraint;
    }

    public IfcRelAssociatesConstraint(
        SET<IfcRoot> relatedObjects,
        IfcLabel intent,
        IfcConstraint relatingConstraint
    ) {
        super(relatedObjects);
        this.intent = intent;
        this.relatingConstraint = relatingConstraint;
    }

    @IfcParserConstructor
    public IfcRelAssociatesConstraint(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        SET<IfcRoot> relatedObjects,
        IfcLabel intent,
        IfcConstraint relatingConstraint
    ) {
        super(globalId, ownerHistory, name, description, relatedObjects);
        this.intent = intent;
        this.relatingConstraint = relatingConstraint;
    }

    public IfcLabel getIntent() {
        return intent;
    }

    public void setIntent(IfcLabel intent) {
        this.intent = intent;
    }

    public IfcConstraint getRelatingConstraint() {
        return relatingConstraint;
    }

    public void setRelatingConstraint(IfcConstraint relatingConstraint) {
        this.relatingConstraint = relatingConstraint;
    }
}
