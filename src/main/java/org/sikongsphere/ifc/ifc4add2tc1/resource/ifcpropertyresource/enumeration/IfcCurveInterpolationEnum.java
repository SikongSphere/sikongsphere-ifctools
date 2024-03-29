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
package org.sikongsphere.ifc.ifc4add2tc1.resource.ifcpropertyresource.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * IfcCurveInterpolationEnum specifies the possible methodsfor the interpolation of property values given as a curve.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcCurveInterpolationEnum {
    /**
      * Indicates that values between the defined values are to be found by linear interpolation.
      */
    LINEAR,

    /**
      * Indicates that values between the defined values are to be found by linear interpolation of the natural logarithm (base e) of the values.
      */
    LOG_LINEAR,

    /**
      * Indicates that values between the defined values are to be found by linear interpolation of the Briggs' logarithm (base 10) of the values.
      */
    LOG_LOG,

    /**
      * No interpolation information is provided
      */
    NOTDEFINED

}
