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
package org.sikongsphere.ifc.newModel.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLengthMeasure;

/**
 *  The vector is defined in terms of the direction and magnitude of the vector.
 *  The value of the magnitude attribute defines the magnitude of the vector.
 *
 * @author stan
 * @date 2022/09/01 23:56
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcVector extends IfcGeometricRepresentationItem {
    private IfcDirection orientation;
    private IfcLengthMeasure magnitude;

    public IfcVector() {}

    public IfcVector(IfcDirection orientation, IfcLengthMeasure magnitude) {
        this.orientation = orientation;
        this.magnitude = magnitude;
    }

    public IfcDirection getOrientation() {
        return orientation;
    }

    public void setOrientation(IfcDirection orientation) {
        this.orientation = orientation;
    }

    public IfcLengthMeasure getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(IfcLengthMeasure magnitude) {
        this.magnitude = magnitude;
    }
}
