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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcRelConnects
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public abstract class IfcRelConnects extends IfcRelationship {
    public IfcRelConnects() {}

    @IfcParserConstructor
    public IfcRelConnects(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description
    ) {
        super(globalId, ownerHistory, name, description);
    }
}
