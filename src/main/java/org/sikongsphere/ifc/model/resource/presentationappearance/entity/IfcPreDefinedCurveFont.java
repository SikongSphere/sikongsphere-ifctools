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
package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.presentation.entity.IfcPreDefinedItem;

/**
 * The predefined curve font type is an abstract supertype provided to
 * define an application specific curve font.
 *
 * @author stan
 * @date 2022/09/01 23:36
 */
public abstract class IfcPreDefinedCurveFont extends IfcPreDefinedItem {
    public IfcPreDefinedCurveFont() {}

    public IfcPreDefinedCurveFont(IfcLabel name) {
        super(name);
    }
}
