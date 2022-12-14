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
package org.sikongsphere.ifc.model.schema.shared.sharedbldgelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * @author Yiwei
 * @date 2022/10/25
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.RESOURCE)
public enum IfcMemberTypeEnum {
    BRACE,
    CHORD,
    COLLAR,
    MEMBER,
    MULLION,
    PLATE,
    POST,
    PURLIN,
    RAFTER,
    STRINGER,
    STRUT,
    STUD,
    USERDEFINED,
    NOTDEFINED;
}
