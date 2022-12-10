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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcTypeObject
 *
 * @author GaoSu
 * @date 2022/10/20 15:07
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcTypeObject extends IfcObjectDefinition {
    @IfcOptionField
    private IfcLabel applicableOccurrence;
    @IfcOptionField
    private SET<IfcPropertySetDefinition> hasPropertySets;
    @IfcInverseParameter
    private SET<IfcRelDefinesByType> objectTypeOf;

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

    public SET<IfcRelDefinesByType> getObjectTypeOf() {
        return objectTypeOf;
    }

    public void setObjectTypeOf(SET<IfcRelDefinesByType> objectTypeOf) {
        this.objectTypeOf = objectTypeOf;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
