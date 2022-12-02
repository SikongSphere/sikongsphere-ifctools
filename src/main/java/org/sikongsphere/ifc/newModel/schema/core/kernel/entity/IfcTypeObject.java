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
package org.sikongsphere.ifc.newModel.schema.core.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcTypeObject
 *
 * @author GaoSu
 * @date 2022/10/20 15:07
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcTypeObject extends IfcObjectDefinition {
    private IfcLabel applicableOccurrence;
    private SET<IfcPropertySetDefinition> hasPropertySets;

    public IfcTypeObject() {}

    @IfcParserConstructor
    public IfcTypeObject(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel applicableOccurrence,
        SET<IfcPropertySetDefinition> hasPropertySets
    ) {
        super(globalId, ownerHistory, name, description);
        this.applicableOccurrence = applicableOccurrence;
        this.hasPropertySets = hasPropertySets;
    }

    public IfcLabel getApplicableOccurrence() {
        return applicableOccurrence;
    }

    public void setApplicableOccurrence(IfcLabel applicableOccurrence) {
        this.applicableOccurrence = applicableOccurrence;
    }

    public SET<IfcPropertySetDefinition> getHasPropertySets() {
        return hasPropertySets;
    }

    public void setHasPropertySets(SET<IfcPropertySetDefinition> hasPropertySets) {
        this.hasPropertySets = hasPropertySets;
    }
}
