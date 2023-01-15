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
 * This enumeration defines the various sources of thermal gains or losses for spaces or zones, derived from various use cases:
 * PEOPLE: Heat gains and losses from people.
 * LIGHTING: Lighting loads.
 * EQUIPMENTSENSIBLE: Heat gains and losses from equipment.
 * VENTILATIONINDOORAIR: Ventilation loads from indoor air.
 * VENTILATIONOUTSIDEAIR: Ventilation loads from outside air.
 * RECIRCULATEDAIR: Loads from recirculated air.
 * EXHAUSTAIR: Loads from exhaust air.
 * AIREXCHANGERATE: Loads from the air exchange rate.
 * DRYBULBTEMPERATURE: Loads from the dry bulb temperature.
 * RELATIVEHUMIDITY: Loads from the relative humidity.
 * INFILTRATIONSENSIBLE: Heat gains and losses from infiltration.
 * USERDEFINED: User-defined thermal load type.
 * NOTDEFINED: Undefined thermal load type.
 * @author zaiyuan
 * @modify GaoSu
 * @date 2022/12/18 15:34
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcThermalLoadSourceEnum {
    PEOPLE,
    LIGHTING,
    EQUIPMENT,
    VENTILATIONINDOORAIR,
    VENTILATIONOUTSIDEAIR,
    RECIRCULATEDAIR,
    EXHAUSTAIR,
    AIREXCHANGERATE,
    DRYBULBTEMPERATURE,
    RELATIVEHUMIDITY,
    INFILTRATION,
    USERDEFINED,
    NOTDEFINED
}
