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
package org.sikongsphere.ifc.model.schema.shared.building.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This enumeration defines the basic ways to describe how window panels operate.
 * @author Kuang Tianyu
 * @date 2022/12/18 16:47
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcWindowPanelOperationEnum {
    SIDEHUNGRIGHTHAND,
    SIDEHUNGLEFTHAND,
    TILTANDTURNRIGHTHAND,
    TILTANDTURNLEFTHAND,
    TOPHUNG,
    BOTTOMHUNG,
    PIVOTHORIZONTAL,
    PIVOTVERTICAL,
    SLIDINGHORIZONTAL,
    SLIDINGVERTICAL,
    REMOVABLECASEMENT,
    FIXEDCASEMENT,
    OTHEROPERATION,
    NOTDEFINED;
}
