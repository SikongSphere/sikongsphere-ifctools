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
package org.sikongsphere.ifc.ifc4add2tc1.extension.ifcprocessextension.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcTaskTypeEnum defines the range of different types of task that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.EXTENSION,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcTaskTypeEnum {
    /**
      * Attendance or waiting on other things happening.
      */
    ATTENDANCE,

    /**
      * Constructing or building something.
      */
    CONSTRUCTION,

    /**
      * Demolishing or breaking down something.
      */
    DEMOLITION,

    /**
      * Taking something apart carefully so that it can be recycled or reused.
      */
    DISMANTLE,

    /**
      * Disposing or getting rid of something.
      */
    DISPOSAL,

    /**
      * Installing something (equivalent to construction but more commonly used for engineering tasks).
      */
    INSTALLATION,

    /**
      * Transporation or delivery of something.
      */
    LOGISTIC,

    /**
      * Keeping something in good working order.
      */
    MAINTENANCE,

    /**
      * Moving things from one place to another.
      */
    MOVE,

    /**
      * A procedure undertaken to start up the operation an artifact.
      */
    OPERATION,

    /**
      * Removal of an item from use and taking it from its place of use.
      */
    REMOVAL,

    /**
      * Bringing something to an 'as-new' state.
      */
    RENOVATION,

    USERDEFINED,

    NOTDEFINED

}
