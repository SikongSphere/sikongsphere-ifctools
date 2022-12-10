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
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcRoot
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public abstract class IfcRoot extends IfcAbstractClass {
    private IfcGloballyUniqueId globalId;
    private IfcOwnerHistory ownerHistory;
    private IfcLabel name;
    private IfcText description;

    public IfcRoot() {}

    public IfcRoot(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description
    ) {
        this.globalId = globalId;
        this.ownerHistory = ownerHistory;
        this.name = name;
        this.description = description;
    }

    public IfcGloballyUniqueId getGlobalId() {
        return globalId;
    }

    public void setGlobalId(IfcGloballyUniqueId globalId) {
        this.globalId = globalId;
    }

    public IfcOwnerHistory getOwnerHistory() {
        return ownerHistory;
    }

    public void setOwnerHistory(IfcOwnerHistory ownerHistory) {
        this.ownerHistory = ownerHistory;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = new IfcLabel(name);
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = new IfcText(description);
    }
}
