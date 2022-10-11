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
package org.sikongsphere.ifc.model.domain.buildingcontrols.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcControllerTypeEnum defines the range of different types of controller that can be specified.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcControllerTypeEnum {
    /**
     * Output increases or decreases at a constant or accelerating rate
     */
    FLOATING,
    /**
     * Output is proportional to the control error
     */
    PROPORTIONAL,
    /**
     * Part of the output is proportional to the control error and part is proportional to the time integral
     * of the control error
     */
    PROPORTIONALINTEGRAL,
    /**
     * part of the output is proportional to the control error, part is proportional to the time integral of
     * the control error and part is proportional to the time derivative of the control error
     */
    PROPORTIONALINTEGRALDERIVATIVE,
    /**
     * Output changes state for a time interval proportional to the deviation from setpoint
     */
    TIMEDTWOPOSITION,
    /**
     * Binary output, can be either on or off
     */
    TWOPOSITION,
    USERDEFINED,
    NOTDEFINED
}
