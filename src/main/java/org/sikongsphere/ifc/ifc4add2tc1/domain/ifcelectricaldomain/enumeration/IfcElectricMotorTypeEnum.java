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
 * The IfcElectricMotorTypeEnum defines the range of different types of electric motor that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcElectricMotorTypeEnum {
    /**
      * A motor using either generated or rectified Direct Current (DC) power.
      */
    DC,

    /**
      * An alternating current motor in which the primary winding on one member (usually the stator) is connected to the power source and a secondary winding or a squirrel-cage secondary winding on the other member (usually the rotor) carries the induced current. There is no physical electrical connection to the secondary winding, its current is induced.
      */
    INDUCTION,

    /**
      * A two or three-phase induction motor in which the windings, one for each phase, are evenly divided by the same number of electrical degrees.
      */
    POLYPHASE,

    /**
      * A synchronous motor with a special rotor design which directly lines the rotor up with the rotating magnetic field of the stator, allowing for no slip under load.
      */
    RELUCTANCESYNCHRONOUS,

    /**
      * A motor that operates at a constant speed up to full load. The rotor speed is equal to the speed of the rotating magnetic field of the stator; there is no slip.
      */
    SYNCHRONOUS,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
