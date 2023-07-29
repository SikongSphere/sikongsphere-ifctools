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
 * This enumeration defines the basic configuration types for element assemblies.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.EXTENSION,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcElementAssemblyTypeEnum {
    /**
      * Assembled accessories or components.
      */
    ACCESSORY_ASSEMBLY,

    /**
      * A curved structure.
      */
    ARCH,

    /**
      * Interconnected beams, located in one (typically horizontal) plane.
      */
    BEAM_GRID,

    /**
      * A rigid frame with additional bracing members.
      */
    BRACED_FRAME,

    /**
      * A beam-like superstructure.
      */
    GIRDER,

    /**
      * Assembled reinforcement elements.
      */
    REINFORCEMENT_UNIT,

    /**
      * A structure built up of beams, columns, etc. with moment-resisting joints.
      */
    RIGID_FRAME,

    /**
      * Slabs, laid out in one plane.
      */
    SLAB_FIELD,

    /**
      * A structure built up of members with (quasi) pinned joint.
      */
    TRUSS,

    /**
      * User-defined element assembly.
      */
    USERDEFINED,

    /**
      * Undefined element assembly.
      */
    NOTDEFINED

}
