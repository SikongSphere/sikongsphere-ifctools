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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcplumbingfireprotectiondomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcFireSuppressionTerminalTypeEnum defines the range of different types of fire suppression terminal that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcFireSuppressionTerminalTypeEnum {
    /**
      * Symmetrical pipe fitting that unites two or more inlets into a single pipe. A breeching inlet may be used on either a wet or dry riser. Used by fire services personnel for fast connection of fire appliance hose reels. May also be used for foam.
      */
    BREECHINGINLET,

    /**
      * Device, fitted to a pipe, through which a temporary supply of water may be provided. May also be termed a stand pipe.
      */
    FIREHYDRANT,

    /**
      * A supporting framework on which a hose may be wound.
      */
    HOSEREEL,

    /**
      * Device for sprinkling water from a pipe under pressure over an area.
      */
    SPRINKLER,

    /**
      * Device attached to a sprinkler to deflect the water flow into a spread pattern to cover the required area.
      */
    SPRINKLERDEFLECTOR,

    /**
      * User-defined type
      */
    USERDEFINED,

    /**
      * Underined type.
      */
    NOTDEFINED

}
