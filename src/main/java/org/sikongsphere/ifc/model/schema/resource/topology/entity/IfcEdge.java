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

/**
 * @author zaiyuan
 * @date 2022/12/10 23:09
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcEdge extends IfcTopologicalRepresentationItem {
    private IfcVertex edgeStart;
    private IfcVertex edgeEnd;

    @IfcParserConstructor
    public IfcEdge(IfcVertex edgeStart, IfcVertex edgeEnd) {
        this.edgeStart = edgeStart;
        this.edgeEnd = edgeEnd;
    }

    public IfcVertex getEdgeStart() {
        return edgeStart;
    }

    public void setEdgeStart(IfcVertex edgeStart) {
        this.edgeStart = edgeStart;
    }

    public IfcVertex getEdgeEnd() {
        return edgeEnd;
    }

    public void setEdgeEnd(IfcVertex edgeEnd) {
        this.edgeEnd = edgeEnd;
    }
}
