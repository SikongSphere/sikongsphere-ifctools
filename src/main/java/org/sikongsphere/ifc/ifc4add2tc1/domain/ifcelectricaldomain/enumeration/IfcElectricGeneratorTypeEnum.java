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
 * The IfcElectricGeneratorTypeEnum defines different types of electric generators.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcElectricGeneratorTypeEnum {
    /**
      * Combined heat and power supply, used not only as a source of electric energy but also as a heating source for the building. It may therefore be not only part of an electrical system but also of a heating system.
      */
    CHP,

    /**
      * Electrical generator with a fuel-driven engine, for example a diesel-driven emergency power supply.
      */
    ENGINEGENERATOR,

    /**
      * Electrical generator which does not include its source of kinetic energy, that is, a motor, engine, or turbine are all modeled separately.
      */
    STANDALONE,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
