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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.domain.constructionmanagement.enumeration.IfcResourceConsumptionEnum;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
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
public class IfcSubContractResource extends IfcConstructionResource {
    @IfcOptionField
    private IfcActorSelect subContractor;
    @IfcOptionField
    private IfcText jobDescription;

    @IfcParserConstructor
    public IfcSubContractResource(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcIdentifier resourceIdentifier,
        IfcLabel resourceGroup,
        IfcResourceConsumptionEnum resourceConsumption,
        IfcMeasureWithUnit baseQuantity,
        IfcActorSelect subContractor,
        IfcText jobDescription
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
        this.subContractor = subContractor;
        this.jobDescription = jobDescription;
    }

    public IfcActorSelect getSubContractor() {
        return subContractor;
    }

    public void setSubContractor(IfcActorSelect subContractor) {
        this.subContractor = subContractor;
    }

    public IfcText getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(IfcText jobDescription) {
        this.jobDescription = jobDescription;
    }
}
