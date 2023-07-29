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
 * This enumeration defines the various types of damper
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcDamperTypeEnum {
    /**
      * Damper used for purposes of manually balancing pressure differences. Commonly operated by mechanical adjustment.
      */
    BACKDRAFTDAMPER,

    /**
      * Backdraft damper used to restrict the movement of air in one direction. Commonly operated by mechanical spring.
      */
    BALANCINGDAMPER,

    /**
      * Blast damper used to prevent protect occupants and equipment against overpressures resultant of an explosion. Commonly operated by mechanical spring.
      */
    BLASTDAMPER,

    /**
      * Control damper used to modulate the flow of air by adjusting the position of the blades. Commonly operated by an actuator of a building automation system.
      */
    CONTROLDAMPER,

    /**
      * Fire damper used to prevent the spread of fire for a specified duration. Commonly operated by fusable link that melts above a certain temperature.
      */
    FIREDAMPER,

    /**
      * Combination fire and smoke damper used to preven the spread of fire and smoke. Commonly operated by a fusable link and a smoke detector.
      */
    FIRESMOKEDAMPER,

    /**
      * Fume hood exhaust damper. Commonly operated by actuator.
      */
    FUMEHOODEXHAUST,

    /**
      * Gravity damper closes from the force of gravity. Commonly operated by gravitational weight.
      */
    GRAVITYDAMPER,

    /**
      * Gravity-relief damper used to allow air to move upon a buildup of enough pressure to overcome the gravitational force exerted upon the damper blades. Commonly operated by gravitational weight.
      */
    GRAVITYRELIEFDAMPER,

    /**
      * Relief damper used to allow air to move upon a buildup of a specified pressure differential. Commonly operated by mechanical spring.
      */
    RELIEFDAMPER,

    /**
      * Smoke damper used to prevent the spread of smoke. Commonly operated by a smoke detector of a building automation system.
      */
    SMOKEDAMPER,

    /**
      * User-defined damper.
      */
    USERDEFINED,

    /**
      * Undefined damper.
      */
    NOTDEFINED

}
