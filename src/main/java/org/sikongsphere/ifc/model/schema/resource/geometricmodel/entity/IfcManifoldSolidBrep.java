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
package org.sikongsphere.ifc.model.schema.resource.geometricmodel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.topology.entity.IfcClosedShell;

/**
 * A manifold solid B-rep is a finite, arcwise connected volume bounded by one or more surfaces, each of which is a
 * connected, oriented, finite, closed 2-manifold.
 * @author Yiwei
 * @date 2022/11/6
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcManifoldSolidBrep extends IfcSolidModel {
    private IfcClosedShell outer;

    public IfcManifoldSolidBrep() {}

    @IfcParserConstructor
    public IfcManifoldSolidBrep(IfcClosedShell outer) {
        this.outer = outer;
    }

    public IfcClosedShell getOuter() {
        return outer;
    }

    public void setOuter(IfcClosedShell outer) {
        this.outer = outer;
    }
}
