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
 * IfcSequenceEnum is an enumeration that defines the different ways in which a time lag is applied to a sequence between two processes.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.EXTENSION,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcSequenceEnum {
    /**
      * The predecessor task must start before the successor task may start.
      */
    START_START,

    /**
      * The predecessor task must start before the successor task may finish.
      */
    START_FINISH,

    /**
      * The predecessor task must finish before the successor task may start.
      */
    FINISH_START,

    /**
      * The predecessor task must finish before the successor task may finish.
      */
    FINISH_FINISH,

    USERDEFINED,

    NOTDEFINED

}
