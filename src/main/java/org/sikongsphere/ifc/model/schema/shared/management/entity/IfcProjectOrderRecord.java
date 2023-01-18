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
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcControl;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssignsToControl;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.management.enumeration.IfcProjectOrderRecordTypeEnum;

/**
 * @author zaiyuan
 * @date 2022/12/18 12:14
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcProjectOrderRecord extends IfcControl {
    private LIST<IfcRelAssignsToProjectOrder> records;
    private IfcProjectOrderRecordTypeEnum predefinedType;

    @IfcParserConstructor
    public IfcProjectOrderRecord(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        SET<IfcRelAssignsToControl> controls,
        LIST<IfcRelAssignsToProjectOrder> records,
        IfcProjectOrderRecordTypeEnum predefinedType
    ) {
        super(globalId, ownerHistory, name, description, objectType, controls);
        this.records = records;
        this.predefinedType = predefinedType;
    }

    public LIST<IfcRelAssignsToProjectOrder> getRecords() {
        return records;
    }

    public void setRecords(LIST<IfcRelAssignsToProjectOrder> records) {
        this.records = records;
    }

    public IfcProjectOrderRecordTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcProjectOrderRecordTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }
}
