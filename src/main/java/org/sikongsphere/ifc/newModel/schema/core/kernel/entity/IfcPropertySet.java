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
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.proper.entity.IfcProperty;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Wang Bohong
 * @date 2022/10/14 15:27
 */

@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcPropertySet extends IfcPropertySetDefinition {
    private SET<IfcProperty> hasProperties = new SET<>();

    public IfcPropertySet() {}

    @IfcParserConstructor
    public IfcPropertySet(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        SET<IfcProperty> hasProperties
    ) {
        super(globalId, ownerHistory, name, description);
        this.hasProperties = hasProperties;
    }

    public SET<IfcProperty> getHasProperties() {
        return hasProperties;
    }

    public void setHasProperties(SET<IfcProperty> hasProperties) {
        this.hasProperties = hasProperties;
    }

    public void addProperty(IfcProperty property) {
        hasProperties.add(property);
    }
}
