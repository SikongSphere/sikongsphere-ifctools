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
package org.sikongsphere.ifc.model.schema.extension.process.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.INTEGER;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProcess;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcTask extends IfcProcess {
    private IfcIdentifier taskId;
    @IfcOptionField
    private IfcLabel status;
    @IfcOptionField
    private IfcLabel workMethod;
    private BOOLEAN isMilestone;
    @IfcOptionField
    private INTEGER priority;

    @IfcParserConstructor
    public IfcTask(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcIdentifier taskId,
        IfcLabel status,
        IfcLabel workMethod,
        BOOLEAN isMilestone,
        INTEGER priority
    ) {
        super(globalId, ownerHistory, name, description, objectType);
        this.taskId = taskId;
        this.status = status;
        this.workMethod = workMethod;
        this.isMilestone = isMilestone;
        this.priority = priority;
    }

    public IfcIdentifier getTaskId() {
        return taskId;
    }

    public void setTaskId(IfcIdentifier taskId) {
        this.taskId = taskId;
    }

    public IfcLabel getStatus() {
        return status;
    }

    public void setStatus(IfcLabel status) {
        this.status = status;
    }

    public IfcLabel getWorkMethod() {
        return workMethod;
    }

    public void setWorkMethod(IfcLabel workMethod) {
        this.workMethod = workMethod;
    }

    public BOOLEAN getIsMilestone() {
        return isMilestone;
    }

    public void setIsMilestone(BOOLEAN isMilestone) {
        this.isMilestone = isMilestone;
    }

    public INTEGER getPriority() {
        return priority;
    }

    public void setPriority(INTEGER priority) {
        this.priority = priority;
    }
}
