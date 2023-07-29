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
package org.sikongsphere.ifc.ifc4add2tc1.resource.ifcpresentationorganizationresource.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * There are three kinds of light distribution curves, see Figure 423.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcLightDistributionCurveEnum {
    /**
      * Type A is basically not used. For completeness the Type A Photometry equals the Type B rotated 90° around the Z-Axis counter clockwise.
      */
    TYPE_A,

    /**
      * Type B is sometimes used for floodlights. The B-Plane System has a horizontal axis. B-Angles are valid from -180° to +180° with B 0° at the bottom and B180°/B-180° at the top, β-Angles are valid from -90° to +90°.
      */
    TYPE_B,

    /**
      * Type C is the recommended standard system. The C-Plane system equals a globe with a vertical axis. C-Angles are valid from 0° to 360°, γ-Angles are valid from 0° (south pole) to 180° (north pole).
      */
    TYPE_C,

    NOTDEFINED

}
