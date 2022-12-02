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
package org.sikongsphere.ifc.newModel.core.productextension.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * Enumeration that provides an indication, whether the spatial structure element or proxy represents
 *
 * @author Wang Bohong
 * @date 2022/8/29 15:35
 */

@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENUMERATION)
public enum IfcElementCompositionEnum {
    /**
     * a group or aggregation of similar elements
     * @author Wang Bohong
     */
    COMPLEX,
    /**
     * a (undivided) element itself
     * @author Wang Bohong
     */
    ELEMENT,
    /**
     * a subelement or part
     * @author Wang Bohong
     */
    PARTIAL
}
