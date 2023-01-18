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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.process.enumeration.IfcWorkControlTypeEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssignsToControl;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcPerson;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcTimeMeasure;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcWorkSchedule extends IfcWorkControl {
    @IfcParserConstructor
    public IfcWorkSchedule(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        SET<IfcRelAssignsToControl> controls,
        IfcIdentifier identifier,
        IfcDateTimeSelect creationDate,
        SET<IfcPerson> creators,
        IfcLabel purpose,
        IfcTimeMeasure duration,
        IfcTimeMeasure totalFloat,
        IfcDateTimeSelect startTime,
        IfcDateTimeSelect finishTime,
        IfcWorkControlTypeEnum workControlType,
        IfcLabel userDefinedControlType
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            controls,
            identifier,
            creationDate,
            creators,
            purpose,
            duration,
            totalFloat,
            startTime,
            finishTime,
            workControlType,
            userDefinedControlType
        );
    }
}
