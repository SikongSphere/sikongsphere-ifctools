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
package org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This enumeration defines the different sound scales.
 * USERDEFINED: User-defined sound scale
 * NOTDEFINED: Undefined sound scale
 * @author zaiyuan
 * @modify GaoSu
 * @date 2022/12/18 15:34
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcSoundScaleEnum {
    /**
     * Decibels in an A-wieghted scale.
     */
    DBA,
    /**
     * Decibels in an B-wieghted scale.
     */
    DBB,
    /**
     * Decibels in an C-wieghted scale.
     */
    DBC,
    /**
     * Noise criteria.
     */
    NC,
    /**
     * Noise rating.
     */
    NR,
    /**
     * User-defined sound scale.
     */
    USERDEFINED,
    /**
     * Undefined sound scale.
     */
    NOTDEFINED
}
