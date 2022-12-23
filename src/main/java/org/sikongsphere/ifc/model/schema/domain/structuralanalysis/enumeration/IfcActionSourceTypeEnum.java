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
package org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This enumeration type contains possible action sources. The IfcActionSourceTypeEnum type is referenced by the entity IfcStructuralLoadGroup which shall normally be of the type LOAD_CASE (see also IfcLoadGroupTypeEnum).
 *
 * @author yiwei
 * @date 2022-12-22 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
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
