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
 * This enumeration defines the different types of discrete accessories.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcDiscreteAccessoryTypeEnum {
    /**
      * An accessory consisting of a steel plate, shear stud connectors or welded-on rebar which is embedded into the surface of a concrete element so that other elements can be welded or bolted onto it later.
      */
    ANCHORPLATE,

    /**
      * An L-shaped or similarly shaped accessory attached in a corner between elements to hold them together or to carry a secondary element.
      */
    BRACKET,

    /**
      * A column shoe or a beam shoe (beam hanger) used to support or secure an element.
      */
    SHOE,

    /**
      * User-defined accessory.
      */
    USERDEFINED,

    /**
      * Undefined accessory.
      */
    NOTDEFINED

}
