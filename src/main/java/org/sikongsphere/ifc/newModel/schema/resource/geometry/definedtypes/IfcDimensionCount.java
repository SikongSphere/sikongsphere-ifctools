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
package org.sikongsphere.ifc.newModel.schema.resource.geometry.definedtypes;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.INTEGER;
import org.sikongsphere.ifc.newModel.datatype.SCIENTIFICNOTATION;
import org.sikongsphere.ifc.newModel.datatype.STRING;

/**
 * A dimension count is a positive integer used to define the coordinate space dimensionality.
 *
 * @author stan
 * @date 2022/09/02 00:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcDimensionCount extends INTEGER {
    private INTEGER dimensionCount;

    public IfcDimensionCount() {
        super(3);
    }

    public IfcDimensionCount(INTEGER dimensionCount) {
        super(dimensionCount);
        this.dimensionCount = dimensionCount;
    }

    public IfcDimensionCount(SCIENTIFICNOTATION dimensionCount) {
        super(dimensionCount.getInteger());
        this.dimensionCount = new INTEGER(dimensionCount.getInteger());
    }

    public IfcDimensionCount(Integer dimensionCount) {
        super(dimensionCount);
        this.dimensionCount = new INTEGER(dimensionCount);
    }

    public IfcDimensionCount(STRING dimensionCount) {
        super(dimensionCount);
        this.dimensionCount = new INTEGER(Integer.valueOf(dimensionCount.value));
    }

    public INTEGER getDimensionCount() {
        return dimensionCount;
    }

    public void setDimensionCount(INTEGER dimensionCount) {
        this.dimensionCount = dimensionCount;
    }

}
