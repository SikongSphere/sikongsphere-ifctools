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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedcomponentelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the different types of mechanical fasteners.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcMechanicalFastenerTypeEnum {
    /**
      * A special bolt which is anchored into conrete, stone, or brickwork.
      */
    ANCHORBOLT,

    /**
      * A threaded cylindrical rod that engages with a similarly threaded hole in a nut or any other part to form a fastener. The mechanical fastener often also includes one or more washers and one or more nuts.
      */
    BOLT,

    /**
      * A cylindrical rod that is driven into holes of the connected pieces.
      */
    DOWEL,

    /**
      * A thin pointed piece of metal that is hammered into materials as a fastener.
      */
    NAIL,

    /**
      * A piece of sheet metal with punched points that overlaps the connected pieces and is pressed into their material.
      */
    NAILPLATE,

    /**
      * A fastening part having a head at one end and the other end being hammered flat after being passed through holes in the pieces that are fastened together.
      */
    RIVET,

    /**
      * A fastener with a tapered threaded shank and a slotted head.
      */
    SCREW,

    /**
      * A ring connector that is accepted by ring keyways in the connected pieces; or a toothed circular or square connector that is pressed into the connected pieces.
      */
    SHEARCONNECTOR,

    /**
      * A doubly pointed piece of metal that is hammered into materials as a fastener.
      */
    STAPLE,

    /**
      * Stud shear connectors are cylindrical fastening parts with a head on one side. On the other side they are welded on steel members for the use in composite steel and concrete structures.
      */
    STUDSHEARCONNECTOR,

    /**
      * User-defined mechanical fastener.
      */
    USERDEFINED,

    /**
      * Undefined mechanical fastener.
      */
    NOTDEFINED

}
