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
package org.sikongsphere.ifc.model.schema.resource.presentation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.presentation.definedType.IfcFontStyle;
import org.sikongsphere.ifc.model.schema.resource.presentation.definedType.IfcFontVariant;
import org.sikongsphere.ifc.model.schema.resource.presentation.definedType.IfcFontWeight;
import org.sikongsphere.ifc.model.schema.resource.presentation.definedType.IfcTextFontName;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSizeSelect;

/**
 * Setting font properties will be among the most common uses of style sheets.
 *
 * @author zaiyuan
 * @date 2022/12/17 13:18
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextStyleFontModel extends IfcPreDefinedTextFont {
    @IfcOptionField
    private LIST<IfcTextFontName> fontFamily;
    @IfcOptionField
    private IfcFontStyle fontStyle;
    @IfcOptionField
    private IfcFontVariant fontVariant;
    @IfcOptionField
    private IfcFontWeight fontWeight;
    private IfcSizeSelect fontSize;

    @IfcParserConstructor
    public IfcTextStyleFontModel(
        IfcLabel name,
        LIST<IfcTextFontName> fontFamily,
        IfcFontStyle fontStyle,
        IfcFontVariant fontVariant,
        IfcFontWeight fontWeight,
        IfcSizeSelect fontSize
    ) {
        super(name);
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontVariant = fontVariant;
        this.fontWeight = fontWeight;
        this.fontSize = fontSize;
    }

    public LIST<IfcTextFontName> getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(LIST<IfcTextFontName> fontFamily) {
        this.fontFamily = fontFamily;
    }

    public IfcFontStyle getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(IfcFontStyle fontStyle) {
        this.fontStyle = fontStyle;
    }

    public IfcFontVariant getFontVariant() {
        return fontVariant;
    }

    public void setFontVariant(IfcFontVariant fontVariant) {
        this.fontVariant = fontVariant;
    }

    public IfcFontWeight getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(IfcFontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public IfcSizeSelect getFontSize() {
        return fontSize;
    }

    public void setFontSize(IfcSizeSelect fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
