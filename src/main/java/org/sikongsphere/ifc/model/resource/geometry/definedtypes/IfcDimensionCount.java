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
package org.sikongsphere.ifc.model.resource.geometry.definedtypes;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.INTEGER;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;

/**
 * A dimension count is a positive integer used to define the coordinate space dimensionality.
 *
 * @author stan
 * @date 2022/09/02 00:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE)
public class IfcDimensionCount extends IfcBodyTemplate {
    private INTEGER dimensionCount;

    public IfcDimensionCount() {}

    public IfcDimensionCount(INTEGER dimensionCount) {
        this.dimensionCount = dimensionCount;
    }

    public IfcDimensionCount(Integer dimensionCount) {
        this.dimensionCount = new INTEGER(dimensionCount);
    }

    public IfcDimensionCount(STRING dimensionCount) {
        this.dimensionCount = new INTEGER(Integer.valueOf(dimensionCount.value));
    }

    public INTEGER getDimensionCount() {
        return dimensionCount;
    }

    public void setDimensionCount(INTEGER dimensionCount) {
        this.dimensionCount = dimensionCount;
    }
}
