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
 * The IfcWasteTerminalTypeEnum defines the range of different types of waste terminal that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcWasteTerminalTypeEnum {
    /**
      * Pipe fitting, set into the floor, that retains liquid to prevent the passage of foul air
      */
    FLOORTRAP,

    /**
      * Pipe fitting, set into the floor, that collects waste water and discharges it to a separate trap.
      */
    FLOORWASTE,

    /**
      * Pipe fitting or assembly of fittings to receive surface water or waste water, fitted with a grating or sealed cover.
      */
    GULLYSUMP,

    /**
      * Pipe fitting or assembly of fittings that receives surface water or waste water; fitted with a grating or sealed cover that discharges water through a trap.
      */
    GULLYTRAP,

    /**
      * Pipe fitting, set into the roof, that collects rainwater for discharge into the rainwater system.
      */
    ROOFDRAIN,

    /**
      * Electrically operated device that reduces kitchen or other waste into fragments small enough to be flushed into a drainage system.
      */
    WASTEDISPOSALUNIT,

    /**
      * Pipe fitting, set adjacent to a sanitary terminal, that retains liquid to prevent the passage of foul air.
      */
    WASTETRAP,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
