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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcbuildingcontrolsdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcControllerTypeEnum defines the range of different types of controller that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcControllerTypeEnum {
    /**
      * Output increases or decreases at a constant or accelerating rate.
      */
    FLOATING,

    /**
      * Output is programmable such as Discrete Digital Control (DDC).
      */
    PROGRAMMABLE,

    /**
      * Output is proportional to the control error and optionally time integral and derivative.
      */
    PROPORTIONAL,

    /**
      * Output is discrete value, can be one of three or more values.
      */
    MULTIPOSITION,

    /**
      * Output can be either on or off.
      */
    TWOPOSITION,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
