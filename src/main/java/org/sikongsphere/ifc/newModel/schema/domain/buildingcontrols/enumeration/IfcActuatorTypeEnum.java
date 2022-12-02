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
package org.sikongsphere.ifc.newModel.schema.domain.buildingcontrols.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcActuatorTypeEnum defines the range of different types of actuator that can be specified.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcActuatorTypeEnum {
    /**
     * A device that electrically actuates a control element.
     */
    ELECTRICACTUATOR,
    /**
     * A device that pneumatically actuates a control element
     */
    HANDOPERATEDACTUATOR,
    /**
     * A device that electrically actuates a control element.
     */
    HYDRAULICACTUATOR,
    /**
     * A device that manually actuates a control element.
     */
    PNEUMATICACTUATOR,
    /**
     * A device that thermostatically actuates a control element.
     */
    THERMOSTATICACTUATOR,
    USERDEFINED,
    NOTDEFINED
}
