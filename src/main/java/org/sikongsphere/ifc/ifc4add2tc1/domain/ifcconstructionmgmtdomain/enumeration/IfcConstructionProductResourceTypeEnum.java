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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcconstructionmgmtdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration is used to identify the primary purpose of a construction product resource. It describes use of products created for construction, and excludes products of the finished building model.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcConstructionProductResourceTypeEnum {
    /**
      * Construction of assemblies for use as input to the building model or other assemblies.
      */
    ASSEMBLY,

    /**
      * Construction or placement of forms for placing materials such as concrete.
      */
    FORMWORK,

    /**
      * User-defined resource.
      */
    USERDEFINED,

    /**
      * Undefined resource.
      */
    NOTDEFINED

}
