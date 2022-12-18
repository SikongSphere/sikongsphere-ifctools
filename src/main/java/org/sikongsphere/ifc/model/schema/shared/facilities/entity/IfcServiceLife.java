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
package org.sikongsphere.ifc.model.schema.shared.facilities.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcControl;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssignsToControl;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcTimeMeasure;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.facilities.enumeration.IfcServiceLifeTypeEnum;

/**
 * @author zaiyuan
 * @date 2022/12/18 12:14
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcServiceLife extends IfcControl {
    private IfcServiceLifeTypeEnum serviceLifeType;
    private IfcTimeMeasure serviceLifeDuration;

    @IfcParserConstructor
    public IfcServiceLife(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        SET<IfcRelAssignsToControl> controls,
        IfcServiceLifeTypeEnum serviceLifeType,
        IfcTimeMeasure serviceLifeDuration
    ) {
        super(globalId, ownerHistory, name, description, objectType, controls);
        this.serviceLifeType = serviceLifeType;
        this.serviceLifeDuration = serviceLifeDuration;
    }

    public IfcServiceLifeTypeEnum getServiceLifeType() {
        return serviceLifeType;
    }

    public void setServiceLifeType(IfcServiceLifeTypeEnum serviceLifeType) {
        this.serviceLifeType = serviceLifeType;
    }

    public IfcTimeMeasure getServiceLifeDuration() {
        return serviceLifeDuration;
    }

    public void setServiceLifeDuration(IfcTimeMeasure serviceLifeDuration) {
        this.serviceLifeDuration = serviceLifeDuration;
    }
}
