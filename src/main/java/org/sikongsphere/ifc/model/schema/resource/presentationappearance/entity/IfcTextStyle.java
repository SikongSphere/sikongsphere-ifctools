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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentation.selectType.IfcTextFontSelect;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcCharacterStyleSelect;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcPresentationStyleSelect;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcTextStyleSelect;

/**
 * The text style is a presentation style for annotation text..
 *
 * @author Wang Bohong
 * @date 2022/9/2 11:44
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect {
    @IfcOptionField
    private IfcCharacterStyleSelect textCharacterAppearance;
    @IfcOptionField
    private IfcTextStyleSelect textStyle;
    private IfcTextFontSelect textFontStyle;

    public IfcTextStyle() {}

    @IfcParserConstructor
    public IfcTextStyle(
        IfcLabel name,
        IfcCharacterStyleSelect textCharacterAppearance,
        IfcTextStyleSelect textStyle,
        IfcTextFontSelect textFontStyle
    ) {
        super(name);
        this.textCharacterAppearance = textCharacterAppearance;
        this.textStyle = textStyle;
        this.textFontStyle = textFontStyle;
    }

    public IfcCharacterStyleSelect getTextCharacterAppearance() {
        return textCharacterAppearance;
    }

    public void setTextCharacterAppearance(IfcCharacterStyleSelect textCharacterAppearance) {
        this.textCharacterAppearance = textCharacterAppearance;
    }

    public IfcTextStyleSelect getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(IfcTextStyleSelect textStyle) {
        this.textStyle = textStyle;
    }

    public IfcTextFontSelect getTextFontStyle() {
        return textFontStyle;
    }

    public void setTextFontStyle(IfcTextFontSelect textFontStyle) {
        this.textFontStyle = textFontStyle;
    }
}
