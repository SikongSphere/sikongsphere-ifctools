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
package org.sikongsphere.ifc.model.schema.domain.constructionmanagement.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.domain.constructionmanagement.enumeration.IfcResourceConsumptionEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcMeasureWithUnit;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcLaborResource extends IfcConstructionResource {
    private IfcText skillSet;

    @IfcParserConstructor
    public IfcLaborResource(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcIdentifier resourceIdentifier,
        IfcLabel resourceGroup,
        IfcResourceConsumptionEnum resourceConsumption,
        IfcMeasureWithUnit baseQuantity,
        IfcText skillSet
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            resourceIdentifier,
            resourceGroup,
            resourceConsumption,
            baseQuantity
        );
        this.skillSet = skillSet;
    }

    public IfcText getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(IfcText skillSet) {
        this.skillSet = skillSet;
    }
}
