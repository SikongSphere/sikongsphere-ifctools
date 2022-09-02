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

import org.sikongsphere.ifc.model.IfcNonLeafNode;

/**
 * A dimension count is a positive integer used to define the coordinate space dimensionality.
 *
 * @author stan
 * @date 2022/09/02 00:00
 */
public class IfcDimensionCount {
    private Integer dimensionCount;

    public IfcDimensionCount(Integer dimensionCount) {
        this.dimensionCount = dimensionCount;
    }

    public IfcDimensionCount() {}

    public Integer getDimensionCount() {
        return dimensionCount;
    }

    public void setDimensionCount(Integer dimensionCount) {
        this.dimensionCount = dimensionCount;
    }
}