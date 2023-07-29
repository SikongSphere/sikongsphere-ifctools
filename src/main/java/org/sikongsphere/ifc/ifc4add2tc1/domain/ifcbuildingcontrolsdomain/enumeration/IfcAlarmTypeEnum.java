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
 * The IfcAlarmTypeEnum defines the range of different types of alarm that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcAlarmTypeEnum {
    /**
      * An audible alarm.
      */
    BELL,

    /**
      * An alarm activation mechanism in which a protective glass has to be broken to enable a button to be pressed.
      */
    BREAKGLASSBUTTON,

    /**
      * A visual alarm.
      */
    LIGHT,

    /**
      * An alarm activation mechanism in which activation is achieved by a pulling action.
      */
    MANUALPULLBOX,

    /**
      * An audible alarm.
      */
    SIREN,

    /**
      * An audible alarm.
      */
    WHISTLE,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
