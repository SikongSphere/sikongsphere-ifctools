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
 * Enumeration defining the generic footing type.
 *
 * @author yiwei
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcFootingTypeEnum {
    FOOTING_BEAM,
    /**
     * Footing elements that are in bending and are supported clear of the ground. They will normally span between piers, piles or pile caps. They are distinguished from beams in the building superstructure since they will normally require a lower grade of finish. They are distinguished from STRIP_FOOTING since they are clear of the ground surface and hence require support to the lower face while the concrete is curing.
     */
    PAD_FOOTING,
    /**
     * An element that transfers the load of a single column (possibly two) to the ground.
     */
    PILE_CAP,
    /**
     * An element that transfers the load from a column or group of columns to a pier or pile or group of piers or piles.
     */
    STRIP_FOOTING,
    /**
     * A linear element that transfers loads into the ground from either a continuous element, such as a wall, or from a series of elements, such as columns.
     */
    USERDEFINED,
    /**
     * Special types of footings which meet specific local requirements.
     */
    NOTDEFINED
    /**
     * The type of footing is not defined.
     */
}
