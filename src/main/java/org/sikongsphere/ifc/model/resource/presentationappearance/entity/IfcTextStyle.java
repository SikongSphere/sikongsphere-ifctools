package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.presentationappearance.selecttype.IfcCharacterStyleSelect;
import org.sikongsphere.ifc.model.resource.presentationappearance.selecttype.IfcTextStyleSelect;
import org.sikongsphere.ifc.model.resource.representation.selecttype.IfcTextFontSelect;

/**
 * @author Wang Bohong
 * @date 2022/9/2 11:44
 */
public class IfcTextStyle extends IfcPresentationStyle{
    private IfcCharacterStyleSelect textCharacterAppearance;
    private IfcTextStyleSelect textStyle;
    private IfcTextFontSelect textFontStyle;

    public IfcTextStyle() {
    }

    public IfcTextStyle(IfcLabel name, IfcCharacterStyleSelect textCharacterAppearance, IfcTextStyleSelect textStyle, IfcTextFontSelect textFontStyle) {
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
