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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.topology.entity.IfcClosedShell;

/**
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcFacetedBrepWithVoids extends IfcManifoldSolidBrep {
    private SET<IfcClosedShell> voids;

    @IfcParserConstructor
    public IfcFacetedBrepWithVoids(IfcClosedShell outer, SET<IfcClosedShell> voids) {
        super(outer);
        this.voids = voids;
    }

    public SET<IfcClosedShell> getVoids() {
        return voids;
    }

    public void setVoids(SET<IfcClosedShell> voids) {
        this.voids = voids;
    }
}
