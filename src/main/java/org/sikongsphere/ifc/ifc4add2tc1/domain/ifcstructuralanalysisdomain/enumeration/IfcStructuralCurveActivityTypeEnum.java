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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcstructuralanalysisdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the distribution of load values in a curve action or reaction.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcStructuralCurveActivityTypeEnum {
    /**
      * The load has a constant value over its entire extent.
      */
    CONST,

    /**
      * The load value is linearly distributed over the load's extent.
      */
    LINEAR,

    /**
      * The load consists of several consecutive linear sections.
      */
    POLYGONAL,

    /**
      * The load consists of n consecutive sections of same length and is specified by n+1 load samples. The interpolation type over the segments is not defined by this distribution type but may be qualified in IfcObject.ObjectType based on additional agreements.
      */
    EQUIDISTANT,

    /**
      * The load value is distributed as a sinus half wave.
      */
    SINUS,

    /**
      * The load value is distributed as a half wave described by a symmetric quadratic parabola.
      */
    PARABOLA,

    /**
      * The load is specified as a series of discrete load points.
      */
    DISCRETE,

    /**
      * The load distribution is user-defined.
      */
    USERDEFINED,

    /**
      * The load distribution is undefined.
      */
    NOTDEFINED

}
