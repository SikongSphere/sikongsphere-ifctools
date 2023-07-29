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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifchvacdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * Defines general types of air-to-air heat recovery devices.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcAirToAirHeatRecoveryTypeEnum {
    /**
      * Heat exchanger with moving parts and alternate layers of plates, separated and sealed from the exhaust and supply air stream passages with primary air entering at secondary air outlet location and exiting at secondary air inlet location.
      */
    FIXEDPLATECOUNTERFLOWEXCHANGER,

    /**
      * Heat exchanger with moving parts and alternate layers of plates, separated and sealed from the exhaust and supply air stream passages with secondary air flow in the direction perpendicular to primary air flow.
      */
    FIXEDPLATECROSSFLOWEXCHANGER,

    /**
      * Heat exchanger with moving parts and alternate layers of plates, separated and sealed from the exhaust and supply air stream passages with primary air entering at secondary air inlet location and exiting at secondary air outlet location.
      */
    FIXEDPLATEPARALLELFLOWEXCHANGER,

    /**
      * A heat wheel with a revolving cylinder filled with an air-permeable medium having a large internal surface area.
      */
    ROTARYWHEEL,

    /**
      * A typical coil energy recovery loop places extended surface, finned tube water coils in the supply and exhaust airstreams of a building.
      */
    RUNAROUNDCOILLOOP,

    /**
      * A passive energy recovery device with a heat pipe divided into evaporator and condenser sections.
      */
    HEATPIPE,

    /**
      * An air-to-liquid, liquid-to-air enthalpy recovery system with a sorbent liquid circulates continuously between supply and exhaust airstreams, alternately contacting both airstreams directly in contactor towers.
      */
    TWINTOWERENTHALPYRECOVERYLOOPS,

    /**
      * Sealed systems that consist of an evaporator, a condenser, interconnecting piping, and an intermediate working fluid that is present in both liquid and vapor phases where the evaporator and the condenser are usually at opposite ends of a bundle of straight, individual thermosiphon tubes and the exhaust and supply ducts are adjacent to each other.
      */
    THERMOSIPHONSEALEDTUBEHEATEXCHANGERS,

    /**
      * Sealed systems that consist of an evaporator, a condenser, interconnecting piping, and an intermediate working fluid that is present in both liquid and vapor phases where the evaporator and condensor coils are installed independently in the ducts and are interconnected by the working fluid piping.
      */
    THERMOSIPHONCOILTYPEHEATEXCHANGERS,

    /**
      * User-defined air to air heat recovery type.
      */
    USERDEFINED,

    /**
      * Undefined air to air heat recovery type.
      */
    NOTDEFINED

}
