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
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcRelAssociates
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelAssociates extends IfcRelationship {
    private SET<IfcRoot> relatedObjects;

    public IfcRelAssociates() {}

    public IfcRelAssociates(SET<IfcRoot> relatedObjects) {
        this.relatedObjects = relatedObjects;
    }

    @IfcParserConstructor
    public IfcRelAssociates(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        SET<IfcRoot> relatedObjects
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatedObjects = relatedObjects;
    }

    public SET<IfcRoot> getRelatedObjects() {
        return relatedObjects;
    }

    public void setRelatedObjects(SET<IfcRoot> relatedObjects) {
        this.relatedObjects = relatedObjects;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
