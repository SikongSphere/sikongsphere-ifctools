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
package org.sikongsphere.ifc.model.schema.resource.presentationappearance.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * Denotion of whether negative, positive or both sides of a surface are being referenced.
 *
 * @author zaiyuan
 * @date 2022/8/31 21:24
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcSurfaceSide {
    /**
     * The side of a surface which is in the same direction as the surface normal derived
     * from the mathematical definition
     */
    POSITIVE,
    /**
     * The side of a surface which is in the opposite direction than the surface normal
     * derived from the mathematical definition
     */
    NEGATIVE,
    /**
     * Both, positive and negative side
     */
    BOTH
}
