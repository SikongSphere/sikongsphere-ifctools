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
 * A faceted brep is a simple form of boundary representation model in which all faces are planar and all edges are
 * straight lines.
 *
 * @author Yiwei
 * @date 2022/11/6
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcFacetedBrep extends IfcManifoldSolidBrep {
    public IfcFacetedBrep() {}

    @IfcParserConstructor
    public IfcFacetedBrep(IfcClosedShell outer) {
        super(outer);
    }

}
