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
package org.sikongsphere.ifc.model.core.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Wang Bohong
 * @date 2022/10/11 21:25
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcPropertySetDefinition extends IfcPropertyDefinition {

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

    public void addPropertyDefinitionOf(IfcRelDefinesByProperties properties) {
        propertyDefinitionOf.add(properties);
    }

    public void addDefinesType(IfcTypeObject typeObject) {
        definesType.add(typeObject);
    }
}
