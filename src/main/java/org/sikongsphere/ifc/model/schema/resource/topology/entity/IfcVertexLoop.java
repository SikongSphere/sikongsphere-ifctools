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
 * A vertex_loop is a loop of zero genus consisting of a single vertex. A vertex can exist independently of a vertex loop.
 *
 * @author zaiyuan
 * @date 2022/12/10 23:09
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcVertexLoop extends IfcLoop {
    private IfcVertex loopVertex;

    @IfcParserConstructor
    public IfcVertexLoop(IfcVertex loopVertex) {
        this.loopVertex = loopVertex;
    }

    public IfcVertex getLoopVertex() {
        return loopVertex;
    }

    public void setLoopVertex(IfcVertex loopVertex) {
        this.loopVertex = loopVertex;
    }
}
