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
package org.sikongsphere.ifc.newModel.schema.resource.profile.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcAxis2Placement2D;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcBoundedCurve;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The profile IfcCenterLineProfileDef defines an arbitrary two-dimensional open, not self intersecting profile for the
 * use within the swept solid geometry. It is given by an area defined by applying a constant thickness to a centerline,
 * generating an area from which the solid can be constructed.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCenterLineProfileDef extends IfcArbitraryOpenProfileDef {
    private IfcPositiveLengthMeasure thickness;

    public IfcCenterLineProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcBoundedCurve curve
    ) {
        super(profileType, profileName, curve);
    }

    @IfcParserConstructor
    public IfcCenterLineProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcBoundedCurve curve,
        IfcPositiveLengthMeasure thickness
    ) {
        super(profileType, profileName, curve);
        this.thickness = thickness;
    }

    public IfcPositiveLengthMeasure getThickness() {
        return thickness;
    }

    public void setThickness(IfcPositiveLengthMeasure thickness) {
        this.thickness = thickness;
    }
}
