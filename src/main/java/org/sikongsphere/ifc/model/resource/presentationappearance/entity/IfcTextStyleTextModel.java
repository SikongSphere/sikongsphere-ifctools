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

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.resource.presentationappearance.definedtype.IfcTextAlignment;
import org.sikongsphere.ifc.model.resource.presentationappearance.definedtype.IfcTextDecoration;
import org.sikongsphere.ifc.model.resource.presentationappearance.definedtype.IfcTextTransformation;
import org.sikongsphere.ifc.model.resource.presentationappearance.selecttype.IfcSizeSelect;

/**
 * IfcTextStyleTextModel
 *
 * @author zaiyuan
 * @date 2022/9/2 19:15
 */
public class IfcTextStyleTextModel extends IfcNonLeafNode implements IfcTextStyleSelect {
    private IfcSizeSelect TextIndent;
    private IfcTextAlignment TextAlign;
    private IfcTextDecoration TextDecoration;
    private IfcSizeSelect LetterSpacing;
    private IfcSizeSelect WordSpacing;
    private IfcTextTransformation TextTransform;
    private IfcSizeSelect LineHeight;
}
