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
 * Enumeration defining the typical types of compressors.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcCompressorTypeEnum {
    /**
      * The pressure of refrigerant vapor is increased by a continuous transfer of angular momentum from a rotating member to the vapor followed by conversion of this momentum into static pressure.
      */
    DYNAMIC,

    /**
      * Positive-displacement compressor using a piston driven by a connecting rod from a crankshaft.
      */
    RECIPROCATING,

    /**
      * Positive-displacement compressor using a roller or rotor device.
      */
    ROTARY,

    /**
      * Positive-displacement compressor using two inter-fitting, spiral-shaped scroll members.
      */
    SCROLL,

    /**
      * Positive-displacement compressor using a rolling motion of one circle outside or inside the circumference of a basic circle and produce either epitrochoids or hypotrochoids.
      */
    TROCHOIDAL,

    /**
      * Positive-displacement reciprocating compressor where vapor is compressed in a single stage.
      */
    SINGLESTAGE,

    /**
      * Positive-displacement reciprocating compressor where pressure is increased by a booster.
      */
    BOOSTER,

    /**
      * Positive-displacement reciprocating compressor where the shaft extends through a seal in the crankcase for an external drive.
      */
    OPENTYPE,

    /**
      * Positive-displacement reciprocating compressor where the motor and compressor are contained within the same housing, with the motor shaft integral with the compressor crankshaft and the motor in contact with refrigerant.
      */
    HERMETIC,

    /**
      * Positive-displacement reciprocating compressor where the hermetic compressors use bolted construction amenable to field repair.
      */
    SEMIHERMETIC,

    /**
      * Positive-displacement reciprocating compressor where the motor compressor is mounted inside a steel shell, which, in turn is sealed by welding.
      */
    WELDEDSHELLHERMETIC,

    /**
      * Positive-displacement rotary compressor using a roller mounted on the eccentric of a shaft with a single vane in the nonrotating cylindrical housing.
      */
    ROLLINGPISTON,

    /**
      * Positive-displacement rotary compressor using a roller mounted on the eccentric of a shaft with multiple vanes in the nontotating cylindrical housing.
      */
    ROTARYVANE,

    /**
      * Positive-displacement rotary compressor using a single cylindrical main rotor that works with a pair of gate rotors.
      */
    SINGLESCREW,

    /**
      * Positive-displacement rotary compressor using two mating helically grooved rotors, male (lobes) and female (flutes) in a stationary housing with inlet and outlet gas ports.
      */
    TWINSCREW,

    /**
      * User-defined compressor type.
      */
    USERDEFINED,

    /**
      * Undefined compressor type.
      */
    NOTDEFINED

}
