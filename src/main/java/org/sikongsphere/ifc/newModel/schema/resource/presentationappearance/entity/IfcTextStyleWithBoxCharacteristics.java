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
package org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcPlaneAngleMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.selecttype.IfcSizeSelect;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.selecttype.IfcTextStyleSelect;

/**
 * IfcTextStyleWithBoxCharacteristics
 *
 * @author zaiyuan
 * @date 2022/9/2 19:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextStyleWithBoxCharacteristics extends IfcAbstractClass
    implements
        IfcTextStyleSelect {
    private IfcPositiveLengthMeasure boxHeight;
    private IfcPositiveLengthMeasure boxWidth;
    private IfcPlaneAngleMeasure boxSlantAngle;
    private IfcPlaneAngleMeasure boxRotateAngle;
    private IfcSizeSelect characterSpacing;
}
