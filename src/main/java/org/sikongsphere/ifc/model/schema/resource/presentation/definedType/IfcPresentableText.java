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
package org.sikongsphere.ifc.model.schema.resource.presentation.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.STRING;

/**
 * The IfcPresentableText is a text string used to capture the content of a text literal for the purpose of
 * presentation. The IfcPresentableText can include multiple lines of text, then the line feed character LF, 0x0A,
 * should be used to separate lines.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:38
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPresentableText extends STRING {
    public IfcPresentableText() {}

    @IfcParserConstructor
    public IfcPresentableText(STRING value) {
        super(value);
    }
}
