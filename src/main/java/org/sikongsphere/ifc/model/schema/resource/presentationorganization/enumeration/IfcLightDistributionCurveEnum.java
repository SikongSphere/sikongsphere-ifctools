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
package org.sikongsphere.ifc.model.schema.resource.presentationorganization.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * There are three kinds of light distribution curves:
 * Type A Photometry
 * Type B Photometry
 * Type C Photometry.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcLightDistributionCurveEnum {
    /**
     * Type A is basically not used. For completeness the Type A Photometry equals the Type B rotated 90° around
     * the Z-Axis counter clockwise.
     */
    TYPE_A,
    /**
     *Type B is sometimes used for floodlights. The B-Plane System has a horizontal axis. B-Angles are valid from
     * -180° to +180° with B 0° at the bottom and B180°/B-180° at the top, β-Angles are valid from -90° to +90°.
     */
    TYPE_B,
    /**
     *ype C is the recommended standard system. The C-Plane system equals a globe with a vertical axis. C-Angles are
     * valid from 0° to 360°, γ-Angles are valid from 0° (south pole) to 180° (north pole).
     */
    TYPE_C,
    NOTDEFINED
}
