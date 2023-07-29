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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifchvacdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration is used to identify the primary purpose of a pipe segment. This is a very basic categorization mechanismto generically identify the pipe segment type. Subcategories of pipe segments are not enumerated.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcPipeSegmentTypeEnum {
    /**
      * A covered channel or large pipe that forms a watercourse below ground level, usually under a road or railway.
      */
    CULVERT,

    /**
      * A flexible segment is a continuous non-linear segment of pipe that can be deformed and change the direction of flow.
      */
    FLEXIBLESEGMENT,

    /**
      * A rigid segment is continuous linear segment of pipe that cannot be deformed.
      */
    RIGIDSEGMENT,

    /**
      * A gutter segment is a continuous open-channel segment of pipe.
      */
    GUTTER,

    /**
      * A type of rigid segment that is typically shorter and used for providing connectivity within a piping network.
      */
    SPOOL,

    /**
      * User-defined segment.
      */
    USERDEFINED,

    /**
      * Undefined segment.
      */
    NOTDEFINED

}
