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
package org.sikongsphere.ifc.model.schema.resource.profile.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement2D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The IfcRectangleHollowProfileDef defines a section profile that provides the defining parameters of a rectangular
 * (or square) hollow section to be used by the swept surface geometry or the swept area solid. Its parameters and
 * orientation relative to the position coordinate system are according to the following illustration. A square hollow
 * section can be defined by equal values for h and b. The centre of the position coordinate system is in the profiles
 * centre of the bounding box (for symmetric profiles identical with the centre of gravity). Normally, the longer sides
 * are parallel to the y-axis, the shorter sides parallel to the x-axis.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRectangleHollowProfileDef extends IfcRectangleProfileDef {
    private IfcPositiveLengthMeasure wallThickness;
    @IfcOptionField
    private IfcPositiveLengthMeasure innerFilletRadius;
    @IfcOptionField
    private IfcPositiveLengthMeasure outerFilletRadius;

    @IfcParserConstructor
    public IfcRectangleHollowProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure xDim,
        IfcPositiveLengthMeasure yDim,
        IfcPositiveLengthMeasure wallThickness,
        IfcPositiveLengthMeasure innerFilletRadius,
        IfcPositiveLengthMeasure outerFilletRadius
    ) {
        super(profileType, profileName, position, xDim, yDim);
        this.wallThickness = wallThickness;
        this.innerFilletRadius = innerFilletRadius;
        this.outerFilletRadius = outerFilletRadius;
    }

    public IfcPositiveLengthMeasure getWallThickness() {
        return wallThickness;
    }

    public void setWallThickness(IfcPositiveLengthMeasure wallThickness) {
        this.wallThickness = wallThickness;
    }

    public IfcPositiveLengthMeasure getInnerFilletRadius() {
        return innerFilletRadius;
    }

    public void setInnerFilletRadius(IfcPositiveLengthMeasure innerFilletRadius) {
        this.innerFilletRadius = innerFilletRadius;
    }

    public IfcPositiveLengthMeasure getOuterFilletRadius() {
        return outerFilletRadius;
    }

    public void setOuterFilletRadius(IfcPositiveLengthMeasure outerFilletRadius) {
        this.outerFilletRadius = outerFilletRadius;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
