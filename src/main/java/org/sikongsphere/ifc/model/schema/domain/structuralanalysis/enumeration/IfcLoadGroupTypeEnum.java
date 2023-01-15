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
package org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 *This type definition is used to distinguish between different kinds and purposes of load grouping. It allows to differentiate between load groups, load cases, load combination groups and load combinations. Normally, these enumeration types shall be used in the following context :
 *
 * @author yiwei
 * @date 2022-12-22 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcLoadGroupTypeEnum {
    /**
     *LOAD_GROUP groups instances of IfcStructuralAction or its subclasses. It shall be used as a container for loads grouped together for specific purposes. Optionally, an overall load factor can be assigned.
     */
    LOAD_GROUP,
    /**
     *LOAD_CASE groups LOAD_GROUPs and instances of IfcStructuralAction or its subclasses. It shall be used as a container for loads with the same origin, and to assign a common load factor.
     */
    LOAD_CASE,
    /**
     *LOAD_COMBINATION_GROUP shall be used to group LOAD_CASEs and to assign a common load combination factor. The grouping of LOAD_GROUPs and instances of IfcStructuralAction or its subclasses is also possible, but off the traditional way.
     */
    LOAD_COMBINATION_GROUP,
    /**
     * LOAD_COMBINATION shall be used to group all loads belonging to a specific load combination. Normally only LOAD_COMBINATION_GROUPs with all needed load factors are used to create load combinations.
     */
    LOAD_COMBINATION,
    USERDEFINED,
    NOTDEFINED
}
