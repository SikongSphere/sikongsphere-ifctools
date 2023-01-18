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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.domain.constructionmanagement.enumeration.IfcResourceConsumptionEnum;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcMeasureWithUnit;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcConstructionMaterialResource extends IfcConstructionResource {
    @IfcOptionField
    private SET<IfcActorSelect> suppliers;
    @IfcOptionField
    private IfcRatioMeasure usageRatio;

    @IfcParserConstructor
    public IfcConstructionMaterialResource(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcIdentifier resourceIdentifier,
        IfcLabel resourceGroup,
        IfcResourceConsumptionEnum resourceConsumption,
        IfcMeasureWithUnit baseQuantity,
        SET<IfcActorSelect> suppliers,
        IfcRatioMeasure usageRatio
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
        this.suppliers = suppliers;
        this.usageRatio = usageRatio;
    }

    public SET<IfcActorSelect> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(SET<IfcActorSelect> suppliers) {
        this.suppliers = suppliers;
    }

    public IfcRatioMeasure getUsageRatio() {
        return usageRatio;
    }

    public void setUsageRatio(IfcRatioMeasure usageRatio) {
        this.usageRatio = usageRatio;
    }
}
