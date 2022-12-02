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
package org.sikongsphere.ifc.newModel.schema.resource.presentationorganization.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcRepresentationItem;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;

/**
 * The styled item is an assignment of style for presentation to
 * a geometric representation item as it is used in a representation.
 *
 * @author stan
 * @date 2022/09/01 23:24
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStyledItem extends IfcRepresentationItem {
    private IfcRepresentationItem item;
    private SET<IfcPresentationStyleAssignment> styles;
    private IfcLabel name;

    public IfcStyledItem() {}

    @IfcParserConstructor
    public IfcStyledItem(
        IfcRepresentationItem item,
        SET<IfcPresentationStyleAssignment> styles,
        IfcLabel name
    ) {
        this.item = item;
        this.styles = styles;
        this.name = name;
    }

    public IfcRepresentationItem getItem() {
        return item;
    }

    public void setItem(IfcRepresentationItem item) {
        this.item = item;
    }

    public SET<IfcPresentationStyleAssignment> getStyles() {
        return styles;
    }

    public void setStyles(SET<IfcPresentationStyleAssignment> styles) {
        this.styles = styles;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }
}
