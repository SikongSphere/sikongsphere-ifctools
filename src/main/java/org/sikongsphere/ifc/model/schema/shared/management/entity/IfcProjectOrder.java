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
package org.sikongsphere.ifc.model.schema.shared.management.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcControl;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssignsToControl;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.management.enumeration.IfcProjectOrderTypeEnum;

/**
 * @author zaiyuan
 * @date 2022/12/18 12:14
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcProjectOrder extends IfcControl {
    private IfcIdentifier ID;
    private IfcProjectOrderTypeEnum predefinedType;
    private IfcLabel status;

    @IfcParserConstructor
    public IfcProjectOrder(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        SET<IfcRelAssignsToControl> controls,
        IfcIdentifier ID,
        IfcProjectOrderTypeEnum predefinedType,
        IfcLabel status
    ) {
        super(globalId, ownerHistory, name, description, objectType, controls);
        this.ID = ID;
        this.predefinedType = predefinedType;
        this.status = status;
    }

    public IfcIdentifier getID() {
        return ID;
    }

    public void setID(IfcIdentifier iD) {
        this.ID = ID;
    }

    public IfcProjectOrderTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcProjectOrderTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    public IfcLabel getStatus() {
        return status;
    }

    public void setStatus(IfcLabel status) {
        this.status = status;
    }
}
