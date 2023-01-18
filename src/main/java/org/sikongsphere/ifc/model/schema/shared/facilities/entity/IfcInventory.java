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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcGroup;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcPerson;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.model.schema.resource.cost.entity.IfcCostValue;
import org.sikongsphere.ifc.model.schema.resource.datetime.entity.IfcCalendarDate;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.facilities.enumeration.IfcInventoryTypeEnum;

/**
 * @author zaiyuan
 * @date 2022/12/18 12:14
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcInventory extends IfcGroup {
    private IfcInventoryTypeEnum inventoryType;
    private IfcActorSelect jurisdiction;
    private SET<IfcPerson> responsiblePersons;
    private IfcCalendarDate lastUpdateDate;
    @IfcOptionField
    private IfcCostValue currentValue;
    @IfcOptionField
    private IfcCostValue originalValue;

    @IfcParserConstructor
    public IfcInventory(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcInventoryTypeEnum inventoryType,
        IfcActorSelect jurisdiction,
        SET<IfcPerson> responsiblePersons,
        IfcCalendarDate lastUpdateDate,
        IfcCostValue currentValue,
        IfcCostValue originalValue
    ) {
        super(globalId, ownerHistory, name, description, objectType);
        this.inventoryType = inventoryType;
        this.jurisdiction = jurisdiction;
        this.responsiblePersons = responsiblePersons;
        this.lastUpdateDate = lastUpdateDate;
        this.currentValue = currentValue;
        this.originalValue = originalValue;
    }

    public IfcInventoryTypeEnum getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(IfcInventoryTypeEnum inventoryType) {
        this.inventoryType = inventoryType;
    }

    public IfcActorSelect getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(IfcActorSelect jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public SET<IfcPerson> getResponsiblePersons() {
        return responsiblePersons;
    }

    public void setResponsiblePersons(SET<IfcPerson> responsiblePersons) {
        this.responsiblePersons = responsiblePersons;
    }

    public IfcCalendarDate getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(IfcCalendarDate lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public IfcCostValue getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(IfcCostValue currentValue) {
        this.currentValue = currentValue;
    }

    public IfcCostValue getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(IfcCostValue originalValue) {
        this.originalValue = originalValue;
    }
}
