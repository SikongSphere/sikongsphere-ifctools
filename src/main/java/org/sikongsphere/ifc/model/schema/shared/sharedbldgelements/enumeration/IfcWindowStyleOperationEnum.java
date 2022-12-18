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
package org.sikongsphere.ifc.model.schema.shared.sharedbldgelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * @author GaoSu
 * @date 2022/10/25 13:04
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcWindowStyleOperationEnum {
    SINGLE_PANEL,
    DOUBLE_PANEL_VERTICAL,
    DOUBLE_PANEL_HORIZONTAL,
    TRIPLE_PANEL_VERTICAL,
    TRIPLE_PANEL_BOTTOM,
    TRIPLE_PANEL_TOP,
    TRIPLE_PANEL_LEFT,
    TRIPLE_PANEL_RIGHT,
    TRIPLE_PANEL_HORIZONTAL,
    USERDEFINED,
    NOTDEFINED;
}
