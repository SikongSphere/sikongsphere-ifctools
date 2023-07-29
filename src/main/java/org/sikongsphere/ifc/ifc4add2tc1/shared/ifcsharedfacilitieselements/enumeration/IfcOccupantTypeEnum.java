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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedfacilitieselements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * IfcOccupantTypeEnum defines the types of occupant from which the type required can be selected.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcOccupantTypeEnum {
    /**
      * Actor receiving the assignment of a property agreement from an assignor.
      */
    ASSIGNEE,

    /**
      * Actor assigning a property agreement to an assignor.
      */
    ASSIGNOR,

    /**
      * Actor receiving the lease of a property from a lessor.
      */
    LESSEE,

    /**
      * Actor leasing a property to a lessee.
      */
    LESSOR,

    /**
      * Actor participating in a property agreement on behalf of an owner, lessor or assignor.
      */
    LETTINGAGENT,

    /**
      * Actor that owns a property.
      */
    OWNER,

    /**
      * Actor renting the use of a property fro a period of time.
      */
    TENANT,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
