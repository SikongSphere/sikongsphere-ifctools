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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Wang Bohong
 * @date 2022/10/11 21:25
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public abstract class IfcPropertySetDefinition extends IfcPropertyDefinition {

    @IfcInverseParameter
    private SET<IfcRelDefinesByProperties> propertyDefinitionOf = new SET<>();
    @IfcInverseParameter
    private SET<IfcTypeObject> definesType = new SET<>();

    public IfcPropertySetDefinition() {}

    @IfcParserConstructor
    public IfcPropertySetDefinition(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description
    ) {
        super(globalId, ownerHistory, name, description);
    }

    public SET<IfcRelDefinesByProperties> getPropertyDefinitionOf() {
        return propertyDefinitionOf;
    }

    public void setPropertyDefinitionOf(SET<IfcRelDefinesByProperties> propertyDefinitionOf) {
        this.propertyDefinitionOf = propertyDefinitionOf;
    }

    public SET<IfcTypeObject> getDefinesType() {
        return definesType;
    }

    public void setDefinesType(SET<IfcTypeObject> definesType) {
        this.definesType = definesType;
    }

    public void addPropertyDefinitionOf(IfcRelDefinesByProperties properties) {
        propertyDefinitionOf.add(properties);
    }

    public void addDefinesType(IfcTypeObject typeObject) {
        definesType.add(typeObject);
    }
}
