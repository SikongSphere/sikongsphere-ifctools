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

/**
 * A Cartesian transformation operator
 * defines a geometric transformation composed of translation, rotation, mirroring and uniform scaling.
 *
 * @author stan
 * @date 2022/09/02 13:24
 */
public abstract class IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem {
    private IfcDirection axis1;
    private IfcDirection axis2;
    private IfcCartesianPoint localOrigin;
    private Boolean scale;// todo -> REAL

    public IfcCartesianTransformationOperator() {}

    public IfcCartesianTransformationOperator(
        IfcDirection axis1,
        IfcDirection axis2,
        IfcCartesianPoint localOrigin,
        Boolean scale
    ) {
        this.axis1 = axis1;
        this.axis2 = axis2;
        this.localOrigin = localOrigin;
        this.scale = scale;
    }

    public IfcDirection getAxis1() {
        return axis1;
    }

    public void setAxis1(IfcDirection axis1) {
        this.axis1 = axis1;
    }

    public IfcDirection getAxis2() {
        return axis2;
    }

    public void setAxis2(IfcDirection axis2) {
        this.axis2 = axis2;
    }

    public IfcCartesianPoint getLocalOrigin() {
        return localOrigin;
    }

    public void setLocalOrigin(IfcCartesianPoint localOrigin) {
        this.localOrigin = localOrigin;
    }

    public Boolean getScale() {
        return scale;
    }

    public void setScale(Boolean scale) {
        this.scale = scale;
    }
}
