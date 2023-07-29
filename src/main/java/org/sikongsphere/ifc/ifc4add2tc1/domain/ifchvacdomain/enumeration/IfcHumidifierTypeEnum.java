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
 * Enumeration defining the typical types of humidifiers.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcHumidifierTypeEnum {
    /**
      * Water vapor is added into the airstream through direct steam injection.
      */
    STEAMINJECTION,

    /**
      * Water vapor is added into the airstream through adiabatic evaporation using an air washing element.
      */
    ADIABATICAIRWASHER,

    /**
      * Water vapor is added into the airstream through adiabatic evaporation using a pan.
      */
    ADIABATICPAN,

    /**
      * Water vapor is added into the airstream through adiabatic evaporation using a wetted element.
      */
    ADIABATICWETTEDELEMENT,

    /**
      * Water vapor is added into the airstream through adiabatic evaporation using an atomizing element.
      */
    ADIABATICATOMIZING,

    /**
      * Water vapor is added into the airstream through adiabatic evaporation using an ultrasonic element.
      */
    ADIABATICULTRASONIC,

    /**
      * Water vapor is added into the airstream through adiabatic evaporation using a rigid media.
      */
    ADIABATICRIGIDMEDIA,

    /**
      * Water vapor is added into the airstream through adiabatic evaporation using a compressed air nozzle.
      */
    ADIABATICCOMPRESSEDAIRNOZZLE,

    /**
      * Water vapor is added into the airstream through water heated evaporation using an electric heater.
      */
    ASSISTEDELECTRIC,

    /**
      * Water vapor is added into the airstream through water heated evaporation using a natural gas heater.
      */
    ASSISTEDNATURALGAS,

    /**
      * Water vapor is added into the airstream through water heated evaporation using a propane heater.
      */
    ASSISTEDPROPANE,

    /**
      * Water vapor is added into the airstream through water heated evaporation using a butane heater.
      */
    ASSISTEDBUTANE,

    /**
      * Water vapor is added into the airstream through water heated evaporation using a steam heater.
      */
    ASSISTEDSTEAM,

    /**
      * User-defined humidifier type.
      */
    USERDEFINED,

    /**
      * Undefined humidifier type.
      */
    NOTDEFINED

}
