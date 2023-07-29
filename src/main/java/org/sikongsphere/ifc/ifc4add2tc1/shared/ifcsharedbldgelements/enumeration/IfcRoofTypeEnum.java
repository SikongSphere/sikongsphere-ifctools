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
 * This enumeration defines the basic configuration of the roof in terms of the different roof shapes, as illustratedin Figure 191.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcRoofTypeEnum {
    /**
      * A roof having no slope, or one with only a slight pitch so as to drainrainwater.
      */
    FLAT_ROOF,

    /**
      * A roof having a single slope.
      */
    SHED_ROOF,

    /**
      * A roof sloping downward in two parts from a central ridge, so as to form agable at each end.
      */
    GABLE_ROOF,

    /**
      * A roof having sloping ends and sides meeting at an inclined projectingangle.
      */
    HIP_ROOF,

    /**
      * A roof having a hipped end truncating a gable.
      */
    HIPPED_GABLE_ROOF,

    /**
      * A roof sloping downward in two parts from a central ridge, so as to form agable at each end.
      */
    GAMBREL_ROOF,

    /**
      * A roof having on each side a steeper lower part and a shallower upperpart.
      */
    MANSARD_ROOF,

    /**
      * A roof or ceiling having a semicylindrical form.
      */
    BARREL_ROOF,

    /**
      * A gable roof in the form of a broad Gothic arch, with gently sloping convexsurfaces.
      */
    RAINBOW_ROOF,

    /**
      * A roof having two slopes, each descending inward from the eaves.
      */
    BUTTERFLY_ROOF,

    /**
      * A pyramidal hip roof.
      */
    PAVILION_ROOF,

    /**
      * A hemispherical hip roof.
      */
    DOME_ROOF,

    /**
      * Free form roof.
      */
    FREEFORM,

    /**
      * No specification given.
      */
    USERDEFINED,

    /**
      * No specification given.
      */
    NOTDEFINED

}
