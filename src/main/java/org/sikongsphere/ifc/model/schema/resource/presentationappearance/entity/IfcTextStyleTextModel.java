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
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.definedtype.IfcTextAlignment;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.definedtype.IfcTextDecoration;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.definedtype.IfcTextTransformation;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSizeSelect;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcTextStyleSelect;

/**
 * The properties defined in the text model affect the visual presentation of characters, spaces, words, and paragraphs.
 *
 * @author zaiyuan
 * @date 2022/9/2 19:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextStyleTextModel extends IfcAbstractClass implements IfcTextStyleSelect {
    @IfcOptionField
    private IfcSizeSelect TextIndent;
    @IfcOptionField
    private IfcTextAlignment TextAlign;
    @IfcOptionField
    private IfcTextDecoration TextDecoration;
    @IfcOptionField
    private IfcSizeSelect LetterSpacing;
    @IfcOptionField
    private IfcSizeSelect WordSpacing;
    @IfcOptionField
    private IfcTextTransformation TextTransform;
    @IfcOptionField
    private IfcSizeSelect LineHeight;

    @IfcParserConstructor
    public IfcTextStyleTextModel(
        IfcSizeSelect textIndent,
        IfcTextAlignment textAlign,
        IfcTextDecoration textDecoration,
        IfcSizeSelect letterSpacing,
        IfcSizeSelect wordSpacing,
        IfcTextTransformation textTransform,
        IfcSizeSelect lineHeight
    ) {
        TextIndent = textIndent;
        TextAlign = textAlign;
        TextDecoration = textDecoration;
        LetterSpacing = letterSpacing;
        WordSpacing = wordSpacing;
        TextTransform = textTransform;
        LineHeight = lineHeight;
    }

    public IfcSizeSelect getTextIndent() {
        return TextIndent;
    }

    public void setTextIndent(IfcSizeSelect textIndent) {
        TextIndent = textIndent;
    }

    public IfcTextAlignment getTextAlign() {
        return TextAlign;
    }

    public void setTextAlign(IfcTextAlignment textAlign) {
        TextAlign = textAlign;
    }

    public IfcTextDecoration getTextDecoration() {
        return TextDecoration;
    }

    public void setTextDecoration(IfcTextDecoration textDecoration) {
        TextDecoration = textDecoration;
    }

    public IfcSizeSelect getLetterSpacing() {
        return LetterSpacing;
    }

    public void setLetterSpacing(IfcSizeSelect letterSpacing) {
        LetterSpacing = letterSpacing;
    }

    public IfcSizeSelect getWordSpacing() {
        return WordSpacing;
    }

    public void setWordSpacing(IfcSizeSelect wordSpacing) {
        WordSpacing = wordSpacing;
    }

    public IfcTextTransformation getTextTransform() {
        return TextTransform;
    }

    public void setTextTransform(IfcTextTransformation textTransform) {
        TextTransform = textTransform;
    }

    public IfcSizeSelect getLineHeight() {
        return LineHeight;
    }

    public void setLineHeight(IfcSizeSelect lineHeight) {
        LineHeight = lineHeight;
    }
}
