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
 * Enumeration defining the typical types of evaporative coolers.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcEvaporativeCoolerTypeEnum {
    /**
      * Direct evaporative random media air cooler: Cools the air stream by evaporating water dircectly into the air stream using coolers with evaporative pads, usually of aspen wood or plastic fiber/foam.
      */
    DIRECTEVAPORATIVERANDOMMEDIAAIRCOOLER,

    /**
      * Direct evaporative rigid media air cooler: Cools the air stream by evaporating water dircectly into the air stream using coolers with sheets of rigid, corrugated material as the wetted surface.
      */
    DIRECTEVAPORATIVERIGIDMEDIAAIRCOOLER,

    /**
      * Direct evaporative slingers packaged air cooler: Cools the air stream by evaporating water dircectly into the air stream using coolers with a water slinger in an evaporative cooling section and a fan section.
      */
    DIRECTEVAPORATIVESLINGERSPACKAGEDAIRCOOLER,

    /**
      * Direct evaporative packaged rotary air cooler: Cools the air stream by evaporating water dircectly into the air stream using coolers that wet and wash the evaporative pad by rotating it through a water bath.
      */
    DIRECTEVAPORATIVEPACKAGEDROTARYAIRCOOLER,

    /**
      * Direct evaporative air washer: Cools the air stream by evaporating water dircectly into the air stream using coolers with spray-type air washer consist of a chamber or casing containing spray nozzles, and tank for collecting spray water, and an eliminator section for removing entrained drops of water from the air.
      */
    DIRECTEVAPORATIVEAIRWASHER,

    /**
      * Indirect evaporative package air cooler: Cools the air stream by evaporating water indirectly and without adding moisture into the air stream. On one side of the heat exchanger, the secondary air stream is cooled by evaporation, while on the other side of heat exchanger, the primary air stream (conditioned air to be supplied to the room) is sensibly cooled by the heat exchanger surfaces.
      */
    INDIRECTEVAPORATIVEPACKAGEAIRCOOLER,

    /**
      * Indirect evaporative wet coil: Cools the air stream by evaporating water indirectly and without adding moisture into the air stream. Water is sprayed directly on the tubes of the heat exchanger where latent cooling takes place and the vaporization of the water on the outside of the heat exchanger tubes allows the simultaneous heat and mass transfer which removes heat from the supply air on the tube side.
      */
    INDIRECTEVAPORATIVEWETCOIL,

    /**
      * Indirect evaporative cooling tower or coil cooler: Cools the air stream by evaporating water indirectly and without adding moisture into the air stream using a combination of a cooling tower or other evaporative water cooler with a water-to-air heat exchanger coil and water circulating pump.
      */
    INDIRECTEVAPORATIVECOOLINGTOWERORCOILCOOLER,

    /**
      * Indirect/Direct combination: Cools the air stream by evaporating water indirectly and without adding moisture into the air stream using a two-stage cooler with a first-stage indirect evaporative cooler and second-stage direct evaporative cooler.
      */
    INDIRECTDIRECTCOMBINATION,

    /**
      * User-defined evaporative cooler type.
      */
    USERDEFINED,

    /**
      * Undefined evaporative cooler type.
      */
    NOTDEFINED

}
