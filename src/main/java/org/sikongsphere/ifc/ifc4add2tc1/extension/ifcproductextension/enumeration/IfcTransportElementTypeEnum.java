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
package org.sikongsphere.ifc.ifc4add2tc1.extension.ifcproductextension.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration is used to identify primary transport element types.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.EXTENSION,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcTransportElementTypeEnum {
    /**
      * Elevator or lift being a transport device to move people of good vertically.
      */
    ELEVATOR,

    /**
      * Escalator being a transport device to move people. It consists of individual linked steps that move up and down on tracks while keeping the threads horizontal.
      */
    ESCALATOR,

    /**
      * Moving walkway being a transport device to move people horizontally or on an incline. It is a slow conveyor belt that transports people.
      */
    MOVINGWALKWAY,

    /**
      * A crane way system, normally including the crane rails, fasteners and the crane. It is primarily used to move heavy goods in a factory or other industry buildings.
      */
    CRANEWAY,

    /**
      * A device used for lifting or lowering heavy goods. It may be manually operated or electrically or pneumatically driven.
      */
    LIFTINGGEAR,

    USERDEFINED,

    NOTDEFINED

}
