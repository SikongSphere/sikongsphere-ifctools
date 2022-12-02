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
package org.sikongsphere.ifc.newModel.schema.domain.plumbingfireprotection.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * An IfcStackTerminalTypeEnum defines the range of different types of stack terminal that can be specified for
 * use at the top of a vertical stack subsystem.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcStackTerminalTypeEnum {
    /**
     * Guard cage, typically wire mesh, at the top of the stack preventing access by birds
     */
    BIRDCAGE,
    /**
     * A cowling placed at the top of a stack to eliminate downdraft
     */
    COWL,
    /**
     * A box placed at the top of a rainwater downpipe to catch rainwater from guttering
     */
    RAINWATERHOPPER,
    USERDEFINED,
    NOTDEFINED
}
