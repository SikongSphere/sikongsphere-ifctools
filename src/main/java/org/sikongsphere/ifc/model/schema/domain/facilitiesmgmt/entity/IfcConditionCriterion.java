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
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.domain.facilitiesmgmt.selectType.IfcConditionCriterionSelect;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcControl;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssignsToControl;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcConditionCriterion extends IfcControl {
    private IfcConditionCriterionSelect criterion;
    private IfcDateTimeSelect criterionDateTime;

    @IfcParserConstructor
    public IfcConditionCriterion(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        SET<IfcRelAssignsToControl> controls,
        IfcConditionCriterionSelect criterion,
        IfcDateTimeSelect criterionDateTime
    ) {
        super(globalId, ownerHistory, name, description, objectType, controls);
        this.criterion = criterion;
        this.criterionDateTime = criterionDateTime;
    }

    public IfcConditionCriterionSelect getCriterion() {
        return criterion;
    }

    public void setCriterion(IfcConditionCriterionSelect criterion) {
        this.criterion = criterion;
    }

    public IfcDateTimeSelect getCriterionDateTime() {
        return criterionDateTime;
    }

    public void setCriterionDateTime(IfcDateTimeSelect criterionDateTime) {
        this.criterionDateTime = criterionDateTime;
    }
}
