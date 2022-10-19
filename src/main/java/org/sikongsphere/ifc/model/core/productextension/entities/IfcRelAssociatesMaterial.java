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
package org.sikongsphere.ifc.model.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcRelAssociates;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcRoot;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;


/**
 * IfcRelAssociatesMaterial
 *
 * @author GaoSu
 * @date 2022/10/18 14:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelAssociatesMaterial extends IfcRelAssociates {
    private SET<IfcRoot> relatedObjects;

    public IfcRelAssociatesMaterial() {
    }

    @IfcParserConstructor
    public IfcRelAssociatesMaterial(IfcGloballyUniqueId globalId, IfcOwnerHistory ownerHistory, IfcLabel name, IfcText description, SET<IfcRoot> relatedObjects, SET<IfcRoot> relatedObjects1) {
        super(globalId, ownerHistory, name, description, relatedObjects);
        this.relatedObjects = relatedObjects1;
    }

    public SET<IfcRoot> getRelatedObjects() {
        return relatedObjects;
    }

    public void setRelatedObjects(SET<IfcRoot> relatedObjects) {
        this.relatedObjects = relatedObjects;
    }
}
