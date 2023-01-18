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
package org.sikongsphere.ifc.model.schema.domain.facilitiesmgmt.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.INTEGER;
import org.sikongsphere.ifc.model.schema.extension.process.entity.IfcTask;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcOrderAction extends IfcTask {
    private IfcIdentifier actionID;

    @IfcParserConstructor
    public IfcOrderAction(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcIdentifier taskId,
        IfcLabel status,
        IfcLabel workMethod,
        BOOLEAN isMilestone,
        INTEGER priority,
        IfcIdentifier actionID
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            taskId,
            status,
            workMethod,
            isMilestone,
            priority
        );
        this.actionID = actionID;
    }

    public IfcIdentifier getActionID() {
        return actionID;
    }

    public void setActionID(IfcIdentifier actionID) {
        this.actionID = actionID;
    }
}
