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
package org.sikongsphere.ifc.model.schema.shared.bldgservices.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration.IfcEnergySequenceEnum;

/**
 * Common definition to capture the properties of an energy source typically used within the context of building services.
 * @author zaiyuan
 * @modify GaoSu
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENTITY)
public class IfcEnergyProperties extends IfcPropertySetDefinition {
    @IfcOptionField
    private IfcEnergySequenceEnum energySequence;
    @IfcOptionField
    private IfcLabel userDefinedEnergySequence;

    @IfcParserConstructor
    public IfcEnergyProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcEnergySequenceEnum energySequence,
        IfcLabel userDefinedEnergySequence
    ) {
        super(globalId, ownerHistory, name, description);
        this.energySequence = energySequence;
        this.userDefinedEnergySequence = userDefinedEnergySequence;
    }

    public IfcEnergySequenceEnum getEnergySequence() {
        return energySequence;
    }

    public void setEnergySequence(IfcEnergySequenceEnum energySequence) {
        this.energySequence = energySequence;
    }

    public IfcLabel getUserDefinedEnergySequence() {
        return userDefinedEnergySequence;
    }

    public void setUserDefinedEnergySequence(IfcLabel userDefinedEnergySequence) {
        this.userDefinedEnergySequence = userDefinedEnergySequence;
    }
}
