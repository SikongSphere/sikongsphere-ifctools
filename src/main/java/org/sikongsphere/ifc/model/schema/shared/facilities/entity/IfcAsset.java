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
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcGroup;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcPerson;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.model.schema.resource.cost.entity.IfcCostValue;
import org.sikongsphere.ifc.model.schema.resource.datetime.entity.IfcCalendarDate;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/18 12:14
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcAsset extends IfcGroup {
    private IfcIdentifier assetID;
    private IfcCostValue originalValue;
    private IfcCostValue currentValue;
    private IfcCostValue totalReplacementCost;
    private IfcActorSelect owner;
    private IfcActorSelect user;
    private IfcPerson responsiblePerson;
    private IfcCalendarDate incorporationDate;
    private IfcCostValue depreciatedValue;

    @IfcParserConstructor
    public IfcAsset(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcIdentifier assetID,
        IfcCostValue originalValue,
        IfcCostValue currentValue,
        IfcCostValue totalReplacementCost,
        IfcActorSelect owner,
        IfcActorSelect user,
        IfcPerson responsiblePerson,
        IfcCalendarDate incorporationDate,
        IfcCostValue depreciatedValue
    ) {
        super(globalId, ownerHistory, name, description, objectType);
        this.assetID = assetID;
        this.originalValue = originalValue;
        this.currentValue = currentValue;
        this.totalReplacementCost = totalReplacementCost;
        this.owner = owner;
        this.user = user;
        this.responsiblePerson = responsiblePerson;
        this.incorporationDate = incorporationDate;
        this.depreciatedValue = depreciatedValue;
    }

    public IfcIdentifier getAssetID() {
        return assetID;
    }

    public void setAssetID(IfcIdentifier assetID) {
        this.assetID = assetID;
    }

    public IfcCostValue getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(IfcCostValue originalValue) {
        this.originalValue = originalValue;
    }

    public IfcCostValue getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(IfcCostValue currentValue) {
        this.currentValue = currentValue;
    }

    public IfcCostValue getTotalReplacementCost() {
        return totalReplacementCost;
    }

    public void setTotalReplacementCost(IfcCostValue totalReplacementCost) {
        this.totalReplacementCost = totalReplacementCost;
    }

    public IfcActorSelect getOwner() {
        return owner;
    }

    public void setOwner(IfcActorSelect owner) {
        this.owner = owner;
    }

    public IfcActorSelect getUser() {
        return user;
    }

    public void setUser(IfcActorSelect user) {
        this.user = user;
    }

    public IfcPerson getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(IfcPerson responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public IfcCalendarDate getIncorporationDate() {
        return incorporationDate;
    }

    public void setIncorporationDate(IfcCalendarDate incorporationDate) {
        this.incorporationDate = incorporationDate;
    }

    public IfcCostValue getDepreciatedValue() {
        return depreciatedValue;
    }

    public void setDepreciatedValue(IfcCostValue depreciatedValue) {
        this.depreciatedValue = depreciatedValue;
    }
}
