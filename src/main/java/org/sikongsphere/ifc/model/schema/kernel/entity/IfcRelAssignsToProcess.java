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
package org.sikongsphere.ifc.model.schema.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.enumeration.IfcObjectTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcActorRole;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcMeasureWithUnit;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 21:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelAssignsToProcess extends IfcRelAssigns {
    private IfcProcess relatingProcess;
    @IfcOptionField
    private IfcMeasureWithUnit quantityInProcess;

    @IfcParserConstructor
    public IfcRelAssignsToProcess(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        SET<IfcObjectDefinition> relatedObjects,
        IfcObjectTypeEnum relatedObjectsType,
        IfcProcess relatingProcess,
        IfcMeasureWithUnit quantityInProcess
    ) {
        super(globalId, ownerHistory, name, description, relatedObjects, relatedObjectsType);
        this.relatingProcess = relatingProcess;
        this.quantityInProcess = quantityInProcess;
    }

    public IfcProcess getRelatingProcess() {
        return relatingProcess;
    }

    public void setRelatingProcess(IfcProcess relatingProcess) {
        this.relatingProcess = relatingProcess;
    }

    public IfcMeasureWithUnit getQuantityInProcess() {
        return quantityInProcess;
    }

    public void setQuantityInProcess(IfcMeasureWithUnit quantityInProcess) {
        this.quantityInProcess = quantityInProcess;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
