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
package org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.presentation.selectType.IfcColour;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcCharacterStyleSelect;

/**
 * IfcTextStyleForDefinedFont
 *
 * @author zaiyuan
 * @date 2022/9/2 19:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextStyleForDefinedFont extends IfcAbstractClass
    implements
        IfcCharacterStyleSelect {
    private IfcColour colour;
    private IfcColour backgroundColour;
}
