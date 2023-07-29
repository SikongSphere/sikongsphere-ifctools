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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedbldgelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the basic configuration of the window type in terms of the number of window panels and the subdivision of the total window as shown in Figure 193. The window configurations are given for windows with one, two or three panels (including fixed panels).
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcWindowTypePartitioningEnum {
    /**
      * Window with one panel.
      */
    SINGLE_PANEL,

    /**
      * Window with two panels. The configuration of the panels is vertically.
      */
    DOUBLE_PANEL_VERTICAL,

    /**
      * Window with two panels. The configuration of the panels is horizontally.
      */
    DOUBLE_PANEL_HORIZONTAL,

    /**
      * Window with three panels. The configuration of the panels is vertically.
      */
    TRIPLE_PANEL_VERTICAL,

    /**
      * Window with three panels. The configuration of two panels is vertically and thethird one is horizontally at the bottom.
      */
    TRIPLE_PANEL_BOTTOM,

    /**
      * Window with three panels. The configuration of two panels is vertically and thethird one is horizontally at the top.
      */
    TRIPLE_PANEL_TOP,

    /**
      * Window with three panels. The configuration of two panels is horizontally and thethird one is vertically at the left hand side.
      */
    TRIPLE_PANEL_LEFT,

    /**
      * Window with three panels. The configuration of two panels is horizontally and thethird one is vertically at the right hand side.
      */
    TRIPLE_PANEL_RIGHT,

    /**
      * Window with three panels. The configuration of the panels is horizontally.
      */
    TRIPLE_PANEL_HORIZONTAL,

    /**
      * User defined operation type.
      */
    USERDEFINED,

    NOTDEFINED

}
