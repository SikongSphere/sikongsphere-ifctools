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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcplumbingfireprotectiondomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcInterceptorTypeEnum defines the range of different types of interceptor that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcInterceptorTypeEnum {
    /**
      * Removes larger liquid drops or larger solid particles.
      */
    CYCLONIC,

    /**
      * Chamber, on the line of a drain or discharge pipe, that prevents grease passing into a drainage system.
      */
    GREASE,

    /**
      * One or more chambers arranged to prevent the ingress of oil to a drain or sewer that retains the oil for later removal.
      */
    OIL,

    /**
      * Two or more chambers with inlet and outlet pipes arranged to allow petrol/gasoline collected on the surface of water drained into them to evaporate through ventilating pipes.
      */
    PETROL,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
