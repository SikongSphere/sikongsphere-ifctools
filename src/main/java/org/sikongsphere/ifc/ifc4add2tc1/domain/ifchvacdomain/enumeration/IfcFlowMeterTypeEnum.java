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
 * This enumeration defines various types of flow meter:
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcFlowMeterTypeEnum {
    /**
      * An electric meter or energy meter is a device that measures the amount of electrical energy supplied to or produced by a residence, business or machine.
      */
    ENERGYMETER,

    /**
      * A device that measures the quantity of a gas or fuel.
      */
    GASMETER,

    /**
      * A device that measures the quantity of oil.
      */
    OILMETER,

    /**
      * A device that measures the quantity of water.
      */
    WATERMETER,

    /**
      * User-defined meter type
      */
    USERDEFINED,

    /**
      * Undefined meter type
      */
    NOTDEFINED

}
