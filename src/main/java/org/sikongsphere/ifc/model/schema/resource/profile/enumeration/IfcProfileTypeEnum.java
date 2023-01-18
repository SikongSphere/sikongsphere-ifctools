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
package org.sikongsphere.ifc.model.schema.resource.profile.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The enumeration defines whether the definition of a profile shape shall be geometrically resolved into
 * a curve or into a surface.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcProfileTypeEnum {
    /**
     * The resulting geometric item is of type curve and closed (with the only exception of the curve created
     * by the IfcArbitraryOpenProfileDef which resolves into an open curve). The resulting geometry after
     * applying a sweeping operation is a swept surface. This can be used to define shapes with thin sheets,
     * such as ducts, where the thickness is not appropriate for geometric representation.
     */
    CURVE,
    /**
     * The resulting geometric item is of type surface. The resulting geometry after applying a sweeping
     * operation is a swept solid with defined volume.
     */
    AREA
}
