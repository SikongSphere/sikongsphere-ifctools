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
 * Enumeration defining the construction type for piles. The type is mainly based on how the piles are used and manufactured. Some material information is mixed in because this affects the way the piles are used.
 *
 * @author yiwei
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcPileConstructionEnum {
    /**
     * Piles and piers that are excavated and poured in place.
     */
    CAST_IN_PLACE,
    /**
     *Piles that are a mix of components, such as a steel outer casing which is driven into the ground with a cast-in-place concrete core.
     */
    COMPOSITE,
    /**
     *Piles that are a mix of components, such as a steel outer casing which is driven into the ground with a cast-in-place concrete core.
     */
    PRECAST_CONCRETE,
    /**
     *Prefabricated piles made entirely out of steel. It will also include steel sheet piles where these are not part of another construction element.
     */
    PREFAB_STEEL,
    /**
     *Special types of pile construction which meet specific local requirements.
     */
    USERDEFINED,
    /**
     *The type of pile construction is not defined.
     */
    NOTDEFINED

}
