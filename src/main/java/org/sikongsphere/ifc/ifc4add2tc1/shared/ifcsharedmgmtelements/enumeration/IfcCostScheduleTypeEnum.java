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
 * An IfcCostScheduleTypeEnum is a list of the available types of cost schedule from which that required may be selected.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcCostScheduleTypeEnum {
    /**
      * An allocation of money for a particular purpose.
      */
    BUDGET,

    /**
      * An assessment of the amount of money needing to be expended for a defined purpose based on incomplete information about the goods and services required for a construction or installation.
      */
    COSTPLAN,

    /**
      * An assessment of the amount of money needing to be expended for a defined purpose based on actual information about the goods and services required for a construction or installation.
      */
    ESTIMATE,

    /**
      * An offer to provide goods and services.
      */
    TENDER,

    /**
      * A complete listing of all work items forming construction or installation works in which costs have been allocated to work items.
      */
    PRICEDBILLOFQUANTITIES,

    /**
      * A complete listing of all work items forming construction or installation works in which costs have not yet been allocated to work items.
      */
    UNPRICEDBILLOFQUANTITIES,

    /**
      * A listing of each type of goods forming construction or installation works with the cost of purchase, construction/installation, overheads and profit assigned so that additional items of that type can be costed.
      */
    SCHEDULEOFRATES,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
