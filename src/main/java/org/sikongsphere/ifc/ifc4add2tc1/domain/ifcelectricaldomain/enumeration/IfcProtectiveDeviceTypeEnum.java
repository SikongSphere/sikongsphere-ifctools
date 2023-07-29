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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcelectricaldomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcProtectiveDeviceTypeEnum specifically defines the range of different breaker unit types that can be used in conjunction with protective device. Types may also be used as a reference to a complete protective device in circumstances where tripping units are not separately identified (typically expected to be the case during earlier stages of design).
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcProtectiveDeviceTypeEnum {
    /**
      * A mechanical switching device capable of making, carrying, and breaking currents under normal circuit conditions and also making, carrying for a specified time and breaking, current under specified abnormal circuit conditions such as those of short circuit.
      */
    CIRCUITBREAKER,

    /**
      * A device that opens, closes, or isolates a circuit and has short circuit protection but no overload protection. It attempts to break the circuit when there is a leakage of current from phase to earth, by measuring voltage on the earth conductor.
      */
    EARTHLEAKAGECIRCUITBREAKER,

    /**
      * A safety device used to open or close a circuit when there is no current. Used to isolate a part of a circuit, a machine, a part of an overhead line or an underground line so that maintenance can be safely conducted.
      */
    EARTHINGSWITCH,

    /**
      * A device that will electrically open the circuit after a period of prolonged, abnormal current flow.
      */
    FUSEDISCONNECTOR,

    /**
      * A device that opens, closes, or isolates a circuit and has short circuit and overload protection. It attempts to break the circuit when there is a difference in current between any two phases. May also be referred to as 'Ground Fault Interupter (GFI)' or 'Ground Fault Circuit Interuptor (GFCI)'
      */
    RESIDUALCURRENTCIRCUITBREAKER,

    /**
      * A device that opens, closes or isolates a circuit and has no short circuit or overload protection. May also be identified as a 'ground fault switch'.
      */
    RESIDUALCURRENTSWITCH,

    /**
      * A high voltage surge protection device.
      */
    VARISTOR,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
