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
package org.sikongsphere.ifc.model.schema.resource.topology.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;

/**
 * @author zaiyuan
 * @date 2022/12/10 13:40
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcSubedge extends IfcEdge {
    private IfcEdge parentEdge;

    @IfcParserConstructor
    public IfcSubedge(IfcVertex edgeStart, IfcVertex edgeEnd, IfcEdge parentEdge) {
        super(edgeStart, edgeEnd);
        this.parentEdge = parentEdge;
    }

    public IfcEdge getParentEdge() {
        return parentEdge;
    }

    public void setParentEdge(IfcEdge parentEdge) {
        this.parentEdge = parentEdge;
    }
}
