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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * An abstract generalisation of style table for presentation information assigned to geometric representation items.
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPresentationStyle extends IfcAbstractClass {
    @IfcOptionField
    private IfcLabel name;

    public IfcPresentationStyle() {}

    @IfcParserConstructor
    public IfcPresentationStyle(IfcLabel name) {
        this.name = name;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }
}
