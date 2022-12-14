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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentation.entity.IfcPreDefinedItem;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcCurveStyleFontSelect;

/**
 * The predefined curve font type is an abstract supertype provided to
 * define an application specific curve font.
 *
 * @author stan
 * @date 2022/09/01 23:36
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcPreDefinedCurveFont extends IfcPreDefinedItem
    implements
        IfcCurveStyleFontSelect {
    public IfcPreDefinedCurveFont() {}

    public IfcPreDefinedCurveFont(IfcLabel name) {
        super(name);
    }
}
