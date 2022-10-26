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
package org.sikongsphere.ifc.model.resource.topology.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.SET;

/**
 * @author GaoSU
 * @date 2022/10/25 13:26
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcFace extends IfcTopologicalRepresentationItem {
    private SET<IfcFaceBound> Bounds;

    public IfcFace() {}

    @IfcParserConstructor
    public IfcFace(SET<IfcFaceBound> bounds) {
        Bounds = bounds;
    }

    public SET<IfcFaceBound> getBounds() {
        return Bounds;
    }

    public void setBounds(SET<IfcFaceBound> bounds) {
        Bounds = bounds;
    }
}
