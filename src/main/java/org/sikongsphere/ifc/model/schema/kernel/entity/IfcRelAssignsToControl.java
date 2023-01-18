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
package org.sikongsphere.ifc.model.schema.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.enumeration.IfcObjectTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcActorRole;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcRelAssignsToActor
 *
 * @author zaiyuan
 * @date 2022/12/10 21:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelAssignsToControl extends IfcRelAssigns {
    private IfcControl relatingControl;

    @IfcParserConstructor
    public IfcRelAssignsToControl(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        SET<IfcObjectDefinition> relatedObjects,
        IfcObjectTypeEnum relatedObjectsType,
        IfcControl relatingControl
    ) {
        super(globalId, ownerHistory, name, description, relatedObjects, relatedObjectsType);
        this.relatingControl = relatingControl;
    }

    public IfcControl getRelatingControl() {
        return relatingControl;
    }

    public void setRelatingControl(IfcControl relatingControl) {
        this.relatingControl = relatingControl;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
