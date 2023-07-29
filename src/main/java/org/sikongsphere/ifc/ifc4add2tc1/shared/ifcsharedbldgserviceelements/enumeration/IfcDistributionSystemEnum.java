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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedbldgserviceelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration identifies different types of distribution systems. It is used to designate systems by their function as well as ports of devices within such systems to restrict connectivity to compatible connections.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcDistributionSystemEnum {
    /**
      * Conditioned air distribution system for purposes of maintaining a temperature range within one or more spaces.
      */
    AIRCONDITIONING,

    /**
      * A transport of a single media source, having audio and/or video streams.
      */
    AUDIOVISUAL,

    /**
      * Arbitrary chemical further qualified by property set, such as for medical or industrial use.
      */
    CHEMICAL,

    /**
      * Nonpotable chilled water, such as circulated through an evaporator.
      */
    CHILLEDWATER,

    COMMUNICATION,

    /**
      * Compressed air system.
      */
    COMPRESSEDAIR,

    /**
      * Nonpotable water, such as circulated through a condenser.
      */
    CONDENSERWATER,

    /**
      * A transport or network dedicated to control system usage.
      */
    CONTROL,

    /**
      * Arbitrary supply of substances.
      */
    CONVEYING,

    /**
      * A network having general-purpose usage.
      */
    DATA,

    /**
      * Arbitrary disposal of substances.
      */
    DISPOSAL,

    /**
      * Unheated potable water distribution system.
      */
    DOMESTICCOLDWATER,

    /**
      * Heated potable water distribution system.
      */
    DOMESTICHOTWATER,

    /**
      * Drainage collection system.
      */
    DRAINAGE,

    /**
      * A path for equipotential bonding, conducting current to the ground.
      */
    EARTHING,

    /**
      * A circuit for delivering electrical power.
      */
    ELECTRICAL,

    /**
      * An amplified audio signal such as for loudspeakers.
      */
    ELECTROACOUSTIC,

    /**
      * Exhaust air collection system for removing stale or noxious air from one or more spaces.
      */
    EXHAUST,

    /**
      * Fire protection sprinkler system.
      */
    FIREPROTECTION,

    /**
      * Arbitrary supply of fuel.
      */
    FUEL,

    /**
      * Gas-phase materials such as methane or natural gas.
      */
    GAS,

    /**
      * Hazardous material or fluid collection system.
      */
    HAZARDOUS,

    /**
      * Water or steam heated from a boiler and circulated through radiators.
      */
    HEATING,

    /**
      * A circuit dedicated for lighting, such as a fixture having sockets for lamps.
      */
    LIGHTING,

    /**
      * A path for conducting lightning current to the ground.
      */
    LIGHTNINGPROTECTION,

    /**
      * Items consumed and discarded, commonly known as trash or garbage.
      */
    MUNICIPALSOLIDWASTE,

    /**
      * Oil distribution system.
      */
    OIL,

    /**
      * Operating supplies system.
      */
    OPERATIONAL,

    /**
      * A path for power generation.
      */
    POWERGENERATION,

    /**
      * Rainwater resulting from precipitation which directly falls on a parcel.
      */
    RAINWATER,

    /**
      * Refrigerant distribution system for purposes of fulfilling all or parts of a refrigeration cycle.
      */
    REFRIGERATION,

    /**
      * A transport or network dedicated to security system usage.
      */
    SECURITY,

    /**
      * Sewage collection system.
      */
    SEWAGE,

    /**
      * A raw analog signal, such as modulated data or measurements from sensors.
      */
    SIGNAL,

    /**
      * Stormwater resulting from precipitation which runs off or travels over the ground surface.
      */
    STORMWATER,

    /**
      * A transport or network dedicated to telephone system usage.
      */
    TELEPHONE,

    /**
      * A transport of multiple media sources such as analog cable TV, satellite TV, or over-the-air TV.
      */
    TV,

    /**
      * Vacuum distribution system.
      */
    VACUUM,

    /**
      * Vent system for wastewater piping systems.
      */
    VENT,

    /**
      * Ventilation air distribution system involved in either the exchange of air to the outside as well as circulation of air within a building.
      */
    VENTILATION,

    /**
      * Water adversely affected in quality by anthropogenic influence, possibly originating from sewage, drainage, or other source.
      */
    WASTEWATER,

    /**
      * Arbitrary water supply.
      */
    WATERSUPPLY,

    USERDEFINED,

    NOTDEFINED

}
