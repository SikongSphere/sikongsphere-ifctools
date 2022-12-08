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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcAxis2Placement2D;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The IfcTrapeziumProfileDef defines a trapezium as the profile definition used by the swept surface geometry or the
 * swept area solid. It is given by its Top X and Bottom X extent and its Y extent as well as by the offset of the Top
 * X extend, and placed within the 2D position coordinate system, established by the Position attribute. It is placed
 * centric within the position coordinate system, i.e. in the center of the bounding box.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTrapeziumProfileDef extends IfcParameterizedProfileDef {
    private IfcPositiveLengthMeasure bottomXDim;
    private IfcPositiveLengthMeasure topXDim;
    private IfcPositiveLengthMeasure yDim;
    private IfcPositiveLengthMeasure topXOffset;

    @IfcParserConstructor
    public IfcTrapeziumProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure bottomXDim,
        IfcPositiveLengthMeasure topXDim,
        IfcPositiveLengthMeasure yDim,
        IfcPositiveLengthMeasure topXOffset
    ) {
        super(profileType, profileName, position);
        this.bottomXDim = bottomXDim;
        this.topXDim = topXDim;
        this.yDim = yDim;
        this.topXOffset = topXOffset;
    }

    public IfcPositiveLengthMeasure getBottomXDim() {
        return bottomXDim;
    }

    public void setBottomXDim(IfcPositiveLengthMeasure bottomXDim) {
        this.bottomXDim = bottomXDim;
    }

    public IfcPositiveLengthMeasure getTopXDim() {
        return topXDim;
    }

    public void setTopXDim(IfcPositiveLengthMeasure topXDim) {
        this.topXDim = topXDim;
    }

    public IfcPositiveLengthMeasure getyDim() {
        return yDim;
    }

    public void setyDim(IfcPositiveLengthMeasure yDim) {
        this.yDim = yDim;
    }

    public IfcPositiveLengthMeasure getTopXOffset() {
        return topXOffset;
    }

    public void setTopXOffset(IfcPositiveLengthMeasure topXOffset) {
        this.topXOffset = topXOffset;
    }
}
