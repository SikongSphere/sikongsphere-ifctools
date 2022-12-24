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
 *This enumeration type is used to distinguish between possible action types at a high level. It can be used for an automated definition of load combinations and for dimensioning. The contained items and their acronyms are adopted from the Eurocode standard.
 *
 * @author yiwei
 * @date 2022-12-22 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcActionTypeEnum {
    PERMANENT_G,
    VARIABLE_Q,
    EXTRAORDINARY_A,
    USERDEFINED,
    NOTDEFINED
}
