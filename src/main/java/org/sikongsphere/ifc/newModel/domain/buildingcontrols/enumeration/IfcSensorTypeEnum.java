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
 * The IfcSensorTypeEnum defines the range of different types of sensor that can be specified.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcSensorTypeEnum {
    /**
     * A device that senses or detects carbon dioxide.
     */
    CO2SENSOR,
    /**
     * A device that senses or detects fire.
     */
    FIRESENSOR,
    /**
     * A device that senses or detects flow.
     */
    FLOWSENSOR,
    /**
     * A device that senses or detects gas.
     */
    GASSENSOR,
    /**
     * A device that senses or detects heat.
     */
    HEATSENSOR,
    /**
     * A device that senses or detects humidity.
     */
    HUMIDITYSENSOR,
    /**
     * A device that senses or detects light.
     */
    LIGHTSENSOR,
    /**
     * A device that senses or detects moisture.
     */
    MOISTURESENSOR,
    /**
     * A device that senses or detects movement.
     */
    MOVEMENTSENSOR,
    /**
     * A device that senses or detects pressure.
     */
    PRESSURESENSOR,
    /**
     * A device that senses or detects smoke.
     */
    SMOKESENSOR,
    /**
     * A device that senses or detects sound.
     */
    SOUNDSENSOR,
    /**
     * A device that senses or detects temperature.
     */
    TEMPERATURESENSOR,
    USERDEFINED,
    NOTDEFINED
}
