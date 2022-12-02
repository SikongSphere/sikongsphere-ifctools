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
 * The IfcSanitaryTerminalTypeEnum defines the range of different types of sanitary
 * terminal that can be specified.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcSanitaryTerminalTypeEnum {
    /**
     * Sanitary appliance for immersion of the human body or parts of it
     */
    BATH,
    /**
     * Waste water appliance for washing the excretory organs while sitting astride the bowl
     */
    BIDET,
    /**
     * A water storage unit attached to a sanitary terminal that is fitted with a device, operated automatically or
     * by the user, that discharges water to cleanse a water closet (toilet) pan, urinal or slop hopper.
     */
    CISTERN,
    /**
     * Installation or waste water appliance that emits a spray of water to wash the human body
     */
    SHOWER,
    /**
     * Waste water appliance for receiving, retaining or disposing of domestic, culinary, laboratory or
     * industrial process liquids.
     */
    SINK,
    /**
     * A sanitary terminal that provides a low pressure jet of water for a specific purpose
     */
    SANITARYFOUNTAIN,
    /**
     * Soil appliance for the disposal of excrement.
     */
    TOILETPAN,
    /**
     * Soil appliance that receives urine and directs it to a waste outlet
     */
    URINAL,
    /**
     * Waste water appliance for washing the upper parts of the body.
     */
    WASHHANDBASIN,
    /**
     * Hinged seat that fits on the top of a water closet (WC) pan.
     */
    WCSEAT,
    USERDEFINED,
    NOTDEFINED
}
