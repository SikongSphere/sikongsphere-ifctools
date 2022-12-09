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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement2D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The IfcCircleHollowProfileDef defines a section profile that provides the defining parameters of a circular hollow
 * section (tube) to be used by the swept area solid. Its parameters and orientation relative to the position coordinate
 * system are according to the following illustration.The centre of the position coordinate system is in the profile's
 * centre of the bounding box (for symmetric profiles identical with the centre of gravity).
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCircleHollowProfileDef extends IfcCircleProfileDef {
    private IfcPositiveLengthMeasure wallThickness;

    public IfcCircleHollowProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure radius
    ) {
        super(profileType, profileName, position, radius);
    }

    @IfcParserConstructor
    public IfcCircleHollowProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure radius,
        IfcPositiveLengthMeasure wallThickness
    ) {
        super(profileType, profileName, position, radius);
        this.wallThickness = wallThickness;
    }

    public IfcPositiveLengthMeasure getWallThickness() {
        return wallThickness;
    }

    public void setWallThickness(IfcPositiveLengthMeasure wallThickness) {
        this.wallThickness = wallThickness;
    }

    @Override
    public boolean illegal() {
        return wallThickness.value < getRadius().value;
    }
}
