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
package org.sikongsphere.ifc.model.schema.domain.structuralelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * Enumeration defining the types of tendons.
 *
 * @author yiwei
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcTendonTypeEnum {
    /**
     * The tendon is a strand.
     */
    STRAND,
    /**
     * The tendon is a wire.
     */
    WIRE,
    /**
     * The tendon is configured as a bar.
     */
    BAR,
    /**
     * The tendon is coated.
     */
    COATED,
    /**
     * The type of tendon is user defined.
     */
    USERDEFINED,
    /**
     * The type of tendon is not defined.
     */
    NOTDEFINED

}
