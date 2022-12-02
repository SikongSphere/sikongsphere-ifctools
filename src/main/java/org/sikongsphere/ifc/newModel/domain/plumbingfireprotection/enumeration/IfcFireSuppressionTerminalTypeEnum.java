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
package org.sikongsphere.ifc.newModel.domain.plumbingfireprotection.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcFireSuppressionTerminalTypeEnum defines the range of different types of fire suppression
 * terminal that can be specified.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcFireSuppressionTerminalTypeEnum {
    /**
     * Symmetrical pipe fitting that unites two or more inlets into a single pipe
     */
    BREECHINGINLET,
    /**
     * Device, fitted to a pipe, through which a temporary supply of water may be provided
     */
    FIREHYDRANT,
    /**
     * A supporting framework on which a hose may be wound
     */
    HOSEREEL,
    /**
     * Device for sprinkling water from a pipe under pressure over an area
     */
    SPRINKLER,
    /**
     * Device attached to a sprinkler to deflect the water flow into a spread pattern to cover the required area
     */
    SPRINKLERDEFLECTOR,
    USERDEFINED,
    NOTDEFINED
}
