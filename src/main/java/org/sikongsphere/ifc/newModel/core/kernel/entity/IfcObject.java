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
package org.sikongsphere.ifc.newModel.core.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.basic.SET;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcObject
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public abstract class IfcObject extends IfcObjectDefinition {
    private IfcLabel objectType;

    @IfcInverseParameter
    private SET<IfcRelDefines> isDefinedBy = new SET<>();

    public IfcObject() {}

    @IfcParserConstructor
    public IfcObject(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType
    ) {
        super(globalId, ownerHistory, name, description);
        this.objectType = objectType;
    }

    public IfcLabel getObjectType() {
        return objectType;
    }

    public void setObjectType(IfcLabel objectType) {
        this.objectType = objectType;
    }

    public SET<IfcRelDefines> getIsDefinedBy() {
        return isDefinedBy;
    }

    public void setIsDefinedBy(SET<IfcRelDefines> isDefinedBy) {
        this.isDefinedBy = isDefinedBy;
    }

    public void addIsDefinedBy(IfcRelDefines subProperty) {
        isDefinedBy.add(subProperty);
    }
}
