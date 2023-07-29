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
 * The IfcElectricDistributionBoardTypeEnum defines different types and/or functions of electric distribution boards.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcElectricDistributionBoardTypeEnum {
    /**
      * A distribution point on the incoming electrical supply, typically in domestic premises, at which protective devices are located.
      */
    CONSUMERUNIT,

    /**
      * A distribution point at which connections are made for distribution of electrical circuits usually through protective devices.
      */
    DISTRIBUTIONBOARD,

    /**
      * A distribution point at which starting and control devices for major plant items are located.
      */
    MOTORCONTROLCENTRE,

    /**
      * A distribution point at which switching devices are located.
      */
    SWITCHBOARD,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
