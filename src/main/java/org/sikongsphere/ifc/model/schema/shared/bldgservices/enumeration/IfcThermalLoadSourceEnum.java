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
package org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This enumeration defines the various sources of thermal gains or losses for spaces or zones, derived from various use cases.
 * @author zaiyuan
 * @modify GaoSu
 * @date 2022/12/18 15:34
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcThermalLoadSourceEnum {
    /**
     * Heat gains and losses from people.
     */
    PEOPLE,
    /**
     * Lighting loads.
     */
    LIGHTING,
    /**
     * Heat gains and losses from equipment.
     */
    EQUIPMENT,
    /**
     * Ventilation loads from indoor air.
     */
    VENTILATIONINDOORAIR,
    /**
     * Ventilation loads from outside air.
     */
    VENTILATIONOUTSIDEAIR,
    /**
     * Loads from recirculated air.
     */
    RECIRCULATEDAIR,
    /**
     * Loads from exhaust air.
     */
    EXHAUSTAIR,
    /**
     * Loads from the air exchange rate.
     */
    AIREXCHANGERATE,
    /**
     * Loads from the dry bulb temperature.
     */
    DRYBULBTEMPERATURE,
    /**
     * Loads from the relative humidity.
     */
    RELATIVEHUMIDITY,
    /**
     * Heat gains and losses from infiltration.
     */
    INFILTRATION,
    /**
     * User-defined thermal load type.
     */
    USERDEFINED,
    /**
     * Undefined thermal load type.
     */
    NOTDEFINED
}
