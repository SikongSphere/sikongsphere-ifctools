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
package org.sikongsphere.ifc.model.resource.presentationorganization.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.resource.presentationappearance.selecttype.IfcPresentationStyleSelect;

/**
 * The presentation style assignment is a set of styles which are assigned to styled items
 * for the purpose of presenting these styled items.
 *
 * @author stan
 * @date 2022/09/14 23:26
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPresentationStyleAssignment extends IfcBodyTemplate {
    private SET<IfcPresentationStyleSelect> styles;

    public IfcPresentationStyleAssignment() {}

    @IfcParserConstructor
    public IfcPresentationStyleAssignment(SET<IfcPresentationStyleSelect> styles) {
        this.styles = styles;
    }

    public SET<IfcPresentationStyleSelect> getStyles() {
        return styles;
    }

    public void setStyles(SET<IfcPresentationStyleSelect> styles) {
        this.styles = styles;
    }
}
