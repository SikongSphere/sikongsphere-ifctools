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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcstructuralelementsdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration indicates the type of a surface feature.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcSurfaceFeatureTypeEnum {
    /**
      * A point, line, cross, or other mark, applied for example for easier adjustment of elements during assembly.
      */
    MARK,

    /**
      * A name tag, which allows to identify an element during production, delivery and assembly. May be manufactured in different ways, e.g. by printing or punching the tracking code onto the element or by attaching an actual tag.
      */
    TAG,

    /**
      * A subtractive surface feature, e.g. grinding, or an additive surface feature, e.g. coating, or an impregnating treatment, or a series of any of these kinds of treatments.
      */
    TREATMENT,

    /**
      * A user-defined type of surface feature.
      */
    USERDEFINED,

    /**
      * An undefined type of surface feature.
      */
    NOTDEFINED

}
