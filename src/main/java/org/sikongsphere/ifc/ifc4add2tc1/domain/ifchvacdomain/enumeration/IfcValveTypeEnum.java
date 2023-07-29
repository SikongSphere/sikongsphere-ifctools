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
 * The IfcValveTypeEnum defines the range of different types of valve that can be specified. These are typicallyused in conjunction with Pset_ValveTypeCommon, which contains common properties for all valve types.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcValveTypeEnum {
    /**
      * Valve used to release air from a pipe or fitting.
      */
    AIRRELEASE,

    /**
      * Valve that opens to admit air if the pressure falls below atmospheric pressure.
      */
    ANTIVACUUM,

    /**
      * Valve that enables flow to be switched between pipelines (3 or 4 port).
      */
    CHANGEOVER,

    /**
      * Valve that permits water to flow in one direction only and is enclosed when there is no flow (2 port).
      */
    CHECK,

    /**
      * Valve used to facilitate commissioning of a system (2 port).
      */
    COMMISSIONING,

    /**
      * Valve that enables flow to be diverted from one branch of a pipeline to another (3 port).
      */
    DIVERTING,

    /**
      * A valve used to remove fluid from a piping system.
      */
    DRAWOFFCOCK,

    /**
      * An assembly that incorporates two valves used to prevent backflow.
      */
    DOUBLECHECK,

    /**
      * Valve used to facilitate regulation of fluid flow in a system.
      */
    DOUBLEREGULATING,

    /**
      * Faucet valve typically used as a flow discharge.
      */
    FAUCET,

    /**
      * Valve that flushes a predetermined quantity of water to cleanse a toilet, urinal, etc.
      */
    FLUSHING,

    /**
      * Valve that is used for controlling the flow of gas.
      */
    GASCOCK,

    /**
      * Gas tap typically used for venting or discharging gas from a system.
      */
    GASTAP,

    /**
      * Valve that closes off flow in a pipeline.
      */
    ISOLATING,

    /**
      * Valve that enables flow from two branches of a pipeline to be mixed together (3 port).
      */
    MIXING,

    /**
      * Valve that reduces the pressure of a fluid immediately downstream of its position in a pipeline to a preselected value or by a predetermined ratio.
      */
    PRESSUREREDUCING,

    /**
      * Spring or weight loaded valve that automatically discharges to a safe place fluid that has built up to excessive pressure in pipes or fittings.
      */
    PRESSURERELIEF,

    /**
      * Valve used to facilitate regulation of fluid flow in a system.
      */
    REGULATING,

    /**
      * Valve that closes under the action of a safety mechanism such as a drop weight, solenoid etc.
      */
    SAFETYCUTOFF,

    /**
      * Valve that restricts flow of steam while allowing condensate to pass through.
      */
    STEAMTRAP,

    /**
      * An isolating valve used on a domestic water service.
      */
    STOPCOCK,

    /**
      * User-defined valve type.
      */
    USERDEFINED,

    /**
      * Undefined valve type.
      */
    NOTDEFINED

}
