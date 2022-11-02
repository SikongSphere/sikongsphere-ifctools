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
package org.sikongsphere.ifc.model.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.INTEGER;
import org.sikongsphere.ifc.model.basic.LIST;

/**
 * his entity defines a general direction vector in two or three dimensional space.
 * The actual magnitudes of the components have no effect upon the direction being defined,
 * only the ratios X:Y:Z or X:Y are significant.
 *
 * @author stan
 * @date 2022/09/01 23:59
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDirection extends IfcGeometricRepresentationItem {
    private LIST<INTEGER> directionRatios;// todo -> REAL

    public IfcDirection() {}

    @IfcParserConstructor
    public IfcDirection(LIST<INTEGER> directionRatios) {
        this.directionRatios = directionRatios;
    }

    public LIST<INTEGER> getDirectionRatios() {
        return directionRatios;
    }

    public void setDirectionRatios(LIST<INTEGER> directionRatios) {
        this.directionRatios = directionRatios;
    }
}
