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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.property.entity.IfcProperty;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 21:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelOverridesProperties extends IfcRelDefinesByProperties {
    private SET<IfcProperty> overridingProperties;

    @IfcParserConstructor
    public IfcRelOverridesProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcObject relatedObject,
        IfcPropertySetDefinition relatingPropertyDefinition,
        SET<IfcProperty> overridingProperties
    ) {
        super(globalId, ownerHistory, name, description, relatedObject, relatingPropertyDefinition);
        this.overridingProperties = overridingProperties;
    }

    public SET<IfcProperty> getOverridingProperties() {
        return overridingProperties;
    }

    public void setOverridingProperties(SET<IfcProperty> overridingProperties) {
        this.overridingProperties = overridingProperties;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
