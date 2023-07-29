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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcstructuralanalysisdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration type contains possible action sources.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcActionSourceTypeEnum {
    DEAD_LOAD_G,

    COMPLETION_G1,

    LIVE_LOAD_Q,

    SNOW_S,

    WIND_W,

    PRESTRESSING_P,

    SETTLEMENT_U,

    TEMPERATURE_T,

    EARTHQUAKE_E,

    FIRE,

    IMPULSE,

    IMPACT,

    TRANSPORT,

    ERECTION,

    PROPPING,

    SYSTEM_IMPERFECTION,

    SHRINKAGE,

    CREEP,

    LACK_OF_FIT,

    BUOYANCY,

    ICE,

    CURRENT,

    WAVE,

    RAIN,

    BRAKES,

    USERDEFINED,

    NOTDEFINED

}
