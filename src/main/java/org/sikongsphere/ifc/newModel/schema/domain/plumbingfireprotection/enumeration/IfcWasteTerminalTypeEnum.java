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
package org.sikongsphere.ifc.newModel.schema.domain.plumbingfireprotection.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcWasteTerminalTypeEnum defines the range of different types of waste terminal that can be specified.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
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
     * Pipe fitting or assembly of fittings to receive surface water or waste water, fitted with a grating
     * or sealed cover.
     */
    GULLYSUMP,
    /**
     * Pipe fitting or assembly of fittings to receive surface water or waste water, fitted with a grating or
     * sealed cover and discharging through a trap
     */
    GULLYTRAP,
    /**
     * Chamber, on the line of a drain or discharge pipe, that prevents grease passing into a drainage system
     */
    GREASEINTERCEPTOR,
    /**
     * One or more chambers arranged to prevent the ingress of oil to a drain or sewer, that retain the oil
     * for later removal
     */
    OILINTERCEPTOR,
    /**
     * Two or more chambers with inlet and outlet pipes arranged to allow petrol/gasoline collected on the surface
     * of water drained into them to evaporate through ventilating pipes.
     */
    PETROLINTERCEPTOR,
    /**
     * Pipe fitting, set into the roof, that collects rainwater for discharge into the rainwater system.
     */
    ROOFDRAIN,
    /**
     * Electrically operated device that reduces kitchen or other waste into fragments small enough to be flushed
     * into a drainage system.
     */
    WASTEDISPOSALUNIT,
    /**
     * Pipe fitting, set adjacent to a sanitary terminal, that retains liquid to prevent the passage of foul air.
     */
    WASTETRAP,
    USERDEFINED,
    NOTDEFINED
}
