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
 * The IfcSensorTypeEnum defines the range of different types of sensor that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcSensorTypeEnum {
    /**
      * A device that senses or detects carbon monoxide.
      */
    COSENSOR,

    /**
      * A device that senses or detects carbon dioxide.
      */
    CO2SENSOR,

    /**
      * A device that senses or detects electrical conductance.
      */
    CONDUCTANCESENSOR,

    /**
      * A device that senses or detects contact, such as for detecting if a door is closed.
      */
    CONTACTSENSOR,

    /**
      * A device that senses or detects fire
      */
    FIRESENSOR,

    /**
      * A device that senses or detects flow in a fluid.
      */
    FLOWSENSOR,

    /**
      * A device that senses or detects frost on a window.
      */
    FROSTSENSOR,

    /**
      * A device that senses or detects gas concentration (other than CO2)
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
      * A device that reads a tag, such as for gaining access to a door or elevator
      */
    IDENTIFIERSENSOR,

    /**
      * A device that senses or detects ion concentration, such as for water hardness.
      */
    IONCONCENTRATIONSENSOR,

    /**
      * A device that senses or detects fill level, such as for a tank.
      */
    LEVELSENSOR,

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
      * A device that senses or detects acidity.
      */
    PHSENSOR,

    /**
      * A device that senses or detects pressure.
      */
    PRESSURESENSOR,

    /**
      * A device that senses or detects pressure.
      */
    RADIATIONSENSOR,

    /**
      * A device that senses or detects atomic decay.
      */
    RADIOACTIVITYSENSOR,

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

    /**
      * A device that senses or detects airflow speed and direction.
      */
    WINDSENSOR,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
