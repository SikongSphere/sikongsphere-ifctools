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
 * This enumeration defines the different types of walls that can further specify an IfcWall or IfcWallType.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcWallTypeEnum {
    /**
      * A movable wall that is either movable, such as folding wall or a sliding wall, or can be easily removed as a removable partitioning or mounting wall. Movable walls do normally not define space boundaries and often belong to the furnishing system.
      */
    MOVABLE,

    /**
      * A wall-like barrier to protect human occupants from falling, or to prevent the spread of fires. Often designed at the edge of balconies, terraces or roofs.
      */
    PARAPET,

    /**
      * A wall designed to partition spaces that often has a light-weight, sandwich-like construction (e.g. using gypsum board). Partitioning walls are normally non load bearing.
      */
    PARTITIONING,

    /**
      * A pier, or enclosure, or encasement, normally used to enclose plumbing in sanitary rooms. Such walls often do not extent to the ceiling.
      */
    PLUMBINGWALL,

    /**
      * A wall designed to withstand shear loads. Such shear walls are often designed having a non-rectangular cross section along the wall path. Also called retaining walls or supporting walls they are used to protect against soil layers behind.
      */
    SHEAR,

    /**
      * A massive wall construction for the wall core being the single layer or having multiple layers attached. Such walls are often masonry or concrete walls (both cast in-situ or precast) that are load bearing and fire protecting.
      */
    SOLIDWALL,

    /**
      * A standard wall, extruded vertically with a constant thickness along the wall path.
      */
    STANDARD,

    /**
      * A polygonal wall, extruded vertically, where the wall thickness varies along the wall path. IFC4 DEPRECATION  The enumerator POLYGONAL is deprecated and shall no longer be used.
      */
    POLYGONAL,

    /**
      * A stud wall framed with studs and faced with sheetings, sidings, wallboard, or plasterwork.
      */
    ELEMENTEDWALL,

    /**
      * User-defined wall element.
      */
    USERDEFINED,

    /**
      * Undefined wall element.
      */
    NOTDEFINED

}
