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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.INTEGER;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.extension.process.entity.IfcTask;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcSpatialStructureElement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcMove extends IfcTask {
    private IfcSpatialStructureElement moveFrom;
    private IfcSpatialStructureElement moveTo;
    @IfcOptionField
    private LIST<IfcText> punchList;

    @IfcParserConstructor
    public IfcMove(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcIdentifier taskId,
        IfcLabel status,
        IfcLabel workMethod,
        BOOLEAN isMilestone,
        INTEGER priority,
        IfcSpatialStructureElement moveFrom,
        IfcSpatialStructureElement moveTo,
        LIST<IfcText> punchList
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            taskId,
            status,
            workMethod,
            isMilestone,
            priority
        );
        this.moveFrom = moveFrom;
        this.moveTo = moveTo;
        this.punchList = punchList;
    }

    public IfcSpatialStructureElement getMoveFrom() {
        return moveFrom;
    }

    public void setMoveFrom(IfcSpatialStructureElement moveFrom) {
        this.moveFrom = moveFrom;
    }

    public IfcSpatialStructureElement getMoveTo() {
        return moveTo;
    }

    public void setMoveTo(IfcSpatialStructureElement moveTo) {
        this.moveTo = moveTo;
    }

    public LIST<IfcText> getPunchList() {
        return punchList;
    }

    public void setPunchList(LIST<IfcText> punchList) {
        this.punchList = punchList;
    }
}
