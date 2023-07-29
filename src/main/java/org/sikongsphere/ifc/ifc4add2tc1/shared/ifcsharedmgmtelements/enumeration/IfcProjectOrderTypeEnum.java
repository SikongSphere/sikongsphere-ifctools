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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedmgmtelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * An IfcProjectOrderTypeEnum is a list of the types of project order that may be identified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcProjectOrderTypeEnum {
    /**
      * An instruction to make a change to a product or work being undertaken and a description of the work that is to be performed.
      */
    CHANGEORDER,

    /**
      * An instruction to carry out maintenance work and a description of the work that is to be performed.
      */
    MAINTENANCEWORKORDER,

    /**
      * An instruction to move persons and artefacts and a description of the move locations, objects to be moved, etc.
      */
    MOVEORDER,

    /**
      * An instruction to purchase goods and/or services and a description of the goods and/or services to be purchased that is to be performed.
      */
    PURCHASEORDER,

    /**
      * A general instruction to carry out work and a description of the work to be done. Note the difference between a work order generally and a maintenance work order.
      */
    WORKORDER,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
