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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcstructuralanalysisdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration is used to distinguish between different levelsof load grouping. It allows to differentiate between load groups, load cases, and load combinations.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcLoadGroupTypeEnum {
    /**
      * Groups instances of subtypes of IfcStructuralAction. It shall be used as a container for loads grouped together for specific purposes, such as loads which are part of a special load pattern.
      */
    LOAD_GROUP,

    /**
      * Groups LOAD_GROUPs and instances of subtypes of IfcStructuralAction. It should be used as a container for loads with the same origin.
      */
    LOAD_CASE,

    /**
      * An intermediate level between LOAD_CASE and LOAD_COMBINATION. This level is obsolete and deprecated. Before the introduction of IfcRelAssignsToGroupByFactor, the purpose of this level was to provide a factor with which one or more LOAD_CASEs occur in a LOAD_COMBINATION.
      */
    LOAD_COMBINATION,

    /**
      * A grouping level which does not follow the standard hierarchy of load group types.
      */
    USERDEFINED,

    /**
      * The grouping level is not yet known.
      */
    NOTDEFINED

}
