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

import java.util.Set;

/**
 * IfcRelAssociatesMaterial
 *
 * @author GaoSu
 * @date 2022/10/18 14:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelAssociatesMaterial extends IfcRelAssociates {
    private Set<IfcRoot> relatedObjects;

    public IfcRelAssociatesMaterial() {}

    @IfcParserConstructor

    public IfcRelAssociatesMaterial(Set<IfcRoot> relatedObjects) {
        this.relatedObjects = relatedObjects;
    }

    public IfcRelAssociatesMaterial(SET<IfcRoot> relatedObjects, Set<IfcRoot> relatedObjects1) {
        super(relatedObjects);
        this.relatedObjects = relatedObjects1;
    }

    public Set<IfcRoot> getRelatedObjects() {
        return relatedObjects;
    }

    public void setRelatedObjects(Set<IfcRoot> relatedObjects) {
        this.relatedObjects = relatedObjects;
    }
}
