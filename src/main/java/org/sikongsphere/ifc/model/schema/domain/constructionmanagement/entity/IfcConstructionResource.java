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
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcResource;
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
public abstract class IfcConstructionResource extends IfcResource {
    @IfcOptionField
    private IfcIdentifier resourceIdentifier;
    @IfcOptionField
    private IfcLabel resourceGroup;
    @IfcOptionField
    private IfcResourceConsumptionEnum resourceConsumption;
    @IfcOptionField
    private IfcMeasureWithUnit baseQuantity;

    @IfcParserConstructor
    public IfcConstructionResource(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcIdentifier resourceIdentifier,
        IfcLabel resourceGroup,
        IfcResourceConsumptionEnum resourceConsumption,
        IfcMeasureWithUnit baseQuantity
    ) {
        super(globalId, ownerHistory, name, description, objectType);
        this.resourceIdentifier = resourceIdentifier;
        this.resourceGroup = resourceGroup;
        this.resourceConsumption = resourceConsumption;
        this.baseQuantity = baseQuantity;
    }

    public IfcIdentifier getResourceIdentifier() {
        return resourceIdentifier;
    }

    public void setResourceIdentifier(IfcIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    public IfcLabel getResourceGroup() {
        return resourceGroup;
    }

    public void setResourceGroup(IfcLabel resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public IfcResourceConsumptionEnum getResourceConsumption() {
        return resourceConsumption;
    }

    public void setResourceConsumption(IfcResourceConsumptionEnum resourceConsumption) {
        this.resourceConsumption = resourceConsumption;
    }

    public IfcMeasureWithUnit getBaseQuantity() {
        return baseQuantity;
    }

    public void setBaseQuantity(IfcMeasureWithUnit baseQuantity) {
        this.baseQuantity = baseQuantity;
    }
}
