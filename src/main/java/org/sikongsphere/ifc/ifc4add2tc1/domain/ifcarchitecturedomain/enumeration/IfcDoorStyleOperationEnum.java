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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcarchitecturedomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the basic ways to describe how doors operate as shown in Figure 318.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcDoorStyleOperationEnum {
    /**
      * Door with one panel that opens (swings) to the left. The hinges are on the left side as viewed in the direction of the positive y-axis.
      */
    SINGLE_SWING_LEFT,

    /**
      * Door with one panel that swings in both directions and to the right in the main trafic direction. Also called double acting door.
      */
    SINGLE_SWING_RIGHT,

    /**
      * Door with two panels, one swings in both directions and to the right in the main trafic direction the other swings also in both directions and to the left in the main trafic direction.
      */
    DOUBLE_DOOR_SINGLE_SWING,

    /**
      * Door with two panels that both open to the left, one panel swings in one direction and the other panel swings in the opposite direction.
      */
    DOUBLE_DOOR_SINGLE_SWING_OPPOSITE_LEFT,

    /**
      * Door with two panels that both open to the right, one panel swings in one direction and the other panel swings in the opposite direction.
      */
    DOUBLE_DOOR_SINGLE_SWING_OPPOSITE_RIGHT,

    DOUBLE_SWING_LEFT,

    DOUBLE_SWING_RIGHT,

    DOUBLE_DOOR_DOUBLE_SWING,

    /**
      * Door with one panel that is sliding to the left.
      */
    SLIDING_TO_LEFT,

    /**
      * Door with one panel that is sliding to the right.
      */
    SLIDING_TO_RIGHT,

    /**
      * Door with two panels, one is sliding to the left the other is sliding to the right.
      */
    DOUBLE_DOOR_SLIDING,

    /**
      * Door with one panel that is folding to the left.
      */
    FOLDING_TO_LEFT,

    /**
      * Door with one panel that is folding to the right.
      */
    FOLDING_TO_RIGHT,

    /**
      * Door with two panels, one is folding to the left the other is folding to the right.
      */
    DOUBLE_DOOR_FOLDING,

    /**
      * An entrance door consisting of four leaves set in a form of a cross and revolving around a central vertical axis (the four panels are described by a single IfcDoor panel property).
      */
    REVOLVING,

    /**
      * Door that opens by rolling up.
      */
    ROLLINGUP,

    /**
      * User defined operation type
      */
    USERDEFINED,

    /**
      * A door with anot defined operation type isconsidered as a door with a lining, but no panels. It is thereby alwaysopen.
      */
    NOTDEFINED

}
