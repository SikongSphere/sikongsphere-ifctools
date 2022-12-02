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
package org.sikongsphere.ifc.newModel.domain.buildingcontrols.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcAlarmTypeEnum defines the range of different types of alarm that can be specified
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcAlarmTypeEnum {
    /**
     * An audible alarm
     */
    BELL,
    /**
     * An alarm activation mechanism in which a protective glass has to be broken to enable a button to be pressed.
     */
    BREAKGLASSBUTTON,
    /**
     * A visual alarm
     */
    LIGHT,
    /**
     * An alarm activation mechanism in which activation is achieved by a pulling action.
     */
    MANUALPULLBOX,
    /**
     * An audible alarm
     */
    SIREN,
    /**
     * An audible alarm
     */
    WHISTLE,
    USERDEFINED,
    NOTDEFINED
}
