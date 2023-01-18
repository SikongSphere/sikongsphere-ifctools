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
package org.sikongsphere.ifc.model.schema.domain.structuralanalysis.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.selectType.IfcStructuralActivityAssignmentSelect;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.representation.enumeration.IfcGlobalOrLocalEnum;
import org.sikongsphere.ifc.model.schema.resource.structuralload.entity.IfcStructuralLoad;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author yiwei
 * @date 2022/12/22 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcStructuralActivity extends IfcProduct {
    private IfcStructuralLoad appliedLoad;
    private IfcGlobalOrLocalEnum globalOrLocal;
    @IfcInverseParameter
    private IfcRelConnectsStructuralActivity assignedToStructuralItem;

    public IfcStructuralActivity(
        IfcStructuralLoad appliedLoad,
        IfcGlobalOrLocalEnum globalOrLocal
    ) {
        this.appliedLoad = appliedLoad;
        this.globalOrLocal = globalOrLocal;
    }

    @IfcParserConstructor
    public IfcStructuralActivity(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcStructuralLoad appliedLoad,
        IfcGlobalOrLocalEnum globalOrLocal
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation
        );
        this.appliedLoad = appliedLoad;
        this.globalOrLocal = globalOrLocal;
    }

    public IfcStructuralLoad getAppliedLoad() {
        return appliedLoad;
    }

    public void setAppliedLoad(IfcStructuralLoad appliedLoad) {
        this.appliedLoad = appliedLoad;
    }

    public IfcGlobalOrLocalEnum getGlobalOrLocal() {
        return globalOrLocal;
    }

    public void setGlobalOrLocal(IfcGlobalOrLocalEnum globalOrLocal) {
        this.globalOrLocal = globalOrLocal;
    }

    public IfcRelConnectsStructuralActivity getAssignedToStructuralItem() {
        return assignedToStructuralItem;
    }

    public void setAssignedToStructuralItem(
        IfcRelConnectsStructuralActivity assignedToStructuralItem
    ) {
        this.assignedToStructuralItem = assignedToStructuralItem;
    }
}
