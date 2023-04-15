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
 * Enumeration defining the pile type according to function.
 *
 * @author yiwei
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcPileTypeEnum {
    /**
     * A cohesion pile.
     */
    COHESION,
    /**
     * A friction pile.
     */
    FRICTION,
    /**
     * A support pile.
     */
    SUPPORT,
    /**
     * The type of pile function is user defined.
     */
    USERDEFINED,
    /**
     * The type of pile function is not defined.
     */
    NOTDEFINED

}
