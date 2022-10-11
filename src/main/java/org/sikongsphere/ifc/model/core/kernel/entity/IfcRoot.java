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
package org.sikongsphere.ifc.model.core.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcRoot
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public abstract class IfcRoot extends IfcBodyTemplate {
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
}
