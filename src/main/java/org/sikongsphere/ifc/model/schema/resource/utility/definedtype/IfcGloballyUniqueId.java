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
package org.sikongsphere.ifc.model.schema.resource.utility.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.STRING;

/**
 * Holds an identifier that is unique throughout the software world.
 * This is also known as a Globally Unique Identifier (GUID) or Universal Unique Identifier (UUID) by the Open Group.
 * The identifier is generated using an algorithm published by the Object Management Group.
 * The algorithm is explained at the open group website.
 * The Microsoft Foundation Class (MFC) function "CoCreateGuid", which is an implementation of the above algorithm, has been used by many IFC implementers to create an identifier.
 *
 * @author zaiyuan
 * @date 2022/8/31 21:24
 * @modified stan
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE)
public class IfcGloballyUniqueId extends STRING {
    public IfcGloballyUniqueId(String value) {
        super(value);
    }

    public IfcGloballyUniqueId(STRING value) {
        super(value.value);
    }
}
