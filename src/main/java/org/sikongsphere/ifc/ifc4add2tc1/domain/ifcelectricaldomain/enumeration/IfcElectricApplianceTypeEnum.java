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
 * The IfcElectricApplianceTypeEnum defines the range of different types of electrical appliance that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcElectricApplianceTypeEnum {
    /**
      * An appliance that has the primary function of washing dishes.
      */
    DISHWASHER,

    /**
      * An electrical appliance that has the primary function of cooking food (including oven, hob, grill).
      */
    ELECTRICCOOKER,

    /**
      * An electrical appliance that is used occasionally to provide heat. A freestanding electric heater is a 'plugged' appliance whose load may be removed from an electric circuit.
      */
    FREESTANDINGELECTRICHEATER,

    /**
      * An electrical appliance that is used occasionally to provide ventilation. A freestanding fan is a 'plugged' appliance whose load may be removed from an electric circuit.
      */
    FREESTANDINGFAN,

    /**
      * A small, local electrical appliance for heating water. A freestanding water heater is a 'plugged' appliance whose load may be removed from an electric circuit.
      */
    FREESTANDINGWATERHEATER,

    /**
      * A small, local electrical appliance for cooling water. A freestanding water cooler is a 'plugged' appliance whose load may be removed from an electric circuit.
      */
    FREESTANDINGWATERCOOLER,

    /**
      * An electrical appliance that has the primary function of storing food at temperatures below the freezing point of water.
      */
    FREEZER,

    /**
      * An electrical appliance that combines the functions of a freezer and a refrigerator through the provision of separate compartments.
      */
    FRIDGE_FREEZER,

    /**
      * An electrical appliance that has the primary function of drying hands.
      */
    HANDDRYER,

    /**
      * A specialized appliance used in commercial kitchens such as a mixer.
      */
    KITCHENMACHINE,

    /**
      * An electrical appliance that has the primary function of cooking food using microwaves.
      */
    MICROWAVE,

    /**
      * A machine that has the primary function of reproduction of printed matter.
      */
    PHOTOCOPIER,

    /**
      * An electrical appliance that has the primary function of storing food at low temperature but above the freezing point of water.
      */
    REFRIGERATOR,

    /**
      * An electrical appliance that has the primary function of drying clothes.
      */
    TUMBLEDRYER,

    /**
      * An appliance that stores and vends goods including food, drink and goods of various types.
      */
    VENDINGMACHINE,

    /**
      * An appliance that has the primary function of washing clothes.
      */
    WASHINGMACHINE,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
