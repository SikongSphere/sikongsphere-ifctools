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
 * A face bound is a loop which is intended to be used for bounding a face.
 *
 * @author GaoSU
 * @date 2022/10/25 13:41
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcFaceBound extends IfcTopologicalRepresentationItem {
    private IfcLoop bound;
    private BOOLEAN orientation;

    @IfcParserConstructor
    public IfcFaceBound(IfcLoop bound, BOOLEAN orientation) {
        this.bound = bound;
        this.orientation = orientation;
    }

    public IfcLoop getBound() {
        return bound;
    }

    public void setBound(IfcLoop bound) {
        this.bound = bound;
    }

    public BOOLEAN getOrientation() {
        return orientation;
    }

    public void setOrientation(BOOLEAN orientation) {
        this.orientation = orientation;
    }
}
