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
 * The IfcLampTypeEnum defines the range of different types of lamp available.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcLampTypeEnum {
    /**
      * A fluorescent lamp having a compact form factor produced by shaping the tube.
      */
    COMPACTFLUORESCENT,

    /**
      * A typically tubular discharge lamp in which most of the light is emitted by one or several layers of phosphors excited by ultraviolet radiation from the discharge.
      */
    FLUORESCENT,

    /**
      * An incandescent lamp in which a tungsten filament is sealed into a compact transport envelope filled with an inert gas and a small amount of halogen such as iodine or bromine.
      */
    HALOGEN,

    /**
      * A discharge lamp in which most of the light is emitted by exciting mercury at high pressure.
      */
    HIGHPRESSUREMERCURY,

    /**
      * A discharge lamp in which most of the light is emitted by exciting sodium at high pressure.
      */
    HIGHPRESSURESODIUM,

    /**
      * A solid state lamp that uses light-emitting diodes as the source of light.
      */
    LED,

    /**
      * A discharge lamp in which most of the light is emitted by exciting a metal halide.
      */
    METALHALIDE,

    /**
      * A solid state lamp that uses light-emitting diodes as the source of light whose emissive electroluminescent layer is composed of a film of organic compounds.
      */
    OLED,

    /**
      * A lamp that emits light by passing an electrical current through a tungsten wire filament in a near vacuum.
      */
    TUNGSTENFILAMENT,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
