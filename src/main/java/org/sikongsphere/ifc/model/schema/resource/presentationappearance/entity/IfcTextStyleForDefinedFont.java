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
import org.sikongsphere.ifc.model.schema.resource.presentation.selectType.IfcColour;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcCharacterStyleSelect;

/**
 * A text style for defined font is a character glyph style for pre-defined or externally defined text fonts.
 *
 * @author zaiyuan
 * @date 2022/9/2 19:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextStyleForDefinedFont extends IfcAbstractClass
    implements
        IfcCharacterStyleSelect {
    private IfcColour colour;
    @IfcOptionField
    private IfcColour backgroundColour;

    @IfcParserConstructor
    public IfcTextStyleForDefinedFont(IfcColour colour, IfcColour backgroundColour) {
        this.colour = colour;
        this.backgroundColour = backgroundColour;
    }

    public IfcColour getColour() {
        return colour;
    }

    public void setColour(IfcColour colour) {
        this.colour = colour;
    }

    public IfcColour getBackgroundColour() {
        return backgroundColour;
    }

    public void setBackgroundColour(IfcColour backgroundColour) {
        this.backgroundColour = backgroundColour;
    }
}
