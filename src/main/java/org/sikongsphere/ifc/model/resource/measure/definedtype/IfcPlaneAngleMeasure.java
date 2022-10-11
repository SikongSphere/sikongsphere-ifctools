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
package org.sikongsphere.ifc.model.resource.measure.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcNonLeafNode;

/**
 * A plane angle measure is the value of an angle in a plane.
 *
 * @author stan
 * @date 2022/09/02 00:02
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE)
public class IfcPlaneAngleMeasure {
    private Boolean planeAngleMeasure;// todo -> REAL

    public IfcPlaneAngleMeasure() {}

    public IfcPlaneAngleMeasure(Boolean planeAngleMeasure) {
        this.planeAngleMeasure = planeAngleMeasure;
    }

    public Boolean getPlaneAngleMeasure() {
        return planeAngleMeasure;
    }

    public void setPlaneAngleMeasure(Boolean planeAngleMeasure) {
        this.planeAngleMeasure = planeAngleMeasure;
    }
}
